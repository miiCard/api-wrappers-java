package com.miicard.consumers.service.v1.directory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import com.miicard.consumers.service.v1.claims.impl.ArrayOfEmailAddress;
import com.miicard.consumers.service.v1.claims.impl.EmailAddressImpl;

public class ArrayOfEmailAddressDeserialiser implements JsonDeserializer<ArrayOfEmailAddress> {

	public ArrayOfEmailAddress deserialize(JsonElement json, Type t, JsonDeserializationContext context) throws JsonParseException {
		ArrayOfEmailAddress toReturn = new ArrayOfEmailAddress();
		Type deserialisationType = new TypeToken<ArrayList<EmailAddressImpl>>(){}.getType();
		toReturn.setEmailAddresses((List<EmailAddressImpl>) context.deserialize(json, deserialisationType));
		
		return toReturn;
	}
	
}
