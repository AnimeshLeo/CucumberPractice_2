package com.qa.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws FileNotFoundException {
		prop= new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\saptadeepa pc\\workspace\\SecondDemo\\src"
				+ "\\main\\java\\com\\demo\\properties\\config.properties");
		try {
			prop.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void Initialize() {
		String browserName=prop.getProperty("browser");
		System.out.println("BrowserName is "+browserName);
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	public static void tearDown() {
		driver.close();
	}
}

