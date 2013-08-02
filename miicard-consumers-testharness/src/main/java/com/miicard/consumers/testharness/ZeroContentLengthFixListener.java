package com.miicard.consumers.testharness;

import java.net.HttpURLConnection;

import oauth.signpost.OAuthProviderListener;
import oauth.signpost.http.HttpRequest;
import oauth.signpost.http.HttpResponse;

public class ZeroContentLengthFixListener implements OAuthProviderListener  {
	public void prepareRequest(HttpRequest request) throws Exception {
		HttpURLConnection connection = (HttpURLConnection) request.unwrap();
		connection.setFixedLengthStreamingMode(0);
		connection.setDoOutput(true);
	}

	public void prepareSubmission(HttpRequest request) throws Exception {

	}

	public boolean onResponseReceived(HttpRequest request, HttpResponse response)
			throws Exception {

		return false;
	}
}
