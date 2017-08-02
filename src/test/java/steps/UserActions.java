package steps;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;

import jline.internal.Log;
import net.thucydides.core.annotations.Step;
import pages.HomePage;
import pages.LoginPage;
import utilities.Props;

public class UserActions {

	LoginPage loginpage;
	HomePage homepage;
	Logger logger=Logger.getLogger("UserActions");

	
	@Step
	public void user_is_one_the_home_page() throws FileNotFoundException{
		try{
		homepage.open();
		logger.info(Props.getConfigData("pageSuccess"));
		}catch(Exception e){
			logger.error(Props.getConfigData("pageError") + e.getMessage());
		}
	}
	@Step
	public void user_navigate_to_the_login_page() throws FileNotFoundException{
		try{
			homepage.clickAccountLink();
			logger.info(Props.getConfigData("linkSuccess"));
		}catch(Exception e){
			logger.error(Props.getConfigData("linkError") + e.getMessage());
		}
	}
	
	@Step
	public void i_enter_the_following_for_Login(String username, String password) throws FileNotFoundException{
		try{
			loginpage.Login(username, password);
			logger.info("User entered"+ username +"and"+ password);
		}catch(Exception e){
			logger.error(Props.getConfigData("textBoxError")  + e.getMessage());
		}
	}
	
	@Step
	public void i_click_for_Login() throws FileNotFoundException{
		try{
			loginpage.ClickLogin();
			logger.info(Props.getConfigData("buttonSuccess"));
		}catch(Exception e){
			logger.error(Props.getConfigData("buttonError") + e.getMessage());
		}
	}

	
}
