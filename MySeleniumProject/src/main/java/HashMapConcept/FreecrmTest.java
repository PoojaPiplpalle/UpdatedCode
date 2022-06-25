package HashMapConcept;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreecrmTest {
	WebDriver driver;
	String credential;
	public String CredentialInfo[];

	@BeforeMethod
	
	public void setUp() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/ ");
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
	}

	@Test(priority=1)
	public void CostumerloginTest() throws InterruptedException {
		credential = FreecrmData.getUserLoginInfo().get("Costumer");
		 CredentialInfo = credential.split("_");
Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys( CredentialInfo[0]);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys( CredentialInfo[1]);
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/ ");
		Select select=new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText(FreecrmData.monthmap().get(4));
		
		Thread.sleep(3000);
	}

	@Test(priority=2)
	public void adminTest() throws InterruptedException {

		String credential = FreecrmData.getUserLoginInfo().get("admin");
		 CredentialInfo = credential.split("_");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(CredentialInfo[0]);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(CredentialInfo[1]);
		Thread.sleep(2000);
		
	}
	@AfterMethod
	public void Quit() {
		
		driver.quit();
	}
	

}
