package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInAccount {
     public static WebDriver driver;
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\buddi\\eclipse-workspace\\Progressive\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.progressive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
	   driver.findElement(By.xpath("//a[@id='login_link']")).click();
	   
	}

	@When("user enter invalid username")
	public void user_enter_invalid_username() {
	   driver.findElement(By.xpath("(//input/parent::div)[1]")).sendKeys("JohnCena@gmail.com");
	
	}

	@When("user enter invalid password")
	public void user_enter_invalid_password() {
 WebElement   user=driver.findElement(By.className("lh-copy outline-0 input-reset gray-900 b-white ba br2 ph2 ma1 w-100 v-top inputUtilityClass mw5-5 h2-4 b--red-700 inputInvalidClass"));
WebDriverWait wait =new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.textToBePresentInElementValue(user, "bonnybullshit"));
	}

	@When("user click on login")
	public void user_click_on_login() {
	  driver.findElement(By.xpath("//span[text()='Log In']")).click();
	}

	@Then("displays invalid information")
	public void displays_invalid_information() {
	 String title =driver.getTitle();
	System.out.println(title);
	}
}
