package com.ontargetcloud.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Register {
	WebDriver driver;
	JavascriptExecutor jse;

	public void Invokemybrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium latest\\driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://qa.ontargetcloud.com/#/signin");
			Thread.sleep(3000);
			Signup();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Signup() {
		
		try {
			driver.findElement(By.xpath("/html/body/div[3]/div/div/signin-component/div/div[2]/p/strong/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("firstName")).sendKeys("Isha");
			driver.findElement(By.name("lastName")).sendKeys("Khanal");
			driver.findElement(By.name("email")).sendKeys("ishakhanaljuly8test2@mailinator.com");
			driver.findElement(By.name("area_code")).clear();
			driver.findElement(By.name("area_code")).sendKeys("977");
			driver.findElement(By.name("phone_number")).sendKeys("98765432110");
			
			WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/div/div/signin-component/div/div[2]/div/div[2]/form/div[8]/button[1]"));
			jse = (JavascriptExecutor)driver;
			// Scrolling down the page till the element is found		
	        jse.executeScript("arguments[0].scrollIntoView();", Element);
			driver.findElement(By.id("auto")).sendKeys("Test");
			//selecting from dropdown
			driver.findElement(By.xpath("/html/body/div[3]/div/div/signin-component/div/div[2]/div/div[2]/form/div[5]/div/div[1]/span")).click();
			//set password
			driver.findElement(By.name("password")).sendKeys("Ishaqa@2020");
			//agreement
			driver.findElement(By.id("agreeTerms")).click();
			//register button
			driver.findElement(By.xpath("/html/body/div[3]/div/div/signin-component/div/div[2]/div/div[2]/form/button")).click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}	
		
	public static void main(String[] args) {
		Register myObj =  new Register();
		myObj.Invokemybrowser();	
		

	}

}
