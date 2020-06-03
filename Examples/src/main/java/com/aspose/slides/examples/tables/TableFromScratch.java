package com.aspose.slides.examples.tables;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class TableFromScratch
{
    public static void main(String[] args)
    {
        //ExStart:TableFromScratch
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Tables();

        // Instantiate Presentation class that represents PPTX// Instantiate Presentation class that represents PPTX
        Presentation presentation = new Presentation(dataDir + "UpdateExistingTable.pptx");
        try
        {
            // Access the first slide
            ISlide sld = presentation.getSlides().get_Item(0);

            // Initialize null TableEx
            ITable table = null;

            // Iterate through the shapes and set a reference to the table found
            for (IShape shape : sld.getShapes())
                if (shape instanceof ITable)
                    table = (ITable) shape;

            // Set the text of the first column of second row
            table.getRows().get_Item(0).get_Item(1).getTextFrame().setText("New");

            // Write the PPTX to Disk
            presentation.save(dataDir + "UpdateTable_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:TableFromScratch
    }
}
