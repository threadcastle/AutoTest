package com.mycompany.test.testeng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNgAssertion {

    @Test
    public void testAssertion(){
        int er = 3;
        int ar = 4;
        if(er == ar){
            System.out.println("pass");
        }else{

            System.out.println("fail");
        }


        Assert.assertEquals(er,ar,"checking int values");

        System.out.println("line after Assertion");

        //Assert.assertTrue();


        SoftAssert sa = new SoftAssert();
        sa.assertEquals(2,3,"compare 2 and 3");


        sa.assertEquals(4,4,"cmpr 4 and 4");


        System.out.println("line after assertion");

        sa.assertAll();





    }




}
