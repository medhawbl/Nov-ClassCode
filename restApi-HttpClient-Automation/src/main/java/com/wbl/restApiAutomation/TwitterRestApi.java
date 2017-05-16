package com.wbl.restApiAutomation;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import com.wbl.base.HttpBaseApi;


public class TwitterRestApi extends HttpBaseApi {

	public HttpResponse getData(String resource) {

		HttpResponse response = null;

		HttpGet get = get(resource);

		//adding header
		get.addHeader("content-type", "application/json");

		try {
			try{
				consumer.sign(get);
				}catch(Exception e){
					e.printStackTrace();
				}
			response = client.execute(get);

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

		return response;
	}

	public HttpResponse postData(String resource,HttpEntity entity) {
		
		HttpResponse response = null;

		HttpPost post = post(resource);

		try {
			// method 1 to create post request entity/payload
			// creating the rquest data
			//StringEntity entity = new StringEntity(req.toString(),"UTF8");
			
			// setting the request entity/payload to post method
			try{
				post.setEntity(entity);
				consumer.sign(post);
				}catch(Exception e){
					e.printStackTrace();
				}

			// method 2 to create post request entity/payload
			/*
			 * List<NameValuePair> nvps = new ArrayList <NameValuePair>();
			 * nvps.add(new BasicNameValuePair("name", "vip")); nvps.add(new
			 * BasicNameValuePair("location", "secret")); post.setEntity(new
			 * UrlEncodedFormEntity(nvps));
			 */

			//post.addHeader("content-type", "application/json");

			response = client.execute(post);

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return response;
	}

}
