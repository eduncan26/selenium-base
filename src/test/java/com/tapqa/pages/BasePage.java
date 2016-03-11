package com.tapqa.pages;


import com.tapqa.framework.SiteProperties;
import org.openqa.selenium.WebDriver;

abstract class BasePage implements Page {

    protected WebDriver driver;
    protected SiteProperties properties;

    BasePage(WebDriver driver) {
        this.driver = driver;
    }

    BasePage(WebDriver driver, SiteProperties properties) {
        this.driver = driver;
        this.properties = properties;
    }

    @Override
    public void get(String uri) {
        this.driver.get(uri);
    }

    @Override
    public void exit() {
        this.driver.close();
    }
}
