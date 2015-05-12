/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithpresentation.managingpresentationproperties.accessingmodifyingproperties.java;

import com.aspose.slides.*;

public class AccessingModifyingProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithpresentation/managingpresentationproperties/accessingmodifyingproperties/data/";
        Presentation pres = new Presentation(dataDir+ "Aspose.pptx");

        //Create a reference to IDocumentProperties object associated with Presentation
        IDocumentProperties dp = pres.getDocumentProperties();

        //Set the builtin properties
        dp.setAuthor ( "Aspose.Slides for Java");
        dp.setTitle ("Modifying Presentation Properties");
        dp.setSubject ( "Aspose Subject");
        dp.setComments ( "Aspose Description");
        dp.setManager ( "Aspose Manager");

        //Save your presentation to a file
        pres.save(dataDir+ "DocProps.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");
        
    }
}




