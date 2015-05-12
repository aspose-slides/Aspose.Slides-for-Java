/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithpresentation.openingapresentation.accessingdocumentproperties.java;

import com.aspose.slides.*;

public class AccessingDocumentProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithpresentation/openingapresentation/accessingdocumentproperties/data/";

        //Accessing the Document Properties of a Password Protected Presentation without Password
        //creating instance of load options to set the presentation access password
        com.aspose.slides.LoadOptions loadOptions = new com.aspose.slides.LoadOptions();

        //Setting the access password to null
        loadOptions.setPassword (null);

        //Setting the access to document properties
        loadOptions.setOnlyLoadDocumentProperties (true);

        //Opening the presentation file by passing the file path and load options to the constructor of Presentation class
        Presentation pres = new Presentation( dataDir+ "demoPassDocument.pptx", loadOptions);

        //Getting Document Properties
        IDocumentProperties docProps = pres.getDocumentProperties();
        System.out.println("Program executed successfully");
    }
}




