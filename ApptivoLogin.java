package com.Finance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ApptivoLogin
{
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
//		WebDriver driver = new FirefoxDriver();
		
		//To launch the chrome browser
		System.setProperty("webdriver.chrome.driver","/home/grajan/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseurl = "https://www.apptivo.com/ ";
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//To maximize the browser window
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log In")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//To enter user name
		WebElement email = driver.findElement(By.name("login_email"));
		email.sendKeys("sanitytesting@berijam.com");
		
		//To enter password
		WebElement password = driver.findElement(By.name("login_password"));
		password.sendKeys("welcome123");
		
		//To click Login button
		WebElement login = driver.findElement(By.id("sign_up_button"));
		login.click();
		System.out.println("Login done with click");
		
		
		
		//To click Log off
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("drop3")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fat-menu\"]/ul/li[2]/button")).click();	
		System.out.println("Logged off Successfully");
		
		//To close the current browser window
		driver.close();
 
		
	}

	

}


