package com.phonebook.core;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {


    public void setUp(){
        app.init();
    }
    //@AfterMethod(enabled = false)
    public void tearDown(){
        app.stop();
    }

}
