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

public class claimreceivedreport {WebDriver driver = new ChromeDriver();
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
	 	WebElement otherbill = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Claims Reports']")));
	 	otherbill.click(); 
	 	Thread.sleep(3000);
	 	WebElement xraybill = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Claims Received Report']"))); 
	 	xraybill.click();
Thread.sleep(2000);

//Select Facility
WebElement facility = driver.findElement(By.id("facilityCode"));
Select facilityselect = new Select(facility);
facilityselect.selectByVisibleText("All");

//Select from month
WebElement frommonth = driver.findElement(By.id("fromMonth"));
Select frommonthselect = new Select(frommonth);
frommonthselect.selectByVisibleText("January");

//Select from year
WebElement fromyear = driver.findElement(By.id("fromYear"));
Select fromyearselect = new Select(fromyear);
fromyearselect.selectByVisibleText("2019");

//Select To month
WebElement tomonth = driver.findElement(By.id("toMonth"));
Select tomonthselect = new Select(tomonth);
tomonthselect.selectByVisibleText("December");

//Select To year
WebElement toyear = driver.findElement(By.id("toYear"));
Select toyearselect = new Select(toyear);
toyearselect.selectByVisibleText("2019");

driver.findElement(By.id("newSearch")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[normalize-space()='Clear']"));






  }
}
