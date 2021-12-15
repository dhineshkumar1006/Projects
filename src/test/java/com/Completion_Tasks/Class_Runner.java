package com.Completion_Tasks;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class Class_Runner extends Class_Base {
	
static Logger log = Logger.getLogger(Class_Base.class);	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		BasicConfigurator.configure();
		 
		log.info("browser launched");
		
		getbrowser("chrome");
		
		geturl("http://automationpractice.com/index.php");
		
		WebElement sigin = driver.findElement(By.xpath("//a[@class='login']"));
				clickonelement(sigin);
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
				passvalue(email, "dhineshfb10@gmail.com");
		
		WebElement pswd = driver.findElement(By.xpath("(//input[@type='password'])"));
				passvalue(pswd, "dinu20");
		
		WebElement accsign = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
				clickonelement(accsign);
		
		log.info("account get signin");
		
		WebElement tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		getmouse("moveto", tshirts);
		
		log.info("tshirt clicked");
		
		
		
		WebElement imagecl = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		gettouch("arguments[0].scrollIntoview|();", imagecl);
		
		log.info("image touched");
		
		WebElement addcart = driver.findElement(By.xpath("(//a[@title='Add to cart'])"));
		
		getmouse("moveto", addcart);
		log.info("added to the cart");
		
		Thread.sleep(5000);
		WebElement firstproceedbtn = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])"));
		getmouse("moveto", firstproceedbtn);
		log.info("first proceed clicked");
		
		WebElement secondprobtn = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		
		getmouse("moveto", secondprobtn);
		log.info("second btn clicked");
		
		WebElement thirdprobtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		getmouse("moveto", thirdprobtn);
		log.info("thirdprobtn clicked");
		
		WebElement tick = driver.findElement(By.xpath("(//input[@type='checkbox'])"));
		
		getmouse("moveto", tick);
		log.info("tick");
		
		WebElement fourthprobtn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		getmouse("moveto", fourthprobtn);
		log.info(fourthprobtn);
		
	}
}
		
		
		
		
		
		
		
		
	
	



