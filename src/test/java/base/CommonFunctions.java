package base;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CommonFunctions extends PageObject {

	public void click(WebElementFacade by){
		try{
			if(by.isCurrentlyEnabled()){
				by.click();
			}
			else{
				System.out.print("Element not visible");
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}



}
