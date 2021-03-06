package com.miicard.consumers.service.v1.financial.impl;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.miicard.consumers.service.v1.claims.impl.MiiApiResponseOfBoolean;
import com.miicard.consumers.service.v1.claims.impl.MiiApiResponseOfFinancialRefreshStatus;
import com.miicard.consumers.service.v1.claims.impl.MiiApiResponseOfMiiFinancialData;

@SuppressWarnings("restriction")
@WebService(name = "IFinancial", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class,
    com.miicard.consumers.service.v1.claims.impl.ObjectFactory.class
})
public interface IFinancial {
    @WebMethod(operationName = "GetFinancialTransactions", action = "http://tempuri.org/IFinancial/GetFinancialTransactions")
    @WebResult(name = "GetFinancialTransactionsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetFinancialTransactions", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.financial.GetFinancialTransactions")
    @ResponseWrapper(localName = "GetFinancialTransactionsResponse", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.financial.GetFinancialTransactionsResponse")
    MiiApiResponseOfMiiFinancialData getFinancialTransactions();
    
    @WebMethod(operationName = "GetFinancialTransactionsCreditCards", action = "http://tempuri.org/IFinancial/GetFinancialTransactionsCreditCards")
    @WebResult(name = "GetFinancialTransactionsCreditCardsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetFinancialTransactionsCreditCards", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.financial.GetFinancialTransactionsCreditCards")
    @ResponseWrapper(localName = "GetFinancialTransactionsCreditCardsResponse", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.financial.GetFinancialTransactionsCreditCardsResponse")
    MiiApiResponseOfMiiFinancialData getFinancialTransactionsCreditCards();
    
    @WebMethod(operationName = "IsRefreshInProgress", action = "http://tempuri.org/IFinancial/IsRefreshInProgress")
    @WebResult(name = "IsRefreshInProgressResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "IsRefreshInProgress", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.financial.IsRefreshInProgress")
    @ResponseWrapper(localName = "IsRefreshInProgressResponse", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.financial.IsRefreshInProgressResponse")
    MiiApiResponseOfBoolean isRefreshInProgress();
    
    @WebMethod(operationName = "IsRefreshInProgressCreditCards", action = "http://tempuri.org/IFinancial/IsRefreshInProgressCreditCards")
    @WebResult(name = "IsRefreshInProgressCreditCardsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "IsRefreshInProgressCreditCards", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.financial.IsRefreshInProgressCreditCards")
    @ResponseWrapper(localName = "IsRefreshInProgressCreditCardsResponse", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.financial.IsRefreshInProgressCreditCardsResponse")
    MiiApiResponseOfBoolean isRefreshInProgressCreditCards();
    
    @WebMethod(operationName = "RefreshFinancialData", action = "http://tempuri.org/IFinancial/RefreshFinancialData")
    @WebResult(name = "RefreshFinancialDataResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RefreshFinancialData", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.financial.RefreshFinancialData")
    @ResponseWrapper(localName = "RefreshFinancialDataResponse", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.financial.RefreshFinancialDataResponse")
    MiiApiResponseOfFinancialRefreshStatus refreshFinancialData();
    
    @WebMethod(operationName = "RefreshFinancialDataCreditCards", action = "http://tempuri.org/IFinancial/RefreshFinancialDataCreditCards")
    @WebResult(name = "RefreshFinancialDataCreditCardsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RefreshFinancialDataCreditCards", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.financial.RefreshFinancialDataCreditCards")
    @ResponseWrapper(localName = "RefreshFinancialDataCreditCardsResponse", targetNamespace = "http://tempuri.org/", className = "com.miicard.consumers.service.v1.financial.RefreshFinancialDataCreditCardsResponse")
    MiiApiResponseOfFinancialRefreshStatus refreshFinancialDataCreditCards();
}
