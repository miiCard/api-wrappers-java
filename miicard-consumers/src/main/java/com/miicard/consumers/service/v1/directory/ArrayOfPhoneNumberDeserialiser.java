package com.miicard.consumers.service.v1.directory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.miicard.consumers.service.v1.claims.impl.ArrayOfPhoneNumber;
import com.miicard.consumers.service.v1.claims.impl.GeographicLocationImpl;
import com.miicard.consumers.service.v1.claims.impl.PhoneNumberImpl;
public class ArrayOfPhoneNumberDeserialiser implements JsonDeserializer<ArrayOfPhoneNumber> {

	public ArrayOfPhoneNumber deserialize(JsonElement json, Type t, JsonDeserializationContext context) throws JsonParseException {
		ArrayOfPhoneNumber toReturn = new ArrayOfPhoneNumber();
		Type deserialisationType = new TypeToken<ArrayList<PhoneNumberImpl>>(){}.getType();
		toReturn.setPhoneNumbers((List<PhoneNumberImpl>) context.deserialize(json, deserialisationType));
		
		return toReturn;
	}
	
}
