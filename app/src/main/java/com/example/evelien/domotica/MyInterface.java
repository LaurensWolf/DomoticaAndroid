package com.example.evelien.domotica;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Len on 9-2-2016.
 */
public interface MyInterface {

    @GET("/?led1")
    void led1();


}
