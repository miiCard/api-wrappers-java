package com.miicard.consumers.service.v1.claims.impl;

import java.text.DateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class Adapter1 extends XmlAdapter<String, Date> {
	
	@SuppressWarnings("deprecation")
	public Date unmarshal(final String value) {
		return new Date(value);
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
