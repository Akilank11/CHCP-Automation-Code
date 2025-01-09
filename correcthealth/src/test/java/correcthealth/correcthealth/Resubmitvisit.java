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

public class Resubmitvisit { 
	WebDriver driver = new ChromeDriver();


@Test
public void f() throws InterruptedException {
	
	 driver.get("http://localhost:8090/CHCP/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Dev@9090");
	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	rememberme.click();
	driver.findElement(By.id("btn-login")).click();

	driver.findElement(By.xpath("//a[normalize-space()='Specialty Care']")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 	WebElement clickspsummary = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Specialty Care Status']")));
 	clickspsummary.click(); 
 	Thread.sleep(15000);
 	
 	WebElement resubmitvisit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Resubmit Visits']")));
 	resubmitvisit.click(); 
 	Thread.sleep(2000);
 	//Select Facility
    driver.findElement(By.id("select2-autoCompleterFacilityIdResubmit-container")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("walton county jail");
    WebElement facility = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Walton County Jail (116)']")));
    facility.click();
    
    //Select patientid
    driver.findElement(By.xpath("//span[@id='select2-autoCompleterPatientIDResubmit-container']")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("116-P01516");
    WebElement patientid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'116-P01516')]")));
    patientid.click();
    
    //Select patientname
    driver.findElement(By.id("select2-autoCompleterPatientNameResubmit-container")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("test user akilan");
    WebElement patientname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Test user Akilan')]")));
    patientname.click();
    
  //Select Destination
    driver.findElement(By.xpath("//span[contains(text(),'Select Destination')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("ganga");
    WebElement destination = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Ganga Hospital']")));
    destination.click();
    
    //Select referrer
    driver.findElement(By.xpath("//span[contains(text(),'Select Referrer')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("akilanksa10");
    WebElement referrer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='akilanksa10@gmail.com']")));
    referrer.click();
    
  //Select visitid
    driver.findElement(By.xpath("//span[contains(text(),'Select Visit ID')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("116-V03086");
    WebElement VISITID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='116-V03086']")));
    VISITID.click();

    
    //Select visitTYPE
      driver.findElement(By.xpath("//span[contains(text(),'Select Visit Type')]")).click();
      driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("OnSite");
      WebElement Visittype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='OnSite']")));
      Visittype.click();


      //Select Servicetype
        driver.findElement(By.xpath("//span[contains(text(),'Select Service Type')]")).click();
        driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("DentalOn");
        WebElement Servicetype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='DentalOn']")));
        Servicetype.click();

      //Select Status
        WebElement Status = driver.findElement(By.id("specialityCareStatus"));
        Select select4 = new Select(Status);
        select4.selectByVisibleText("Active");
       
      //Click Search
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
        search.click(); 
        
        //Click Clear
        WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
        clear.click(); 
        
 	//Resubmit edit
        WebElement resubmitedit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='Resubmit'])[1]")));
        resubmitedit.click(); 
        driver.findElement(By.id("internalNotes")).sendKeys("Verify and Submit");
        driver.findElement(By.id("resubmitAndUpdatedVisitsBtn")).click();
        driver.findElement(By.xpath("//img[@id='gotoSummary']")).click();
}}