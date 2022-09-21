package com.sgtesting.Pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyUserDemo {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String args[])
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
	//	modifyUser();
	//	deleteUser();
	//	logout();
	//	closeApplication();
	}
	
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","G:\\\\ExampleAutomation\\\\Automation\\\\Web-Application\\\\Library\\\\Drivers\\\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser()
	{
		try
		{
			oPage.getUSERS().click();
			oPage.getAddUser().click();
			oPage.getFirstName1().sendKeys("Namita");		
			oPage.getLastName().sendKeys("L");
			oPage.getEmailID().sendKeys("unamiat@gmail.com");
			oPage.getUserName().sendKeys("User1");
			oPage.getPassword1().sendKeys("Welcome123");
			oPage.getReTypePassword1().sendKeys("Welcome123");
			oPage.getCreateUser1().click();
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
			oPage.getClickUser1().click();
			Thread.sleep(3000);
			oPage.getEmailIDModify().clear();
			Thread.sleep(500);
			oPage.getEmailIDModify().sendKeys("nam@Gmail.com");
			Thread.sleep(500);
			oPage.getEmailIDModifySaveChanges().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	private static void deleteUser()
	{
		try
		{
			oPage.getUSERS().click();
			oPage.getClickUser1().click();
			Thread.sleep(3000);
			oPage.getClickDeleteUser1().click();
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
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	private static void closeApplication()
	{
		try
		{
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
