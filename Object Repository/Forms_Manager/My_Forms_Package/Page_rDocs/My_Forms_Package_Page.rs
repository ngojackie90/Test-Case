<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>My_Forms_Package_Page</name>
   <tag></tag>
   <elementGuidId>87e38211-f60a-4449-8f72-91d79c556c7a</elementGuidId>
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
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>container</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
    
//&lt;![CDATA[
Sys.WebForms.PageRequestManager._initialize('ctl00$MainContent$ScriptManager1', 'form1', ['tctl00$MainContent$UPAddPackageForm','MainContent_UPAddPackageForm','tctl00$MainContent$upnlLibList','MainContent_upnlLibList','tctl00$MainContent$UCAddForms$upnlNLibList','MainContent_UCAddForms_upnlNLibList'], [], ['ctl00$MainContent$BtnUploadForm','MainContent_BtnUploadForm'], 90, 'ctl00');
//]]>


    
    

    
    
        
            Forms Library
            Forms Package
            Forms Template
            My Forms Package
            
                Clauses
            
        
    
    
    
	
        
            
                
                    
                    
                    
                        
                            
                                
                                    Show:
                                
		All
		Active
		InActive

	
                            
                            
                                 Add Package  
                                
                            
                        
                        
                        

                        
                            
		
			
				 Packages 
			
				
                                        
                                            My Forms Package Test
                                        
                                            
                                                
                                                
                                                
                                            
                                        
			
				
                                        
                                            My Forms Package Test
                                        
                                            
                                                
                                                
                                                
                                            
                                        
			
		
	
                        

                    
                    
                
                
                    
                    
                    
                        
		
                        
                            
                                 Upload New Form
                                 Add Library Forms
                            
                        
                        
	
                        
                        
                            
		
			
				There are no Forms.
			
		
	
                        
                    
                    
                
            
        
    
 


    
    
        
            ×
            Add Package
        
        
            
                
                
                    
                        
                            * Package Name:
                        
                        (Minimum 4 characters)
                    
                
                
                    
                        
                    
                
                
            
        
        
            Cancel
            
        
    
  
    
    
        
            ×
            
                Update Package
        
        
                
            
                
                    
                        
                            * Package Name:
                        
                        
                        
                    
                
                
                    
                        
                    
                
                
            
        
        
            Cancel
            
        
    

    
    
        
	
        
            ×
            
                Upload Form to My Package
        
        
                

          Select Form: 
		
        
            
            You can upload the PDF Forms. Forms with fillable fields are also allowed. 
            
        
        
        
            Cancel
            
        
            

    

    
    
        
	
                
                    ×
                    Library List:
                    

	
                        
                            
                                Select Form(s) to add:
                            
                            
                                
                            
                        
                
                
                    
                    

	
                
                
                    Cancel
                    
                
            

    
    

    
    
        
            ×
            
                Remove Forms from Package
        
        
            
            
                
                
                    Please select at least one form to remove.
                
                
                    


                
                
            
        
        
        
            Cancel 
            
        
    
    

    
    
        
            ×
            
                Update Package Form Name
        
        
                
            
                
                    * - Maximum length of a form name is 50.
                
                
                    
                        
                            * Package Form Name:
                        
                        
                        
                    
                
            
        
        
            
        
    
    
    
    
	
	    
	        ×
	        Append Forms
            Form Name: 
	    
	    
	        
                
	
                
                    This form is already a child form. It cannot be a parent form.
                
                

                
	
	            
                    
	                

	
	            
                

	        
	    
	    
	        Cancel
	        
	    
	




    function APAddFormsShowModalPopup() {
        $(document).ready(function () {
            $('#MdlNAddForms').modal('show');
            $('#MdlNAddForms').on('hidden', function () {
                ClearField();
            });
        });
    }
    function APAddFormsHideModalPopup() {
        $('#MdlNAddForms').modal('hide');
    }
    function ClearField() {
        $('#MainContent_UCAddForms_TextBox2').val('');
    }

    function cAPSearch() {
        $(document).ready(function () {
            var searchKey = $('#MainContent_UCAddForms_TextBox2').val().toLowerCase();
            $(&quot;#MainContent_UCAddForms_gvNLibFormsList tr td:nth-child(2)&quot;).each(function () {
                var cellText = $(this).text().toLowerCase();
                if (cellText.indexOf(searchKey) >= 0) {
                    $(this).parent().show();
                }
                else {
                    $(this).parent().hide();
                }
            });
            //var tbSearchLength = $(&quot;#MainContent_UCAddForms_TextBox2&quot;).val().length
            //if (tbSearchLength > 3) {
            //    $(&quot;#MainContent_UCAddForms_LBSearch&quot;).removeAttr(&quot;disabled&quot;);
            //}
            //else {
            //    $(&quot;#MainContent_UCAddForms_LBSearch&quot;).attr(&quot;disabled&quot;, true);
            //}
        });
    }

    function enableSelButton() {
        $(document).ready(function () {
            $('.lfchkbox').change(function () {
                if ($('.lfchkbox:checked').length) {
                    $('#MainContent_UCAddForms_ibSelForms').removeAttr('disabled');
                } else {
                    $('#MainContent_UCAddForms_ibSelForms').attr('disabled', 'disabled');
                }
            });
        });
    }

    function lfUnSelectAll() {
        $('input:checkbox.chkNLibFrmSelect').removeAttr('checked');
        $('input:checkbox.chkSRLibFrmSelect').removeAttr('checked');
    }




    
    
        
	
                
                    ×
                    Add Forms to Package
                
                
                    
                    
                        
                            
                            
                                
                                    

	
                                
                                        
		
                                            
                                                 
                                                
                                            
                                        
	
                                
                                
                            
                            
                            

	
                            
                            

	
                            
                            
                        
                        
                            
                            
                        
                        
                        
                            
                                
                                    Selected Forms
                                
                                                                
                            
                                

	
                            
                        
                        
                    
                
                
                    Cancel
                    
                
            

    
    


    


    
          
            
              Terms of Use
              ·
              Copyright © 2018 Real Estate Digital, LLC
              ·
              v2017.2.23
            
          
    
</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;form1&quot;)/div[@class=&quot;container&quot;]</value>
   </webElementProperties>
</WebElementEntity>
