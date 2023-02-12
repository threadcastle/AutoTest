package com.mycompany.test.framework.mlcalc;

import com.mycompany.TestBase;
import com.mycompany.pages.MLCalcHome;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMLcalcFramework extends TestBase {

    @Test
    public void testMllcalc(){
        System.out.println("start of the framework");
        mlCalcHome.fillDetails("600000");

        String test = result.getMonthyPayment();
        Assert.assertNotNull(test);
    }
}


