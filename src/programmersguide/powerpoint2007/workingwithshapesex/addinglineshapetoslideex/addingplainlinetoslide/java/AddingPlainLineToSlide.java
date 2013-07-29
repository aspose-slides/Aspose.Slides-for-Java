/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithshapesex.addinglineshapetoslideex.addingplainlinetoslide.java;

import com.aspose.slides.*;

public class AddingPlainLineToSlide
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithshapesex/addinglineshapetoslideex/addingplainlinetoslide/data/";

        //Instantiate PresentationEx class that represents the PPTX file
        PresentationEx pres = new PresentationEx();

        //Get the first slide
        SlideEx sld = pres.getSlides().get_Item(0);

        //Add an autoshape of type line
        int idx = sld.getShapes().addAutoShape(ShapeTypeEx.Line, 50, 150, 300, 0);

        //Write the PPTX to Disk
        pres.write(dataDir + "LineShape1.pptx");

        //Printing the status
        System.out.println("Line Shape added successfully!");
    }
}




