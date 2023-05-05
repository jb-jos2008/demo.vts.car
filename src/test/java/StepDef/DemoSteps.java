package StepDef;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DemoPage;



public class DemoSteps 
{
	DemoPage demoPage;
	@Given("Customer open car.com application")
	public void customer_open_car_com_application() {
	 System.out.println("test");  
	 demoPage.openBrowser();
	 }

	@When("Customer select car type")
	public void customer_select_car_type() throws Exception {
		demoPage.selectCarType();
	    
	}

	@When("Customer select car make")
	public void customer_select_car_make() throws Exception {
		demoPage.selectCarMake();
	}

	@When("Customer select car model")
	public void customer_select_car_model() throws Exception {
		demoPage.selectCarModel();
	}

	@When("Customer click search button")
	public void customer_click_search_button() {
		demoPage.clickSearchButton();
	}

	@Then("Customer will see search car are showing")
	public void customer_will_see_search_car_are_showing() {
	    Assert.assertEquals(demoPage.searchedCar.getText(),"New Audi A5 for sale" );
	}

	

}
