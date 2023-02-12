package com.mycompany.test.testeng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestYahoo {



    @Test(dataProvider = "provideData")
    public void testYahoo(String uname, String psd, String email) {
        System.out.println("yahoo"+uname+" "+psd+" "+ email);
    }



    @DataProvider
    public Object[][] provideData(){
        //code that will read data
        //POI api: reading from excel
        //Database: hibernate, Jooq

        String[][] data = new String[2][3];

        data[0][0] = "uname1";
        data[0][1] = "pwd1";
        data[0][2] = "usr1@gmail.com";

        data[1][0] = "uname2";
        data[1][1] = "pwd2";
        data[1][2] = "usr2@gmail.com";


        return data;


    }
}
