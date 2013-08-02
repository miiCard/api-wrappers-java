package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identitySnapshotResult"
})
@XmlRootElement(name = "GetIdentitySnapshotResponse", namespace = "http://tempuri.org/")
class GetIdentitySnapshotDetailsResponse {

    @XmlElement(name = "GetIdentitySnapshotResult", namespace = "http://tempuri.org/", nillable = true)
    protected MiiApiResponseOfIdentitySnapshot identitySnapshotResult;

    /**
     * Gets the value of the isUserAssuredResult property.
     * 
     * @return possible object is
     * {@link MiiApiResponseOfIdentitySnapshot }
     *     
     */
    public final MiiApiResponseOfIdentitySnapshot getIdentitySnapshotResult() {
        return identitySnapshotResult;
    }

    /**
     * Sets the value of the isUserAssuredResult property.
     * 
     * @param value allowed object is
     * {@link MiiApiResponseOfIdentitySnapshot }
     *     
     */
    public void setIdentitySnapshotResult(MiiApiResponseOfIdentitySnapshot value) {
        this.identitySnapshotResult = value;
    }
}
