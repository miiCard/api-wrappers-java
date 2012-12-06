package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "snapshotId"
})
@XmlRootElement(name = "GetIdentitySnapshot", namespace = "http://tempuri.org/")
class GetIdentitySnapshot {

    @XmlElement(namespace = "http://tempuri.org/", nillable = true)
    protected String snapshotId;

    /**
     * Gets the value of the type property.
     * 
     * @return possible object is
     * {@link String }
     *     
     */
    public final String getSnapshotId() {
        return snapshotId;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value allowed object is
     * {@link String }
     *     
     */
    public final void setSnapshotId(
    		final String value) {
        
    	this.snapshotId = value;
    }
}
