package com.miicard.consumers.service.v1.claims.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardImageConfiguration", propOrder = {
	"snapshotId",
	"showEmailAddress",
	"showPhoneNumber",
	"format"
})
public class CardImageConfiguration {

    @XmlElement(name = "SnapshotId", nillable = true)
	protected String snapshotId;
    
    @XmlElement(name = "ShowEmailAddress")
    protected Boolean showEmailAddress;
    
    @XmlElement(name = "ShowPhoneNumber")
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
