package com.example.cws.demoretrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by CWS on 7/8/2017.
 */

public class News {

    @SerializedName("status")
    String title;

//    @SerializedName("urlToImage")
//    String image_path;

    public String getTitle() {
        return title;
    }

//    public String getImage_path() {
//        return image_path;
//    }
}
