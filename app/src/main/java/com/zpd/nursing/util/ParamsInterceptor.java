package com.zpd.nursing.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.inject.Inject;

import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by zhoubo on 2017/8/21.
 */

public class ParamsInterceptor implements Interceptor {

    @Inject
    public ParamsInterceptor() {
    }

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request originalRequest = chain.request();

        RequestBody originalRequestBody = originalRequest.body();
        RequestBody newRequestBody = setPostRequestBody(getCommonParams(), originalRequestBody);

        if (newRequestBody != null) {

            Request newRequest = originalRequest.newBuilder()
                    .url(originalRequest.url())
                    .method(originalRequest.method(), newRequestBody)
                    .build();

            return chain.proceed(newRequest);
        }

        return chain.proceed(originalRequest);
    }

    /**
     * post请求参数
     *
     * @param bodyParams
     * @return
     */
    private RequestBody setPostRequestBody(Map<String, String> bodyParams, RequestBody originalRequestBody) {

        RequestBody body = null;
        FormBody.Builder formEncodingBuilder = new FormBody.Builder();
        if (bodyParams != null) {
            Iterator<String> iterator = bodyParams.keySet().iterator();
            String key = "";
            while (iterator.hasNext()) {
                key = iterator.next().toString();
                formEncodingBuilder.add(key, bodyParams.get(key));
            }
        }

        if (originalRequestBody != null) {
            if (originalRequestBody instanceof FormBody) {
                FormBody originalBody = (FormBody) originalRequestBody;
                for (int index = 0; index < originalBody.size(); index ++) {

                    String decodeValue = "";
                    try {
                        decodeValue = URLDecoder.decode(originalBody.encodedValue(index), "UTF-8");
                        Logger.d("ParamsInterceptor >>>" + decodeValue);
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }

                    formEncodingBuilder.add(originalBody.encodedName(index), decodeValue);
                }
            }
        }

        body = formEncodingBuilder.build();
        return body;
    }

     private Map<String, String > getCommonParams() {

         Map<String, String> commonBodyParams = new HashMap<>();
//
//         if (AppConfig.getInstance().getAccount() != null) {
//             commonBodyParams.put("user_number", StringHelper.null2blank(AppConfig.getInstance().getAccount().getUser_number()));
//             commonBodyParams.put("user_department", StringHelper.null2blank(AppConfig.getInstance().getAccount().getUser_department()));
//             commonBodyParams.put("user_department_id", StringHelper.null2blank(AppConfig.getInstance().getAccount().getUser_department_id()));
//             commonBodyParams.put("session_id", StringHelper.null2blank(AppConfig.getInstance().getAccount().getSession_id()));
//             commonBodyParams.put("yiyuan_id", StringHelper.null2blank(AppConfig.getInstance().getAccount().getYiyuan_id()));
//         }else {
//             commonBodyParams.put("yiyuan_id", "0");
//         }
//
//         commonBodyParams.put("shebei_id", StringHelper.null2blank(AppConfig.getInstance().getShebei_id()));
//         commonBodyParams.put("version", "9.0.1.2");
////         commonBodyParams.put("compression_http_data", "off");

         return commonBodyParams;
     }
}
