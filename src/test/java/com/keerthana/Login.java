package com.keerthana.demo.selenium;

import static org.junit.jupiter.api.Assertions.*;


import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Login {
	
	WebDriver driver=new ChromeDriver();



//	@Test
//	void validLogin() {
//		driver.get("http://localhost:3000/login");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sanjai@gmail.com");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
//		driver.findElement(By.id("btnn")).click();
//	}
	
		    @Test
			
			void inValidLogin() {
		    	driver.get("http://localhost:3000/login");
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("keet@gmail.com");
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123");
				driver.findElement(By.id("btnn")).click();
//				assertEquals("Invalid Credentials",driver.switchTo().alert().getText());
//				WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
//				wait.until(ExpectedConditions.alertIsPresent());
//				Alert alert = driver.switchTo().alert();
//				String txt = alert.getText();
//				alert.accept();
//				System.out.println(txt);
//				assertEquals("Invalid Credentials", txt);
			}
	}


