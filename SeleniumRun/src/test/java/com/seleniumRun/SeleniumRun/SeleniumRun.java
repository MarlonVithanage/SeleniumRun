package com.seleniumRun.SeleniumRun;

import java.util.List; 

import org.junit.jupiter.api.BeforeAll;  
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumRun {
	
	//declaring driver to be acccessible for all methods
	
	static WebDriver driver;
	
	@BeforeAll
	
	//Opening the website
	public static void openLink () {
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.leafground.com/link.xhtml");
	}
	
	@Test
	public void tasks () throws InterruptedException {
		
		//Going to dashboard
		
		driver.findElement(By.linkText("Go to Dashboard")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Printing the URL of the link
		
		WebElement getLink = driver.findElement(By.partialLinkText("Find the URL "));
		String path = getLink.getAttribute("href");
		System.out.println("Link is:" + path);
	
		//Checking if the link is broken
		
		driver.findElement(By.linkText("Broken?")).click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("Link is Broken");
		} else {
			System.out.println("Link Works");
		}
		Thread.sleep(2000);
		driver.navigate().back();

		
		//Counting the amount of links
		driver.findElements(By.tagName("a")).size();
		System.out.println("Total Links:" +driver.findElements(By.tagName("a")).size());
		
		//Counting layout links
		WebElement layout = driver.findElement(By.className("layout-main-content"));
		List<WebElement> layoutlinks = layout.findElements(By.tagName("a"));
		int layoutlinksCount = layoutlinks.size();
		System.out.println("layout link count:" + layoutlinksCount); 
		
	}


}
