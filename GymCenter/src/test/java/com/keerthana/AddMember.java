package com.keerthana.demo.selenium;

import static org.junit.jupiter.api.Assertions.*;


import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class AddMember {
	
	WebDriver driver=new ChromeDriver();

//	@Test
//	void test() throws InterruptedException{
//
//		
//
//		
//		driver.get("http://localhost:3000/AppRoute");
//	    driver.manage().window().maximize();
//	    driver.findElement(By.linkText("Members")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.linkText("Add +")).click();
//	    Thread.sleep(2000);
//	    
//	    driver.findElement(By.name("username")).sendKeys("viraj");
//	    Thread.sleep(2000);
//	    
//	    driver.findElement(By.name("city")).sendKeys("salem");
//	    Thread.sleep(2000);
//	    
//	    driver.findElement(By.name("email")).sendKeys("vi@gmail.com");
//	    Thread.sleep(2000);
//	    
//	    driver.findElement(By.name("Age")).sendKeys("32");
//	    Thread.sleep(2000);
//	    
//	    driver.findElement(By.cssSelector("div:nth-child(6) > .form-control")).click();
//	    {
//	      WebElement dropdown = driver.findElement(By.cssSelector("div:nth-child(6) > .form-control"));
//	      dropdown.findElement(By.xpath("//option[. = 'leg trainer']")).click();
//	    }
//	    
//	    driver.findElement(By.name("btnm")).click();
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		String txt = alert.getText();
//		alert.accept();
//		assertEquals("Data added successfully!", txt);
//	}
//	
	@Test
	void testInvalid()
	{
		driver.get("http://localhost:3000/ViewUser");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("Add +")).click();
	    driver.findElement(By.name("username")).click();
	    driver.findElement(By.name("username")).sendKeys("ganesh");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).sendKeys("g@gmail.com");
	    driver.findElement(By.name("Age")).click();
	    driver.findElement(By.name("Age")).sendKeys("22");
	    driver.findElement(By.cssSelector("div:nth-child(6) > .form-control")).click();
	    {
	      WebElement dropdown = driver.findElement(By.cssSelector("div:nth-child(6) > .form-control"));
	      dropdown.findElement(By.xpath("//option[. = 'personal trainer']")).click();
	    }
	    driver.findElement(By.name("btnm")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		
		String txt = alert.getText();
		alert.accept();
		assertEquals("Please Enter Valid Inputs!!!", txt);
	    
	  }
	}


