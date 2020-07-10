package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Base_Config {

	public static  String getconfig(String key ) throws Throwable {
		
		Properties proper = new Properties (); // 
		
		String path ="./Config.properties";
		FileInputStream fileinput = new FileInputStream(path);
		proper.load(fileinput);
		
		//System.out.println(proper.get(key));
		return proper.get(key).toString();
		
	}

	public static void main (String args[]) throws Throwable {
		System.out.println(Base_Config.getconfig("URL"));
		
	}
	
	
	}


