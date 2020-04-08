package com.aspose.slides.examples.Slides.Table;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITable;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class EnableDisableFirstRowAsHeader {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(EnableDisableFirstRowAsHeader.class);

        //ExStart:EnableDisableFirstRowAsHeader
        // Instantiate Presentation class that represents PPTX
        Presentation pres = new Presentation(dataDir + "table.pptx");
        try {
            // Access the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Initialize null TableEx
            ITable tbl = null;

            // Iterate through the shapes and set a reference to the table found
            for (IShape shp : sld.getShapes()) {
                if (shp instanceof ITable) {
                    tbl = (ITable) shp;
                }
            }

            //Check if the first row of a table is with header formatting
            tbl.getFirstRow();

            //Set the first row of a table as header with a special formatting.
            tbl.setFirstRow(true);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:EnableDisableFirstRowAsHeader
    }

}
