package com.miicard.consumers.testharness;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;

public class ConnectMiicardCallbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected final void processRequest(
			final HttpServletRequest request,
			final HttpServletResponse response)
					throws ServletException, IOException {		
		OAuthConsumer consumer = (OAuthConsumer) request.getSession().getAttribute("miiCardOAuthConsumer");
		OAuthProvider provider = (OAuthProvider) request.getSession().getAttribute("miiCardOAuthProvider");
		
		provider.setListener(new ZeroContentLengthFixListener());		
		
		try 
		{
			provider.setOAuth10a(true);
			provider.retrieveAccessToken(consumer, request.getParameter("oauth_verifier"));
			request.getSession().removeAttribute("miiCardOAuthConsumer");		
			
			
			String accessToken = consumer.getToken();
			String accessTokenSecret = consumer.getTokenSecret();
			
			// Ordinarily you'd store the access token and secret in your database against the currently logged-in
			// user, but for this test harness we'll just render them to the response
			PrintWriter stream = response.getWriter();
			stream.write("Access token " + accessToken);
			stream.write("\nAccess token secret " + accessTokenSecret);
		}
		catch (Exception e) {
			// For debugging only!
			response.sendError(500, e.toString());
		}
	}
	
    @Override
    protected final void doGet(
    		final HttpServletRequest request, 
    		final HttpServletResponse response)
    				throws ServletException, IOException {
        
    	processRequest(request, response);
    }
}
