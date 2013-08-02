package com.miicard.consumers.service.v1.directory;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.miicard.consumers.service.v1.claims.impl.MiiApiCallStatus;

public class MiiApiCallStatusDeserialiser implements JsonDeserializer<MiiApiCallStatus> {

	public MiiApiCallStatus deserialize(JsonElement json, Type t, JsonDeserializationContext context) throws JsonParseException {
		return MiiApiCallStatus.fromValue(json.getAsInt());
	}

}
