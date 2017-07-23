在分布式系统中，为了保证数据分布式事务的强一致性，大家在调用RPC接口或者发送MQ时，针对可能会出现网络抖动请求超时情况采取一下重试操作
最多的重试方式就是MQ，Spring Retry实现重试操作
1.jar包:
   spring-retry
   aspectjweaver
2. retry启动 添加注解
   @EnableRetry  //开启Retry服务
3. 指定目标class retry 在方法上添加注解
   @Retryable(value = {RuntimeException.class}, maxAttempts = 4, backoff = @Backoff(delay = 2000l, multiplier = 1))
        * @Retryable：发生异常时会进行重试
        *  value：抛出指定异常才会重试
        *  maxAttempts:最大重试次数，默认3次
        *  backoff：重试等待策略，默认使用@Backoff，@Backoff的value默认为1000L，multiplier（指定延迟倍数）
   当retry 失败后, 可回调添加@Recover注解的方法
    @Recover //用于@Retryable重试失败后处理方法，此方法里的异常一定要是@Retryable方法里抛出的异常，否则不会调用

