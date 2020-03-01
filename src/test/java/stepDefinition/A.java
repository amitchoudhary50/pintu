package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;

public class A {
	 @Given("^User is on Home Page$")
	 public void user_is_on_Home_Page() throws Throwable {
	       
	        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://www.store.demoqa.com");
	 }
	 
//	 @When("^User Navigate to LogIn Page$")
//	 public void user_Navigate_to_LogIn_Page() throws Throwable {
//	 driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//	 }
//	 
//	 @When("^User enters UserName and Password$")
//	 public void user_enters_UserName_and_Password() throws Throwable {
//	 driver.findElement(By.id("log")).sendKeys("testuser_1"); 
//	     driver.findElement(By.id("pwd")).sendKeys("Test@123");
//	     driver.findElement(By.id("login")).click();
//	 }
}
