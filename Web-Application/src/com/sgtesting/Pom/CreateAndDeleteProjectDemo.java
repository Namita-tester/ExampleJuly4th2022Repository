package com.sgtesting.Pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndDeleteProjectDemo {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String args[])
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		createProject();
		deleteProject();
		deleteUser();
		logout();
		closeApplication();
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
			Thread.sleep(4000);
			oPage.getAddUser().click();
			Thread.sleep(4000);
			oPage.getFirstName1().sendKeys("Namitassd");		
			oPage.getLastName().sendKeys("L");
			oPage.getEmailID().sendKeys("unamiat@gmail.com");
			oPage.getUserName().sendKeys("Usessr1s");
			oPage.getPassword1().sendKeys("Welcome123");
			oPage.getReTypePassword1().sendKeys("Welcome123");
			Thread.sleep(3000);
			oPage.getCreateUser1().click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createProject()
	{
		try
		{
			oPage.getTaskManager().click();
			Thread.sleep(4000);
			oPage.getAddNew().click();
			Thread.sleep(4000);
			oPage.getCreateProject().click();
			Thread.sleep(4000);
			oPage.getEnterProjectName().sendKeys("Projecsst04dd01");
			Thread.sleep(3000);
			oPage.getEnterCustomerNameForProject().sendKeys("Namitdsssas");
			Thread.sleep(3000);
			oPage.getAddProjectDescription().sendKeys("This project is Tested by Namita");
			Thread.sleep(1000);
			
			
			oPage.getCreateProjectButton().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteProject()
	{
		try
		{
			oPage.getClickOnProjectSettingIcon().click();
			Thread.sleep(3000);
			oPage.getDelProject().click();
			Thread.sleep(3000);
			oPage.getDeletePermanentlyProject().click();
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
			oPage.getUSERS().click();
			oPage.getClickUser1().click();
			Thread.sleep(3000);
			oPage.getClickDeleteUser1().click();
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(5000);
				
		}catch(Exception e)
	    {
			e.printStackTrace();
		}
	}
		
	private static void logout()
	{
		try
		{

			oPage.getLogoutLink().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
			Thread.sleep(1000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
