package com.miicard.consumers.service.v1.claims.impl;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.miicard.consumers.service.v1.claims.api.GeographicLocation;
import com.miicard.consumers.service.v1.claims.api.PostalAddress;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicLocation", propOrder = {
    "approximateAddress",
    "latLongAccuracyMetres",
    "latitude",
    "locationProvider",
    "longitude"
})
public class GeographicLocationImpl implements GeographicLocation {

    @XmlElement(name = "ApproximateAddress", nillable = true)
    protected PostalAddressImpl approximateAddress;
    
    @XmlElement(name = "LatLongAccuracyMetres", nillable = true)
    protected Integer latLongAccuracyMetres;
    
    @XmlElement(name = "Latitude", nillable = true)
    protected BigDecimal latitude;
    
    @XmlElement(name = "LocationProvider", nillable = true)
    protected String locationProvider;
    
    @XmlElement(name = "Longitude", nillable = true)
    protected BigDecimal longitude;

	public String getLocationProvider() {
		return this.locationProvider;
	}

	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public Integer getLatLongAccuracyMetres() {
		return this.latLongAccuracyMetres;
	}

	public PostalAddress getApproximateAddress() {
		return this.approximateAddress;
	}    
}
