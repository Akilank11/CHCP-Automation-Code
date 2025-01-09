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

public class PendingExecMDReview {
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
 	WebElement clickspcarestauspending = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Specialty Care Status']")));
 	clickspcarestauspending.click(); 
 	Actions action = new Actions(driver);
 	WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Pending Exec MD Review']"));
 	action.moveToElement(we).click().build().perform();
 	Thread.sleep(10000);
 
 	
 	//Select Facility
    driver.findElement(By.xpath("//span[contains(text(),'Select Facility')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("walton county jail");
    WebElement facility = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Walton County Jail (116)']")));
    facility.click();
    
    //Select patientid
    driver.findElement(By.id("select2-autoCompleterPatientID-container")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("116-P01516");
    WebElement patientid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'116-P01516')]")));
    patientid.click();
    
    //Select patientname
    driver.findElement(By.id("select2-autoCompleterPatientName-container")).click();
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
        Thread.sleep(5000);
        WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
        clear.click(); 
        
      //Move to nextpage
        Thread.sleep(3000);
        WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newVisitSummaryTable_next")));
        nextpage.click();
        
        //page navigation
        WebElement pagenavigation = driver.findElement(By.name("newVisitSummaryTable_length"));
        Select select5 = new Select(pagenavigation);
        select5.selectByVisibleText("80");
        
      //Click download
       

         //Click Clear
     
         
         
         //Review
        Thread.sleep(8000);
         WebElement review = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='row_3119741']//a[contains(text(),'Review')]")));
         review.click();

         WebElement Recommendation = driver.findElement(By.id("recommendation"));
         Select Recommendationselect = new Select(Recommendation);
         Recommendationselect.selectByVisibleText("Internal Consult");
         driver.findElement(By.id("execMDNotes")).sendKeys("Tested");
         Thread.sleep(8000);
         WebElement saveedit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@id='saveSpecialityCare1'])[1]")));
         saveedit.clear();
         driver.findElement(By.xpath("//img[@id='gotoSummary']")).click();
         WebElement download = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".img-responsive.goSummary[src='/CHCP/resources/images/excel.png']")));
         download.click();
         


}}