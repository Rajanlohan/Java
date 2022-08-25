package automationWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebChrome {

	public static void main(String[] args) {
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajan\\Downloads\\chromedriver_win32-unzip\\chromedriver.exe");	
		
	   WebDriver driver = new ChromeDriver();
	
       driver.get("http://www.google.com");
       
       String title = driver.getTitle();
       System.out.println(title);
    
       if(title.equals("Google"))
       {
    	   System.out.println("correct title");
       }
       else
       {
    	   System.out.println("incorrect title");
       }
       
       System.out.println(driver.getCurrentUrl());       
	}

}
