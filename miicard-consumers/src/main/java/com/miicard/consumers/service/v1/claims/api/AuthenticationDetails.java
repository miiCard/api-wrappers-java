package com.miicard.consumers.service.v1.claims.api;

import java.util.Date;
import java.util.List;

import com.miicard.consumers.service.v1.claims.impl.AuthenticationTokenType;

public interface AuthenticationDetails {
	public final static String PROVIDER_YUBIKEY = "Yubikey";
	public final static String PROVIDER_TOOPHER = "Toopher";
	public final static String PROVIDER_SMS = "SMS";
	
	public Date getAuthenticationTimeUtc();
	public AuthenticationTokenType getSecondFactorTokenType();
	public String getSecondFactorProvider();
	public List<? extends GeographicLocation> getLocations();
}
