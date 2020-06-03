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


public class AddCustomDocumentProperties
{
    public static void main(String[] args)
    {
        //ExStart:AddCustomDocumentProperties
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationProperties();

        // Instantiate the Presentation class
        Presentation presentation = new Presentation();

        // Getting Document Properties
        IDocumentProperties documentProperties = presentation.getDocumentProperties();

        // Adding Custom properties
        documentProperties.set_Item("New Custom", 12);
        documentProperties.set_Item("My Name", "Mudassir");
        documentProperties.set_Item("Custom", 124);

        // Getting property name at particular index
        String getPropertyName = documentProperties.getCustomPropertyName(2);

        // Removing selected property
        documentProperties.removeCustomProperty(getPropertyName);

        // Saving presentation
        presentation.save(dataDir + "CustomDocumentProperties_out.pptx", SaveFormat.Pptx);
        //ExEnd:AddCustomDocumentProperties
    }
}

