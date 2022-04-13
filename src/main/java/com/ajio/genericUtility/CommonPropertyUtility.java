package com.ajio.genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class CommonPropertyUtility {
	public static String getDataFromPropertyFile(String path,String key) throws Throwable {
		FileInputStream fin = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fin);
		String data = prop.getProperty(key);
		return data;
	}
}
