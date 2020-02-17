package com.example.base.networkfactory.retrofit;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.socks.library.KLog;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Time:2020/1/23 9:10
 * Author: han1254
 * Email: 1254763408@qq.com
 * Function:
 */
public class RetrofitUtils {

    private static String mToken;

    private static OkHttpClient.Builder getOkHttpClientBuilder() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                try {
                    String text = URLDecoder.decode(message, "utf-8");
                    Log.e("OKHttp-----", text);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    Log.e("OKHttp-----", message);
                }
            }
        });

        HttpKLoggingInterceptor kLog = new HttpKLoggingInterceptor();
       kLog.setLevel(HttpKLoggingInterceptor.Level.BODY);
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .readTimeout(5000, TimeUnit.MILLISECONDS)
                .connectTimeout(5000, TimeUnit.MILLISECONDS)
                .addInterceptor(new BaseInterceptor())
                .addInterceptor(kLog)
                .addInterceptor(interceptor);
    }

    public static Retrofit.Builder getRetrofitBuilder(String baseUrl, String token) {
        mToken = token;
        Gson gson  = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create();
        OkHttpClient okHttpClient = RetrofitUtils.getOkHttpClientBuilder().build();
        return new Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(baseUrl);
    }

    public static class BaseInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();

            //add access token
            if(!(mToken == null || "".equals(mToken))){
                String auth = mToken.startsWith("Basic") ? mToken : "token " + mToken;
                request = request.newBuilder()
                        .addHeader("Authorization", auth)
                        .build();
            }

            return chain.proceed(request);
        }
    }

}
