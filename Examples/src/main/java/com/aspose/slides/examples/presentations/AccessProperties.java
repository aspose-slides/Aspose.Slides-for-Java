package com.aspose.slides.examples.presentations;

import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.LoadOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class AccessProperties
{
    public static void main(String[] args)
    {
        //ExStart:AccessProperties
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationProperties();

        // Accessing the Document Properties of a Password Protected Presentation without Password
        // creating instance of load options to set the presentation access password
        LoadOptions loadOptions = new LoadOptions();

        // Setting the access password to null
        loadOptions.setPassword(null);

        // Setting the access to document properties
        loadOptions.setOnlyLoadDocumentProperties(true);

        // Opening the presentation file by passing the file path and load options to the constructor of Presentation class
        Presentation pres = new Presentation(dataDir + "AccessProperties.pptx", loadOptions);

        // Getting Document Properties
        IDocumentProperties docProps = pres.getDocumentProperties();

        System.out.println("Name of Application : " + docProps.getNameOfApplication());
        //ExEnd:AccessProperties
    }
}
