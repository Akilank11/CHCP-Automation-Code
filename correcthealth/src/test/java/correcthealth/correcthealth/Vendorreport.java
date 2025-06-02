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

public class Vendorreport {
	WebDriver driver = new ChromeDriver();
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
		  driver.get("http://localhost:8080/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
		 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();

		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement Destinationreports = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Destination Reports']")));
		 	Destinationreports.click(); 
		 	WebElement Vendorreport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Vendor Report']"))); 
		 	Vendorreport.click();
	        Thread.sleep(2000);
	        
	//Select Vendor Name
	WebElement Vendorname = driver.findElement(By.id("select2-autoCompleterVendorName-container"));
	Vendorname.click();  
	driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("All");
	Thread.sleep(1000);
	WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='All']")));
	 option.click();
	 Thread.sleep(1000);
	 
	//Select Status
	    WebElement Status = driver.findElement(By.id("status"));
	    Select Statusselect = new Select(Status);
	    Statusselect.selectByVisibleText("Active");
	    
	    //Tax Id
	    //driver.findElement(By.id("taxID")).sendKeys("11");
    
  //Select From date
    driver.findElement(By.id("dateFrom")).click();
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement FROMDATE = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[3]")));
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    WebElement FROMDATEselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='11'][data-month='5'][data-year='2024']")));
    FROMDATEselect.click();
    Thread.sleep(1000);
    
  //Select To date
    driver.findElement(By.id("dateTo")).click();
    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement Todate = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[9]")));
    Todate.click();
    WebElement Todateselect = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='30'][data-month='4'][data-year='2025']")));
    Todateselect.click();
    Thread.sleep(2000);

	
    driver.findElement(By.id("newSearch")).click();
    
    Thread.sleep(3000);
    driver.findElement(By.id("clearSearch")).click();
	}}
