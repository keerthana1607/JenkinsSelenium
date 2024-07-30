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

class Delete {

//	WebDriver driver;
//
//	@BeforeAll
//	void setUp() {
//		driver = new ChromeDriver();
//	}
	
	@Test
	void test() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:3000/ViewUser");
	    driver.manage().window().maximize();
	    driver.findElement(By.cssSelector("tr:nth-child(3) #del")).click();
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		alert.accept();
		assertEquals("Do you want to delete?", txt);
	}

}
