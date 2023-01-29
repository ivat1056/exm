package com.example.exm;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RetrofitAPI {

    @GET("Movies")
    Call<List<Model>> getmodel();

    @POST("Movies")
    Call<Model> postData(@Body Model moviesModal);
}
