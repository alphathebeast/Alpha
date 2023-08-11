package com.prprt.util;

public class Environment {
	private static String filePath = "/src/main/resources/Environment.properties";
	public static String URL;
	public static String Result;

	static {
		PropUtility prop = new PropUtility();
		String baseDir = System.getProperty("user.dir");
		URL = prop.getValue(baseDir + filePath, "app_url");
		Result = prop.getValue(baseDir + filePath, "app_url_result");
	}
}
