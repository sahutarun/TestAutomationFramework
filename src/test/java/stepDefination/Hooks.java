package stepDefination;

import org.apache.log4j.PropertyConfigurator;

import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void setup()throws Exception{
		PropertyConfigurator.configure("Log4j.properties");

	}
	

}
