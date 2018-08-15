/*
package com.redcode.springboot.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import sun.misc.BASE64Decoder;

import java.io.*;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

*/
/**
 * Created by zhouzhiyu on 2018/7/16
 *//*

public class ImageUtils {

    private static final String DATEFORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    private static final String TOKENTYPE = "11"; //浏览器端
    private static final String APPID = "11540387";
//    private static final String APIKEY = "gTvHcwd4fuNYpTohlSR5rOqgt7Rzfwsg";
    private static final String UID = "0"; //1884599608
    private static final String SK = "6MDX9Z7D3DT5EUXwvhnmw8Zd5Opk9Ucn";

    private static final String V1_ERASE_WATERMARK_API = "http://inner.openapi.baidu.com/rest/2.0/vis-classify/v1/erase_watermark";

    private static final String OPEN_API_TEST = "";

    private static final String V2_ENW_API = "http://inner.openapi.baidu.com/rest/2.0/vis-classify/v2/classify/enhanced_watermark";
    private static final String V2_ERASE_WAPI = "http://inner.openapi.baidu.com/rest/2.0/vis-classify/v1/customize_erase_watermark";

    public static void main(String[] args) throws UnsupportedEncodingException {

        String imgFile = "/Users/zhouzhiyu/Desktop/test.png";
        String imgResultFile = "/Users/zhouzhiyu/Desktop/test_result.png";
        String image = getImageStr(imgFile);

        String accessToken = generateServerToken(TOKENTYPE, APPID, UID, SK);

        String remarkResult = imageWatermarkProcess(image, V2_ENW_API, accessToken, null);

        JSONObject resultAllJson = JSON.parseObject(remarkResult);
        //JSONObject resultJson = JSON.parseObject(remarkResult).getJSONObject("result");
        System.out.println("detection result num :" + resultAllJson.get("result_num"));

        String location = "220,165,486,97;660,410,202,30";
        String imgResult = imageWatermarkProcess(image, V2_ERASE_WAPI, accessToken, location);
        System.out.println("erase result:" + resultAllJson.get("result_num"));

        JSONObject resultJson = JSON.parseObject(imgResult).getJSONObject("result");

        String imageStr = resultJson.get("image").toString();
        boolean resultFlag = generateImage(imageStr, imgResultFile);
        System.out.println("resultFlag" + resultFlag);
    }

    public static String getImageStr(String imgFile) throws UnsupportedEncodingException {
        //将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        InputStream in = null;
        byte[] data = null;
        //读取图片字节数组
        try {
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(Base64.encodeBase64(data), "UTF-8");
    }

    public static String imageWatermarkProcess(String image, String apiUrl, String accessToken, String location) {

        CloseableHttpClient httpClient = null;

        try {
            httpClient = HttpClients.createDefault();
            HttpPost httpPost = new HttpPost(apiUrl + "?access_token=" + accessToken);
            httpPost.addHeader("Content-Type", "application/x-www-form-urlencoded");

            List<BasicNameValuePair> nameValuePairs = new ArrayList<>();
            nameValuePairs.add(new BasicNameValuePair("image", image));
            if(!com.baidu.nmp.base.utils.StringUtils.isEmpty(location)) {
                nameValuePairs.add(new BasicNameValuePair("location", location));
            }
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

            HttpResponse response = httpClient.execute(httpPost);

            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String line = null;
            StringBuffer result = new StringBuffer();
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            return result.toString();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String generateServerToken(String tokenType, String appId, String uid, String sk) {
        //getSignString
        long time = System.currentTimeMillis() / 1000;
        String str = time + uid + appId + sk;
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }

        char[] charArray = str.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        String sign = hexValue.toString();
        String res = "";
        if (tokenType != null && sign != null && uid != null && appId != null) {
            res = tokenType + "." + sign + "." + time + "." + uid + "-" + appId;
        }
        return res;
    }

    public static boolean generateImage(String imgStr, String imgResultFile) {
        if (imgStr == null) {
            return false;
        }
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            byte[] bytes = decoder.decodeBuffer(imgStr);
            for (int i = 0; i < bytes.length; ++i) {
                if (bytes[i] < 0) {// 调整异常数据
                    bytes[i] += 256;
                }
            }
            OutputStream out = new FileOutputStream(imgResultFile);
            out.write(bytes);
            out.flush();
            out.close();
            System.out.println("生成图片路径:" + imgResultFile);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
*/
