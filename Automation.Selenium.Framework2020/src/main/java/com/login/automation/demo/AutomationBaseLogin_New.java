package com.login.automation.demo;

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

public class AutomationBaseLogin_New {
	
	public static void main (String[]args) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "/WebDriver/chromedriver");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://automationpractice.com/index.php");
		System.out.println(driver.getTitle());
		
		
		WebElement login = driver.findElement(By.xpath("//*[@class='login']"));
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid red;');",login);
		login.click();
		System.out.println(driver.getTitle());
		
		// fajle.rabbi.ny@gmail.com-----Student123
		
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		//Thread.sleep(3000);
		
		WebDriverWait obj = new WebDriverWait(driver, 20);  // Explicit wait
		//obj.until(ExpectedConditions.elementToBeClickable(email));
		obj.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//*[@id='email']"), 0));
		js.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid red;');",email); // color highlight
		email.sendKeys("fajle.rabbi.ny@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
		js.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid red;');",password);
		password.sendKeys("Student123");
		Thread.sleep(3000);
		
		WebElement signin = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
		signin.click();
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
