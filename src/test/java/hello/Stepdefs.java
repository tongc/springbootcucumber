package hello;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class Stepdefs {
    WebDriver driver = new FirefoxDriver();

	@Before
	public void setup() throws IOException {
	}

	@After
	public void destroy() {
		if(driver != null) {
			driver.close();
		}
	}

	@When("^I go to the hello page$")
	public void i_go_to_the_hello_page() throws Throwable {
		driver.get("http://localhost:8080/hello");
	}

	@When("^I click \"(.*?)\"$")
	public void i_click(String elementName) throws Throwable {
		driver.findElement(By.name(elementName)).click();
	}

	@When("^I follow \"(.*?)\"$")
	public void i_follow(String linkText) throws Throwable {
		driver.findElement(By.linkText(linkText)).click();
	}

	@Then("^I expect to see \"(.*?)\"$")
	public void i_expect_to_see(String text) throws Throwable {
		assertTrue(driver.findElement(By.id("message")).getText().equals(text));
	}
}
