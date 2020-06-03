package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class AccessModifyingProperties
{
    public static void main(String[] args)
    {
        //ExStart:AccessModifyingProperties
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationProperties();

        // Instanciate the Presentation class that represents the PPTX
        Presentation presentation = new Presentation(dataDir + "AccessModifyingProperties.pptx");

        // Create a reference to DocumentProperties object associated with Prsentation
        IDocumentProperties documentProperties = presentation.getDocumentProperties();

        // Access and modify custom properties
        for (int i = 0; i < documentProperties.getCountOfCustomProperties(); i++)
        {
            // Display names and values of custom properties
            System.out.println("Custom Property Name : " + documentProperties.getCustomPropertyName(i));
            System.out.println("Custom Property Value : " + documentProperties.get_Item(documentProperties.getCustomPropertyName(i)));

            // Modify values of custom properties
            documentProperties.set_Item(documentProperties.getCustomPropertyName(i), "New Value " + (i + 1));
        }

        // Save your presentation to a file
        presentation.save(dataDir + "CustomDemoModified_out.pptx", SaveFormat.Pptx);
        //ExEnd:AccessModifyingProperties
    }
}
