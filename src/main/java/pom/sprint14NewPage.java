
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



import reuseablePackage.feature.AllActions;



public class sprint14NewPage {

// public WebDriver driver=null;

// public sprint14NewPage (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 
	public sprint14NewPage (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//*[@id='userName']")public WebElement name;

@FindBy(xpath="//*[@id='password']")public WebElement password;

@FindBy(id="loginBtn")public WebElement login;
//pomStart
	


}
