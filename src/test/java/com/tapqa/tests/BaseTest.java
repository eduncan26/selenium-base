package com.tapqa.tests;

import com.tapqa.framework.Driver;
import com.tapqa.framework.DriverFactory;
import com.tapqa.framework.SiteProperties;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

abstract class BaseTest implements Test {

    private Driver factory;
    private SiteProperties properties;
    protected WebDriver driver;

    BaseTest() {
        this.factory = new DriverFactory();
        this.properties = new SiteProperties();
    }

    @Before
    public void setup() {
        this.driver = this.factory.getDriver();
    }

    @After
    public void teardown() {
       this.factory.killDriver();
    }
}
