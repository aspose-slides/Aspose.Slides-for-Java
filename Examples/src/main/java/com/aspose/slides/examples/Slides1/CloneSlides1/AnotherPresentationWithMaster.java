/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Slides1.CloneSlides1;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class AnotherPresentationWithMaster
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AnotherPresentationWithMaster.class);

        //Instantiate Presentation class to load the source Presentation1 file

        Presentation srcPres = new Presentation(dataDir+ "demo.pptx");

//Instantiate Presentation class for destination Presentation1 (where slide is to be cloned)

        Presentation destPres = new Presentation();

//Instantiate ISlide from the collection of Slides1 in source Presentation1 along with
//master slide
        ISlide  SourceSlide= srcPres.getSlides().get_Item(0);


        //Clone the desired master slide from the source Presentation1 to the collection of masters in the
             //destination Presentation1
        IMasterSlideCollection masters=destPres.getMasters();
        IMasterSlide SourceMaster = SourceSlide.getLayoutSlide().getMasterSlide();

        //Clone the desired master slide from the source Presentation1 to the collection of masters in the
        //destination Presentation1
        IMasterSlide iSlide = masters.addClone(SourceMaster);

        //Clone the desired slide from the source Presentation1 with the desired master to the end of the
        //collection of Slides1 in the destination Presentation1
        ISlideCollection slds = destPres.getSlides();
        slds.addClone(SourceSlide,iSlide);

        //Clone the desired master slide from the source Presentation1 to the collection of masters in the//destination Presentation1
        //Save the destination Presentation1 to disk
        destPres.save(dataDir+ "helloworld_dest3.pptx",SaveFormat.Pptx);
        System.out.println("Program executed successfully");
    }
}




