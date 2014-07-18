/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtables.existingtable.java;

import com.aspose.slides.*;

public class ExistingTable
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtables/existingtable/data/";

        //Instantiate Presentation class that represents PPTX
        Presentation pres = new Presentation(dataDir+ "demotable.pptx");

        //Access the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Initialize null TableEx
        ITable tbl = null;

        //Iterate through the shapes and set a reference to the table found
        for (IShape shp  : sld.getShapes())
            if (shp instanceof  ITable)
                tbl = (ITable)shp;

        //Set the text of the first column of second row
        tbl.getRows().get_Item(0).get_Item(1).getTextFrame().setText("New");

        //Save the PPTX to Disk
        pres.save(dataDir+ "table1.pptx", SaveFormat.Pptx);
        System.out.println("Program executed successfully");
    }
}




