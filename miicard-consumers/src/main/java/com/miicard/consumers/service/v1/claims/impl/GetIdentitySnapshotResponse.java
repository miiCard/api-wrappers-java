package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identitySnapshotDetailsResult"
})
@XmlRootElement(name = "GetIdentitySnapshotDetailsResponse", namespace = "http://tempuri.org/")
class GetIdentitySnapshotResponse {

    @XmlElement(name = "GetIdentitySnapshotDetailsResult", namespace = "http://tempuri.org/", nillable = true)
    protected MiiApiResponseOfArrayOfIdentitySnapshotDetails identitySnapshotDetailsResult;

    /**
     * Gets the value of the isUserAssuredResult property.
     * 
     * @return possible object is
     * {@link MiiApiResponseOfArrayOfIdentitySnapshotDetails }
     *     
     */
    public final MiiApiResponseOfArrayOfIdentitySnapshotDetails getIdentitySnapshotDetailsResult() {
        return identitySnapshotDetailsResult;
    }

    /**
     * Sets the value of the isUserAssuredResult property.
     * 
     * @param value allowed object is
     * {@link MiiApiResponseOfArrayOfIdentitySnapshotDetails }
     *     
     */
    public void setIdentitySnapshotDetailsResult(MiiApiResponseOfArrayOfIdentitySnapshotDetails value) {
        this.identitySnapshotDetailsResult = value;
    }
}
