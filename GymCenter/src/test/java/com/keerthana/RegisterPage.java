package com.keerthana.demo.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class RegisterPage {
	

	@Test
	void testMain() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:3000/");
		driver.manage().window().maximize();
		driver.findElement(By.name("entry-btn")).click();
		
		driver.findElement(By.name("userName")).sendKeys("sanjai ram");
		
		driver.findElement(By.name("email")).sendKeys("sanjai@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("123");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("123");
		driver.findElement(By.name("btton-primary")).click();

	}
	

}
