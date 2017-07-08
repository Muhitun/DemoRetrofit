package com.example.cws.demoretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by CWS on 7/8/2017.
 */

public class ApiClass {

    public static final String BASE_URL = "https://newsapi.org";
    public static Retrofit retrofit;

    public static Retrofit getApiClient(){
        if(retrofit==null){
             retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
