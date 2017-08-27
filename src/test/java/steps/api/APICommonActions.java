package steps.api;


import java.util.List;

import jline.internal.Log;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class APICommonActions {
	
	@Step
	public void getCall(String strAPIURl){
		try{
			SerenityRest.given().contentType("application/json")
            .when().get(strAPIURl);
		}catch(Exception e){
			Log.error(e.getMessage());
		}
	}
	
	@Step
	public int getStatusCode(){
        return SerenityRest.then().extract().statusCode();
    }
	
	@Step
    public String getComments(){
        return SerenityRest.then().extract().body().jsonPath().get("body[0]");     
    }
	
	@Step
    public void postCall(String body){
        SerenityRest.given().contentType("application/json")
        .when().body(body).post("http://localhost:3000/comments");
    }
	
	
		
	}


