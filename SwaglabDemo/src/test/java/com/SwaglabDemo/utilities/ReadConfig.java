package com.SwaglabDemo.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties p;
	public  ReadConfig() {
		File f=new File("./Configuration/Swaglab.properties");
		try {

			FileInputStream fis=new FileInputStream(f);
			p=new Properties();
			p.load(fis);
		}
		catch (Exception e) {
		}
	}
	public String getApplicationUrl() {
		String url=p.getProperty("url");
		return url;
	}
	public String getUsername() {
		String username=p.getProperty("username");
		return username;

	}
	public String getPassword() {
		String password=p.getProperty("password");
		return password;
	}
	public String getBrowser() {
		String browser=p.getProperty("browser");
		return browser;
	}
}
