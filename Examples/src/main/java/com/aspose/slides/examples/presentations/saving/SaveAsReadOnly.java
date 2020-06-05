package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.io.File;





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
