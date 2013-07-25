<%@page import="java.net.URLEncoder"%>
<%@page import="com.miicard.consumers.testharness.Prettify"%>
<%@page import="com.miicard.consumers.service.v1.MiiCardOAuthClaimsService"%>
<%@page import="org.apache.commons.io.IOUtils"%>
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
    
    if (action != null 
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
    	
    	if (action.equals("get-claims")) {
    		viewModel.setLastGetClaimsResult(Prettify.renderResponse(service.getClaims()));
    	}
        else if (action.equals("is-user-assured")) {
        	viewModel.setLastIsUserAssuredResult(
        			Prettify.renderResponse(service.isUserAssured()));
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
        					)
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
        	viewModel.setLastGetIdentitySnapshotDetailsResult(Prettify.renderResponse(service.getIdentitySnapshotDetails(viewModel.getIdentitySnapshotDetailsId())));
        }
        else if (action.equals("get-identity-snapshot") 
        		&& viewModel.getIdentitySnapshotId() != null
        		&& !viewModel.getIdentitySnapshotId().isEmpty())
        {
        	viewModel.setLastGetIdentitySnapshotResult(Prettify.renderResponse(service.getIdentitySnapshot(viewModel.getIdentitySnapshotId())));
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
    }
    else if (action != null) {
    	viewModel.setShowOAuthDetailsRequiredError(true);
    }
%>

<html>
<head>
    <link rel="Stylesheet" type="text/css" href="bootstrap.min.css" />
    <link rel="Stylesheet" type="text/css" href="Site.css" />
    <script href="jquery-1.8.0.min.js"></script>
    <script href="bootstrap.min.js"></script>
    <style type="text/css">
      .page-header { margin-top: 50px; margin-bottom: 10px; }
      input[type=text] { width: 50%; }
    </style>
    <title>miiCard Java API Wrappers Test Harness</title>
</head>

<body>
<div class="container">
    <div class="row">
        <div class="span12">
            <h1>Java miiCard API test harness</h1>
        </div>
    </div>
    <form method="POST">
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
            <h1>API methods
            <small>Find the method you want to invoke</small>
            </h1>
        </div>
        <div class="page-header">
            <h2>GetClaims
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
            <h2>IsUserAssured
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
            <h2>IsSocialAccountAssured
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
            <h2>AssuranceImage
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
            <h2>GetCardImage
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
            <h2>GetIdentitySnapshotDetails
            <small>Retrieve metadata about an identity snapshot</small>
            </h2>
        </div>
        <div class="row">
            <div class="span12">
                <h3>Parameters</h3>
                <label for="identitySnapshotDetailsSnapshotId">Snapshot ID (blank to list all)</label>
                <input type="text" name="identitySnapshotDetailsSnapshotId" value="<%= viewModel.getIdentitySnapshotDetailsId() %>" />

                <h4>Result</h4>
                <% if (viewModel.getLastGetIdentitySnapshotDetailsResult() != null) { %>
                <p><%= viewModel.getLastGetIdentitySnapshotDetailsResult() %></p>
                <% } %>
                <button type="submit" name="btn-invoke" value="get-identity-snapshot-details" class="btn btn-large">Invoke method &raquo;</button>
            </div>
        </div>

        <div class="page-header">
            <h2>GetIdentitySnapshot
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
            <h2>GetIdentitySnapshotPdf
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
    </form>
</div>
</body>
</html>

