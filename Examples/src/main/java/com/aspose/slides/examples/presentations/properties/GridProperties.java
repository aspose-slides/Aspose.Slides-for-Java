package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

/*
The following example shows how to set the grid spacing to 72 points (1 inch) and save the PowerPoint presentation.
*/

public class GridProperties
{
    public static void main(String[] args)
    {
        String outFilePath = RunExamples.getOutPath() + "GridProperties-out.pptx";

        //ExStart:GridProperties
        Presentation pres = new Presentation();
        try {
            // Set grid spacing
            pres.getViewProperties().setGridSpacing(72f);
            // Save presentation
            pres.save(outFilePath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GridProperties
    }
}
