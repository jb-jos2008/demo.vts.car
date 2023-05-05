package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DemoPage extends BaseClass{
	@FindBy(id="make-model-search-stocktype")
	public WebElementFacade carType;
	
	@FindBy(id="makes")
	public WebElementFacade makes;
	
	@FindBy(id="models")
	public WebElementFacade model;
	
	
	@FindBy(css = "[data-searchtype='make']")
	public WebElementFacade searchButton;
	
	@FindBy(css = "[data-qa='page_h1']")
	public WebElementFacade searchedCar;
	
	
	
	public void selectCarType() throws InterruptedException {
		selectDropDownValue(carType, "New");
		
	}
	public void selectCarMake() throws InterruptedException {
		selectDropDownValue(makes, "Audi");
		
	}
	public void selectCarModel() throws InterruptedException {
		selectDropDownValue(model, "A5");
		
	}
	public void clickSearchButton()
	{
		clickMethod(searchButton);
	}
	
	
	
	
	public void openBrowser(){
		open();
	}

}
