/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithpresentation.managingpresentationproperties.java;

import com.aspose.slides.*;

public class ManagingPresentationProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithpresentation/managingpresentationproperties/data/";

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Create a reference to DocumentProperties associated with Presentation
        DocumentProperties dp = pres.getDocumentProperties();

        //Accessing the built-in properties of the presentation
        System.out.println("Author: " + dp.getAuthor());
        System.out.println("Title: " + dp. getTitle());
        System.out.println("Company: " + dp. getCompany());
        System.out.println("Comments: " + dp. getComments());
        System.out.println("Subject: " + dp. getSubject());

        System.out.println("");
        System.out.println("Modifying presentation properties now ");
        System.out.println("");

        //Modifying the built-in properties of the presentation
        dp.setAuthor("Mudassir Fayyaz");
        dp.setTitle("Modifying Presentation Properties");
        dp.setCompany("Aspose Pty. Ltd." );
        dp.setComments("Modified Presentation Properties");
        dp.setSubject("Presentation Properties");

        //Save your presentation to a file
        pres.write(dataDir + "modified.ppt");

        //Access and modify custom properties
        for (int i = 0; i < dp.getCount(); i++)
        {
            //Display names and values of custom properties
            System.out.println("Custom Property Name : " + dp.getPropertyName(i));
            System.out.println("Custom Property Value : " + dp.get_Item(dp.getPropertyName(i)));

            //Modify values of custom properties
            dp.set_Item(dp.getPropertyName(i), "New Value " + Integer.toString(i+1));
        }

        //Save your presentation to a file
        pres.write(dataDir + "DemoProps.ppt");

        System.out.println("");
        System.out.println("Presentations with modified properties are saved successfully!");
    }
}




