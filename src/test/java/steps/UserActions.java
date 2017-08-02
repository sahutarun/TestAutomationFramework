package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;
import pages.LoginPage;

public class UserActions {

	LoginPage loginpage;
	HomePage homepage;
	
	@Step
	public void user_is_one_the_home_page(){
		homepage.open();
	}
	@Step
	public void user_navigate_to_the_login_page(){
		homepage.clickAccountLink();
	}
	
	@Step
	public void i_enter_the_following_for_Login(String username, String password){
		loginpage.Login(username, password);
	}
	
	@Step
	public void i_click_for_Login(){
		loginpage.ClickLogin();
	}

	
}
