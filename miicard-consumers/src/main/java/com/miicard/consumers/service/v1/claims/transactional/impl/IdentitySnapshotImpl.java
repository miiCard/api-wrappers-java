package com.miicard.consumers.service.v1.claims.transactional.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.miicard.consumers.service.v1.claims.api.IdentitySnapshot;
import com.miicard.consumers.service.v1.claims.impl.MiiUserProfileImpl;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentitySnapshot", propOrder = {
    "details",
    "snapshot"
})

public class IdentitySnapshotImpl implements IdentitySnapshot {

    @XmlElement(name = "Details", nillable = true)
    protected IdentitySnapshotDetailsImpl details;
       
    @XmlElement(name = "Snapshot", nillable = true)
    protected MiiUserProfileImpl snapshot;
    
    public final IdentitySnapshotDetailsImpl getDetails(){
    	return details;
    }
    
    public final void setDetails(IdentitySnapshotDetailsImpl details){
    	this.details = details;
    }
    
    public final MiiUserProfileImpl getSnapshot() {
        return snapshot;
    }
    
    public final void setSnapshot(MiiUserProfileImpl snapshot){
    	this.snapshot = snapshot;
    }
}
