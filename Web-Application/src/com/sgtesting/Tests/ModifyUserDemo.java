package com.sgtesting.Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v102.browser.Browser;

public class ModifyUserDemo {

		public static WebDriver oBrowser=null;
		
		public static void main(String[] args) 
		{
				Launchbrowser();
				navigate();
				login();
				minimizeFlyOutWindow();
		     	createUser();
		    	modifyUser();
				deleteUser();
		        logout();
			    closeApplication();
			
					}
		
		private static void Launchbrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver","G:\\ExampleAutomation\\Automation\\Web-Application\\Library\\Drivers\\chromedriver.exe ");
				oBrowser=new ChromeDriver();
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
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();;
				Thread.sleep(2000);
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}

		
	private static void createUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.name("firstName")).sendKeys("ddemo34");
				oBrowser.findElement(By.name("lastName")).sendKeys("User2");
				oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("jck33y");
				oBrowser.findElement(By.name("password")).sendKeys("Welcome2");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome2");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
private static void modifyUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_emailField")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("dem@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(5000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}


private static void deleteUser()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
		Thread.sleep(2000);
		Alert oAlert=oBrowser.switchTo().alert();
		String content=oAlert.getText();
		System.out.println(content);
		oAlert.accept();
		Thread.sleep(2000);
	}catch(Exception e)
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