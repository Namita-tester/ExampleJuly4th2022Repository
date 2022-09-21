package com.sgtesting.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		Launchbrowser();
		navigate();
		closeApplication();
	}
	private static void Launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","G:\\ExampleAutomation\\Automation\\Web-Application\\Library\\Drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}



	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:8081/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}