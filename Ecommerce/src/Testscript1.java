
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;



public class Testscript1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		try {
		
	
		
		File file = new File("C:/Users/savan/git/Ecommerce/Ecommerce/Library/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
 		
		ChromeDriver driver =  new ChromeDriver();
 		
 		    driver.get("https://www.snapdeal.com/");
 		    
 		    driver.manage().window().maximize();
 		    
 		    
 		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		   
 		    
 		     driver.findElement(By.name("keyword")).sendKeys("TSHIRT");
 		     
 		     
 		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		    
            
 		     driver.findElement(By.className("searchTextSpan")).click();
 		     
 		     
 		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		    
 		    
 		   driver.findElement(By.xpath("//*[@id='content_wrapper']/div[7]/div[4]/div/div[1]/div[2]/div[3]/div[3]/div/div[1]")).click();
 		
 		
 		   Thread.sleep(5000);
 		   
 		  	    
 		 driver.findElement(By.xpath("/html/body/div[11]/div[7]/div[4]/div/div[1]/div[2]/div[4]/div[3]/div/div[1]")).click();
 		 
 	//	String windowHandle = driver.getWindowHandle();
 		 
 		  Thread.sleep(5000);
 		 
 		 driver.findElement(By.linkText("product-title")).click();
 		  		
 		
 	/*	Thread.sleep(5000);
 				
 		Actions action= new Actions(driver);
 		
 		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
 		
 		driver.findElement(By.xpath("/html/body/div[11]/div[7]/div[5]/div[3]/div[7]/section/div/div[3]/div[1]/a")).click();
 		 		
 				 		
 		Thread.sleep(5000);
 		
 		
 		driver.findElement(By.name("inputValEnter")).sendKeys("test");*/
 		
		}
		
		catch (Exception e) {
			
			System.out.println(e);
		}
 		 
 		
 		
}
}
