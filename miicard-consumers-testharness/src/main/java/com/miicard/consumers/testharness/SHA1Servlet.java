package com.miicard.consumers.testharness;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.miicard.consumers.service.v1.MiiCardDirectoryService;

/**
 *
 * @author Paul.ONeill
 * 
 */
public class SHA1Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected final void processRequest(
			final HttpServletRequest request,
			final HttpServletResponse response)
					throws ServletException, IOException, NoSuchAlgorithmException {
		
		String identifier = request.getParameter("identifier");
		
		if (identifier != null && !identifier.isEmpty())
		{
			response.getWriter().write(MiiCardDirectoryService.hashIdentifier(identifier));
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
        
    	try {
			processRequest(request, response);
		} catch (NoSuchAlgorithmException e) {
			
		}
    }
}
