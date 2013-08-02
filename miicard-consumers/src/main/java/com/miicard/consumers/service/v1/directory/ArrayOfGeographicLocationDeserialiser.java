package com.miicard.consumers.service.v1.directory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.miicard.consumers.service.v1.claims.impl.ArrayOfGeographicLocation;
import com.miicard.consumers.service.v1.claims.impl.EmailAddressImpl;
import com.miicard.consumers.service.v1.claims.impl.GeographicLocationImpl;

public class ArrayOfGeographicLocationDeserialiser implements JsonDeserializer<ArrayOfGeographicLocation> {

	public ArrayOfGeographicLocation deserialize(JsonElement json, Type t, JsonDeserializationContext context) throws JsonParseException {
		ArrayOfGeographicLocation toReturn = new ArrayOfGeographicLocation();
		Type deserialisationType = new TypeToken<ArrayList<GeographicLocationImpl>>(){}.getType();
		toReturn.setGeographicLocations((List<GeographicLocationImpl>) context.deserialize(json, deserialisationType));
		
		return toReturn;
	}
	
}
