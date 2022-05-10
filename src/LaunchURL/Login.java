package LaunchURL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Selenium_soft\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		System.out.println("Before  launching");
		driver.get("https://www.saucedemo.com/");
		System.out.println("After launching");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//driver.close();
	}

}
