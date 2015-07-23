/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.slides.removeslides;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class UsingSlideReference
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(UsingSlideReference.class);


        //Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir+ "demo.pptx");

        //Accessing a slide using its index in the slides collection
        ISlide slide = pres.getSlides().get_Item(0);


        //Removing a slide using its reference
        pres.getSlides().remove(slide);


        //Writing the presentation file
        pres.save(dataDir+ "modified.pptx",SaveFormat.Pptx);


        System.out.println("Program executed successfully");
        
    }
}




