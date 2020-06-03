package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;





public class FodpFormatConvertion
{
    public static void main(String[] args)
    {
        String dataDir = RunExamples.getDataDir_Conversion();
        String outFodpPath = RunExamples.OutPath + "FodpFormatConvertion.fodp";
        String outPptxPath = RunExamples.OutPath + "FodpFormatConvertion.pptx";

        Presentation presentation = new Presentation(dataDir + "Example.fodp");
        try
        {
            presentation.save(outPptxPath, SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }

        Presentation pres = new Presentation(outPptxPath);
        try
        {
            pres.save(outFodpPath, SaveFormat.Fodp);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
}

