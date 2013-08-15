/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithtextinpresentationex.creatingtextboxonslideex.java;

import com.aspose.slides.*;

public class CreatingTextBoxOnSlideEx
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithtextinpresentationex/creatingtextboxonslideex/data/";

        //Instantiate PresentationEx
        PresentationEx pres = new PresentationEx();

        //Get the first slide
        SlideEx sld = pres.getSlides().get_Item(0);

        //Add an AutoShape of Rectangle type
        int idx = sld.getShapes().addAutoShape(ShapeTypeEx.Rectangle, 150, 75,150 , 50);
        AutoShapeEx ashp = (AutoShapeEx)sld.getShapes().get_Item(idx);

        //Add TextFrame to the Rectangle
        ashp.addTextFrame("Aspose TextBox");

        //Write the presentation to disk
        pres.write(dataDir + "output.pptx");

        // Status
        System.out.println("Process completed successfully.");
    }
}




