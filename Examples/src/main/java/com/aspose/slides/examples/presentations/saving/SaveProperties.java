package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





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
