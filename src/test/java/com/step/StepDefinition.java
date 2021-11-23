package com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("user is on adactin login page")
	public void user_is_on_adactin_login_page() {
		 WebDriverManager.chromedriver().setup();
		   driver =new ChromeDriver();
		   driver.get("https://adactinhotelapp.com/");
		   driver.manage().window().maximize();
	}

	@When("enter the details valid {string} and  {string}")
	public void enter_the_details_valid_and(String email, String pass) {
	    WebElement txtusername = driver.findElement(By.id("username"));
	    txtusername.sendKeys(email);
	    WebElement txtpass = driver.findElement(By.id("password"));
	    txtpass .sendKeys(pass);
	}

	@When("click on login button")
	public void click_on_login_button() {
	   WebElement btnLogin = driver.findElement(By.id("login"));
	   btnLogin.click();
	}

	@Then("verify adactin")
	public void verify_adactin() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


	}


