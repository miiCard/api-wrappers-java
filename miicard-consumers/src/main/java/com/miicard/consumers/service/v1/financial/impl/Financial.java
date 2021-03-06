package com.miicard.consumers.service.v1.financial.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@SuppressWarnings("restriction")
@WebServiceClient(
		name = "Financial", 
		targetNamespace = "http://tempuri.org/", 
		wsdlLocation = "http://sts.miicard.com/api/v1/Financial.svc?wsdl")
public class Financial extends Service {

	/**
	 * The Claims WSDL Location.
	 */
    private final static URL FINANCIAL_WSDL_LOCATION;
    
    /**
     * The Claims WebServiceException.
     */
    private final static WebServiceException FINANCIAL_EXCEPTION;
    
    /**
     * The Claims Qname.
     */
    private final static QName FINANCIAL_QNAME 
    	= new QName("http://tempuri.org/", "Financial");

    static {
    	
    	URL url = null;
    	
    	WebServiceException e = null;
    	
    	try {
    		url = new URL("http://sts.miicard.com/api/v1/Financial.svc?wsdl");
    	} catch (MalformedURLException ex) {
    		e = new WebServiceException(ex);
        }
        
    	FINANCIAL_WSDL_LOCATION = url;
        FINANCIAL_EXCEPTION = e;
    }

    /**
     * Constructor.
     */
    public Financial() {
        super(__getWsdlLocation(), FINANCIAL_QNAME);
    }
    
    /**
     * Constructor.
     * 
     * @param features WebServiceFeature
     */
    public Financial(final WebServiceFeature... features) {
        super(__getWsdlLocation(), FINANCIAL_QNAME, features);
    }

    /**
     * Constructor.
     * 
     * @param wsdlLocation URL of the WSDL Location
     */
    public Financial(final URL wsdlLocation) {
        super(wsdlLocation, FINANCIAL_QNAME);
    }

    /**
     * Constructor.
     * 
     * @param wsdlLocation URL of the WSDL Location
     * @param features WebServiceFeature
     */
    public Financial(
    		final URL wsdlLocation, 
    		final WebServiceFeature... features) {
        
    	super(wsdlLocation, FINANCIAL_QNAME, features);
    }

    /**
     * Constructor.
     * 
     * @param wsdlLocation URL of the WSDL Location
     * @param serviceName QName of the service name
     */
    public Financial(
    		final URL wsdlLocation, 
    		final QName serviceName) {
        
    	super(wsdlLocation, serviceName);
    }

    /**
     * Constructor.
     * 
     * @param wsdlLocation URL of the WSDL Location
     * @param serviceName QName of the service name
     * @param features WebServiceFeature
     */
    public Financial(
    		final URL wsdlLocation, 
    		final QName serviceName, 
    		final WebServiceFeature... features) {
        
    	super(wsdlLocation, serviceName, features);
    }

    /**
     * @return returns IClaims
     */
    @WebEndpoint(name = "BasicHttpBinding_IFinancial")
    public final IFinancial getBasicHttpBindingIFinancial() {
        return super.getPort(
        		new QName(
        				"http://tempuri.org/", 
        				"BasicHttpBinding_IFinancial"), 
        				IFinancial.class);
    }

    /**
     * 
     * @param features 
     * A list of {@link javax.xml.ws.WebServiceFeature} to 
     * configure on the proxy.  Supported features not in the 
     * <code>features</code> parameter will have their default values.
     * 
     * @return returns IClaims
     */
    @WebEndpoint(name = "BasicHttpBinding_IFinancial")
    public final IFinancial getBasicHttpBindingIFinancial(
    		final WebServiceFeature... features) {
    	
    	return super.getPort(
    			new QName(
    					"http://tempuri.org/", 
    					"BasicHttpBinding_IFinancial"),
    					IFinancial.class,
    					features);
    }

    /**
     * Gets the URL of the WSDL Location.
     * 
     * @return URL of the WSDL Location
     */
    private final static URL __getWsdlLocation() {
        
    	if (FINANCIAL_EXCEPTION != null) {
            throw FINANCIAL_EXCEPTION;
        }
        
    	return FINANCIAL_WSDL_LOCATION;
    }
}
