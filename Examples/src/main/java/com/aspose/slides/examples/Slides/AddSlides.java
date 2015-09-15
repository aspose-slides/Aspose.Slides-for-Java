/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Slides;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class AddSlides
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddSlides.class);

        //Instantiate Presentation class that represents the Presentation1 file
        Presentation pres = new Presentation();

        //Instantiate SlideCollection class
        ISlideCollection slds = pres.getSlides();

        for (int i = 0; i < pres.getLayoutSlides().size(); i++)
        {
            //Add an empty slide to the Slides collection
            slds.addEmptySlide(pres.getLayoutSlides().get_Item(i));

        }
        //Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add an autoshape of type line
        sld.getShapes().addAutoShape(ShapeType.Line, 50, 150, 300, 0);

        //Save the PPTX file to the Disk
        pres.save(dataDir+ "EmptySlide.pptx", SaveFormat.Pptx);


        System.out.println("Program executed successfully");
        
    }
}




