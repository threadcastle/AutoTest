package com.mycompany.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

@Getter @AllArgsConstructor
public class HttpResponse {

    private String responseEntity;
    private int statusCode;

    private Header[] header;


    /*
        public String getResponseEntity() throws IOException {
        return EntityUtils.toString(responseEntity);
    }
     */



}
