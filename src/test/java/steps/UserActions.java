package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class UserActions {

	LoginPage loginpage;
	
	@Step
	public void i_navigate_to_the_login_page(){
		loginpage.openLoginPage();
	}
	
	@Step
	public void i_enter_the_following_for_Login(){
		loginpage.Login();
	}
	
}
