package com.prprt.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtility {

	public String getValue(String filePath, String key) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			System.err.println("File not found: " + filePath);
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			System.err.println("Unable to load properties file: " + filePath);
		}
		return prop.getProperty(key);

	}

	/**
	 * This method can be used on ObjRepo.properties file only.
	 * 
	 * @param key foe which we want the locator
	 * @return the locator value in the form of {@code String}
	 */
	public String[] getLocator(String key) {
		String baseDir = System.getProperty("user.dir");
		return getValue(baseDir + "/src/main/resources/ObjRepo.properties", key).split("##");
	}
}
