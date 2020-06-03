package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

/*
The example shows of using read-only recommendation for presentation (this feature was introduced in PowerPoint 2019).
When enabled it makes PowerPoint to open the presentation in read-only mode first.
*/


public class ReadOnlyRecommended
{
    public static void main(String[] args)
    {
        String outPptxPath = RunExamples.OutPath + "ReadOnlyRecommended.pptx";

        Presentation pres = new Presentation();
        try
        {
            pres.getProtectionManager().setReadOnlyRecommended(true);
            pres.save(outPptxPath, SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
}

