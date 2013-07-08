package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getIdentitySnapshotPdfResult"
})
@XmlRootElement(name = "GetIdentitySnapshotPdfResponse", namespace = "http://tempuri.org/")
class GetIdentitySnapshotPdfResponse {
	
	@XmlElement(name = "GetIdentitySnapshotPdfResult", namespace = "http://tempuri.org/", required = true)
    protected byte[] getIdentitySnapshotPdfResult;

    /**
     * Gets the value of the getIdentitySnapshotPdfResult property.
     * 
     * @return possible object is byte[]
     */
    public final byte[] getIdentitySnapshotPdfResult() {
        return getIdentitySnapshotPdfResult;
    }

    /**
     * Sets the value of the getIdentitySnapshotPdfResult property.
     * 
     * @param value allowed object is byte[]
     */
    public final void setIdentitySnapshotPdfResult(final byte[] value) {
        this.getIdentitySnapshotPdfResult = value;
    }
}
