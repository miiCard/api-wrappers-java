package com.miicard.consumers.service.v1;

import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.datatype.XMLGregorianCalendar;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.miicard.consumers.ServiceUrls;
import com.miicard.consumers.service.v1.claims.api.MiiUserProfile;
import com.miicard.consumers.service.v1.claims.impl.ArrayOfEmailAddress;
import com.miicard.consumers.service.v1.claims.impl.ArrayOfGeographicLocation;
import com.miicard.consumers.service.v1.claims.impl.ArrayOfIdentity;
import com.miicard.consumers.service.v1.claims.impl.ArrayOfPhoneNumber;
import com.miicard.consumers.service.v1.claims.impl.ArrayOfPostalAddress;
import com.miicard.consumers.service.v1.claims.impl.ArrayOfQualification;
import com.miicard.consumers.service.v1.claims.impl.MiiApiCallStatus;
import com.miicard.consumers.service.v1.claims.impl.MiiApiErrorCode;
import com.miicard.consumers.service.v1.claims.impl.MiiUserProfileImpl;
import com.miicard.consumers.service.v1.directory.ArrayOfEmailAddressDeserialiser;
import com.miicard.consumers.service.v1.directory.ArrayOfGeographicLocationDeserialiser;
import com.miicard.consumers.service.v1.directory.ArrayOfIdentityDeserialiser;
import com.miicard.consumers.service.v1.directory.ArrayOfPhoneNumberDeserialiser;
import com.miicard.consumers.service.v1.directory.ArrayOfPostalAddressDeserialiser;
import com.miicard.consumers.service.v1.directory.ArrayOfQualificationDeserialiser;
import com.miicard.consumers.service.v1.directory.MiiApiCallStatusDeserialiser;
import com.miicard.consumers.service.v1.directory.MiiApiErrorCodeDeserialiser;
import com.miicard.consumers.service.v1.directory.XMLGregorianCalendarDeserialiser;

public class MiiCardDirectoryService {
	public static final String CRITERION_USERNAME = "username";
	public static final String CRITERION_EMAIL = "email";
	public static final String CRITERION_PHONE = "phone";
	public static final String CRITERION_TWITTER = "twitter";
	public static final String CRITERION_FACEBOOK = "facebook";
	public static final String CRITERION_LINKEDIN = "linkedin";
	public static final String CRITERION_GOOGLE = "google";
	public static final String CRITERION_MICROSOFT_ID = "liveid";
	public static final String CRITERION_EBAY = "ebay";
	public static final String CRITERION_VERITAS_VITAE = "veritasvitae";
	
	public MiiUserProfile findByEmail(String emailAddress) throws Exception {
		return findByEmail(emailAddress, false);
	}
	
	public MiiUserProfile findByEmail(String emailAddress, Boolean hashed) throws Exception {
		return findBy(CRITERION_EMAIL, emailAddress, hashed);
	}
	
	public MiiUserProfile findByPhoneNumber(String phoneNumber) throws Exception {
		return findByPhoneNumber(phoneNumber, false);
	}	
	
	public MiiUserProfile findByPhoneNumber(String phoneNumber, Boolean hashed) throws Exception {
		return findBy(CRITERION_PHONE, phoneNumber, hashed);
	}
		
	public MiiUserProfile findByUsername(String username) throws Exception {
		return findByUsername(username, false);
	}
	
	public MiiUserProfile findByUsername(String username, Boolean hashed) throws Exception {
		return findBy(CRITERION_USERNAME, username, hashed);
	}
	
	public MiiUserProfile findByTwitter(String twitterHandleOrUrl) throws Exception {
		return findByTwitter(twitterHandleOrUrl, false);
	}
	
	public MiiUserProfile findByTwitter(String twitterHandleOrUrl, Boolean hashed) throws Exception {
		return findBy(CRITERION_TWITTER, twitterHandleOrUrl, hashed);
	}
	
	public MiiUserProfile findByFacebook(String facebookHandleOrUrl) throws Exception {
		return findByFacebook(facebookHandleOrUrl, false);
	}	
	
	public MiiUserProfile findByFacebook(String facebookHandleOrUrl, Boolean hashed) throws Exception {
		return findBy(CRITERION_FACEBOOK, facebookHandleOrUrl, hashed);
	}
	
	public MiiUserProfile findByLinkedIn(String linkedInHandleOrUrl) throws Exception {
		return findByLinkedIn(linkedInHandleOrUrl, false);
	}
	
	public MiiUserProfile findByLinkedIn(String linkedInHandleOrUrl, Boolean hashed) throws Exception {
		return findBy(CRITERION_LINKEDIN, linkedInHandleOrUrl, hashed);
	}
	
	public MiiUserProfile findByGoogle(String googlePlusHandleOrUrl) throws Exception {
		return findByGoogle(googlePlusHandleOrUrl, false);
	}
	
	public MiiUserProfile findByGoogle(String googlePlusHandleOrUrl, Boolean hashed) throws Exception {
		return findBy(CRITERION_GOOGLE, googlePlusHandleOrUrl, hashed);
	}
	
	public MiiUserProfile findByMicrosoftId(String microsoftIdHandleOrUrl) throws Exception {
		return findByMicrosoftId(microsoftIdHandleOrUrl, false);
	}
	
	public MiiUserProfile findByMicrosoftId(String microsoftIdHandleOrUrl, Boolean hashed) throws Exception {
		return findBy(CRITERION_MICROSOFT_ID, microsoftIdHandleOrUrl, hashed);
	}
	
	public MiiUserProfile findByEbay(String ebayHandleOrUrl) throws Exception {
		return findByEbay(ebayHandleOrUrl, false);
	}
	
	public MiiUserProfile findByEbay(String ebayHandleOrUrl, Boolean hashed) throws Exception {
		return findBy(CRITERION_EBAY, ebayHandleOrUrl, hashed);
	}
	
	public MiiUserProfile findByVeritasVitae(String veritasVitaeVvNumberOrUrl) throws Exception {
		return findByVeritasVitae(veritasVitaeVvNumberOrUrl, false);
	}
	
	public MiiUserProfile findByVeritasVitae(String veritasVitaeVvNumberOrUrl, Boolean hashed) throws Exception {
		return findBy(CRITERION_VERITAS_VITAE, veritasVitaeVvNumberOrUrl, hashed);
	}	
	
	public MiiUserProfile findBy(String criterion, String value) throws Exception {
		return this.findBy(criterion, value, false);
	}
	
	public MiiUserProfile findBy(String criterion, String value, Boolean hashed) throws Exception {
		// http://stackoverflow.com/questions/1359689/how-to-send-http-request-in-java
		MiiUserProfile toReturn = null;

		try {
			URL requestUrl = new URL(getRequestUrl(criterion, value, hashed));
			URLConnection connection = requestUrl.openConnection();
			connection.setRequestProperty("Content-type", "application/json");
			
			JsonReader r = new JsonReader(new InputStreamReader(connection.getInputStream()));
			Gson serialiser = 
					new GsonBuilder()
						.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
						.registerTypeAdapter(ArrayOfEmailAddress.class,  new ArrayOfEmailAddressDeserialiser())
						.registerTypeAdapter(ArrayOfGeographicLocation.class, new ArrayOfGeographicLocationDeserialiser())
						.registerTypeAdapter(ArrayOfIdentity.class, new ArrayOfIdentityDeserialiser())
						.registerTypeAdapter(ArrayOfPhoneNumber.class, new ArrayOfPhoneNumberDeserialiser())
						.registerTypeAdapter(ArrayOfPostalAddress.class, new ArrayOfPostalAddressDeserialiser())
						.registerTypeAdapter(ArrayOfQualification.class, new ArrayOfQualificationDeserialiser())
						.registerTypeAdapter(XMLGregorianCalendar.class, new XMLGregorianCalendarDeserialiser())
						.registerTypeAdapter(MiiApiCallStatus.class, new MiiApiCallStatusDeserialiser())
						.registerTypeAdapter(MiiApiErrorCode.class, new MiiApiErrorCodeDeserialiser())
						.create();
			
			Type apiResponseType = new TypeToken<MiiApiResponse<MiiUserProfileImpl>>(){}.getType();
			
			MiiApiResponse<MiiUserProfile> result = serialiser.fromJson(r, apiResponseType); 
			if (result.getStatus() == MiiApiCallStatus.SUCCESS && result.getErrorCode() == MiiApiErrorCode.SUCCESS)
			{
				toReturn = result.getData();
			}
		}
		catch (Exception e) {
			throw e;
		}
		
		return toReturn;
	}
	
	public static String hashIdentifier(String identifier) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// http://stackoverflow.com/questions/4400774/java-calculate-a-sha1-of-a-string
		MessageDigest sha = MessageDigest.getInstance("SHA-1");
		sha.reset();
		sha.update(identifier.toLowerCase().getBytes("UTF-8"));
		
		return (new BigInteger(1, sha.digest())).toString(16).toLowerCase();
	}
	
	protected static String getRequestUrl(String criterion, String value, Boolean hashed) {
		String url = ServiceUrls.DIRECTORY_SERVICE_V1 + "?" + criterion + "=" + value;
		if (hashed) {
			url = url + "&hashed=true";
		}
		
		return url;
	}
}
