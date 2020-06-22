package com.aspose.slides.examples.vba;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class RemoveVBAMacros
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_VBA();

        //ExStart:RemoveVBAMacros
        // Instantiate Presentation
        Presentation presentation = new Presentation(dataDir + "VBA.pptm");
        try
        {
            // Access the Vba module and remove 
            presentation.getVbaProject().getModules().remove(presentation.getVbaProject().getModules().get_Item(0));

            // Save Presentation
            presentation.save(dataDir + "RemovedVBAMacros_out.pptm", SaveFormat.Pptm);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:RemoveVBAMacros
    }
}
