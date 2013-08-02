package com.miicard.consumers.testharness;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.miicard.consumers.ServiceUrls;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.basic.DefaultOAuthProvider;

public class ConnectMiicardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected final void processRequest(
			final HttpServletRequest request,
			final HttpServletResponse response)
					throws ServletException, IOException {
		ServletContext context = this.getServletContext();
		
		String consumerKey = context.getInitParameter("MiiCardConsumerKey");
		String consumerSecret = context.getInitParameter("MiiCardConsumerSecret");
		
		OAuthConsumer consumer = new DefaultOAuthConsumer(consumerKey, consumerSecret);		
		OAuthProvider provider = 
				new DefaultOAuthProvider
				(
						ServiceUrls.OAUTH_ENDPOINT, 
						ServiceUrls.OAUTH_ENDPOINT, 
						ServiceUrls.OAUTH_ENDPOINT
				);
		
		provider.setListener(new ZeroContentLengthFixListener());
		
		try 
		{
			URL currentUrl = new URL(request.getRequestURL().toString());
			
			URL callbackUrl = new URL(currentUrl, "./callback");
			
			String authUrl = provider.retrieveRequestToken(consumer, callbackUrl.toString());
			
			// Store the consumer and provider in session state (they contain our request token + secret
			// and knowledge that we're operating under OAuth 1.0a)
			request.getSession().setAttribute("miiCardOAuthConsumer", consumer);
			request.getSession().setAttribute("miiCardOAuthProvider", provider);
			
			// Redirect user
			response.sendRedirect(authUrl);
		}
		catch (Exception e) {
			// For debugging only!
			response.sendError(500,  e.toString());
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
