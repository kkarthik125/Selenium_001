import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class BBC {
	
	
	@Test
	public void testBBC(){
		//System.setProperty("webdriver.ie.driver", "E:\\IE Driver\\IEDriverServer.exe");   
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://bbc.com");   
		
		// it will click on a link named 'Entertainment & Arts'
		driver.findElement(By.xpath("//a[text()='Entertainment & Arts']")).click();
		
		// it will print the title of the last loaded page
		System.out.println(driver.getTitle());        
	}

}
