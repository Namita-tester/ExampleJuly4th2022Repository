package com.sgtesting.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//WebElement for User Name Text Field
	private WebElement username;
	
	public WebElement getUserName()
	{
		return username;
	}

	//WebElement for Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//WebElement for Login Button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//WebElement for Users
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement oUsers;
	public WebElement getUSERS()
	{
		return oUsers;
	}
	
	//WebElement for AddUser
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement oAddUser;
	public WebElement getAddUser()
	{
		return oAddUser;
		
	}
	
	//WebElement for Firstname1
	@FindBy(xpath="//*[@id=\'userDataLightBox_firstNameField\']")
	private WebElement oFirstName;
	public WebElement getFirstName1()
	{
		return oFirstName;
	}
	

	//WebElement for Lastname1
	@FindBy(xpath="//*[@id=\'userDataLightBox_lastNameField\']")
	private WebElement oLastName;
	public WebElement getLastName()
	{
		return oLastName;
	}
	

	//WebElement for Emailid1
	@FindBy(xpath="//*[@id=\'userDataLightBox_emailField\']")
	private WebElement oEmailId;
	public WebElement getEmailID()
	{
		return oEmailId;
	}
	
	//WebElement for UserName
		@FindBy(xpath="//*[@id=\'userDataLightBox_usernameField\']")
		private WebElement oUserName;
		public WebElement getUserName1()
		{
			return oUserName;
		}
	
			//WebElement for Password
			private WebElement password;
			public WebElement getPassword1()
			{
				return password;
			}
			
		//WebElement for Retype-password
		private WebElement passwordCopy;
		public WebElement getReTypePassword1()
		{
			return passwordCopy;
		}
	

	//WebElement for CreateUser
	private WebElement userDataLightBox_commitBtn;
	public WebElement getCreateUser1()
	{
		return userDataLightBox_commitBtn;
	}
	
	//WebElement for click on user1
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement name;
	public WebElement getClickUser1()
	{
		return name;
	}
	
	
	
	
	//WebElement for click on delete button
	
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getClickDeleteUser1()
	{
		return userDataLightBox_deleteBtn;
	}
	
	
	//WebElement for modify email
	
	@FindBy(xpath="//*[@id=\'userDataLightBox_emailField\']")
	private WebElement oEmailIdModify;
	public WebElement getEmailIDModify()
	{
		return oEmailIdModify;
	}
	
	//WebElement for modify email savechanges
	
		@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']")
		private WebElement oEmailIdModifySaveChanges;
		public WebElement getEmailIDModifySaveChanges()
		{
			return oEmailIdModifySaveChanges;
		}
	
		//WebElement for create customer
		@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a ")
		private WebElement oTaskManager;
		public WebElement getTaskManager()
		{
			return oTaskManager;
		}
		
		//WebElement for click add new
		@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div ")
		private WebElement oAddNew1;
		public WebElement getAddNew()
		{
			return oAddNew1;
		}
		
		
		//WebElement for click add customer
				@FindBy(xpath=" /html/body/div[14]/div[1]")
				private WebElement oAddCustomer;
				public WebElement getAddCustomer()
				{
					return oAddCustomer;
				}
				

				//WebElement for click add customername
				@FindBy(xpath="//*[@id=\'customerLightBox_nameField\']")
				private WebElement oAddCustomerName;
				public WebElement getAddCustomerName()
				{
					return oAddCustomerName;
				}
				
				//WebElement for click add customerdescription
				@FindBy(xpath="//*[@id=\'customerLightBox_descriptionField\']")
				private WebElement oAddCustomerDescription;
				public WebElement getAddCustomerDescription()
				{
					return oAddCustomerDescription;
				}
				
				//WebElement for create customer button
				@FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
				private WebElement oCreateCustomer;
				public WebElement getCreateCustomer()
				{
					return oCreateCustomer;
				}
				
				//WebElement for delete customer goto settings icon
				@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
				private WebElement oSettingIconOfCustomer;
				public WebElement getSettingIconOfCustomer()
				{
					return oSettingIconOfCustomer;
				}
				
				//WebElement for Action button of customer
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
				private WebElement oActionButtonOfCustomer;
				public WebElement getActionButtonOfCustomer()
				{
					return oActionButtonOfCustomer;
				}
				
				//WebElement for Del Button of customer
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
				private WebElement oDelButtonOfCustomer;
				public WebElement getDelButtonOfCustomer()
				{
					return oDelButtonOfCustomer;
				}
				
				//WebElement for Del Permanently Button
				@FindBy(xpath=" //*[@id=\'customerPanel_deleteConfirm_submitTitle\']")
				private WebElement oDelPermanentlyButton;
				public WebElement getDelPermanentlyOfCustomer()
				{
					return oDelPermanentlyButton;
				}
			
				//WebElement for
				 @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
				 private WebElement oCloseButtonOfCustomer;
				public WebElement getCloseButtonOfCustomer()
				{
					return oCloseButtonOfCustomer;
				}
				
				
				//WebElement for
				@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
				private WebElement oModifyCustomerDescription;
				public WebElement getModifyCustomerDescription()
				{
					return oModifyCustomerDescription;
				}
				
				
				//WebElement for 
				@FindBy(xpath="/html/body/div[14]/div[2]")
				private WebElement oCreateProject;
				public WebElement getCreateProject()
				{
					return oCreateProject;
				}
				
				
				//WebElement for
				@FindBy(xpath="//*[@id=\'projectPopup_projectNameField\']")
				private WebElement oEnterProject;
				public WebElement getEnterProjectName()
				{
					return oEnterProject;
				}
							
				
				//WebElement for
				@FindBy(xpath="//*[@id='projectPopup_commitBtn']")
				private WebElement oCreateProjectButton;
				public WebElement getCreateProjectButton()
				{
					return oCreateProjectButton;
				}
							
				
				//WebElement for 
				@FindBy(xpath="//*[@id='projectPopup_newCustomerNameField']")
				private WebElement oEnterCustomerNameForProject;
				public WebElement getEnterCustomerNameForProject()
				{
					return oEnterCustomerNameForProject;
				}
				
				
				
				//WebElement for 
				@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
				private WebElement oClickOnProjectSettingIcon;
				public WebElement getClickOnProjectSettingIcon()
				{
					return oClickOnProjectSettingIcon;
				}
				
				
				//WebElement for
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
				private WebElement oActionButtonProject;
				public WebElement getActionButtonProject()
				{
					return oActionButtonProject;
				}
				
							
				//WebElement for 
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
				private WebElement oDelProject;
				public WebElement getDelProject()
				{
					return oDelProject;
				}
				
				//WebElement for 
				@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitBtn\']/div")
				private WebElement oDeletePermanentlyProject;
				public WebElement getDeletePermanentlyProject()
				{
					return oDeletePermanentlyProject;
				}
				
						
							
				//WebElement for 
				@FindBy(xpath="//*[@id='projectPopup_projectDescriptionField']")
				private WebElement oAddProjectDescription;
				public WebElement getAddProjectDescription()
				{
					return oAddProjectDescription;
				}
				
				
				
				//WebElement for
				@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
				private WebElement oModifyProjectDescription;
				public WebElement getModifyProjectDescription()
				{
					return oModifyProjectDescription;
				}
				
				
				
				//WebElement for 
				@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")
				private WebElement oCloseActionPageOfProject;
				public WebElement getCloseActionPageOfProject()
				{
					return oCloseActionPageOfProject;
				}
				
				
				/*
				//WebElement for
				@FindBy(xpath="")
				private WebElement o;
				public WebElement get()
				{
					return o;
				}
				
				
				
				//WebElement for
				@FindBy(xpath="")
				private WebElement o;
				public WebElement get()
				{
					return o;
				}
				
				
				//WebElement for
				@FindBy(xpath="")
				private WebElement o;
				public WebElement get()
				{
					return o;
				}
			   
			   
			   //WebElement for
			   @FindBy(xpath="")
			   private WebElement o;
				public WebElement get()
				{
					return o;
				}
				
				
				//WebElement for
				@FindBy(xpath="")
				private WebElement o;
				public WebElement get()
				{
					return o;
				}
				
				
				//WebElement for 
				@FindBy(xpath="")
				private WebElement o;
				public WebElement get()
				{
					return o;
				}
				
				
				//WebElement for
				@FindBy(xpath="")
				private WebElement o;
				public WebElement get()
				{
					return o;
				}
				
				
				
				//WebElement for
				@FindBy(xpath="")
				private WebElement o;
				public WebElement get()
				{
					return o;
				}
				
				
				
				//WebElement for
				@FindBy(xpath="")
				private WebElement o;
				public WebElement get()
				{
					return o;
				}
				*/
				
				
	//WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogoutLink()
	{
		return oLogout;
	}	
}