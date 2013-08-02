package com.miicard.consumers.service.v1.claims.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.api.AuthenticationDetails;
import com.miicard.consumers.service.v1.claims.api.GeographicLocation;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationDetails", propOrder = {
    "authenticationTimeUtc",
    "locations",
    "secondFactorProvider",
    "secondFactorTokenType"
})
class AuthenticationDetailsImpl implements AuthenticationDetails {

    @XmlElement(name = "AuthenticationTimeUtc", nillable = true)
    protected Date authenticationTimeUtc;
    
    @XmlElement(name = "Locations", nillable = true)
    protected ArrayOfGeographicLocation locations;
    
    @XmlElement(name = "SecondFactorProvider", nillable = true)
    protected String secondFactorProvider;
    
    @XmlElement(name = "SecondFactorTokenType", nillable = true)
    protected AuthenticationTokenType secondFactorTokenType;

	public Date getAuthenticationTimeUtc() {
		return this.authenticationTimeUtc;
	}

	public AuthenticationTokenType getSecondFactorTokenType() {
		return this.secondFactorTokenType;
	}

	public String getSecondFactorProvider() {
		return this.secondFactorProvider;
	}

	public List<? extends GeographicLocation> getLocations() {
		if (this.locations != null && this.locations.getGeographicLocation() != null) {
			return this.locations.getGeographicLocation();
		}
		
		return new ArrayList<GeographicLocation>();
	}
}
