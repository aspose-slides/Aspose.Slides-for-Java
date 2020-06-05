package com.aspose.slides.examples.tables;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class UpdateExistingTable
{
    public static void main(String[] args)
    {
        //ExStart:UpdateExistingTable
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Tables();

        // Instantiate Presentation class that represents PPTX// Instantiate Presentation class that represents PPTX
        Presentation pres = new Presentation(dataDir + "UpdateExistingTable.pptx");
        try
        {

            // Access the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Initialize null TableEx
            ITable tbl = null;

            // Iterate through the shapes and set a reference to the table found
            for (IShape shp : sld.getShapes())
                if (shp instanceof ITable)
                    tbl = (ITable) shp;

            // Set the text of the first column of second row
            tbl.getRows().get_Item(0).get_Item(1).getTextFrame().setText("New");

            //Write the PPTX to Disk
            pres.save(dataDir + "table1_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:UpdateExistingTable
    }
}
