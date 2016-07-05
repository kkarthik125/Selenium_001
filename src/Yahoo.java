import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		
		// the below browser name should be read in properties file,
		// but for time being i hardcode like this.
		String browser = "Mozilla";     
		WebDriver driver = null;
		
		if(browser.equals("Mozilla"))
			driver = new FirefoxDriver();
		else if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");   
			driver = new ChromeDriver(); 
		}else if(browser.equals("IE")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//IEDriverServer.exe");   
			driver = new InternetExplorerDriver(); 
		}
		
		// Handling dynamic 'ids' on a page using xpaths
		//System.setProperty("webdriver.ie.driver", "E:\\IE Driver\\IEDriverServer.exe");     
		//InternetExplorerDriver driver = new InternetExplorerDriver(); 
		driver.get("http://yahoo.com"); 
		
		// types "hello" in the search field in yahoo.com
		driver.findElement(By.xpath("//input[@id='p_13838465-p']")).sendKeys("hello");
		
		// waits for 4 secs after typing "hello" in the search field
		Thread.sleep(4000);   
		
		// gets the first suggestion appearing in the list after typing "hello"
		String text = driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_4_0_1_1375')]/ul/li[1]/a")).getText();   
		
		// print the first suggestion
		System.out.println(text);           

		
		
		
		
			
		
	}
	

}
