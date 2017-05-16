package com.wbl.restApi_restAssured_Automation;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.pojos.TwitterAccount;

import io.restassured.specification.RequestSpecification;

public class RestAssuredTest  extends BaseTest{

	RequestSpecification rs;

	@BeforeClass
	public void before() {
		rs = given().auth().oauth("mWfW59HF0Rqx5M5zn5ppR3iGG", "jICqsMPVEtLwiRqvQrl5sjF9KUT3W7RGDBqm1G5YlVEDWrl1bv",
				"738049748985204736-KqojDhKb9m7HsWA1ijQ9KaIgi2RLzoC", "Hits9HjjbtDPL8yqGxu5TsXbnrtXBRm7aEqLftbF0qOvf");
	}

	@Test
	public void testGetValid() {
		rs.when().get("settings.json").then().statusCode(200);
	}
	
	@Test
	public void testGetInvalid() {
		rs.when().get("settis.json").then().statusCode(404);
	}
	@Test
	public void testActualResponseElementPresence(){
		rs.when().get("settings.json").then().body(containsString("discoverable_by_mobile_phone"));
	}
	
	@Test
	public void testActualResponseValuePresence(){
		rs.when().get("settings.json").then().body("screen_name",
				equalTo("Medha_7886"));
	}
	
	@Test
	public void testInnerElement(){
		rs.when().get("settings.json").then().body("sleep_time.enabled",equalTo(false))
		.body("always_use_https", equalTo(true));
	}
	
	@Test
	public void postTestWithRestAssured(){
		//method 1
		/*Map<String,String> reqData= new HashMap<String,String>();
		reqData.put("name","TEst786");
		reqData.put("location","CA");*/
		
		//method2
		TwitterAccount reqData = new TwitterAccount();
		reqData.setLocation("US");
		reqData.setName("Medha");
		
		rs.when().contentType("application/json").body(reqData).post("update_profile.json").then().statusCode(200);
	}

}