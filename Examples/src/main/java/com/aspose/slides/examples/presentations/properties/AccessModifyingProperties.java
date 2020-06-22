package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


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
