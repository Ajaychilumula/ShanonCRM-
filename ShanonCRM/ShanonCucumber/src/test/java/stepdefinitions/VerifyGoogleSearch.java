package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyGoogleSearch {

	WebDriver driver;
	WebElement search;
	
	@Given("user on Google Page")
	public void user_on_google_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\ShanonCRM\\ShanonCucumber\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Assert.assertEquals(driver.getTitle(), "Google");
		Reporter.log("Google Page is Displayed, PASS",true);
	}

	@When("user enters data")
	public void user_enters_data() {
		search = driver.findElement(By.name("q"));
		search.sendKeys("qspiders");
	}

	@And("user press enter key")
	public void user_press_enter_key() {
		search.sendKeys(Keys.ENTER);
	}

	@Then("user should navigate to search results page")
	public void user_should_navigate_to_search_results_page() {
		Assert.assertEquals(driver.getTitle(), "qspiders - Google Search");
		Reporter.log("Google Results page is Displayed, PASS",true);
	}
}










