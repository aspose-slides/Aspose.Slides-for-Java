/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Text;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class ReplacingText
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReplacingText.class);

        //Instantiate Presentation class that represents PPTX
        Presentation pres = new Presentation(dataDir+ "welcome.pptx");

        //Access first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Iterate through Shapes1 to find the placeholder
        for (IShape shp : sld.getShapes())
            if (shp.getPlaceholder() != null)
            {
                //Change the Text1 of each placeholder
                ((IAutoShape)shp).getTextFrame().setText("This is Placeholder");
            }

        //Save the PPTX to Disk
        pres.save(dataDir+ "welcome_PH.pptx", SaveFormat.Pptx);
    }
}




