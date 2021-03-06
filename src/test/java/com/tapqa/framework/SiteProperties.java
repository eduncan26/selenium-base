package com.tapqa.framework;

import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class SiteProperties implements PropertiesReader {
	
	private Properties defaultProperties = new Properties();
	private Properties environmentalProperties = new Properties();

	public SiteProperties() {
		try {
			String environmentPropsString = "QA.properties";

			if (System.getProperty("env") != null) {
				environmentPropsString = System.getProperty("env").toUpperCase() + ".properties";
			}

			InputStream defaults = this.getClass().getClassLoader().getResourceAsStream("default.properties");
			InputStream environment = this.getClass().getClassLoader().getResourceAsStream(environmentPropsString);

			this.defaultProperties.load(defaults);
			this.environmentalProperties.load(environment);
		} catch (IOException err) {
			err.printStackTrace();
		}
	}

	public Properties getProperties() {
		Properties mergedProperties = new Properties();
		mergedProperties.putAll(this.defaultProperties);
		mergedProperties.putAll(this.environmentalProperties);
		return mergedProperties;
	}
}
