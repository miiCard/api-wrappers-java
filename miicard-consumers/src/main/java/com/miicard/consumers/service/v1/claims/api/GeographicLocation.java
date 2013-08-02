package com.miicard.consumers.service.v1.claims.api;

import java.math.BigDecimal;

public interface GeographicLocation {
	public String getLocationProvider();
	public BigDecimal getLatitude();
	public BigDecimal getLongitude();
	public Integer getLatLongAccuracyMetres();
	public PostalAddress getApproximateAddress();	
}
