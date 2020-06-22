package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.io.File;





public class SaveToFile
{
    public static void main(String[] args)
    {
        //ExStart:SaveToFile
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationSaving();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate a Presentation object that represents a PPT file
        Presentation presentation = new Presentation();
        try
        {
            //...do some work here...

            // Save your presentation to a file
            presentation.save(dataDir + "Saved_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SaveToFile
    }
}
