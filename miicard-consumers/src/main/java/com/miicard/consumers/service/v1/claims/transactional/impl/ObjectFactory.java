package com.miicard.consumers.service.v1.claims.transactional.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.miicard.consumers.service.v1.claims.transactional.impl.ArrayOfIdentitySnapshotDetails;
import com.miicard.consumers.service.v1.claims.transactional.impl.IdentitySnapshotDetailsImpl;
import com.miicard.consumers.service.v1.claims.transactional.impl.IdentitySnapshotImpl;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.miicard.consumers.service.v1.claims package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@SuppressWarnings("restriction")
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfIdentitySnapshotDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Transactional", "ArrayOfIdentitySnapshotDetails");
    private final static QName _IdentitySnapshot_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Transactional", "IdentitySnapshot");
    private final static QName _IdentitySnapshotDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Transactional", "IdentitySnapshotDetails");
    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.miicard.consumers.service.v1.claims
     * 
     */
    public ObjectFactory() {
    }
        
    public final IdentitySnapshotImpl createIdentitySnapshot()
    {
    	return new IdentitySnapshotImpl();
    }
    
    public final IdentitySnapshotDetailsImpl createIdentitySnapshotDetails()
    {
    	return new IdentitySnapshotDetailsImpl();
    }
    
    public final ArrayOfIdentitySnapshotDetails createArrayOfIdentitySnapshotDetails()
    {
    	return new ArrayOfIdentitySnapshotDetails();
    } 
        
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Transactional", name = "ArrayOfIdentitySnapshotDetails")
    public final JAXBElement<ArrayOfIdentitySnapshotDetails> createArrayOfIdentitySnapshotDetails(
    		final ArrayOfIdentitySnapshotDetails value) {
        
    	return new JAXBElement<ArrayOfIdentitySnapshotDetails>(
    			_ArrayOfIdentitySnapshotDetails_QNAME, 
    			ArrayOfIdentitySnapshotDetails.class, 
    			null, 
    			value);
    }
    
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Transactional", name = "IdentitySnapshot")
    public final JAXBElement<IdentitySnapshotImpl> createIdentitySnapshot(final IdentitySnapshotImpl value) {
        
    	return new JAXBElement<IdentitySnapshotImpl>(
    			_IdentitySnapshot_QNAME, 
    			IdentitySnapshotImpl.class, 
    			null, 
    			value);
    }
    
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Transactional", name = "IdentitySnapshotDetails")
    public final JAXBElement<IdentitySnapshotDetailsImpl> createIdentitySnapshotDetails(final IdentitySnapshotDetailsImpl value) {        
    	return new JAXBElement<IdentitySnapshotDetailsImpl>(
    			_IdentitySnapshotDetails_QNAME, 
    			IdentitySnapshotDetailsImpl.class, 
    			null, 
    			value);
    }
}
