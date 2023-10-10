package HRM_pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class Loging_pageObject {

	private WebDriver driver;
	

	public Loging_pageObject(WebDriver driver) {
		
		this.driver = driver; //==>constructor
		
	}
	

	public void viewLloginPage() {
		 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void setUsernamePassword() throws InterruptedException {
		 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		Thread.sleep(2000);
	}
	
	public void clickLogin() {
		 
		driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]")).click();
		
	}
	
	public void viewHomePage() throws InterruptedException {
		 
		driver.findElement(By.xpath("//h5[text()='Employee Information']")).isDisplayed();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		
	}
	
	
}