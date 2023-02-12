package com.mycompany.test.testeng;

import org.testng.annotations.*;

public class TestEngine {

    @BeforeClass

    public void testBeforeClass() {
        System.out.println("run only once before any test runs: configuration");
    }


    @AfterClass
    public void testAfterClass() {
        System.out.println("......after class the last one to run");
    }

    @BeforeMethod

    public void beforeMethod() {
        System.out.println("run before @test");
    }


    @AfterMethod

    public void testAfterMethod() {
        System.out.println("test after @test");
    }

    @Test
    public void testfirst() {
        System.out.println("first test");
    }


    @Test
    public void secondtest() {
        System.out.println("second test");

    }

    @Test
    public void testDatabase() {
        System.out.println("db test");
    }

}
