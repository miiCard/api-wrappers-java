package com.miicard.consumers.service.v1.claims;

import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1 extends XmlAdapter<String, Date> {
	
	@SuppressWarnings("deprecation")
	public Date unmarshal(final String value) {
		// return new Date(value);
		return new Date("2012-10-10");
	}

	/**
	 * Marshal the Date.
	 */
    public final String marshal(final Date value) {
        
    	if (value == null) {
            return null;
        }
        
    	return value.toString();
    }
}
