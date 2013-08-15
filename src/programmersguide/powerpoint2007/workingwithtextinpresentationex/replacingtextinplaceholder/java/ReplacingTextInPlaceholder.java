/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithtextinpresentationex.replacingtextinplaceholder.java;

import com.aspose.slides.*;

public class ReplacingTextInPlaceholder
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithtextinpresentationex/replacingtextinplaceholder/data/";

        //Instantiate PresentationEx class that represents PPTX
        PresentationEx pres = new PresentationEx(dataDir + "demo.pptx");

        //Access first slide
        SlideEx sld = pres.getSlides().get_Item(0);

        ShapeEx shp= null;

        //Iterate through the shapes and set a reference to the table found
        for (int i=0;i<sld.getShapes().getCount();i++)
        {
            shp = sld.getShapes().get_Item(i);
            if (shp.getPlaceholder()!=null)
            {
                //Change the text of each placeholder
                ((AutoShapeEx)shp).getTextFrame().setText("This is Placeholder");
            }
        }

        //Write the PPTX to Disk
        pres.write(dataDir + "output.pptx");

        // Status
        System.out.println("Process completed successfully.");
    }
}




