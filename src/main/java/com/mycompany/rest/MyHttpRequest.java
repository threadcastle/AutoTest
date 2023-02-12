package com.mycompany.rest;

import org.apache.http.client.methods.HttpGet;

public class MyHttpRequest {

    //request line, header,

    public static final String HOST = "https://reqres.in";


    public static HttpGet createGetRequest(String endpoint){

        String uri = HOST + endpoint;
       HttpGet httpget =  new HttpGet(uri);

       //call method and set headers

        //set the entity



        return httpget;

    }










}
