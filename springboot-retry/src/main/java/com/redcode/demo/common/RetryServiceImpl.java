package com.redcode.demo.common;

import com.redcode.demo.exception.RetryException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * Created by zhiyu.zhou on 2017/7/21.
 */
@Service
public class RetryServiceImpl implements RetryService {

    private int mock_prod_code = 1;

    /**
     * @Retryable：发生异常时会进行重试
     *  value：抛出指定异常才会重试
     *  maxAttempts:最大重试次数，默认3次
     *  backoff：重试等待策略，默认使用@Backoff，@Backoff的value默认为1000L，multiplier（指定延迟倍数）
     */
    @Override
    @Retryable(value = {RuntimeException.class}, maxAttempts = 4, backoff = @Backoff(delay = 2000l, multiplier = 1))
    public String retry() {
        System.out.println("retry test demo");
        mock_prod_code++;//生产环境此处应该为调用第三方接口，判断接口的返回code
        if(mock_prod_code == Constant.MOCK_END) {
            return String.valueOf(mock_prod_code);
        }
        RetryException retryException = new RetryException("206", "连接超时");
        throw retryException;
    }

    @Recover //用于@Retryable重试失败后处理方法，此方法里的异常一定要是@Retryable方法里抛出的异常，否则不会调用
    public String recover(RetryException e) {
        System.out.println(e.getMsg());
        return Constant.DO_SOMETHING;
    }
}
