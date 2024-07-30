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

class AddMaster  {
	
	WebDriver driver=new ChromeDriver();

//	@Test
//	void test()  throws InterruptedException {
//		
//		WebDriver driver=new ChromeDriver();
//		
//
//		
//		driver.get("http://localhost:3000/AppRoute");
//	    driver.manage().window().maximize();
//	    driver.findElement(By.linkText("Trainers")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.linkText("Add +")).click();
//	    Thread.sleep(2000);
//	    
//	    driver.findElement(By.name("name")).sendKeys("varathan");
//	    Thread.sleep(2000);
//	   
//	    driver.findElement(By.name("specialist")).sendKeys("leg trainer");
//	    Thread.sleep(2000);
//	   
//	    driver.findElement(By.name("availability")).sendKeys("8AM to 5PM");
//	    Thread.sleep(2000);
//	   
//	    driver.findElement(By.name("city")).sendKeys("park town");
//	    Thread.sleep(2000);
//	    driver.findElement(By.name("btnk")).click();
//	    
//	    
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		String txt = alert.getText();
//		alert.accept();
//		assertEquals("Data added Successfully", txt);
//	}
//	
	@Test
	void invalidinputs() {
		driver.get("http://localhost:3000/ViewMaster");
	    driver.manage().window().maximize();
	    driver.findElement(By.linkText("Add +")).click();
	    
	    driver.findElement(By.name("name")).sendKeys("siva");
	   
	    driver.findElement(By.name("availability")).sendKeys("5PM to 9PM");
	    driver.findElement(By.name("city")).sendKeys("sivagangai");
	    driver.findElement(By.name("btnk")).click();
	    
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		
		String txt = alert.getText();
		alert.accept();
		assertEquals("Please enter specialist!!!", txt);
	}

}
