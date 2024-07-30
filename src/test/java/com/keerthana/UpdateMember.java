package com.keerthana.demo.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class UpdateMember {

	@Test
	void test() {
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost:3000/ViewUser");
	    driver.manage().window().maximize();
	   	    driver.get("http://localhost:3000/EditUser/12");
	    driver.findElement(By.name("email")).sendKeys("viraj@gmail.com");
	   
	    driver.findElement(By.name("username")).sendKeys("viraj KL");
	    
	    driver.findElement(By.name("Age")).sendKeys("35");
	    driver.findElement(By.name("updating")).click();
	}

}
