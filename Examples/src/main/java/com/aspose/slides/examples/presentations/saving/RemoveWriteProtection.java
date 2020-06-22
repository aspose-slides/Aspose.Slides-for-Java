package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class RemoveWriteProtection
{
    public static void main(String[] args)
    {
        //ExStart:RemoveWriteProtection
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationSaving();

        // Opening the presentation file
        Presentation presentation = new Presentation(dataDir + "RemoveWriteProtection.pptx");
        try
        {
            // Checking if presentation is write protected
            if (presentation.getProtectionManager().isWriteProtected())
                // Removing Write protection
                presentation.getProtectionManager().removeWriteProtection();

            // Saving presentation
            presentation.save(dataDir + "File_Without_WriteProtection_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:RemoveWriteProtection
    }
}
