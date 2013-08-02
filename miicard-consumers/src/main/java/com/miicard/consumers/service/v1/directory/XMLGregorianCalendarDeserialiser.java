package com.miicard.consumers.service.v1.directory;

import java.lang.reflect.Type;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class XMLGregorianCalendarDeserialiser implements JsonDeserializer<XMLGregorianCalendar> {

	public XMLGregorianCalendar deserialize(JsonElement json, Type t, JsonDeserializationContext context) throws JsonParseException {
    	GregorianCalendar g = new GregorianCalendar();
    	// g.setTime(json.getAsString());
    	
    	XMLGregorianCalendar toReturn = null;
    	
    	try 
    	{
    		toReturn = DatatypeFactory.newInstance().newXMLGregorianCalendar(g);
		} 
    	catch (DatatypeConfigurationException e) 
    	{
		}
    	
    	return toReturn;
	}

}
