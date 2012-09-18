package com.miicard.consumers.testharness;

import com.miicard.consumers.MiiCardException;
import com.miicard.consumers.service.v1.MiiCardOAuthClaimsService;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

/**
 *
 * @author Paul.ONeill
 * 
 */
public class ImageServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Processes the HTTP Request.
	 * 
	 * @param request the HTTP Request
	 * @param response the HTTP Response
	 * @throws ServletException ServletException thrown
	 * @throws IOException IOException thrown
	 */
	protected final void processRequest(
			final HttpServletRequest request,
			final HttpServletResponse response)
					throws ServletException, IOException {
        
		response.setContentType("image/png");
        
        String consumerKey 
        	= request.getParameter("oauth-consumer-key");
        
        String consumerSecret 
        	= request.getParameter("oauth-consumer-secret");
        
        String accessToken 
        	= request.getParameter("oauth-access-token");
        
        String accessTokenSecret 
        	= request.getParameter("oauth-access-token-secret");
        
        String type 
        	= request.getParameter("type");
        
        javax.servlet.ServletOutputStream out 
        	= response.getOutputStream();
        
        if (consumerKey != null 
        		&& consumerSecret != null 
        		&& accessToken != null 
        		&& accessTokenSecret != null 
        		&& type != null) {
            
        	MiiCardOAuthClaimsService service 
        		= new MiiCardOAuthClaimsService(
        				consumerKey, 
        				consumerSecret, 
        				accessToken, 
        				accessTokenSecret);
            
        	try {
        		IOUtils.copy(service.assuranceImage(type), out);
        	}
            catch (MiiCardException ex) {
                response.setContentType("text/plain");
                out.write(ex.toString().getBytes());
            }
            
            out.flush();
            out.close();
        }
    }
	
	/**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected final void doGet(
    		final HttpServletRequest request, 
    		final HttpServletResponse response)
    				throws ServletException, IOException {
        
    	processRequest(request, response);
    }
}
