package com.miicard.consumers.service.v1.claims.transactional.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfIdentitySnapshotDetails", propOrder = {
    "identitySnapshotDetails"
})
public class ArrayOfIdentitySnapshotDetails {
	
	@XmlElement(name = "IdentitySnapshotDetails", nillable = true)
    protected List<IdentitySnapshotDetailsImpl> identitySnapshotDetails;

	public final List<IdentitySnapshotDetailsImpl> getIdentitySnapshotDetails() {
        
    	if (identitySnapshotDetails == null) {
    		identitySnapshotDetails = new ArrayList<IdentitySnapshotDetailsImpl>();
        }
        
    	return this.identitySnapshotDetails;
    }
}
