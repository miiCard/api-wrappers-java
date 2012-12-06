package com.miicard.consumers.service.v1.claims.transactional.impl;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.miicard.consumers.service.v1.claims.api.IdentitySnapshotDetails;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentitySnapshotDetails", propOrder = {
    "snapshotId",
    "timestampUtc",
    "username",
    "wasTestUser"
})
public class IdentitySnapshotDetailsImpl implements IdentitySnapshotDetails {

    @XmlElement(name = "SnapshotId", nillable = true)
    protected String snapshotId;
    
    @XmlElement(name = "TimestampUtc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestampUtc;
    
    @XmlElement(name = "Username", nillable = true)
    protected String username;
    
    @XmlElement(name = "WasTestUser")
    protected Boolean wasTestUser;

    public final String getSnapshotId() {
        return snapshotId;
    }
    
    public final void setSnapshotId(String snapshotId){
    	this.snapshotId = snapshotId;
    }
    
    public final Date getTimestampUtc() {
    	return timestampUtc.toGregorianCalendar().getTime();
    }
    
    public final void setTimestampUtc(Date timestampUtc)
    {
    	GregorianCalendar g = new GregorianCalendar();
    	g.setTime(timestampUtc);
    	
    	try 
    	{
			this.timestampUtc = DatatypeFactory.newInstance().newXMLGregorianCalendar(g);
		} 
    	catch (DatatypeConfigurationException e) 
    	{
		}
    }
    
    public final String getUsername() {
    	return username;    	
    }
    
    public final void setUsername(String username)
    {
    	this.username = username;
    }
    
    public final Boolean getWasTestUser() {
    	return wasTestUser;
    }
    
    public final void setWasTestUser(Boolean wasTestUser)
    {
    	this.wasTestUser = wasTestUser;
    }
}
