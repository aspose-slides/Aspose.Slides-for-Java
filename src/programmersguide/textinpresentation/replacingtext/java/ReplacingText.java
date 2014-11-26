/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.textinpresentation.replacingtext.java;

import com.aspose.slides.*;

public class ReplacingText
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/textinpresentation/replacingtext/data/";

        //Instantiate Presentation class that represents PPTX
        Presentation pres = new Presentation(dataDir+ "welcome.pptx");

        //Access first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Iterate through shapes to find the placeholder
        for (IShape shp : sld.getShapes())
            if (shp.getPlaceholder() != null)
            {
                //Change the text of each placeholder
                ((IAutoShape)shp).getTextFrame().setText("This is Placeholder");
            }

        //Save the PPTX to Disk
        pres.save(dataDir+ "welcome_PH.pptx", SaveFormat.Pptx);
    }
}




