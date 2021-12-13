package com.samseen.retrofitexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {
    @GET("posts")
    Call<List<Model>> getModels();
}
