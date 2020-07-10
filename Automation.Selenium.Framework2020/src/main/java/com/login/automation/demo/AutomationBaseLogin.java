package com.login.automation.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.page.object.model.LoginPage;

//http://automationpractice.com/index.php

public class AutomationBaseLogin {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "/WebDriver/chromedriver");
		WebDriver driver = new ChromeDriver(); // upcasting polymorphism
		driver.manage().window().maximize();
		// Full Size Browser
		// driver.manage().window().fullscreen();

		driver.get("http://automationpractice.com/index.php");

		/*
		 * driver.navigate().to("http://automationpractice.com/index.php");
		 * driver.navigate().back(); driver.navigate().forward();
		 * driver.navigate().refresh();
		 */

		/*
		 * // HTML =<a class="login"/> 1) Basic xpath formula = //*[@locator = 'value']
		 * ==> //*[@class='login'] 2)Xpath with method formula =
		 * //*[contains(@locator,'value')] ==> //*[contains(@class,'login')] 3) text()
		 * formula = //*[text()='text value'] ==> //*[text()='sign in'] 4)text()with
		 * xpath method formula = //*[contains(text(),'')] ==> //*[contains(text(),'sign
		 * in')]
		 */
		System.out.println(driver.getTitle());

		LoginPage pagefactory = new LoginPage(driver);
		pagefactory.getSignInBtn().click();
		
		
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Thread.sleep(3000);

		// WebElement SignInbtn = driver.findElement(By.xpath("//*[@class='login']"));

		JavascriptExecutor js = (JavascriptExecutor) driver; // Type casting polymorphism (Relation betw Interface with
																// driver and create a Obj)
		js.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid red;');",
				pagefactory.getSignInBtn()); // button color
		// driver.findElement(By.xpath("//*[@class='login']")).click();
		pagefactory.getSignInBtn().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.elementToBeClickable());
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		

		System.out.println(driver.getTitle());

		pagefactory.getemailbox();
		// WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		js.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid red;');",
				pagefactory.getemailbox());
		pagefactory.getemailbox().sendKeys("fajle.rabbi@yahoo.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Thread.sleep(3000);

		pagefactory.getpasswordinputbox();
		// WebElement pass = driver.findElement(By.xpath("//*[@id='passwd']"));
		js.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px solid red;');",
				pagefactory.getpasswordinputbox());
		pagefactory.getpasswordinputbox().sendKeys("12345678");
		
		

	}

}
