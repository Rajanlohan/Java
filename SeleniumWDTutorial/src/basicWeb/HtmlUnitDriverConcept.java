package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		// advantage of html:
		//1. testing is happening behind the scene --- no browser is launched
		//2. very fast ----  execution of test cases --- very fast --- performance of the script
		//3. not suitable for Actions class --- user actions  --- mousemovement , doubleClick, drag and drop
		//4. Ghost Driver  --- Headless Browser:
		     //--* HtmlUnit Driver  --- Java
		     //--* PhantomJS  -- JavaScript
		
		
		WebDriver driver = new HtmlUnitDriver();
		
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.get("https://classic.crmpro.com/index.html");
	    
	    System.out.println("befor login the title is: "+driver.getTitle());
	    
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("TesterUser");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rajan@012");
	    
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	    
	    Thread.sleep(2000); 
	    System.out.println("after login the title is: "+driver.getTitle());

	}

}
