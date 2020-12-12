package com.example.retrofittrail.api_interfaces;

import com.example.retrofittrail.models.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface JsonPlaceHolderApi {

    @GET("posts")
     Call<List<Post>> getPosts ();
    @POST("posts")
    Call<Post> createPost (@Body Post post);
}
