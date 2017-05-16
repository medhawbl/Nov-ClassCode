package com.wbl.base;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

public class HttpBaseApi {

	String endpoint = "https://api.twitter.com/1.1/";
	protected HttpClient client = HttpClientBuilder.create().build();

	protected final OAuthConsumer consumer;

	public HttpBaseApi() {

		consumer = new CommonsHttpOAuthConsumer("mWfW59HF0Rqx5M5zn5ppR3iGG",
				"jICqsMPVEtLwiRqvQrl5sjF9KUT3W7RGDBqm1G5YlVEDWrl1bv");
		consumer.setTokenWithSecret("738049748985204736-KqojDhKb9m7HsWA1ijQ9KaIgi2RLzoC",
				"Hits9HjjbtDPL8yqGxu5TsXbnrtXBRm7aEqLftbF0qOvf");

	}

	public HttpGet get(String resource){
		HttpGet get = new HttpGet(endpoint + resource);
	
		return get;
	}

	public HttpPost post(String resource){

		HttpPost post = new HttpPost(endpoint + resource);
		
		return post;
	}

}
