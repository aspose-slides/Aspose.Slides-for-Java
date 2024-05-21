package com.aspose.slides.examples.tables;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

public class TableTransparency
{
    public static void main(String[] args)
    {

        // The path to the presentation
        String presentationFilePat = RunExamples.getDataDir_Tables() + "TableTransparency.pptx";

        // The path to output file
        String outFilePath = RunExamples.getOutPath() + "TableTransparency_out.pptx";

        //ExStart:TableTransparency
        // Create a new presentation
        Presentation pres = new Presentation(presentationFilePat);
        try {
            // Get a table
            ITable table = (ITable)pres.getSlides().get_Item(0).getShapes().get_Item(1);

            //Set transparency of the table to 62%
            table.getTableFormat().setTransparency(0.62f);

            // Save presentation
            pres.save(outFilePath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:TableTransparency
    }
}
