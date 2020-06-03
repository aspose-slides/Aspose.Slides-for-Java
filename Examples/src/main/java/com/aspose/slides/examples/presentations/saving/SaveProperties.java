package com.aspose.slides.examples.presentations.saving;

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


public class SaveProperties
{
    public static void main(String[] args)
    {
        //ExStart:SaveProperties
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationSaving();

        // Instantiate a Presentation object that represents a PPT file
        Presentation presentation = new Presentation();

        //....do some work here.....

        // Setting access to document properties in password protected mode
        presentation.getProtectionManager().setEncryptDocumentProperties(false);

        // Setting Password
        presentation.getProtectionManager().encrypt("pass");

        // Save your presentation to a file
        presentation.save(dataDir + "Password Protected Presentation_out.pptx", SaveFormat.Pptx);
        //ExEnd:SaveProperties
    }
}
