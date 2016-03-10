package com.tapqa.framework;

import java.util.Properties;

public interface PropertiesReader {
	void extendDefaultProperties(Properties props);
	void extendEnvironmentalProperties(Properties props);
	Properties getProperties();
}
