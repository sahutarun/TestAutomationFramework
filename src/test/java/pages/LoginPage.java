package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.executeautomation.com/demosite/Login.html")
public class LoginPage extends PageObject {

    @FindBy(how = How.NAME, using = "UserName")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "Password")
    public WebElement txtPassword;

    @FindBy(how = How.NAME, using = "Login")
    public WebElement btnLogin;

    public void openLoginPage(){
    	open();

    }
    public void Login()
    {
        txtUserName.sendKeys("admin");
        txtPassword.sendKeys("adminPassword");
    }

    public void ClickLogin()
    {
        btnLogin.submit();
    }
    
}
