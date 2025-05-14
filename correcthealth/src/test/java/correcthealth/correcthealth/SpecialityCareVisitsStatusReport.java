package correcthealth.correcthealth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SpecialityCareVisitsStatusReport {
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
		 	WebElement specialitycarevisitireport = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Speciality Care Visit Reports']")));
		 	specialitycarevisitireport.click(); 
		 	WebElement specialitycarevisitistatusreports = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Speciality Care Visits Status Report']"))); 
		 	specialitycarevisitistatusreports.click();
	Thread.sleep(2000);


	//Select Facility
	Actions act = new Actions(driver);

	//Double click on element
	WebElement ele = driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_facilityID']//option[@value='80'][normalize-space()='Acadia Parish Jail (182)']")); 
	act.doubleClick(ele).perform();
	//WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='newSearch']")));
	//search.click(); 
	//Thread.sleep(2000);
	//WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
	//clear.click();
	
	 //Select visittype
    WebElement visittype = driver.findElement(By.id("visitType"));
    Select visittypeselect = new Select(visittype);
    visittypeselect.selectByVisibleText("OnSite");
    
  //Select from date
    driver.findElement(By.id("startDateFilter")).click();
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement FROMDATE = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[9]")));
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    FROMDATE.click();
    WebElement dosselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='30'][data-month='10'][data-year='2024']")));
    dosselect.click();



    //Select Invoice date
    driver.findElement(By.id("endDateFilter")).click();
    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement TODATE = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[15]")));
    TODATE.click();
    TODATE.click();
    TODATE.click();
    TODATE.click();
    TODATE.click();
    WebElement dos1select = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='11'][data-year='2024']")));
    dos1select.click();
    //WebElement invoice = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("endDateFilter")));
    //invoice.sendKeys("07/15/2024");
    //invoice.click();
    WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
    search.click(); 
    Thread.sleep(2000);
    WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Clear']")));
    clear.click();

	}}