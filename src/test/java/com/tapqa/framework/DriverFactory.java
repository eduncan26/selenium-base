package com.tapqa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory implements Driver {

    private WebDriver driver;

    public WebDriver getDriver(String name) throws SessionNotCreatedException {
        String targetBrowser = System.getProperty("TARGET_BROWSER");

        if (targetBrowser == null) {
            targetBrowser = name;
        }

        switch (targetBrowser) {
            case "firefox":
                this.driver = new FirefoxDriver();
                break;
            case "chrome":
                this.driver = new ChromeDriver();
                break;
            case "safari":
                this.driver = new SafariDriver();
                break;
            case "ie":
                this.driver = new InternetExplorerDriver();
                break;
            default:
                throw new SessionNotCreatedException("Invalid driver name: "+ name);
        }

        return this.driver;
    }

    public void killDriver() {
        this.driver.quit();
    }

    public Capabilities getCapabilities() throws Exception {
        DesiredCapabilities capabilities;
        String driverName = this.driver.getClass().getSimpleName();

        switch (driverName) {
            case "FirefoxDriver":
                capabilities = DesiredCapabilities.firefox();
                break;
            case "ChromeDriver":
                capabilities = DesiredCapabilities.chrome();
                break;
            case "SafariDriver":
                capabilities = DesiredCapabilities.safari();
                break;
            case "InternetExplorerDriver":
                capabilities = DesiredCapabilities.internetExplorer();
                break;
            default:
                throw new Exception("Desired capabilities not found for :" + driverName);
        }

        capabilities.setJavascriptEnabled(true);
        capabilities.setCapability("takeScreenshot", true);

        return capabilities;
    }
}