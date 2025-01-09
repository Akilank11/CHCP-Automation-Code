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

public class Reviewandpushgpdata {
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
		  driver.get("http://localhost:8090/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
		 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();

		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement Gppayments = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='GP Payments']")));
		 	Gppayments.click(); 
		 	Thread.sleep(3000);
		 	WebElement reviewandpushgpdata = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Review and Push GP Data']"))); 
		 	reviewandpushgpdata.click();
	Thread.sleep(2000);


	//Select Facility
    WebElement expense = driver.findElement(By.id("facilityCode"));
    Select expensetype = new Select(expense);
    expensetype.selectByVisibleText("Muscogee County Prison");
	WebElement reviewgpdata = wait.until(ExpectedConditions.elementToBeClickable(By.id("newSearch")));
	reviewgpdata.click();
	WebElement clear = wait.until(ExpectedConditions.elementToBeClickable(By.id("clearSearch")));
	clear.click();
Thread.sleep(2000);

	//select Vendor
	//driver.findElement(By.xpath("//span[contains(text(),'Select Vendor')]")).click();
	//driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("THE HUGHSTON CLINIC PC");
	//Thread.sleep(1500);
	//WebElement Vendor = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='THE HUGHSTON CLINIC PC']")));
	//Vendor.click();
	//reviewgpdata.click();
	//clear.click();
	//Thread.sleep(2000);
	
	//Select Batch Id
	driver.findElement(By.id("batchId")).sendKeys("DIAM 240315 IP");
	reviewgpdata.click();
	clear.click();
	Thread.sleep(2000);
	
	//Select Invoice No
	driver.findElement(By.id("invoiceNumber")).sendKeys("180-I00003");
	reviewgpdata.click();
	clear.click();
	Thread.sleep(2000);
	
	//Select Document Nbr
		driver.findElement(By.id("documentNumber")).sendKeys("IN001405204");
		reviewgpdata.click();
		clear.click();
		Thread.sleep(2000);
	
	//select Invoicefromdateselect
	           driver.findElement(By.id("invoiceFromDateFilter")).click();
	           WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		           WebElement Invoicefromdate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
		           Invoicefromdate.click();
		           Invoicefromdate.click();
		           Invoicefromdate.click();
		           Invoicefromdate.click();
		           Invoicefromdate.click();
		           Invoicefromdate.click();
		           Invoicefromdate.click();
		           Invoicefromdate.click();
		           Invoicefromdate.click();
		           Invoicefromdate.click();
		           WebElement Invoicefromdateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='11'][data-month='2'][data-year='2024']")));
		           Invoicefromdateselect.click();
		
		         //select Invoicetodateselect
		           driver.findElement(By.id("invoiceToDateFilter")).click();
		           WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			           WebElement Invoicetodate = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[10]")));
			           Invoicetodate.click();
			           Invoicetodate.click();
			           Invoicetodate.click();
			           Invoicetodate.click();
			           Invoicetodate.click();
			           Invoicetodate.click();
			           Invoicetodate.click();
			           Invoicetodate.click();
			           Invoicetodate.click();
			        WebElement Invoicetodateselectselect = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='11'][data-month='3'][data-year='2024']")));
			        Invoicetodateselectselect.click();
			        reviewgpdata.click();
			    	clear.click();
			    	Thread.sleep(2000);

			    	//select Dosfromdateselect
			           driver.findElement(By.id("dateFrom")).click();
			           WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
				           WebElement Dosfromdate = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[16]")));
				           Dosfromdate.click();
				           Dosfromdate.click();
				           Dosfromdate.click();
				           Dosfromdate.click();
				           Dosfromdate.click();
				           Dosfromdate.click();
				           Dosfromdate.click();
				           Dosfromdate.click();
				           Dosfromdate.click();
				           Dosfromdate.click();
				           Dosfromdate.click();
				           WebElement Dosfromdateselect = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='11'][data-month='1'][data-year='2024']")));
				           Dosfromdateselect.click();
				
				         //select Dostodateselect
				           driver.findElement(By.id("dateTo")).click();
				           WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
					           WebElement Dostodate = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[22]")));
					           Dostodate.click();
					           Dostodate.click();
					           Dostodate.click();
					           Dostodate.click();
					           Dostodate.click();
					           Dostodate.click();
					           Dostodate.click();
					           Dostodate.click();
					           WebElement Dostodateselect = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='20'][data-month='4'][data-year='2024']")));
					           Dostodateselect.click();
					           reviewgpdata.click();
						    	clear.click();
						    	Thread.sleep(2000);
			        
			        
			        
	}}