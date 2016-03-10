package com.tapqa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public interface Driver {
	WebDriver getDriver();
	void killDriver();
	Capabilities getCapabilities();
	void setCapabilities(DesiredCapabilities capabilities);
}
