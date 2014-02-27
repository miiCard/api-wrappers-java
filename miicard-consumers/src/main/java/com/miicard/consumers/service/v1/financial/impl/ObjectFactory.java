package com.miicard.consumers.service.v1.financial.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@SuppressWarnings("restriction")
@XmlRegistry
public class ObjectFactory {
	
    private final static QName _ArrayOfFinancialAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", "ArrayOfFinancialAccount");
    private final static QName _ArrayOfFinancialCreditCard_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", "ArrayOfFinancialCreditCard");
    private final static QName _ArrayOfFinancialProvider_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", "ArrayOfFinancialProvider");
    private final static QName _ArrayOfFinancialTransaction_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", "ArrayOfFinancialTransaction");
    
    private final static QName _FinancialAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", "FinancialAccount");
    private final static QName _FinancialCreditCard_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", "FinancialCreditCard");
    private final static QName _FinancialProvider_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", "FinancialProvider");
    private final static QName _FinancialTransaction_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", "FinancialTransaction");
    private final static QName _RefreshState_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", "RefreshState");
    private final static QName _FinancialRefreshStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", "FinancialRefreshStatus");
    
    public ObjectFactory() {
    }
    
    public final ArrayOfFinancialAccount createArrayOfFinancialAccount() {
    	return new ArrayOfFinancialAccount();
    }
    
    public final ArrayOfFinancialCreditCard createArrayOfFinancialCreditCard() {
    	return new ArrayOfFinancialCreditCard();
    }
    
    public final ArrayOfFinancialProvider createArrayOfFinancialProvider() {
    	return new ArrayOfFinancialProvider();
    }
    
    public final ArrayOfFinancialTransaction createArrayOfFinancialTransaction() {
    	return new ArrayOfFinancialTransaction();
    }
    
    public final FinancialAccountImpl createFinancialAccount() {
    	return new FinancialAccountImpl();
    }
    
    public final FinancialCreditCardImpl createFinancialCreditCard() {
    	return new FinancialCreditCardImpl();
    }
    
    public final FinancialProviderImpl createFinancialProvider() {
    	return new FinancialProviderImpl();
    }
    
    public final FinancialTransactionImpl createFinancialTransaction() {
    	return new FinancialTransactionImpl();
    }
    
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", name = "ArrayOfFinancialAccount")
    public final JAXBElement<ArrayOfFinancialAccount> createArrayOfFinancialAccount(
    		final ArrayOfFinancialAccount value) {
        
    	return new JAXBElement<ArrayOfFinancialAccount>(
    			_ArrayOfFinancialAccount_QNAME, 
    			ArrayOfFinancialAccount.class, 
    			null, 
    			value);
    }
    
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", name = "ArrayOfFinancialCreditCard")
    public final JAXBElement<ArrayOfFinancialCreditCard> createArrayOfFinancialCreditCard(
    		final ArrayOfFinancialCreditCard value) {
        
    	return new JAXBElement<ArrayOfFinancialCreditCard>(
    			_ArrayOfFinancialCreditCard_QNAME, 
    			ArrayOfFinancialCreditCard.class, 
    			null, 
    			value);
    }
    
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", name = "ArrayOfFinancialProvider")
    public final JAXBElement<ArrayOfFinancialProvider> createArrayOfFinancialProvider(
    		final ArrayOfFinancialProvider value) {
        
    	return new JAXBElement<ArrayOfFinancialProvider>(
    			_ArrayOfFinancialProvider_QNAME, 
    			ArrayOfFinancialProvider.class, 
    			null, 
    			value);
    }
    
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", name = "ArrayOfFinancialTransaction")
    public final JAXBElement<ArrayOfFinancialTransaction> createArrayOfFinancialTransaction(
    		final ArrayOfFinancialTransaction value) {
        
    	return new JAXBElement<ArrayOfFinancialTransaction>(
    			_ArrayOfFinancialTransaction_QNAME, 
    			ArrayOfFinancialTransaction.class, 
    			null, 
    			value);
    }
    
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", name = "FinancialAccount")
    public final JAXBElement<FinancialAccountImpl> createFinancialAccount(
    		final FinancialAccountImpl value) {
        
    	return new JAXBElement<FinancialAccountImpl>(
    			_FinancialAccount_QNAME, 
    			FinancialAccountImpl.class, 
    			null, 
    			value);
    }
    
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", name = "FinancialCreditCard")
    public final JAXBElement<FinancialCreditCardImpl> createFinancialCreditCard(
    		final FinancialCreditCardImpl value) {
        
    	return new JAXBElement<FinancialCreditCardImpl>(
    			_FinancialCreditCard_QNAME, 
    			FinancialCreditCardImpl.class, 
    			null, 
    			value);
    }
    
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", name = "FinancialProvider")
    public final JAXBElement<FinancialProviderImpl> createFinancialProvider(
    		final FinancialProviderImpl value) {
        
    	return new JAXBElement<FinancialProviderImpl>(
    			_FinancialProvider_QNAME, 
    			FinancialProviderImpl.class, 
    			null, 
    			value);
    }
    
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", name = "FinancialTransaction")
    public final JAXBElement<FinancialTransactionImpl> createFinancialTransaction(
    		final FinancialTransactionImpl value) {
        
    	return new JAXBElement<FinancialTransactionImpl>(
    			_FinancialTransaction_QNAME, 
    			FinancialTransactionImpl.class, 
    			null, 
    			value);
    }  
    
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", name = "RefreshState")
    public final JAXBElement<RefreshState> createRefreshState(
    		final RefreshState value) {
        
    	return new JAXBElement<RefreshState>(
    			_RefreshState_QNAME, 
    			RefreshState.class, 
    			null, 
    			value);
    }     

    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/miiCard.STS.Model.Api.Financial", name = "FinancialRefreshStatus")
    public final JAXBElement<FinancialRefreshStatusImpl> createFinancialRefreshStatus(
    		final FinancialRefreshStatusImpl value) {
        
    	return new JAXBElement<FinancialRefreshStatusImpl>(
    			_FinancialRefreshStatus_QNAME, 
    			FinancialRefreshStatusImpl.class, 
    			null, 
    			value);
    } 
}
