package com.keerthana.demo.selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class UpdateMaster {

	@Test
	void test() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:3000/ViewMaster");
	    driver.manage().window().maximize();
	    
	    driver.get("http://localhost:3000/EditMaster/6");
	    
	    driver.findElement(By.name("availability")).sendKeys("8AM to 8PM");
	    
	    driver.findElement(By.name("specialist")).sendKeys("leg & hand trainer");
	    driver.findElement(By.name("updated")).click();
	
	}

}
