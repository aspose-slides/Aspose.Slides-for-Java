package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.io.File;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class SaveAsReadOnly
{
    public static void main(String[] args)
    {
        //ExStart:SaveAsReadOnly
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationSaving();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate a Presentation object that represents a PPT file
        Presentation presentation = new Presentation();

        //....do some work here.....

        // Setting Write protection Password
        presentation.getProtectionManager().setWriteProtection("test");

        // Save your presentation to a file
        presentation.save(dataDir + "WriteProtected_out.pptx", SaveFormat.Pptx);
        //ExEnd:SaveAsReadOnly
    }
}
