package com.tapqa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;

public interface Driver {
	WebDriver getDriver();
	WebDriver getDriver(String name);
	void killDriver();
	Capabilities getCapabilities() throws Exception;
}
