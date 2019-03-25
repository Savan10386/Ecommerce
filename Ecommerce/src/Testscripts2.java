import java.io.File;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscripts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = null;
		
		try {
			
			
			
			File file = new File("C:/Users/Savan/git/Ecommerce/Library/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	 		
		 driver =  new ChromeDriver();
	 		
	 		    driver.get("https://www.cleartrip.com/");
	 		    
	 		    driver.manage().window().maximize();
	 		    
	 		    
	 		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 	
	 		
	 		   driver.findElement(By.linkText("Flights")).click();
	 		   
	 		   //driver.findElement(By.xpath("//aside[1]/nav/ul[1]/li[1]")).click();
	 		   
	 		   driver.findElement(By.cssSelector("input#RoundTrip")).click();
                 
	 		   
	 		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 		  
	 		 driver.findElement(By.id("FromTag")).sendKeys("Mumbai");
	 		 
	 		driver.findElement(By.id("ToTag")).sendKeys("Delhi");
	 		
	 		
	 		
	}
		
		finally {
			
		     //driver.close();
			
		}
	}

}
