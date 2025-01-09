package correcthealth.correcthealth;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Vendorsmodule {WebDriver driver = new ChromeDriver();
//WebDriver driver;
//FirefoxOptions firefoxoptions = new FirefoxOptions();
//ChromeOptions chromeoptions = new ChromeOptions();
//EdgeOptions edgeoptions = new EdgeOptions();

//@Parameters("browser")
//@BeforeTest

//public void initialize(String browser) 

//{
	// if (browser.equalsIgnoreCase("chrome")) {
          
           // driver = new ChromeDriver();
        //} else if (browser.equalsIgnoreCase("firefox")) {
            
            //driver = new FirefoxDriver();
       // } else if (browser.equalsIgnoreCase("edge")) {
           
            //driver = new EdgeDriver();
        //}
        //driver.manage().window().maximize();
    //}
@Test
public void f() throws InterruptedException {
	  driver.get("http://localhost:8090/CHCP/login");
	 	driver.manage().window().maximize();
	 	
	 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	 	driver.findElement(By.id("password")).sendKeys("Dev@9090");
	 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	 	rememberme.click();
	 	driver.findElement(By.id("btn-login")).click();

	 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement otherbill = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Vendors Module']")));
	 	otherbill.click(); 
	 	Thread.sleep(3000);
	 	WebElement xraybill = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Vendors User Accounts']"))); 
	 	xraybill.click();
  Thread.sleep(2000);
  
  
//Create New Vendors Accounts
 driver.findElement(By.id("newAdminAcc")).click();
 WebElement VENDORNAME = driver.findElement(By.id("vendorRowid"));
 Select select = new Select(VENDORNAME);
 select.selectByVisibleText("ABBOTT");
 Thread.sleep(2000);
 WebElement Status = driver.findElement(By.id("status"));
 Select select1 = new Select(Status);
select1.selectByVisibleText("Active");
Thread.sleep(1000);
WebElement vendorclassid =driver.findElement(By.xpath("//input[@id='vendorClassID']"));
 vendorclassid.sendKeys("ven1123");
 Thread.sleep(2000);
 driver.findElement(By.id("email")).sendKeys("akilanksa110@gmail.com");
 driver.findElement(By.xpath("//button[normalize-space()='Send Credentials Email']")).click();
 WebElement popup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='ok']"))); 
 popup.click();
 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
 WebElement fileInput = wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("file")));
File fileToUpload = new File("C:\\Users\\panini019\\Pictures\\Screenshots\\Screenshot 2024-11-22 102736.png"); // Update with the path to your PNG file
fileInput.sendKeys(fileToUpload.getAbsolutePath());
driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("(//img[@class='img-responsive goSummary'])[1]")).click();

//Edit Vendor Account
WebElement edit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[@id='row_3']//td[@class='edit-control']"))); 
edit.click();
driver.findElement(By.id("vendorClassID")).clear();
driver.findElement(By.id("vendorClassID")).sendKeys("aKILAN123");
driver.findElement(By.id("email")).clear();
driver.findElement(By.id("email")).sendKeys("akilanksa210@gmail.com");
driver.findElement(By.id("//button[normalize-space()='Send Credentials Email']")).click();
//driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

  }
}
