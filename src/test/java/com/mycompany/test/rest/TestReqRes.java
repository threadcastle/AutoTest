package com.mycompany.test.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import com.mycompany.rest.HttpClient;
import com.mycompany.rest.HttpResponse;
import com.mycompany.rest.MyHttpRequest;
import com.mycompany.rest.reponse.cases.GetListofUsers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestReqRes {

    @Test

    public void testGetListofUsers() throws IOException {

       HttpResponse httpResponse = new HttpClient().sendRequest(MyHttpRequest.createGetRequest("/api/users?page=2"));

       String response = httpResponse.getResponseEntity();


       GetListofUsers getListofUsers = new ObjectMapper().readValue(response, GetListofUsers.class);

       //THIS IS OPTIONAL
        // ----------
       JSONObject jsonObject = new JSONObject(httpResponse.getResponseEntity());
       // ----------




        Assert.assertEquals(httpResponse.getStatusCode(), 200, "StatusCode");

        Assert.assertEquals(getListofUsers.page,2,"page value is not 2");


        //Question : what do you to validate the response

        //1, reponse status code

        //2 convert the json body from the reponse to a custom user class using obj mapper of jackson library

        // this makes sure all the keys of json are presented  as expected class and correct types

        //thereafter, any fields to be asserted are asserted


        //Question: how to validate a request


        //1, i send a log in call, which gets a response with bearer token, then I set this token to a varibale, then for all the
        //request calls, i set the authorized header to this bearer token to make this a valid call


    }
}

/*


{"page":2,"per_page":6,"total":12,"total_pages":2,"data":[{"id":7,"email":"michael.lawson@reqres.in","first_name":"Michael","last_name":"Lawson","avatar":"https://reqres.in/img/faces/7-image.jpg"},{"id":8,"email":"lindsay.ferguson@reqres.in","first_name":"Lindsay","last_name":"Ferguson","avatar":"https://reqres.in/img/faces/8-image.jpg"},{"id":9,"email":"tobias.funke@reqres.in","first_name":"Tobias","last_name":"Funke","avatar":"https://reqres.in/img/faces/9-image.jpg"},{"id":10,"email":"byron.fields@reqres.in","first_name":"Byron","last_name":"Fields","avatar":"https://reqres.in/img/faces/10-image.jpg"},{"id":11,"email":"george.edwards@reqres.in","first_name":"George","last_name":"Edwards","avatar":"https://reqres.in/img/faces/11-image.jpg"},{"id":12,"email":"rachel.howell@reqres.in","first_name":"Rachel","last_name":"Howell","avatar":"https://reqres.in/img/faces/12-image.jpg"}],"support":{"url":"https://reqres.in/#support-heading","text":"To keep ReqRes free, contributions towards server costs are appreciated!"}}
 */
