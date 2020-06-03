package com.aspose.slides.examples.vba;

import com.aspose.slides.IVbaModule;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class ExtractingVBAMacros
{
    public static void main(String[] args)
    {
        //ExStart:ExtractingVBAMacros

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_VBA();

        Presentation pres = new Presentation(dataDir + "VBA.pptm");
        try
        {
            if (pres.getVbaProject() != null) // check if Presentation contains VBA Project
            {
                for (IVbaModule module : pres.getVbaProject().getModules())
                {
                    System.out.println(module.getName());
                    System.out.println(module.getSourceCode());
                }
            }
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:ExtractingVBAMacros

    }
}

