package com.tapqa.framework;

import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public final class SiteProperties implements PropertiesReader {
	
	private Properties defaultProperties;
	private Properties environmentalProperties;

	public SiteProperties() {
		try {
			String environmentPropsString = "QA.properties";

			if (System.getProperty("env") != null) {
				environmentPropsString = System.getProperty("env").toUpperCase() + ".properties";
			}

			InputStream defaults = this.getClass().getClassLoader().getResourceAsStream("default.properties");
			InputStream environment = this.getClass().getClassLoader().getResourceAsStream(environmentPropsString);
		
			defaultProperties.load(defaults);
			environmentalProperties.load(environment);
		} catch (IOException err) {
			err.printStackTrace();
		}
	}

	public void extendDefaultProperties(Properties props) {
		this.defaultProperties.putAll(props);
	}

	public void extendEnvironmentalProperties(Properties props) {
		this.environmentalProperties.putAll(props);
	}

	public Properties getProperties() {
		Properties mergedProperties = new Properties();
		mergedProperties.putAll(this.defaultProperties);
		mergedProperties.putAll(this.environmentalProperties);
		return mergedProperties;
	}
}
