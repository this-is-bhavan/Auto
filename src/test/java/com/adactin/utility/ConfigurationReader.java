package com.adactin.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;
	
	public ConfigurationReader() throws IOException {
File file = new File("C:\\Users\\ss\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\adactin\\properties\\Adactin.properties");
FileInputStream fis = new FileInputStream(file);
Properties p = new Properties();
p=new Properties();
p.load(fis);
}
public String getbrowsername()
{
	String browsername=p.getProperty("browsername");
	return browsername;
}
public String getUrl() {
	String Url=p.getProperty("Url");
	return Url;
	
}}
