package com.example.gimhana.tcpip_server;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Dell on 1/27/2018.
 */

public class ClientModel implements Serializable {
    @SerializedName("mac")
    private String mac;

    @SerializedName("msg")
    private String msg;

    public ClientModel(String mac,String msg){
        this.mac=mac;
        this.msg=msg;
    }
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "{" +
                "mac='" + mac + '\'' +
                ", msg='" + msg + '\'' +"}";

    }
}
