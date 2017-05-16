package com.wbl.restApiAutomation;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.helper.ExcelHelper;

public class TestTwitterApi {
	
	@DataProvider(name="postdata")
	@Test
	public Object[][] testData(){
		return ExcelHelper.getData("/rest-data/postdata-twitter.xlsx","post");
	}
	
	@Test
	public void testGetAccountSettings() throws ParseException, IllegalStateException, IOException{
		TwitterRestApi twitter = new TwitterRestApi();
		HttpResponse response = twitter.getData("account/settings.json");
		System.out.println(response.getStatusLine().getStatusCode());
		assertEquals(200,response.getStatusLine().getStatusCode());
		//parsing the json
		JSONObject jsonObject = new JSONObject(IOUtils.toString(response.getEntity().getContent()));
		System.out.println(jsonObject.get("screen_name"));
		assertEquals("en", jsonObject.get("language"));
		assertEquals("Medha_7886", jsonObject.get("screen_name"));
	}
	
	@Test(dataProvider="postdata")
	public void testPostAccountSettings(String resource,String name,String location,String expectedName) throws ParseException, IllegalStateException, IOException{
		TwitterRestApi twitter = new TwitterRestApi();
		
		//setting body for post-way1
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("name", name);
		jsonobject.put("location", location);
	//	HttpEntity reqentity = new StringEntity(jsonobject.toString());
		
		//or
		
		//setting body for post-way2
		List<NameValuePair> entity = new ArrayList <NameValuePair>();
		entity.add(new BasicNameValuePair("name", name));
		entity.add(new BasicNameValuePair("location", location)); 
		HttpEntity reqentity = new UrlEncodedFormEntity(entity);
		
		HttpResponse response = twitter.postData(resource,reqentity);
		
		assertEquals(200,response.getStatusLine().getStatusCode());
		//parsing the json
		JSONObject jsonrespObject = new JSONObject(IOUtils.toString(response.getEntity().getContent()));

		System.out.println(jsonrespObject.toString());
		
		System.out.println(jsonrespObject.get("screen_name"));
		assertEquals(expectedName, jsonrespObject.get("name"));
		assertEquals("Medha_7886", jsonrespObject.get("screen_name"));
		//traversing into complex json
		jsonrespObject = jsonrespObject.getJSONObject("entities");
		jsonrespObject = jsonrespObject.getJSONObject("description");
		JSONArray array = jsonrespObject.getJSONArray("urls");
		System.out.println("size of array:"+array.length());
		/*for(int i=0;i<array.length();i++){
			JSONObject obj =array.getJSONObject(i);
			obj.get("city");
			obj.get("zip");
		}*/
	}
	
	

}
