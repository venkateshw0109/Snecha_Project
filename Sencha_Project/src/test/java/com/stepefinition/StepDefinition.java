package com.stepefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {

	@Given("User Launch the Application")
	public void user_launch_the_application() {

		driver.get("https://examples.sencha.com/extjs/6.0.0/examples/admin-dashboard/#dashboard");
	}

	@When("User Click the Pages button and scroll down and click the login button")
	public void user_click_the_pages_button_and_scroll_down_and_click_the_login_button() throws InterruptedException {

		
		
		driver.switchTo().frame("examples-iframe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[@id='ext-treelistitem-6']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='ext-element-46']")).click();
	}

	@When("User Enter the valid user id {string}")
	public void user_enter_the_valid_user_id(String string) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		driver.findElement(By.xpath("//label[text()='Sign into your account']//following-sibling::div//child::div//child::div//child::div//child::input")).sendKeys(string);

	}

	@When("User Enter the valid password {string}")
	public void user_enter_the_valid_password(String string) {

		driver.findElement(By.xpath("//div[@id='textfield-1104']//child::div//child::div//child::div//child::input")).sendKeys(string);

	}

	@When("User click the login button")
	public void user_click_the_login_button() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[@class='x-btn x-unselectable x-box-item x-btn-soft-green-large']//child::span//child::span//child::span[text()='Login']")).click();
	}

	@Then("login Successfully")
	public void login_successfully() {
		String title = driver.getTitle();
		System.out.println(title);
		String title1= "Sencha | Ext JS Examples";
		System.out.println("Next page");
		if (title==title1) {
			System.out.println("Login Page is Validated");
			
		}else {
			System.out.println("Login Functionality Fails");
		}
	}
	
	@When("User Click the Email Icon")
	public void user_click_the_email_icon() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().defaultContent();
		driver.switchTo().frame("examples-iframe");
		
		driver.findElement(By.xpath("(//div[text()='Email'])[1]")).click();
	}

	@When("User Open one mail from Rhea Clemons in the inbox")
	public void user_open_one_mail_from_rhea_clemons_in_the_inbox() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//table[@id='tableview-1130-record-105']/tbody/tr/td[4]")).click();
	}

	@Then("User Verify that it contains the message {string}")
	public void user_verify_that_it_contains_the_message(String string) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 WebElement expected = driver.findElement(By.xpath("//div[@id='component-1143']"));

	String expectedtext = expected.getText();
	System.out.println(expectedtext);
	if (expectedtext==string) {
		System.out.println("Equal");
	}
	}


}
