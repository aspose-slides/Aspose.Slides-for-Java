/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithpresentationex.managepresentationexproperties.java;

import com.aspose.slides.*;

public class ManagePresentationExProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithpresentationex/managepresentationexproperties/data/";

        //Instantiate the PresentationEx class that represents the PPTX
        PresentationEx pres = new PresentationEx(dataDir + "demo.pptx");

        //Create a reference to DocumentProperties object associated with PresentationEx
        DocumentPropertiesEx dp = pres.getDocumentProperties();


        // 1.
        //Display the builtin properties
        System.out.println("Category : " + dp.getCategory());
        System.out.println("Current Status : " + dp.getContentStatus());
        System.out.println("Creation Date : " + dp.getCreated());
        System.out.println("Author : " + dp.getCreator());
        System.out.println("Description : " + dp.getDescription());
        System.out.println("KeyWords : " + dp.getKeywords());
        System.out.println("Last Modified By : " + dp.getLastModifiedBy());
        System.out.println("Supervisor : " + dp.getManager());
        System.out.println("Modified Date : " + dp.getModified());
        System.out.println("Presentation Format : " + dp.getPresentationFormat());
        System.out.println("Last Print Date : " + dp.getPrinted());
        System.out.println("Is Shared between producers : " + dp.getSharedDoc());
        System.out.println("Subject : " + dp.getSubject());
        System.out.println("Title : " + dp.getTitle());


        // 2.
        //Set the builtin properties
        dp.setCreator("Aspose.Slides for Java");
        dp.setTitle("Modifying Presentation Properties");
        dp.setSubject("Aspose Subject");
        dp.setDescription("Aspose Description");
        dp.setManager("Aspose Manager");

        //Save your presentation to a file
        pres.write(dataDir + "updatedProperties.pptx");


        // 3.
        //Access and modify custom properties
        for (int i = 0; i < dp.getCount(); i++)
        {
            //Display names and values of custom properties
            System.out.println("Custom Property Name : " + dp.getPropertyName(i));
            System.out.println("Custom Property Value : " + dp.get_Item(dp.getPropertyName(i)));

            //Modify values of custom properties
            dp.set_Item(dp.getPropertyName(i), "New Value " + (i+1));
        }

        //Save your presentation to a file
        pres.write(dataDir + "updatedCustomProperties.pptx");

        // Status
        System.out.println("Documents with updated properties have been created successfully!");
    }
}




