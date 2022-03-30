package com.example.photogalleryapp.api

import retrofit2.Call
import retrofit2.http.GET


interface FlickrApi {


 //   @GET("/")
   // fun fetchContents(): Call<String>
 @GET(
     "services/rest/?method=flickr.interestingness.getList" +
             "&api_key=Your Api code" +
             "&format=json" +
             "&nojsoncallback=1" +
             "&extras=url_s"
 )
 fun fetchPhotos(): Call<FlickrResponse>//<String>
}
