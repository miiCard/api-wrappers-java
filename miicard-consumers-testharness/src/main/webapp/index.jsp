<%@page import="com.miicard.consumers.service.v1.MiiCardDirectoryService"%>
<%@page import="com.miicard.consumers.service.v1.claims.impl.Claims"%>
<%@page import="com.miicard.consumers.testharness.PrettifyConfiguration"%>
<%@page import="com.miicard.consumers.service.v1.claims.api.MiiUserProfile"%>
<%@page import="com.miicard.consumers.service.v1.MiiCardOAuthFinancialService"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="com.miicard.consumers.testharness.Prettify"%>
<%@page import="com.miicard.consumers.service.v1.MiiCardOAuthClaimsService"%>
<%@page import="org.apache.commons.io.IOUtils"%>
<%@page import="java.math.BigDecimal" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<jsp:useBean id="viewModel" scope="request" class="com.miicard.consumers.testharness.HarnessViewModel" />
<jsp:setProperty name="viewModel" property="*" />

<%
    String action = null;

	if (request.getMethod() == "POST") {
        action = request.getParameter("btn-invoke");
    }
    
    viewModel.setShowOAuthDetailsRequiredError(false);    

    if (action != null && action.equals("directory-search"))
    {
    	MiiUserProfile result = new MiiCardDirectoryService().findBy(viewModel.getDirectoryCriterion(), viewModel.getDirectoryCriterionValue(), viewModel.getDirectoryCriterionValueHashed());
    	if (result != null) {
    		viewModel.setLastDirectorySearchResult(Prettify.renderUserProfile(result, null));
    	}
    }
    else if (action != null 
    		&& !action.isEmpty() 
    		&& viewModel != null 
    		&& viewModel.getConsumerKey() != null 
    		&& !viewModel.getConsumerKey().isEmpty() 
    		&& viewModel.getConsumerSecret() != null  
    		&& !viewModel.getConsumerSecret().isEmpty() 
    		&& viewModel.getAccessToken() != null 
    		&& !viewModel.getAccessToken().isEmpty() 
    		&& viewModel.getAccessTokenSecret() != null 
    		&& !viewModel.getAccessTokenSecret().isEmpty()) {
    	
    	MiiCardOAuthClaimsService service 
    		= new MiiCardOAuthClaimsService(
    				viewModel.getConsumerKey(),
    				viewModel.getConsumerSecret(),
    				viewModel.getAccessToken(),
    				viewModel.getAccessTokenSecret()
    		);
    	
    	MiiCardOAuthFinancialService financialService
    		= new MiiCardOAuthFinancialService(
    				viewModel.getConsumerKey(),
    				viewModel.getConsumerSecret(),
    				viewModel.getAccessToken(),
    				viewModel.getAccessTokenSecret()
    		);
    	
    	if (action.equals("get-claims")) {
    		viewModel.setLastGetClaimsResult(Prettify.renderResponse(service.getClaims(), null));
    	}
        else if (action.equals("is-user-assured")) {
        	viewModel.setLastIsUserAssuredResult(
        			Prettify.renderResponse(service.isUserAssured(), null));
        }
        else if (action.equals("is-social-account-assured") 
        		&& viewModel.getSocialAccountId() != null 
        		&& !viewModel.getSocialAccountId().isEmpty() 
        		&& viewModel.getSocialAccountType() != null 
        		&& !viewModel.getSocialAccountType().isEmpty()) {
        	
        	viewModel.setLastIsSocialAccountAssuredResult(
        			Prettify.renderResponse(
        					service.isSocialAccountAssured(
        							viewModel.getSocialAccountId(), 
        							viewModel.getSocialAccountType()
        					), null
        			)
        	);
        }
        else if (action.equals("assurance-image") 
        		&& viewModel.getAssuranceImageType() != null 
        		&& !viewModel.getAssuranceImageType().isEmpty()) {
        	viewModel.setShowAssuranceImage(true);
        }
        else if (action.equals("card-image")) {
        	viewModel.setShowCardImage(true);
        }
        else if (action.equals("get-identity-snapshot-details"))
        {
        	viewModel.setLastGetIdentitySnapshotDetailsResult(Prettify.renderResponse(service.getIdentitySnapshotDetails(viewModel.getIdentitySnapshotDetailsSnapshotId()), null));
        }
        else if (action.equals("get-identity-snapshot") 
        		&& viewModel.getIdentitySnapshotId() != null
        		&& !viewModel.getIdentitySnapshotId().isEmpty())
        {
        	viewModel.setLastGetIdentitySnapshotResult(Prettify.renderResponse(service.getIdentitySnapshot(viewModel.getIdentitySnapshotId()), null));
        }
        else if (action.equals("get-identity-snapshot-pdf") 
        		&& viewModel.getIdentitySnapshotPdfId() != null
        		&& !viewModel.getIdentitySnapshotPdfId().isEmpty())
        {
        	response.setContentType("application/pdf");
        	response.setHeader("Content-Disposition", "attachment; filename=\"" + viewModel.getIdentitySnapshotPdfId() + "\".pdf");
        	response.resetBuffer();
        	IOUtils.copy(service.getIdentitySnapshotPdf(viewModel.getIdentitySnapshotPdfId()), response.getOutputStream());
        	
        	return;
        }
        else if (action.equals("is-credit-bureau-refresh-in-progress")) {
		viewModel.setLastIsCreditBureauRefreshInProgressResult(Prettify.renderResponse(service.isCreditBureauRefreshInProgress(), null));
        }
        else if (action.equals("refresh-credit-bureau-data")) {
		viewModel.setLastRefreshCreditBureauDataResult(Prettify.renderResponse(service.refreshCreditBureauData(), null));
        }
        else if (action.equals("is-refresh-in-progress")) {
        	viewModel.setLastIsRefreshInProgressResult(Prettify.renderResponse(financialService.isRefreshInProgress(), null));
        }
        else if (action.equals("is-refresh-in-progress-credit-cards")) {
		viewModel.setLastIsRefreshInProgressCreditCardsResult(Prettify.renderResponse(financialService.isRefreshInProgressCreditCards(), null));
        }
        else if (action.equals("refresh-financial-data")) {
		viewModel.setLastRefreshFinancialDataResult(Prettify.renderResponse(financialService.refreshFinancialData(), null));
        }
        else if (action.equals("refresh-financial-data-credit-cards")) {
		viewModel.setLastRefreshFinancialDataCreditCardsResult(Prettify.renderResponse(financialService.refreshFinancialDataCreditCards(), null));
        }
        else if (action.equals("get-financial-transactions")) {
		PrettifyConfiguration configuration = new PrettifyConfiguration();
		BigDecimal modestyLimit = null;

		try {
			modestyLimit = new BigDecimal(viewModel.getFinancialDataModestyLimit());
		}
		catch (Exception ex) {

		}

		configuration.setModestyLimit(modestyLimit);

		viewModel.setLastGetFinancialTransactionResult(Prettify.renderResponse(financialService.getFinancialData(), configuration));
        }
        else if (action.equals("get-financial-transactions-credit-cards")) {
		PrettifyConfiguration configuration = new PrettifyConfiguration();
        	BigDecimal modestyLimit = null;
        	
        	try {
			modestyLimit = new BigDecimal(viewModel.getFinancialDataCreditCardsModestyLimit());
        	}
        	catch (Exception ex) { 
        		
        	}
        	
        	configuration.setModestyLimit(modestyLimit);
        	
		viewModel.setLastGetFinancialTransactionCreditCardsResult(Prettify.renderResponse(financialService.getFinancialDataCreditCards(), configuration));
        }
        else if (action.equals("get-authentication-details"))
        {
        	viewModel.setLastGetAuthenticationDetailsResult(Prettify.renderResponse(service.getAuthenticationDetails(viewModel.getAuthenticationDetailsSnapshotId()), null));
        }
    }
    else if (action != null) {
    	viewModel.setShowOAuthDetailsRequiredError(true);
    }
%>

<html>
<head>
    <link rel="Stylesheet" type="text/css" href="css/bootstrap.min.css" />
    <link rel="Stylesheet" type="text/css" href="css/bootstrap-responsive.min.css" />
    <link rel="Stylesheet" type="text/css" href="css/Site.css" />
    <script src="js/jquery-1.10.2.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <title>miiCard Java API Wrappers Test Harness</title>
</head>

<body>
<div class="container">
    <div class="row">
        <div class="span12">
            <h1>Java miiCard API test harness</h1>
        </div>
    </div>
    <form method="POST" id="theForm">
        <div class="page-header">
            <h1>OAuth token settings
            <small>Enter manually</small>
            </h1>
        </div>
        <div class="row">
            <div class="span12">

                <% if (viewModel.isShowOAuthDetailsRequiredError()) { %>
                <div class="alert alert-error">
                    Keys and secrets are required fields.
                </div>
                <% } %>

                <label for="consumerKey">OAuth Consumer Key</label>
                <input type="text" name="consumerKey" value="<%= viewModel.getConsumerKey() %>"/>
                <label for="consumerSecret">OAuth Consumer Secret</label>
                <input type="text" name="consumerSecret" value="<%= viewModel.getConsumerSecret() %>" />
                <label for="accessToken">OAuth Access Token</label>
                <input type="text" name="accessToken" value="<%= viewModel.getAccessToken() %>" />
                <label for="accessTokenSecret">OAuth Access Token Secret</label>
                <input type="text" name="accessTokenSecret" value="<%= viewModel.getAccessTokenSecret() %>" />
            </div>
        </div>
        <div class="page-header">
            <h1>Claims API methods
            <small>Find the method you want to invoke</small>
            </h1>
        </div>
        <div class="page-header">
            <h2><a name="get-claims"></a>GetClaims
            <small>Gets the set of data a user has shared with the application</small>
            </h2>
        </div>
        <div class="row">
            <div class="span12">
                <h3>Parameters</h3>
                <p>There are no parameters</p>
                <h4>Result</h4>
                <% if (viewModel.getLastGetClaimsResult() != null) { %>
                <p><%= viewModel.getLastGetClaimsResult() %></p>
                <% } %>
                <button type="submit" name="btn-invoke" value="get-claims" class="btn btn-large">Invoke method &raquo;</button>
            </div>
        </div>

        <div class="page-header">
            <h2><a name="is-user-assured"></a>IsUserAssured
            <small>Determines if the user has a current financial validation</small>
            </h2>
        </div>
        <div class="row">
            <div class="span12">
                <h3>Parameters</h3>
                <p>There are no parameters</p>
                <h4>Result</h4>
                <% if (viewModel.getLastIsUserAssuredResult() != null) { %>
                <p><%= viewModel.getLastIsUserAssuredResult() %></p>
                <% } %>
                <button type="submit" name="btn-invoke" value="is-user-assured" class="btn btn-large">Invoke method &raquo;</button>
            </div>
        </div>

        <div class="page-header">
            <h2><a name="is-social-account-assured"></a>IsSocialAccountAssured
            <small>Determines if a given social account belongs to the user</small>
            </h2>
        </div>
        <div class="row">
            <div class="span12">
                <h3>Parameters</h3>
                <label for="socialAccountId">Social account ID</label>
                <input type="text" name="socialAccountId" value="<%= viewModel.getSocialAccountId() %>" />
                <label for="socialAccountType">Social account type (e.g. 'Twitter')</label>
                <input type="text" name="socialAccountType" value="<%= viewModel.getSocialAccountType() %>" />
    
                <h4>Result</h4>
                <% if (viewModel.getLastIsSocialAccountAssuredResult() != null) { %>
                <p><%= viewModel.getLastIsSocialAccountAssuredResult() %></p>
                <% } %>
                <button type="submit" name="btn-invoke" value="is-social-account-assured" class="btn btn-large">Invoke method &raquo;</button>
            </div>
        </div>

        <div class="page-header">
            <h2><a name="assurance-image"></a>AssuranceImage
            <small>Renders a graphical representation of LOA</small>
            </h2>
        </div>
        <div class="row">
            <div class="span12">
                <h3>Parameters</h3>
                <label for="assuranceImageType">Image type</label>
                <input type="text" name="assuranceImageType" value="<%= viewModel.getAssuranceImageType() %>" />
    
                <h4>Result</h4>
                <% if (viewModel.isShowAssuranceImage()) { %>
                <p><img src="assuranceimage?oauth-consumer-key=<%= URLEncoder.encode(viewModel.getConsumerKey(), "UTF8") %>&oauth-consumer-secret=<%= URLEncoder.encode(viewModel.getConsumerSecret(), "UTF8") %>&oauth-access-token=<%= URLEncoder.encode(viewModel.getAccessToken(), "UTF8") %>&oauth-access-token-secret=<%= URLEncoder.encode(viewModel.getAccessTokenSecret(), "UTF8") %>&type=<%= viewModel.getAssuranceImageType() %>" /></p>
                <% } %>
                <button type="submit" name="btn-invoke" value="assurance-image" class="btn btn-large">Invoke method &raquo;</button>
            </div>
        </div>
        
		<div class="page-header">
            <h2><a name="card-image"></a>GetCardImage
            <small>Renders a card-image representation of LOA</small>
            </h2>
        </div>
        <div class="row">
            <div class="span12">
                <h3>Parameters</h3>
                <label for="cardImageSnapshotId">Snapshot ID (optional)</label>
                <input type="text" name="cardImageSnapshotId" value="<%= viewModel.getCardImageSnapshotId() %>" />

                <label for="cardImageFormat">Format (card, signature)</label>
                <input type="text" name="cardImageFormat" value="<%= viewModel.getCardImageFormat() %>" />

                <% if (viewModel.getCardImageShowEmailAddress()) { %>
                  <label class="checkbox"><input type="checkbox" name="cardImageShowEmailAddress" checked="checked" value="on" /> Show email address</label>
                <% } else { %>
                  <label class="checkbox"><input type="checkbox" name="cardImageShowEmailAddress" /> Show email address</label>
                <% } %> 

                <% if (viewModel.getCardImageShowPhoneNumber()) { %>
                  <label class="checkbox"><input type="checkbox" name="cardImageShowPhoneNumber" checked="checked" value="on" /> Show phone number</label>
                <% } else { %>
                  <label class="checkbox"><input type="checkbox" name="cardImageShowPhoneNumber" /> Show phone number</label>
                <% } %>

                <h4>Result</h4>
                <% if (viewModel.getShowCardImage()) { %>
                <p><img src="cardimage?oauth-consumer-key=<%= URLEncoder.encode(viewModel.getConsumerKey(), "UTF8") %>&oauth-consumer-secret=<%= URLEncoder.encode(viewModel.getConsumerSecret(), "UTF8") %>&oauth-access-token=<%= URLEncoder.encode(viewModel.getAccessToken(), "UTF8") %>&oauth-access-token-secret=<%= URLEncoder.encode(viewModel.getAccessTokenSecret(), "UTF8") %>&snapshot-id=<%= viewModel.getCardImageSnapshotId() %>&format=<%= viewModel.getCardImageFormat() %>&show-email-address=<%= Boolean.toString(viewModel.getCardImageShowEmailAddress()) %>&show-phone-number=<%= Boolean.toString(viewModel.getCardImageShowPhoneNumber()) %>" /></p>
                <% } %>
                <button type="submit" name="btn-invoke" value="card-image" class="btn btn-large">Invoke method &raquo;</button>
            </div>
        </div>        
        
        <div class="page-header">
            <h2><a name="get-identity-snapshot-details"></a>GetIdentitySnapshotDetails
            <small>Retrieve metadata about an identity snapshot</small>
            </h2>
        </div>
        <div class="row">
            <div class="span12">
                <h3>Parameters</h3>
                <label for="identitySnapshotDetailsSnapshotId">Snapshot ID (blank to list all)</label>
                <input type="text" name="identitySnapshotDetailsSnapshotId" value="<%= viewModel.getIdentitySnapshotDetailsSnapshotId() %>" />

                <h4>Result</h4>
                <% if (viewModel.getLastGetIdentitySnapshotDetailsResult() != null) { %>
                <p><%= viewModel.getLastGetIdentitySnapshotDetailsResult() %></p>
                <% } %>
                <button type="submit" name="btn-invoke" value="get-identity-snapshot-details" class="btn btn-large">Invoke method &raquo;</button>
            </div>
        </div>

        <div class="page-header">
            <h2><a name="get-identity-snapshot"></a>GetIdentitySnapshot
            <small>Retrieve a previously created snapshot of a miiCard member's identity</small>
            </h2>
        </div>
        <div class="row">
            <div class="span12">
                <h3>Parameters</h3>
                <label for="identitySnapshotId">Snapshot ID</label>
                <input type="text" name="identitySnapshotId" value="<%= viewModel.getIdentitySnapshotId() %>" />

                <h4>Result</h4>
                <% if (viewModel.getLastGetIdentitySnapshotResult() != null) { %>
                <p><%= viewModel.getLastGetIdentitySnapshotResult() %></p>
                <% } %>
                <button type="submit" name="btn-invoke" value="get-identity-snapshot" class="btn btn-large">Invoke method &raquo;</button>
            </div>
        </div>
        
        <div class="page-header">
            <h2><a name="get-identity-snapshot-pdf"></a>GetIdentitySnapshotPdf
            <small>Retrieve a PDF of a created snapshot of a miiCard member's identity</small>
            </h2>
        </div>
        <div class="row">
            <div class="span12">
                <h3>Parameters</h3>
                <label for="identitySnapshotPdfId">Snapshot ID</label>
                <input type="text" name="identitySnapshotPdfId" value="<%= viewModel.getIdentitySnapshotPdfId() %>" />
                
                <button type="submit" name="btn-invoke" value="get-identity-snapshot-pdf" class="btn btn-large">Invoke method &raquo;</button>
            </div>
        </div>
        
        <div class="page-header">
            <h2><a name="get-authentication-details"></a>GetAuthenticationDetails
            <small>Retrieve details of how a miiCard member authenticated</small>
            </h2>
        </div>
        <div class="row">
            <div class="span12">
                <h3>Parameters</h3>
                <label for="authenticationDetailsSnapshotId">Snapshot ID</label>
                <input type="text" name="authenticationDetailsSnapshotId" value="<%= viewModel.getAuthenticationDetailsSnapshotId() %>" />

                <h4>Result</h4>
                <% if (viewModel.getLastGetAuthenticationDetailsResult() != null) { %>
                <p><%= viewModel.getLastGetAuthenticationDetailsResult() %></p>
                <% } %>
                <button type="submit" name="btn-invoke" value="get-authentication-details" class="btn btn-large">Invoke method &raquo;</button>
            </div>
        </div>        

        <div class="page-header">
            <h2><a name="is-credit-bureau-refresh-in-progress"></a>IsCreditBureauRefreshInProgress
            <small>Checks if a credit bureau data refresh is ongoing</small>
            </h2>
        </div>
        <div class="row">
            <div class="span12">
                <h4>Result</h4>
                <% if (viewModel.getLastIsCreditBureauRefreshInProgressResult() != null) { %>
                <p><%= viewModel.getLastIsCreditBureauRefreshInProgressResult() %></p>
                <% } %>
                <button type="submit" name="btn-invoke" value="is-credit-bureau-refresh-in-progress" class="btn btn-large">Invoke method &raquo;</button>
            </div>
        </div>

        <div class="page-header">
            <h2><a name="refresh-credit-bureau-data"></a>RefreshCreditBureauData
            <small>Requests credit bureau data be updated</small>
            </h2>
        </div>
        <div class="row">
            <div class="span12">
                <h4>Result</h4>
                <% if (viewModel.getLastRefreshCreditBureauDataResult() != null) { %>
                <p><%= viewModel.getLastRefreshCreditBureauDataResult() %></p>
                <% } %>
                <button type="submit" name="btn-invoke" value="refresh-credit-bureau-data" class="btn btn-large">Invoke method &raquo;</button>
            </div>
        </div>
        
        <div class="financials">            
        
        	<div class="page-header">
                <h1>Financial API methods
                <small>Find the method you want to invoke</small>
                </h1>
            </div>
            
	        <div class="page-header">
	            <h2><a name="is-refresh-in-progress"></a>IsRefreshInProgress
	            <small>Checks if a financial data refresh is ongoing</small>
	            </h2>
	        </div>
	        <div class="row">
	            <div class="span12">
					<h4>Result</h4>
	                <% if (viewModel.getLastIsRefreshInProgressResult() != null) { %>
	                <p><%= viewModel.getLastIsRefreshInProgressResult() %></p>
	                <% } %>
	                <button type="submit" name="btn-invoke" value="is-refresh-in-progress" class="btn btn-large">Invoke method &raquo;</button>
	            </div>
	        </div>

	        <div class="page-header">
	            <h2><a name="is-refresh-in-progress-credit-cards"></a>IsRefreshInProgressCreditCards
	            <small>Checks if a financial data refresh is ongoing</small>
	            </h2>
	        </div>
	        <div class="row">
	            <div class="span12">
					<h4>Result</h4>
	                <% if (viewModel.getLastIsRefreshInProgressCreditCardsResult() != null) { %>
	                <p><%= viewModel.getLastIsRefreshInProgressCreditCardsResult() %></p>
	                <% } %>
	                <button type="submit" name="btn-invoke" value="is-refresh-in-progress-credit-cards" class="btn btn-large">Invoke method &raquo;</button>
	            </div>
	        </div>
	        
	        <div class="page-header">
	            <h2><a name="refresh-financial-data"></a>RefreshFinancialData
	            <small>Requests financial data be updated</small>
	            </h2>
	        </div>
	        <div class="row">
	            <div class="span12">
					<h4>Result</h4>
	                <% if (viewModel.getLastRefreshFinancialDataResult() != null) { %>
	                <p><%= viewModel.getLastRefreshFinancialDataResult() %></p>
	                <% } %>
	                <button type="submit" name="btn-invoke" value="refresh-financial-data" class="btn btn-large">Invoke method &raquo;</button>
	            </div>
	        </div>
	        
	        <div class="page-header">
	            <h2><a name="refresh-financial-data-credit-cards"></a>RefreshFinancialDataCreditCards
	            <small>Requests financial credit card data be updated</small>
	            </h2>
	        </div>
	        <div class="row">
	            <div class="span12">
					<h4>Result</h4>
	                <% if (viewModel.getLastRefreshFinancialDataCreditCardsResult() != null) { %>
	                <p><%= viewModel.getLastRefreshFinancialDataCreditCardsResult() %></p>
	                <% } %>
	                <button type="submit" name="btn-invoke" value="refresh-financial-data-credit-cards" class="btn btn-large">Invoke method &raquo;</button>
	            </div>
	        </div>

	        <div class="page-header">
	            <h2><a name="get-financial-transactions"></a>GetFinancialTransactions
	            <small>Retrieve the financial transactions that the member has shared with you</small>
	            </h2>
	        </div>
	        <div class="row">
	            <div class="span12">

	                <h4>Result</h4>
	                <label for="financialDataModestyLimit">Hide values absolutely greater than this for modesty (blank to disable)</label>
	                <input type="text" name="financialDataModestyLimit" value="<%= viewModel.getFinancialDataModestyLimit() %>" />

	                <% if (viewModel.getLastGetFinancialTransactionsResult() != null) { %>
	                <p><%= viewModel.getLastGetFinancialTransactionsResult() %></p>
	                <% } %>
	                <button type="submit" name="btn-invoke" value="get-financial-transactions" class="btn btn-large">Invoke method &raquo;</button>
	            </div>
	        </div>

	        <div class="page-header">
	            <h2><a name="get-financial-transactions-credit-cards"></a>GetFinancialTransactionsCreditCards
	            <small>Retrieve the financial credit card transactions that the member has shared with you</small>
	            </h2>
	        </div>
	        <div class="row">
	            <div class="span12">

	                <h4>Result</h4>
	                <label for="financialDataCreditCardsModestyLimit">Hide values absolutely greater than this for modesty (blank to disable)</label>
	                <input type="text" name="financialDataCreditCardsModestyLimit" value="<%= viewModel.getFinancialDataCreditCardsModestyLimit() %>" />

	                <% if (viewModel.getLastGetFinancialTransactionsCreditCardsResult() != null) { %>
	                <p><%= viewModel.getLastGetFinancialTransactionsCreditCardsResult() %></p>
	                <% } %>
	                <button type="submit" name="btn-invoke" value="get-financial-transactions-credit-cards" class="btn btn-large">Invoke method &raquo;</button>
	            </div>
	        </div>
        </div>
        
        <div class="directory">
            <div class="page-header">
                <h1><a name="directory-search"></a>Directory API
                <small>Lookup miiCard members by data they've published</small>
                </h1>
                <div class="alert alert-info">
                <strong>Notes</strong>
                <ul>
                  <li>The Directory API doesn't require OAuth tokens - just call at will</li>
                  <li>Only data that's been published by a miiCard member who's elected to be searchable can be used as a search criterion</li>
                </ul>
                </div>
            </div>
            <div class="row">
                <div class="span12">
                    <h3>Hash identifier <small><a href="#" data-toggle="sha1-hash" class="toggle">More/less</a></small></h3>
                    <div id="sha1-hash" style="display: none">
                        <p>The Directory API can searched by supplying either plaintext or hashed query values for enhanced privacy</p>
                        <label for="directoryPlaintextIdentifier">Plain text identifier</label>
                        <div class="input-prepend" style="display: block;">
                            <span class="add-on"><i class="icon-random"></i></span>
                            <input class="span6" type="text" placeholder="Identifier value" name="directoryPlaintextIdentifier" id="directoryPlaintextIdentifier" />
                        </div>
                    </div>
                </div>
            </div>            
            <div class="row">
                <div class="span12">
                  <h3>Search</h3>
                  <div class="input-prepend" style="display: block;">
                    <span class="add-on"><i class="icon-search"></i></span>
                    <input class="span2" name="directoryCriterionValue" id="directoryCriterionValue" type="text" placeholder="Search" value="<%= viewModel.getDirectoryCriterionValue() %>" />
                    <select name="directoryCriterion" style="margin-left: 0.5em;">
                        <option value="<%= MiiCardDirectoryService.CRITERION_EMAIL %>"<%= (viewModel.getDirectoryCriterion() != null && viewModel.getDirectoryCriterion().equals(MiiCardDirectoryService.CRITERION_EMAIL)) ? " selected" : "" %>>Email address</option>
                        <option value="<%= MiiCardDirectoryService.CRITERION_PHONE %>"<%= (viewModel.getDirectoryCriterion() != null && viewModel.getDirectoryCriterion().equals(MiiCardDirectoryService.CRITERION_PHONE)) ? " selected" : "" %>>Phone number</option>
                        <option value="<%= MiiCardDirectoryService.CRITERION_TWITTER %>"<%= (viewModel.getDirectoryCriterion() != null && viewModel.getDirectoryCriterion().equals(MiiCardDirectoryService.CRITERION_TWITTER)) ? " selected" : "" %>>Twitter</option>
                        <option value="<%= MiiCardDirectoryService.CRITERION_FACEBOOK %>"<%= (viewModel.getDirectoryCriterion() != null && viewModel.getDirectoryCriterion().equals(MiiCardDirectoryService.CRITERION_FACEBOOK)) ? " selected" : "" %>>Facebook</option>
                        <option value="<%= MiiCardDirectoryService.CRITERION_LINKEDIN %>"<%= (viewModel.getDirectoryCriterion() != null && viewModel.getDirectoryCriterion().equals(MiiCardDirectoryService.CRITERION_LINKEDIN)) ? " selected" : "" %>>LinkedIn</option>
                        <option value="<%= MiiCardDirectoryService.CRITERION_GOOGLE %>"<%= (viewModel.getDirectoryCriterion() != null && viewModel.getDirectoryCriterion().equals(MiiCardDirectoryService.CRITERION_GOOGLE)) ? " selected" : "" %>>Google+</option>
                        <option value="<%= MiiCardDirectoryService.CRITERION_MICROSOFT_ID %>"<%= (viewModel.getDirectoryCriterion() != null && viewModel.getDirectoryCriterion().equals(MiiCardDirectoryService.CRITERION_MICROSOFT_ID)) ? " selected" : "" %>>Microsoft ID</option>
                        <option value="<%= MiiCardDirectoryService.CRITERION_EBAY %>"<%= (viewModel.getDirectoryCriterion() != null && viewModel.getDirectoryCriterion().equals(MiiCardDirectoryService.CRITERION_EBAY)) ? " selected" : "" %>>eBay</option>
                        <option value="<%= MiiCardDirectoryService.CRITERION_VERITAS_VITAE %>"<%= (viewModel.getDirectoryCriterion() != null && viewModel.getDirectoryCriterion().equals(MiiCardDirectoryService.CRITERION_VERITAS_VITAE)) ? " selected" : "" %>>Veritas Vitae</option>
                        <option value="<%= MiiCardDirectoryService.CRITERION_USERNAME %>"<%= (viewModel.getDirectoryCriterion() != null && viewModel.getDirectoryCriterion().equals(MiiCardDirectoryService.CRITERION_USERNAME)) ? " selected" : "" %>>Username</option>
                    </select>
                    <button type="submit" name="btn-invoke" value="directory-search" class="btn" style="margin-left: 0.7em;">Search &raquo;</button>
                  </div>
                  <label for="directoryCriterionValueHashed" class="checkbox"><input type="checkbox" id="directoryCriterionValueHashed" name="directoryCriterionValueHashed"<%= (viewModel.getDirectoryCriterionValueHashed() ? " checked='checked'" : "") %> /> Identifier is a hex SHA-1 hash</label>
                  <h4>Result</h4>
				  <% if (viewModel.getLastDirectorySearchResult() != null) { %>
				  <p><%= viewModel.getLastDirectorySearchResult() %></p>
				  <% 
				  }
				  else
				  {
				  %>
				  No results
				  <%
				  }
				  %>
                </div>
            </div>
        </div>
    </form>
</div>

<script type="text/javascript">
    $(document).ready(function () {
        var sha1timer = null;

        $('button[name="btn-invoke"]').click(function () {
            $('#theForm').attr('action', '#' + $(this).attr('value'));
        });

        $('input, select').keydown(function (e) {
            if (e.which == 10 || e.which == 13) {
                $(this).closest('.row').find('button[type="submit"]').click();
                return false;
            }
        });

        $('a.toggle').click(function (e) {
            $('#' + $(this).attr('data-toggle')).toggle();
            e.preventDefault();
        });

        $('#directoryCriterionValue').keyup(function () {
            $('#directory_plaintext_identifier').val('');
        });

        $('#directoryPlaintextIdentifier').keyup(function () {
            if (sha1timer) {
                window.clearTimeout(sha1timer);
                sha1timer = null;
            }

            if ($(this).val().length) {
                elem = $(this);

                sha1timer =
                    window.setTimeout(function () {
                        $.ajax('sha1?identifier=' + encodeURIComponent(elem.val()), {
                            async: false,
                            success: function (data) {
                                $('#directoryCriterionValue').val(data);
                                $('#directoryCriterionValueHashed').prop('checked', 'checked');
                            },
                            error: function (xhr, status, error) { alert(error); }
                        });
                    }, 200);
            }
        });
    });
</script>
</body>
</html>