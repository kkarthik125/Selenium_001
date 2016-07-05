import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class Dropbox {
	
	
	@Test
	public void dropboxsignin(){
		
		System.setProperty("webdriver.ie.driver", "E:\\IE Driver\\IEDriverServer.exe");   
		InternetExplorerDriver d1 = new InternetExplorerDriver();
		d1.get("https://www.dropbox.com");
		d1.findElement(By.xpath("//href[@'/login']")).click();
		d1.findElement(By.xpath("//*[@id='login_email']")).sendKeys("Hello");
		d1.findElement(By.xpath("//*[@id='login_password']")).sendKeys("xxxxx");
		d1.findElement(By.xpath("//*[@id='login_submit']")).click();
		
	}
	
	
}
