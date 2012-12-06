package com.miicard.consumers.service.v1.claims.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
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
@XmlRegistry
class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _MiiApiCallStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "MiiApiCallStatus");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _MiiUserProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "MiiUserProfile");
    private final static QName _EmailAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "EmailAddress");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _Claim_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "Claim");
    private final static QName _MiiApiResponseOfMiiUserProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "MiiApiResponseOfMiiUserProfile");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _ArrayOfIdentity_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "ArrayOfIdentity");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfPhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "ArrayOfPhoneNumber");
    private final static QName _MiiApiErrorCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "MiiApiErrorCode");
    private final static QName _PostalAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "PostalAddress");
    private final static QName _ArrayOfPostalAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "ArrayOfPostalAddress");
    private final static QName _PhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "PhoneNumber");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Identity_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "Identity");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _MiiApiResponseOfboolean_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "MiiApiResponseOfboolean");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfEmailAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "ArrayOfEmailAddress");
    private final static QName _MiiApiResponseOfArrayOfIdentitySnapshotDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "MiiApiResponseOfArrayOfIdentitySnapshotDetails");
    private final static QName _MiiApiResponseOfIdentitySnapshot_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", "MiiApiResponseOfIdentitySnapshot");

    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.miicard.consumers.service.v1.claims
     * 
     */
    public ObjectFactory() {
    }
    
    public final GetIdentitySnapshot createGetIdentitySnapshot() {
    	return new GetIdentitySnapshot();
    }
    
    public final GetIdentitySnapshotResponse createGetIdentitySnapshotResult()
    {
    	return new GetIdentitySnapshotResponse();
    }
    
    public final GetIdentitySnapshotDetails createGetIdentitySnapshotDetails() {
    	return new GetIdentitySnapshotDetails();
    }
    
    public final GetIdentitySnapshotDetailsResponse createGetIdentitySnapshotDetailsResult()
    {
    	return new GetIdentitySnapshotDetailsResponse();
    }
    
    public final MiiApiResponseOfArrayOfIdentitySnapshotDetails createMiiApiResponseOfArrayOfIdentitySnapshotDetails()
    {
    	return new MiiApiResponseOfArrayOfIdentitySnapshotDetails();
    }
    
    public final MiiApiResponseOfIdentitySnapshot createMiiApiResponseOfIdentitySnapshot()
    {
    	return new MiiApiResponseOfIdentitySnapshot();
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
    
    /**
     * Create an instance of {@link IsSocialAccountAssured }
     * 
     */
    public final IsSocialAccountAssured createIsSocialAccountAssured() {
        return new IsSocialAccountAssured();
    }

    /**
     * Create an instance of {@link GetClaims }
     * 
     */
    public final GetClaims createGetClaims() {
        return new GetClaims();
    }

    /**
     * Create an instance of {@link IsUserAssuredResponse }
     * 
     */
    public final IsUserAssuredResponse createIsUserAssuredResponse() {
        return new IsUserAssuredResponse();
    }

    /**
     * Create an instance of {@link MiiApiResponseOfBoolean }
     * 
     */
    public final MiiApiResponseOfBoolean createMiiApiResponseOfboolean() {
        return new MiiApiResponseOfBoolean();
    }

    /**
     * Create an instance of {@link GetClaimsResponse }
     * 
     */
    public final GetClaimsResponse createGetClaimsResponse() {
        return new GetClaimsResponse();
    }

    /**
     * Create an instance of {@link MiiApiResponseOfMiiUserProfile }
     * 
     */
    public final MiiApiResponseOfMiiUserProfile createMiiApiResponseOfMiiUserProfile() {
        return new MiiApiResponseOfMiiUserProfile();
    }

    /**
     * Create an instance of {@link AssuranceImageResponse }
     * 
     */
    public final AssuranceImageResponse createAssuranceImageResponse() {
        return new AssuranceImageResponse();
    }

    /**
     * Create an instance of {@link IsSocialAccountAssuredResponse }
     * 
     */
    public final IsSocialAccountAssuredResponse createIsSocialAccountAssuredResponse() {
        return new IsSocialAccountAssuredResponse();
    }

    /**
     * Create an instance of {@link IsUserAssured }
     * 
     */
    public final IsUserAssured createIsUserAssured() {
        return new IsUserAssured();
    }

    /**
     * Create an instance of {@link AssuranceImage }
     * 
     */
    public final AssuranceImage createAssuranceImage() {
        return new AssuranceImage();
    }

    /**
     * Create an instance of {@link ClaimImpl }
     * 
     */
    public final ClaimImpl createClaim() {
        return new ClaimImpl();
    }

    /**
     * Create an instance of {@link ArrayOfIdentity }
     * 
     */
    public final ArrayOfIdentity createArrayOfIdentity() {
        return new ArrayOfIdentity();
    }

    /**
     * Create an instance of {@link ArrayOfPhoneNumber }
     * 
     */
    public final ArrayOfPhoneNumber createArrayOfPhoneNumber() {
        return new ArrayOfPhoneNumber();
    }

    /**
     * Create an instance of {@link PhoneNumberImpl }
     * 
     */
    public final PhoneNumberImpl createPhoneNumber() {
        return new PhoneNumberImpl();
    }

    /**
     * Create an instance of {@link ArrayOfPostalAddress }
     * 
     */
    public final ArrayOfPostalAddress createArrayOfPostalAddress() {
        return new ArrayOfPostalAddress();
    }

    /**
     * Create an instance of {@link PostalAddressImpl }
     * 
     */
    public final PostalAddressImpl createPostalAddress() {
        return new PostalAddressImpl();
    }

    /**
     * Create an instance of {@link IdentityImpl }
     * 
     */
    public final IdentityImpl createIdentity() {
        return new IdentityImpl();
    }

    /**
     * Create an instance of {@link MiiUserProfileImpl }
     * 
     */
    public final MiiUserProfileImpl createMiiUserProfile() {
        return new MiiUserProfileImpl();
    }

    /**
     * Create an instance of {@link EmailAddressImpl }
     * 
     */
    public final EmailAddressImpl createEmailAddress() {
        return new EmailAddressImpl();
    }

    /**
     * Create an instance of {@link ArrayOfEmailAddress }
     * 
     */
    public final ArrayOfEmailAddress createArrayOfEmailAddress() {
        return new ArrayOfEmailAddress();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public final JAXBElement<String> createAnyURI(final String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiiApiCallStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "MiiApiCallStatus")
    public final JAXBElement<MiiApiCallStatus> createMiiApiCallStatus(
    		final MiiApiCallStatus value) {
        
    	return new JAXBElement<MiiApiCallStatus>(_MiiApiCallStatus_QNAME, MiiApiCallStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public final JAXBElement<Integer> createChar(
    		final Integer value) {
        
    	return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public final JAXBElement<Date> createDateTime(
    		final Date value) {
        
    	return new JAXBElement<Date>(_DateTime_QNAME, Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public final JAXBElement<QName> createQName(
    		final QName value) {
        
    	return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public final JAXBElement<Integer> createUnsignedShort(
    		final Integer value) {
        
    	return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public final JAXBElement<Float> createFloat(final Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public final JAXBElement<Long> createLong(final Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public final JAXBElement<Short> createShort(final Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public final JAXBElement<byte[]> createBase64Binary(final byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public final JAXBElement<Byte> createByte(final Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiiUserProfileImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "MiiUserProfile")
    public final JAXBElement<MiiUserProfileImpl> createMiiUserProfile(
    		final MiiUserProfileImpl value) {
        
    	return new JAXBElement<MiiUserProfileImpl>(_MiiUserProfile_QNAME, MiiUserProfileImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAddressImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "EmailAddress")
    public final JAXBElement<EmailAddressImpl> createEmailAddress(
    		final EmailAddressImpl value) {
        
    	return new JAXBElement<EmailAddressImpl>(_EmailAddress_QNAME, EmailAddressImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public final JAXBElement<Boolean> createBoolean(
    		final Boolean value) {
        
    	return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public final JAXBElement<Short> createUnsignedByte(final Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "Claim")
    public final JAXBElement<ClaimImpl> createClaim(final ClaimImpl value) {
        return new JAXBElement<ClaimImpl>(_Claim_QNAME, ClaimImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiiApiResponseOfMiiUserProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "MiiApiResponseOfMiiUserProfile")
    public final JAXBElement<MiiApiResponseOfMiiUserProfile> createMiiApiResponseOfMiiUserProfile(
    		final MiiApiResponseOfMiiUserProfile value) {
        
    	return new JAXBElement<MiiApiResponseOfMiiUserProfile>(
    			_MiiApiResponseOfMiiUserProfile_QNAME, 
    			MiiApiResponseOfMiiUserProfile.class, 
    			null, 
    			value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public final JAXBElement<Object> createAnyType(final Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIdentity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "ArrayOfIdentity")
    public final JAXBElement<ArrayOfIdentity> createArrayOfIdentity(
    		final ArrayOfIdentity value) {
        
    	return new JAXBElement<ArrayOfIdentity>(_ArrayOfIdentity_QNAME, ArrayOfIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public final JAXBElement<Long> createUnsignedInt(final Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public final JAXBElement<Integer> createInt(final Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhoneNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "ArrayOfPhoneNumber")
    public final JAXBElement<ArrayOfPhoneNumber> createArrayOfPhoneNumber(
    		final ArrayOfPhoneNumber value) {
        
    	return new JAXBElement<ArrayOfPhoneNumber>(
    			_ArrayOfPhoneNumber_QNAME, 
    			ArrayOfPhoneNumber.class, 
    			null, 
    			value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiiApiErrorCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "MiiApiErrorCode")
    public final JAXBElement<MiiApiErrorCode> createMiiApiErrorCode(
    		final MiiApiErrorCode value) {
        
    	return new JAXBElement<MiiApiErrorCode>(_MiiApiErrorCode_QNAME, MiiApiErrorCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalAddressImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "PostalAddress")
    public final JAXBElement<PostalAddressImpl> createPostalAddress(final PostalAddressImpl value) {
        return new JAXBElement<PostalAddressImpl>(
        		_PostalAddress_QNAME, 
        		PostalAddressImpl.class, 
        		null, 
        		value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPostalAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "ArrayOfPostalAddress")
    public final JAXBElement<ArrayOfPostalAddress> createArrayOfPostalAddress(
    		final ArrayOfPostalAddress value) {
        
    	return new JAXBElement<ArrayOfPostalAddress>(
    			_ArrayOfPostalAddress_QNAME, 
    			ArrayOfPostalAddress.class, 
    			null, 
    			value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "PhoneNumber")
    public final JAXBElement<PhoneNumberImpl> createPhoneNumber(
    		final PhoneNumberImpl value) {
        
    	return new JAXBElement<PhoneNumberImpl>(
    			_PhoneNumber_QNAME, 
    			PhoneNumberImpl.class, 
    			null, 
    			value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public final JAXBElement<BigDecimal> createDecimal(
    		final BigDecimal value) {
        
    	return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public final JAXBElement<Double> createDouble(final Double value) {
        
    	return new JAXBElement<Double>(
    			_Double_QNAME, 
    			Double.class, 
    			null, 
    			value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public final JAXBElement<String> createGuid(final String value) {
        
    	return new JAXBElement<String>(
    			_Guid_QNAME, String.class, 
    			null, 
    			value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public final JAXBElement<Duration> createDuration(
    		final Duration value) {
        
    	return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentityImpl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "Identity")
    public final JAXBElement<IdentityImpl> createIdentity(
    		final IdentityImpl value) {
        
    	return new JAXBElement<IdentityImpl>(_Identity_QNAME, IdentityImpl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public final JAXBElement<String> createString(
    		final String value) {
        
    	return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiiApiResponseOfBoolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "MiiApiResponseOfboolean")
    public final JAXBElement<MiiApiResponseOfBoolean> createMiiApiResponseOfboolean(
    		final MiiApiResponseOfBoolean value) {
        
    	return new JAXBElement<MiiApiResponseOfBoolean>(
    			_MiiApiResponseOfboolean_QNAME, 
    			MiiApiResponseOfBoolean.class, 
    			null, 
    			value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public final JAXBElement<BigInteger> createUnsignedLong(
    		final BigInteger value) {
        
    	return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmailAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "ArrayOfEmailAddress")
    public final JAXBElement<ArrayOfEmailAddress> createArrayOfEmailAddress(
    		final ArrayOfEmailAddress value) {
        
    	return new JAXBElement<ArrayOfEmailAddress>(
    			_ArrayOfEmailAddress_QNAME, 
    			ArrayOfEmailAddress.class, 
    			null, 
    			value);
    }
    
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "MiiApiResponseOfArrayOfIdentitySnapshotDetails")
    public final JAXBElement<MiiApiResponseOfArrayOfIdentitySnapshotDetails> createMiiApiResponseOfArrayOfIdentitySnapshotDetails(
    		final MiiApiResponseOfArrayOfIdentitySnapshotDetails value) {
        
    	return new JAXBElement<MiiApiResponseOfArrayOfIdentitySnapshotDetails>(
    			_MiiApiResponseOfArrayOfIdentitySnapshotDetails_QNAME, 
    			MiiApiResponseOfArrayOfIdentitySnapshotDetails.class, 
    			null, 
    			value);
    }
    
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api", name = "MiiApiResponseOfIdentitySnapshot")
    public final JAXBElement<MiiApiResponseOfIdentitySnapshot> createMiiApiResponseOfIdentitySnapshot(final MiiApiResponseOfIdentitySnapshot value) {
        
    	return new JAXBElement<MiiApiResponseOfIdentitySnapshot>(
    			_MiiApiResponseOfIdentitySnapshot_QNAME, 
    			MiiApiResponseOfIdentitySnapshot.class, 
    			null, 
    			value);
    }
}
