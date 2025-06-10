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

public class Spcarerequestsummary {WebDriver driver = new ChromeDriver();
@Test
public void f() throws InterruptedException {
	
	 driver.get("http://localhost:8080/CHCP/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	rememberme.click();
	driver.findElement(By.id("btn-login")).click();

	driver.findElement(By.xpath("//a[normalize-space()='Specialty Care']")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 	WebElement clickspsummary = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[normalize-space()='Specialty Care Request Summary'])[1]")));
 	clickspsummary.click(); 
 	Thread.sleep(15000);
 
 	//Select Facility
 	WebElement facility = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterFacilityId-container")));
 	facility.click(); 
    WebElement facoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Athens Correctional Institution (120)')]")));
    facoption.click();
 	
    
    //Select Patient name
    WebElement patientname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select2-autoCompleterPatientName-container")));
    patientname.click(); 
  
   WebElement pnameoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Peck Joseph']")));
    pnameoption.click();
 	
    
    //Select Patient id
    WebElement patientid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select Patient ID')]")));
    patientid.click(); 
    WebElement pidoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='120-P00011']")));
    pidoption.click();
    
  //Select Destination
    WebElement destination = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select Destination')]")));
    destination.click(); 
    WebElement desoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='2020  Medical Consulting Inc']")));
    desoption.click();
	
  //Select visitid
    WebElement visitid = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select Visit ID')]")));
    visitid.click(); 
    WebElement vidoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='120-V01402']")));
    vidoption.click();
    
  //Select visittype
    WebElement visittype = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select Visit Type')]")));
    visittype.click(); 
    WebElement vtyoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='OffSite']")));
    vtyoption.click();
    
    //Select service type
    WebElement servicetype = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Select Service Type')]")));
    servicetype.click(); 
    WebElement stoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='DentalOff']")));
    stoption.click();
    
    //Select Recommendation
    WebElement recommendation = driver.findElement(By.id("recommendation"));
    Select select1 = new Select(recommendation);
    select1.selectByVisibleText("Schedule Speciality Care");
    
  //Select DOS
    WebElement DOS = driver.findElement(By.id("type"));
    Select select2 = new Select(DOS);
    select2.selectByVisibleText("DOS");
    
    //Select INMATE
    WebElement Inmate = driver.findElement(By.id("typeofInmate"));
    Select select3 = new Select(Inmate);
    select3.selectByVisibleText("County Inmate");
    
    
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
    
  //Move to nextpage
    WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='specialityCareLogSummaryTable_next']")));
    nextpage.click();
    
    //page navigation
    WebElement pagenavigation = driver.findElement(By.id("specialityCareLogSummaryTable_paginate"));
    Select select5 = new Select(pagenavigation);
    select5.selectByVisibleText("80");
    
  //Click download
     WebElement download = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@src='../resources/images/excel_small.png'])[1]")));
     download.click(); 
  }
}
