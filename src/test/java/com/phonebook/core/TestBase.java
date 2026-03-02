package com.phonebook.core;

import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

public class TestBase {

    protected static ApplicationManager app =
            new ApplicationManager(System.getProperty("browser", Browser.CHROME.browserName()));

    protected SoftAssert softAssert;
    //@BeforeMethod()
    @BeforeSuite(alwaysRun = true)
    public void setUp(){
        app.init();
softAssert = new SoftAssert();
    }
    //@AfterMethod(enabled = false)
    @AfterSuite(alwaysRun = false)
    public void tearDown(){
        app.stop();
    }

}
