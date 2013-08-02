package com.miicard.consumers.service.v1.directory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.miicard.consumers.service.v1.claims.impl.ArrayOfIdentity;
import com.miicard.consumers.service.v1.claims.impl.GeographicLocationImpl;
import com.miicard.consumers.service.v1.claims.impl.IdentityImpl;

public class ArrayOfIdentityDeserialiser implements JsonDeserializer<ArrayOfIdentity> {

	public ArrayOfIdentity deserialize(JsonElement json, Type t, JsonDeserializationContext context) throws JsonParseException {
		ArrayOfIdentity toReturn = new ArrayOfIdentity();
		Type deserialisationType = new TypeToken<ArrayList<IdentityImpl>>(){}.getType();
		toReturn.setIdentities((List<IdentityImpl>) context.deserialize(json, deserialisationType));
		
		return toReturn;
	}
	
}
