package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "configuration"
})
@XmlRootElement(name = "GetCardImage", namespace = "http://tempuri.org/")
class GetCardImage {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected CardImageConfiguration configuration;

    /**
     * Gets the value of the configuration property.
     * 
     * @return possible object is
     * {@link CardImageConfiguration }
     *     
     */
    public final CardImageConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value allowed object is
     * {@link CardImageConfiguration }
     *     
     */
    public final void setConfiguration(
    		final CardImageConfiguration value) {
        
    	this.configuration = value;
    }
}
