/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithtablesex.accessinganexistingtableinslideex.java;

import com.aspose.slides.*;

public class AccessingAnExistingTableInSlideEx
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithtablesex/accessinganexistingtableinslideex/data/";

        //Instantiate PresentationEx class that represents PPTX
        PresentationEx pres = new PresentationEx(dataDir + "table.pptx");

        //Access the first slide
        SlideEx sld = pres.getSlides().get_Item(0);

        //Initialize null TableEx
        TableEx tbl = null;
        ShapeEx shp= null;

        //Iterate through the shapes and set a reference to the table found
        for (int i=0;i<sld.getShapes().getCount();i++)
        {
            shp = sld.getShapes().get_Item(i);
            if (shp instanceof TableEx)
                tbl = (TableEx)shp;
        }
        //Set the text of the first column of second row
        tbl.get_Item(0, 1).getTextFrame().setText("New");

        //Write the PPTX to Disk
        pres.write(dataDir + "table_updated.pptx");

        // Status
        System.out.println("Table updated successfully.");
    }
}




