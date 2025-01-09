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

public class patientsreport {
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
		 	driver.findElement(By.id("password")).sendKeys("Dev@9090");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();

		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement patientrecord = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Patients Reports']")));
		 	patientrecord.click(); 
		 	WebElement inpatientrecord = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='InPatients Report']"))); 
		 	inpatientrecord.click();
	Thread.sleep(2000);

	 //Select Facility
    driver.findElement(By.id("select2-autoCompleterFacilityId-container")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("walton county jail");
    WebElement facility = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Walton County Jail (116)']")));
    facility.click();
   
    
    //Select status
    WebElement status = driver.findElement(By.id("status"));
    Select statusselect = new Select(status);
    statusselect.selectByVisibleText("Active");
    
  //Select Patient id
    driver.findElement(By.id("select2-autoCompleterPatientID-container")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("116-P01516");
    WebElement patientid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='116-P01516']")));
    patientid.click();
 
    
    //Select Patient Name
    driver.findElement(By.id("select2-autoCompleterPatientName-container")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("test user akilan");
    WebElement patientname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Test User Akilan']")));
    patientname.click();
 
    
    
    
  //Select booking
    driver.findElement(By.id("select2-autoCompleterBookingNumber-container")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("All");
    WebElement booking = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='All']")));
    booking.click();
    
    //Select Inmate
    driver.findElement(By.id("select2-autoCompleterInmateNumber-container")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("All");
    WebElement Inmate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='All']")));
    Inmate.click();
    
    
  //Select type OF INMATE
    WebElement typeofinmate = driver.findElement(By.id("typeofInmate"));
    Select typeofinmateselect = new Select(typeofinmate);
    typeofinmateselect.selectByVisibleText("County Inmate");
  
    
    //Select Housedin
    driver.findElement(By.id("select2-autoCompleterHousedIn-container")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("All");
    WebElement Housedin = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='All']")));
    Housedin.click();
    
    
 
    //Select Datetype
    WebElement Datetype = driver.findElement(By.id("datetype"));
    Select Datetypeselect = new Select(Datetype);
    Datetypeselect.selectByVisibleText("Housed In");
 

  //Select from date
    driver.findElement(By.id("dateFrom")).click();
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement FROMDATE = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[3]")));
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    WebElement dosselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='30'][data-month='5'][data-year='2024']")));
    dosselect.click();
 
    
    
    //Select Invoice date
    driver.findElement(By.id("dateTo")).click();
    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement TODATE = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[9]")));
    TODATE.click();
    TODATE.click();
    TODATE.click();
    TODATE.click();
    TODATE.click();
    WebElement dos1select = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='6'][data-year='2024']")));
    dos1select.click();
    //WebElement invoice = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("endDateFilter")));
    //invoice.sendKeys("07/15/2024");
    //invoice.click();
    WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Speciality Care Visits Report']")));
    search.click(); 
    Thread.sleep(2000);
    WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
    clear.click();
    
    
  }
}
