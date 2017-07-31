package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import base.CommonFunctions;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

	@FindBy(how = How.ID, using = "log")
	public WebElementFacade txtUserName;

	@FindBy(how = How.ID, using = "pwd")
	public WebElementFacade txtPassword;

	@FindBy(how = How.ID, using = "login")
	public WebElementFacade btnLogin;
	
	CommonFunctions functions = new CommonFunctions();

	/* Function to enter username and password*/
	public void Login()
	{
		txtUserName.type("admin");
		txtPassword.type("adminPassword");
	}

	/* Function to enter click login button*/
	public void ClickLogin()
	{
		functions.click(btnLogin);
	}

}
