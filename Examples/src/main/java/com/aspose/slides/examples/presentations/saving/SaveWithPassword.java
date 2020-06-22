package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.io.File;


public class SaveWithPassword
{
    public static void main(String[] args)
    {
        //ExStart:SaveWithPassword
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationSaving();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation();

        //....do some work here.....

        // Setting Password
        pres.getProtectionManager().encrypt("pass");

        // Save your presentation to a file
        pres.save(dataDir + "SaveWithPassword_out.pptx", SaveFormat.Pptx);
        //ExEnd:SaveWithPassword
    }
}
