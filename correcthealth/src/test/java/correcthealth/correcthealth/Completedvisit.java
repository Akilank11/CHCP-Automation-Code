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

public class Completedvisit {WebDriver driver = new ChromeDriver();


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
 	WebElement clickspsummary = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Specialty Care Status']")));
 	clickspsummary.click(); 
 	Thread.sleep(15000);
 	//Actions action = new Actions(driver);
 	//WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Internal Consult']"));
 	//action.moveToElement(we).click().build().perform();
 	WebElement completevisit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Completed Visits']")));
 	completevisit.click(); 
 	Thread.sleep(5000);
 	
 	
	//Select Facility
    driver.findElement(By.id("select2-autoCompleterFacilityIdCompletedVisits-container")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Walton County Jail");
    WebElement facility = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Walton County Jail (116)']")));
    facility.click();
    
    //Select patientid
    driver.findElement(By.xpath("//span[contains(text(),'Select Patient ID')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("116-P01516");
    WebElement patientid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'116-P01516')]")));
    patientid.click();
    
    //Select patientname
    driver.findElement(By.xpath("//span[contains(text(),'Select Patient Name')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Test user Akilan");
    WebElement patientname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Test user Akilan')]")));
    patientname.click();
    
  //Select Destination
    driver.findElement(By.xpath("//span[contains(text(),'Select Destination')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Ganga Hospital");
    WebElement destination = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Ganga Hospital']")));
    destination.click();
    
    //Select referrer
    driver.findElement(By.xpath("//span[contains(text(),'Select Referrer')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("akilanksa10@gmail.com");
    WebElement referrer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='akilanksa10@gmail.com']")));
    referrer.click();
    
  //Select visitid
    driver.findElement(By.xpath("//span[contains(text(),'Select Visit ID')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("116-V03085");
    WebElement VISITID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='116-V03085']")));
    VISITID.click();

    
    //Select visitTYPE
      driver.findElement(By.xpath("//span[contains(text(),'Select Visit Type')]")).click();
      driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("OffSite");
      WebElement Visittype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='OffSite']")));
      Visittype.click();


      //Select Servicetype
        driver.findElement(By.xpath("//span[contains(text(),'Select Service Type')]")).click();
        driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Eye");
        WebElement Servicetype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Eye']")));
        Servicetype.click();

      //Select Status
        //WebElement Status = driver.findElement(By.id("specialityCareStatus"));
        //Select select4 = new Select(Status);
        //select4.selectByVisibleText("Active");
       
      //Click Search
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
        search.click(); 
        
        //Click Clear
        Thread.sleep(5000);
        WebElement cleartext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
        cleartext.click();
        
        //Click View
        Thread.sleep(5000);
        
        WebElement clickview = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='row_3119769']//a[contains(text(),'View')]")));
        clickview.click();
        
        driver.findElement(By.xpath("(//img[@class='img-responsive goSummary'])[1]")).click();
        Thread.sleep(5000);
        WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("completedVisitsSummaryTable_next")));
        nextpage.click();
        WebElement pagenavigation = driver.findElement(By.name("completedVisitsSummaryTable_length"));
        Select select4 = new Select(pagenavigation);
        select4.selectByVisibleText("80");
        Thread.sleep(8000);
        WebElement download = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".img-responsive.goSummary[src='/CHCP/resources/images/excel.png']")));
        download.click();
}}