package com.aspose.slides.examples.Slides.Table;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITable;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AccessAnExistingTableInSlide {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AccessAnExistingTableInSlide.class);

        //ExStart:AccessAnExistingTableInSlide
        // Instantiate Presentation class that represents PPTX
        Presentation pres = new Presentation(dataDir + "table.pptx");
        try {
            // Access the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Initialize null Table
            ITable tbl = null;

            // Iterate through the shapes and set a reference to the table found
            for (IShape shp : sld.getShapes()) {
                if (shp instanceof ITable) {
                    tbl = (ITable) shp;
                }
            }

            // Set the text of the first column of second row
            tbl.getRows().get_Item(0).get_Item(1).getTextFrame().setText("New");

            // Save the PPTX to Disk
            pres.save(dataDir + "table1.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AccessAnExistingTableInSlide
    }

}
