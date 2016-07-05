import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Gmail_CssSelector {

	public static void main(String[] args) {


		System.setProperty("webdriver.ie.driver", "E:\\IE Driver\\IEDriverServer.exe");   
		InternetExplorerDriver driver = new InternetExplorerDriver(); 
		driver.get("http://gmail.com");
		
		// to find the username field using css selector
		//driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("ashish");
		
		// to find an element with two attributes using css selector
		//driver.findElement(By.cssSelector("input[id='Email'][name='Email']")).sendKeys("ashish");
		
		// to extract an area of text in gmail.com using css selector
		String x = driver.findElement(By.cssSelector("div[class='product-info mail'] p")).getText();    
		System.out.println(x);      // to print that extracted area of text
		
		// Shortcut in css selector - i.e. if 'id'attribute is there for any element,
		// then we can write as: #value of the id
		driver.findElement(By.cssSelector("#Passwd")).sendKeys("xxxxxxxxxxxx");    
		
		// ^= represents starting with 'Ema'
		//driver.findElement(By.cssSelector("input[name^='Ema']")).sendKeys("starts with");    
		
		// $= represents ending with 'ail'
		driver.findElement(By.cssSelector("input[name$='ail']")).sendKeys("ends with"); 
		
		// *= represents it contains the given text 'mai' either in starting, middle, or ending
		//driver.findElement(By.cssSelector("input[name*='mai']")).sendKeys("contains");         
		
		
	}

}
