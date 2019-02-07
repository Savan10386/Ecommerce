
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class Testscript1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		File file = new File("C:/Users/Savan/git/Ecommerce/Library/chromedriver.exe");
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
 		    
 		/*List<WebElement> options  =  driver.findElements(By.xpath("//div[7]/div[4]/div/div[1]/div[2]/div[3]"));
 		
 		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		    
 		 for(WebElement option : options)
 		    {
 		    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		    	 
 		    	   System.out.println(option.getAttribute("value"));
 		    }*/
	}

}
