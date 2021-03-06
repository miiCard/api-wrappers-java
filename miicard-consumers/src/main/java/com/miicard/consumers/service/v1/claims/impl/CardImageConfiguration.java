package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardImageConfiguration", propOrder = {
	"format",
	"showEmailAddress",
	"showPhoneNumber",
	"snapshotId"
})
public class CardImageConfiguration {

    @XmlElement(name = "SnapshotId", nillable = true)
	protected String snapshotId;
    
    @XmlElement(name = "ShowEmailAddress", nillable = true)
    protected Boolean showEmailAddress;
    
    @XmlElement(name = "ShowPhoneNumber", nillable = true)
    protected Boolean showPhoneNumber;
    
    @XmlElement(name = "Format", nillable = true)
    protected String format;

	protected String getSnapshotId() {
		return snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}

	public Boolean getShowEmailAddress() {
		return showEmailAddress;
	}

	public void setShowEmailAddress(Boolean showEmailAddress) {
		this.showEmailAddress = showEmailAddress;
	}

	public Boolean getShowPhoneNumber() {
		return showPhoneNumber;
	}

	public void setShowPhoneNumber(Boolean showPhoneNumber) {
		this.showPhoneNumber = showPhoneNumber;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
}
