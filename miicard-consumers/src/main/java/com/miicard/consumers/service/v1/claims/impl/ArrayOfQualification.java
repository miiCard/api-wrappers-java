package com.miicard.consumers.service.v1.claims.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQualification", propOrder = {
    "qualification"
})
public class ArrayOfQualification {

    @XmlElement(name = "Qualification", nillable = true)
    protected List<QualificationImpl> qualification;

    public final List<QualificationImpl> getQualification() {
        
    	if (qualification == null) {
    		qualification = new ArrayList<QualificationImpl>();
        }
        
    	return this.qualification;
    }
    
    public final void setQualifications(final List<QualificationImpl> value) {
    	this.qualification = value;
    }
}
