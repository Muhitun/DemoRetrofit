package com.example.cws.demoretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by CWS on 7/8/2017.
 */

public interface ApiInterface {

    @GET("/v1/articles?source=business-insider&sortBy=top&apiKey=f68b88011fae4e68a36937f5c133b87a")
    Call<List<News>> getNews();
}
