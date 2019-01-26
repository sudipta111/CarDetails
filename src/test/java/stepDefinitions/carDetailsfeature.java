package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CoverCheck_Page;

public class carDetailsfeature {
	
	WebDriver driver = null;

	@Before
	public void StartBrowser() {
		System.setProperty("webdriver.chrome.driver", "Lib//chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//logger.info("browser starting");
	}

	@After
	public void quitBrowser() {
		//driver.quit();
	}
	@Given("^I am in the website$")
	public void i_am_in_the_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.get("https://covercheck.vwfsinsuranceportal.co.uk/");
	}
	@When("^I enter carNo \"([^\"]*)\"$")
	public void i_enter_carNo(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		CoverCheck_Page coverP = new CoverCheck_Page();
		
		coverP.txtbx_CarRegNo(driver).sendKeys(arg1);
		
	}

	@When("^click find vehicle$")
	public void click_find_vehicle() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		CoverCheck_Page coverP = new CoverCheck_Page();
		coverP.btn_FindVehicle(driver).click();
	}
	@Then("^I should see the search results$")
	public void i_should_see_the_search_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		CoverCheck_Page coverP = new CoverCheck_Page();
		if (coverP.ele_Result(driver).isDisplayed()) {
			assertTrue(coverP.ele_Result(driver).isDisplayed());
	}

	}
}
