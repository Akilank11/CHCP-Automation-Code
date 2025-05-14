package correcthealth.correcthealth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Claimstatusreport {WebDriver driver = new ChromeDriver();
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
	 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
	 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	 	rememberme.click();
	 	driver.findElement(By.id("btn-login")).click();

	 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement otherbill = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Claims Reports']")));
	 	otherbill.click(); 
	 	Thread.sleep(3000);
	 	WebElement xraybill = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Claims Status Report']"))); 
	 	xraybill.click();
Thread.sleep(2000);

//Select Facility
WebElement facility = driver.findElement(By.id("facilityCode"));
Select facilityselect = new Select(facility);
facilityselect.selectByVisibleText("All");

//Select Vendor
WebElement vendorid = driver.findElement(By.id("vendorID"));
Select vendoridselect = new Select(vendorid);
vendoridselect.selectByVisibleText("All");

//Select Filterby
WebElement filterby = driver.findElement(By.id("filterBy"));
Select filterbyselect = new Select(filterby);
filterbyselect.selectByVisibleText("DOS");


//Select from date
driver.findElement(By.id("fromDate")).click();
WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement FROMDATE = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[3]")));
FROMDATE.click();
FROMDATE.click();
FROMDATE.click();
FROMDATE.click();
FROMDATE.click();
FROMDATE.click();
WebElement dosselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='30'][data-month='10'][data-year='2024']")));
dosselect.click();

//Select Invoice date
driver.findElement(By.id("toDate")).click();
WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement TODATE = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[9]")));
TODATE.click();
TODATE.click();
TODATE.click();
TODATE.click();
TODATE.click();
WebElement dos1select = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='11'][data-year='2024']")));
dos1select.click();

//Select Bill Status
WebElement billstatus = driver.findElement(By.id("claimsBillStatus"));
Select billstatusselect = new Select(billstatus);
billstatusselect.selectByVisibleText("All");


//Select Payable Status
WebElement payablestatus = driver.findElement(By.id("claimsPayableStatus"));
Select payablestatusselect = new Select(payablestatus);
payablestatusselect.selectByVisibleText("All");


driver.findElement(By.id("newSearch")).click();
Thread.sleep(6000);
driver.findElement(By.xpath("//button[normalize-space()='Clear']")).click();

}}