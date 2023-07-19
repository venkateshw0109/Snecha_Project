package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\mages\\Downloads\\Sencha_Project\\Sencha_Project\\src\\test\\java\\com\\feature\\sencha.feature",
                 glue = "com.stepefinition",
                 plugin ="html:target/report.html")
public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		driver = BaseClass.browser("edge");
		driver.manage().window().maximize();
	}

}
