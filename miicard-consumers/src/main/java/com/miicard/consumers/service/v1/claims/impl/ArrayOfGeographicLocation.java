package com.miicard.consumers.service.v1.claims.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGeographicLocation", propOrder = {
    "geographicLocation"
})
public class ArrayOfGeographicLocation {

    @XmlElement(name = "GeographicLocation", nillable = true)
    protected List<GeographicLocationImpl> geographicLocation;

    public final List<GeographicLocationImpl> getGeographicLocation() {        
    	if (geographicLocation == null) {
    		geographicLocation = new ArrayList<GeographicLocationImpl>();
        }
        
    	return this.geographicLocation;
    }
    
    public void setGeographicLocations(final List<GeographicLocationImpl> locations) {
    	this.geographicLocation = locations;
    }
}
