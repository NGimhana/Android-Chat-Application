package com.example.gimhana.tcpip_server;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Dell on 1/27/2018.
 */

public interface APIService {
    @POST("/posts")
    @FormUrlEncoded
    Call<ClientModel> sendMsg(@Field("mac") String mac , @Field("msg") String msg);
}
