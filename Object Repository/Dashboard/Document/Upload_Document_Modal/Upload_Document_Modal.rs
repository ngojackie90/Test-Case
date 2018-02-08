<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>Upload_Document_Modal</name>
   <tag></tag>
   <elementGuidId>4db058ef-fff8-4f73-adb5-f6e2eecf8da6</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>MdlUploadDocBrowser</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>modal hide fade in</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tabindex</name>
      <type>Main</type>
      <value>-1</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>role</name>
      <type>Main</type>
      <value>dialog</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>aria-labelledby</name>
      <type>Main</type>
      <value>myModalLabel</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>aria-hidden</name>
      <type>Main</type>
      <value>false</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
     x
        Upload Document - Via Browser
    
    
          
        
        
			×
			Please correct the following: 
			
		
		
		
             
            
                Document Title:
                
			-Select Document Title-
			Additional Earnest Money Received
			Agency Disclosure
			Broker Demand
			Buyer's Agreement
			Buyer's Inspection Waiver
			CC &amp; R's
			Closing Instructions
			Counter Offer
			Deed of Trust
			Earnest Money Deposit
			Environmental Disclosure Report
			FIRPTA
			Flood Zone Certification
			HOA Documents
			Home Inspection Report
			Home Warranty 
			HUD 1
			Lead Based Paint Disclosure
			Listing Agreement
			Mold Disclosure
			Natural Hazard Disclosure
			Payoff Demand
			Pest Control Report
			Pool Inspection
			Power of Attorney
			Quit Claim Deed
			Reconveyance
			Residential Purchase Agreement
			Roof Inspection
			Seller's Additional Disclosures
			Seller's Statement on Repairs
			Septic / Sewer Disclosure
			Smoke Detector Disclosure
			Statement of Information for Buyer
			Statement of Information for Seller
			test A report that identifies nearby sites such as leaking underground storage tanks, landfills, to
			Transfer Disclosure Statement
			Water Heater Statement
			zz1st Level Document Test

		
                
                  
            
                Document Description:
                
            
			
	

        Select file: 
		
        
        
            
            You can upload the following document types:
            
          
            doc, docx, txt, pdf, rtf, tif, xls, xlsx, jpg, jpeg, gif.
            All documents uploaded will be converted to PDF format.
        

        
		
        

    function pageLoad() {
        // Select All
        $(&quot;.checkallprivatebuyer&quot;).click(function () {
            //Set checked status of all checkboxes to be the same as Select All checkbox checked status.
            $(&quot;.privatebuyer&quot;).attr('checked', this.checked);
            checkSharedRadio();
        });
        $(&quot;.checkallprivateseller&quot;).click(function () {
            //Set checked status of all checkboxes to be the same as Select All checkbox checked status.
            $(&quot;.privateseller&quot;).attr('checked', this.checked);
            checkSharedRadio();
        });
        $(&quot;.checksiteagents&quot;).click(function () {
            checkSharedRadio();
        });

        // Item Select
        $(&quot;.privatebuyer&quot;).click(function () {
            //If total rows with checkboxed is equal to total checked checkboxes then Select All checkbox should be checked.
            var selectAll = $(&quot;.privatebuyer:checked&quot;).length == $(&quot;.privatebuyer&quot;).length;
            $('.checkallprivatebuyer').attr('checked', selectAll);
            checkSharedRadio();
        });
        $(&quot;.privateseller&quot;).click(function () {
            //If total rows with checkboxed is equal to total checked checkboxes then Select All checkbox should be checked.
            var selectAll = $(&quot;.privateseller:checked&quot;).length == $(&quot;.privateseller&quot;).length;
            $('.checkallprivateseller').attr('checked', selectAll);
            checkSharedRadio();
        });

        // Uncheck all under shared if public is checked
        $(&quot;#MainContent_UCUploadDocBrowser_UCDocumentSecurity_RBLDocumentSecurity_1&quot;).click(function () {
            $(&quot;.checkallprivatebuyer&quot;).attr(&quot;checked&quot;, false);
            $(&quot;.privatebuyer&quot;).attr(&quot;checked&quot;, false);
            $(&quot;.checkallprivateseller&quot;).attr(&quot;checked&quot;, false);
            $(&quot;.privateseller&quot;).attr(&quot;checked&quot;, false);
            $(&quot;.checksiteagents&quot;).attr(&quot;checked&quot;, false);
        });

        // Uncheck all under shared if private is checked
        $(&quot;#MainContent_UCUploadDocBrowser_UCDocumentSecurity_RBLDocumentSecurity_0&quot;).click(function () {
            $(&quot;.checkallprivatebuyer&quot;).attr(&quot;checked&quot;, false);
            $(&quot;.privatebuyer&quot;).attr(&quot;checked&quot;, false);
            $(&quot;.checkallprivateseller&quot;).attr(&quot;checked&quot;, false);
            $(&quot;.privateseller&quot;).attr(&quot;checked&quot;, false);
            $(&quot;.checksiteagents&quot;).attr(&quot;checked&quot;, false);
        });

        // Check all if private is selected
        //            $(&quot;#MainContent_UCUploadDocBrowser_UCDocumentSecurity_RBLDocumentSecurity_1&quot;).click(function(){
        //                $(&quot;.checkallprivatebuyer&quot;).attr(&quot;checked&quot;,&quot;true&quot;);
        //                $(&quot;.privatebuyer&quot;).attr(&quot;checked&quot;,&quot;true&quot;);
        //                $(&quot;.checkallprivateseller&quot;).attr(&quot;checked&quot;,&quot;true&quot;);
        //                $(&quot;.privateseller&quot;).attr(&quot;checked&quot;,&quot;true&quot;);
        //            });

        checkAllBuyer();
        checkAllSeller();
        if (window.contentPageLoad) {
            window.contentPageLoad();
        }
    }

    function checkAllBuyer() {
        var selPrivateBuyers = $(&quot;.privatebuyer:checked&quot;).length == $(&quot;.privatebuyer&quot;).length;
        if (selPrivateBuyers) {
            $(&quot;.checkallprivatebuyer&quot;).attr(&quot;checked&quot;, &quot;true&quot;);
        }
    }

    function checkAllSeller() {
        var selPrivateSellers = $(&quot;.privateseller:checked&quot;).length == $(&quot;.privateseller&quot;).length;
        if (selPrivateSellers) {
            $(&quot;.checkallprivateseller&quot;).attr(&quot;checked&quot;, &quot;true&quot;);
        }
    }

    function checkPrivateRadio() {
        var allPrivateUsers = $(&quot;.privatebuyer:checked&quot;).length + $(&quot;.privateseller:checked&quot;).length;
        if (allPrivateUsers > 0) {
            $(&quot;#MainContent_UCUploadDocBrowser_UCDocumentSecurity_RBLDocumentSecurity_0&quot;).attr(&quot;checked&quot;, &quot;true&quot;);
        }
    }

    function checkSharedRadio() {
        var allPrivateUsers = $(&quot;.privatebuyer:checked&quot;).length + $(&quot;.privateseller:checked&quot;).length + $(&quot;.checksiteagents:checked&quot;).length;
        if (allPrivateUsers > 0) {
            $(&quot;#MainContent_UCUploadDocBrowser_UCDocumentSecurity_RBLDocumentSecurity_2&quot;).attr(&quot;checked&quot;, &quot;true&quot;);
        }
    }





			
    Document Security:
    
    
        
            
            
            
				
					Private (Visible to me) 
				
					Public (Visible to all users with a login to this file) 
				
					Shared (Visible to the roles checked below) 
				
			
            
            
            
				
                
                     
                    All  ABC Realty  Agents 
                
            
			
            
            
        
    
    
    
                

		

        
	

        
            
        
    
    
    
		Cancel
		 
		
		
		
    
    
</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;MdlUploadDocBrowser&quot;)</value>
   </webElementProperties>
</WebElementEntity>
