package pages;

import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BaseClass extends PageObject {
	

	public void selectDropDownValue(WebElementFacade ele, String value)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(value);
	}
	
	public void clickMethod(WebElementFacade ele)
	{
		ele.waitUntilClickable().click();
	}
}
