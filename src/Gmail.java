import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class Gmail {
	
	@Test
	public void testHomePage(){
		
		FirefoxDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//IEDriverServer.exe");   
		//WebDriver driver = new InternetExplorerDriver(); 
		driver.get("http://gmail.com");    // get function will navigate to the given URL 
		
		// this line is used to find the element on a webpage using the id
		/*WebElement username = driver.findElement(By.id("Email")); 
		
        // sendkeys is used to type into an element		        
		username.sendKeys("dummyname");                                   
		
		// Identification of the element
		WebElement password = driver.findElement(By.name("Passwd"));
		
		// Operation on the element
		password.sendKeys("xxxxxxx");                                    
		
		// Identification of the element
		WebElement button = driver.findElement(By.id("signIn")); 
		
		// Operation on the element
		button.click();                                                  
		
		*/
		// Above program in a simplified manner
		/*driver.findElement(By.id("Email")).sendKeys("dummyname");
		driver.findElement(By.name("Passwd")).sendKeys("xxxxxxx");  
		driver.findElement(By.id("signIn")).click();*/
				
		// this line will write "hai" in the username field in gmail.com using xpaths
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/form/div[1]/input")).sendKeys("hai");
		
		// this is the own customized xpath. This xpath is for an area of text which is present in gmail.com
		String x = driver.findElement(By.xpath("//div[@class='mail-about-col-left']/p")).getText();           
		
		// This line will print that area of text in gmail.com
		System.out.println(x);                                                                                
		
		// this will give error because there should not be two class names in a single line
		//driver.findElement(By.className("g-button g-button-submit")).click();
		
		// - this line will click the signin button on gmail.com
		driver.findElement(By.xpath("//input[@class='g-button g-button-submit']")).click();     
	}

}
	