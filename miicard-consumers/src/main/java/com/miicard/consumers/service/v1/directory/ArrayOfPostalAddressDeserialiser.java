package com.miicard.consumers.service.v1.directory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.miicard.consumers.service.v1.claims.impl.ArrayOfPostalAddress;
import com.miicard.consumers.service.v1.claims.impl.GeographicLocationImpl;
import com.miicard.consumers.service.v1.claims.impl.PostalAddressImpl;

public class ArrayOfPostalAddressDeserialiser implements JsonDeserializer<ArrayOfPostalAddress> {

	public ArrayOfPostalAddress deserialize(JsonElement json, Type t, JsonDeserializationContext context) throws JsonParseException {
		ArrayOfPostalAddress toReturn = new ArrayOfPostalAddress();
		Type deserialisationType = new TypeToken<ArrayList<PostalAddressImpl>>(){}.getType();
		toReturn.setPostalAddresses((List<PostalAddressImpl>) context.deserialize(json, deserialisationType));
		
		return toReturn;
	}
	
}
