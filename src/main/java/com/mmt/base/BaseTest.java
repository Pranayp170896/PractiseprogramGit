package com.mmt.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public static Properties config;
	public static WebDriver driver;
	
	
	public void driverInitization() {
		driver=new ChromeDriver();
		
		driver.get(config.getProperty("url"));
		
		//convert string value into integer value
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt("pageloadtime")));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	
	
	
	public void readPropertyFile() throws IOException {
		
		try {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/property/config.properties");
			config= new Properties();
			config.load(fis);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	

}
