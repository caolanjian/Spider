package com.clj.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Resources {

	public static String APACHE_HOME_SERVER_IP;
	
	public static String APACHE_IMG_SERVER_IP;
	
	public static String MYSQL_CONNECTION_URL;
	
	public static String IMG_URI_HEADER;
	
	public static String APACHE_RESOURCE_PATH;
	
	public static String TOMCAT_SERVER1_IP;
	
	public static String TOMCAT_SERVER2_IP;
	
	public static String TOMCAT_SERVER_APP_NAME;
	
	public static String IMG_DOWNLOAD_PATH;
	
	public static String IMG_SERVER_URL_HEADER;
	
	static{
		Properties prop = new Properties();
		InputStream in = Object.class.getResourceAsStream("/com/clj/resources/resources.properties");
		try{
			prop.load(in);
			APACHE_HOME_SERVER_IP = prop.getProperty("APACHE_HOME_SERVER_IP");
			APACHE_IMG_SERVER_IP = prop.getProperty("APACHE_IMG_SERVER_IP");
			MYSQL_CONNECTION_URL = prop.getProperty("MYSQL_CONNECTION_URL");
			IMG_URI_HEADER = prop.getProperty("IMG_URI_HEADER");
			APACHE_RESOURCE_PATH = prop.getProperty("APACHE_RESOURCE_PATH");
			TOMCAT_SERVER1_IP = prop.getProperty("TOMCAT_SERVER1_IP");
			TOMCAT_SERVER2_IP = prop.getProperty("TOMCAT_SERVER2_IP");
			TOMCAT_SERVER_APP_NAME = prop.getProperty("TOMCAT_SERVER_APP_NAME");
			IMG_DOWNLOAD_PATH = APACHE_RESOURCE_PATH + IMG_URI_HEADER;
			IMG_SERVER_URL_HEADER = APACHE_IMG_SERVER_IP + IMG_URI_HEADER;
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
