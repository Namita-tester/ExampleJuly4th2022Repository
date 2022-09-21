package com.sgtesting.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v102.browser.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutFireFoxDemo {

		public static WebDriver oBrowser=null;
		
		public static void main(String[] args) 
		{
				Launchbrowser();
				navigate();
				login();
				minimizeFlyOutWindow();
				logout();
				closeApplication();
		}
		
		private static void Launchbrowser()
		{
			try
			{
				System.setProperty("webdriver.gecko.driver","G:\\ExampleAutomation\\Automation\\Web-Application\\Library\\Drivers\\geckodriver.exe ");
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
		
		private static void login()
		{
			try
			{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
					Thread.sleep(5000);
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void minimizeFlyOutWindow()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId"));
				Thread.sleep(2000);
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void closeApplication()
		{
			try
			{
				oBrowser.quit();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}