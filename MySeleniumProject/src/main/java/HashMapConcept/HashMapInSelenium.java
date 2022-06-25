package HashMapConcept;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Scenario : Different Users/Roles : Permission Based User Management System.
		/*category manager user --go to the app--add all the products
		  ~customer user --go to the app-- buy a product --place an order
		~admin user --go to the app-- can see all the orders
		~Seller user --go to the app--see only those orders which are relevant
		~Distributor User - go to the app--can see the respective order
		~Delivery Boy User --go to the app--can see the order and deliver the product
		customer care user --go to the app-- log a ticket
		*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/ ");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		//driver.findElement(By.xpath("//a[@class='btn btn-sm btn-white btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30']")).click();
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Poojaranip14@gmail.com");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Premamadhav1@");*/
		System.out.println(getCredentialMap());
		//duplicate keys are not allowed.
		System.out.println(getCredentialMap().get("Costumer"));
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(getUserName("admin"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(getPassword("admin"));
	}
	public static HashMap<String,String> getCredentialMap() {
		HashMap<String, String> usermap=new HashMap<String, String>();//hashmap store the data in form of key and value pair
		//one string for user that means costumer/seller/admin and other string is for there username and password
		usermap.put("Costumer", "Poojaranip14@gmail.com:Premamadhav1@");//value is user name and password so seperated by ":"
		usermap.put("admin", "Arpit@gmail.com:krishna123");
		usermap.put("distributer", "gulnaz@gmail.com:Gulnaz@");
		usermap.put("seller", "chetna@gmail.com:chetna1@");
		usermap.put("deliverygirl", "reshma@gmail.com:Reshma1@");
		usermap.put("seller", "PRIYA:1234566");//dulpicate are not allowed it will print only one seller that is the latest one becoz it override..
	return usermap;
	}
	
	public static String getUserName(String role) {
		String Credential=getCredentialMap().get(role);
		return Credential.split(":")[0];
	}
	public static String getPassword(String role) {
		String Credential=getCredentialMap().get(role);
		return Credential.split(":")[1];
	}
}
