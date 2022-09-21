package com.sgtesting.anootation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AnnotationDemo1 {
	
	public static WebDriver oBrowser=null;
	
	
	@BeforeClass
	private static void Launchbrowser()
	{
		try
		{
			String path=System.getProperty("user.id");
			System.setProperty("webdriver.chrome.driver","G:\\GIT_Repository\\DemoWorkSpace\\Web-Application\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(5000);
			oBrowser.manage().window().maximize();
			Thread.sleep(2000);
			oBrowser.get("http://localhost:8081/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}

	}
	

	@Test(priority=1,dataProvider="LoginDetails")
	private static void login(String str1, String str2)
	{
		try
		{
			
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(5000);

		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	

	@Test(priority=2, dataProvider="createUserDetails")
	private static void createUser(String fname, String lname, String mail, String usernam, String pass1, String repass)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsMenuCloseId\']")).click();;
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys(fname);
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys(lname);
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys(mail);
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys(usernam);
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys(pass1);
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(repass);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	private static void deleteUser()
	{
		try
		{
		    
		   	oBrowser.findElement(By.xpath("//span[text()='L, Namita']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=4)
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
	
	@AfterClass
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
	
	@DataProvider
	public Object[][] LoginDetails()
	{
		Object obj[][]= {{"admin","manager"}};
		return obj;
	}
	
	@DataProvider
	public Object[][] createUserDetails()
	{
		Object obj1[][]= {{"Namita","L","namita@gmail.com","Namita1","namita123","namita123"}};
		return obj1;
	}
	
}