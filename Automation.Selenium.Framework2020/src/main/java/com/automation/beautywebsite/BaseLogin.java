package com.automation.beautywebsite;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.config.BaseConfig;
import com.config.Base_Config;
import com.page.object.model.LoginPage_Repo;

public class BaseLogin {

	public static void main (String[]args) throws Throwable {
		
	
	System.setProperty("webdriver.chrome.driver", "/WebDriver/chromedriver");
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(Base_Config.getconfig("URL"));
	System.out.println(driver.getTitle());
	
	LoginPage_Repo obj = new LoginPage_Repo(driver); // 
	
	//WebElement signin = driver.findElement(By.xpath("//*[@title='Log in to your customer account']"));
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	//js.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid red;');",obj.getSignin());
	obj.getSignin().click();
	System.out.println(driver.getTitle());
	//abc@xyz.com ------ Test@123
	Thread.sleep(5000);
	
	//WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
	js.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid red;');",obj.getEmail());
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(obj.getEmail()));
	//wait.until(ExpectedConditions.visibilityOfAllElements(email));
	obj.getEmail().sendKeys(Base_Config.getconfig("Email"));
	
	//WebElement pass = driver.findElement(By.xpath("//*[@id='passwd']"));
	js.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid red;');",obj.getPass());
	obj.getPass().sendKeys(Base_Config.getconfig("Password"));
	
	//WebElement login = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
	obj.getLogin().click();
	System.out.println(driver.getTitle());
	//driver.quit();
	
		
		
		
		
	}

}
