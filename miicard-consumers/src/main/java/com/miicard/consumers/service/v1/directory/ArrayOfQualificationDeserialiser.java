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
import com.miicard.consumers.service.v1.claims.impl.ArrayOfQualification;
import com.miicard.consumers.service.v1.claims.impl.GeographicLocationImpl;
import com.miicard.consumers.service.v1.claims.impl.PostalAddressImpl;
import com.miicard.consumers.service.v1.claims.impl.QualificationImpl;

public class ArrayOfQualificationDeserialiser implements JsonDeserializer<ArrayOfQualification> {

	public ArrayOfQualification deserialize(JsonElement json, Type t, JsonDeserializationContext context) throws JsonParseException {
		ArrayOfQualification toReturn = new ArrayOfQualification();
		Type deserialisationType = new TypeToken<ArrayList<QualificationImpl>>(){}.getType();
		toReturn.setQualifications((List<QualificationImpl>) context.deserialize(json, deserialisationType));
		
		return toReturn;
	}
	
}
