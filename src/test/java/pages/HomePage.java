package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://store.demoqa.com/")
public class HomePage extends PageObject {

	@FindBy(how=How.ID, using="account")
	public WebElementFacade link_account;

    /*Method to open home page*/
	public void openLoginPage(){
		open();

	}

	/* Method to click account link page*/
	public void clickAccountLink(){
		try{

			link_account.click();

		}catch(Exception e){
			e.printStackTrace();
		}
	}

}


