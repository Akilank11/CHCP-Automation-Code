package correcthealth.correcthealth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Xraybills {WebDriver driver = new ChromeDriver();
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
		 	WebElement otherbill = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Other Bills']")));
		 	otherbill.click(); 
		 	Thread.sleep(3000);
		 	WebElement xraybill = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='X-Ray Bills']"))); 
		 	xraybill.click();
	  Thread.sleep(2000);
	 
	  
	  //Select Facility
	  driver.findElement(By.xpath("//span[contains(text(),'Select Facility')]")).click();
	  driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Baldwin");
	  WebElement facility = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Baldwin County Jail (188)']")));
	  facility.click();
	  
	  //select Vendor
	  driver.findElement(By.xpath("//span[contains(text(),'Select Vendor')]")).click();
	  driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("diamond p");
	  WebElement Vendor = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='DIAMOND PHARMACY SERVICES']")));
	  Vendor.click();

	//select dos
	               driver.findElement(By.id("dosStr")).click();
	               WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		           WebElement dos = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[3]")));
		           dos.click();
		           dos.click();
		           dos.click();
		           dos.click();
		           dos.click();
		           dos.click();
		           WebElement dosselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='30'][data-month='5'][data-year='2024']")));
		           dosselect.click();
		
	//Select Invoice date
		           WebElement invoice = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("invoiceDateStr")));
		           invoice.sendKeys("07/15/2024");

	//Bill Status
			       driver.findElement(By.xpath("//span[contains(text(),'Select Bill Status')]")).click();
			       driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Approved");
			       WebElement billstatus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Approved']")));
			       billstatus.click();
			  
	//Payable Status
				    driver.findElement(By.xpath("//span[contains(text(),'Select Payable Status')]")).click();
				    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Approved");
				    WebElement payablestatus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Approved']")));
				    payablestatus.click();
			  
	// Click Search and Clear
				    WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
			        search.click(); 
			        Thread.sleep(3000);
			        WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
			        clear.click();

	//Page navigation
			        WebElement pagenavigation = driver.findElement(By.name("xRayBillsSummaryTable_length"));
			        Select select4 = new Select(pagenavigation);
			        select4.selectByVisibleText("80");
			        Thread.sleep(3000);
			        WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("xRayBillsSummaryTable_next")));
			        nextpage.click();
			        Thread.sleep(5000);
			        WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("xRayBillsSummaryTable_previous")));
			        previous.click();
			        Thread.sleep(8000);
			      
			        
			        
	//Edit Pharmacy
			        
			        WebElement download = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".img-responsive.goSummary[src='/CHCP/resources/images/excel.png']")));
			        download.click();
			        
			        
			        
			        
	}
	}
