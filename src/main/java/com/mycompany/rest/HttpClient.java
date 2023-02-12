package com.mycompany.rest;


import org.apache.hc.client5.http.classic.methods.HttpUriRequestBase;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpClient {


    //create a http client and send the request


    public HttpResponse sendRequest(HttpUriRequest httpUriRequest) throws IOException {
        //create a client

        CloseableHttpClient httpclient = null;

        HttpResponse httpResponse = null;

        try{
             httpclient = HttpClients.createDefault();

             try{
                 CloseableHttpResponse response = httpclient.execute(httpUriRequest);

                 httpResponse = new HttpResponse(EntityUtils.toString(response.getEntity()), response.getStatusLine().getStatusCode(), response.getAllHeaders());

                 response.getAllHeaders();

                 return httpResponse;


             }catch (IOException ex){
                 ex.printStackTrace();

                 throw new RuntimeException("response error: "+httpUriRequest.getURI(), ex);
             }



        }



        finally {
            httpclient.close();
        }




    }


















}
