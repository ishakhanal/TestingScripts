package com.ontargetcloud.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	WebDriver driver;
	public void Invokemybrowser1() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium latest\\driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://qa.ontargetcloud.com/#/signin");
			Thread.sleep(3000);
			Loginuser();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Loginuser() {
		driver.findElement(By.name("username")).sendKeys("ishakhanaljuly8@mailinator.com");
		driver.findElement(By.name("password")).sendKeys("Ishaqa@2020");
		driver.findElement(By.xpath("/html/body/div[3]/div/div/signin-component/div/div[2]/div/div/div[2]/form/div[3]/button")).click();
	}
	
	public static void main(String[] args) {
		Login myObj =  new Login();
		myObj.Invokemybrowser1();

	}

}
