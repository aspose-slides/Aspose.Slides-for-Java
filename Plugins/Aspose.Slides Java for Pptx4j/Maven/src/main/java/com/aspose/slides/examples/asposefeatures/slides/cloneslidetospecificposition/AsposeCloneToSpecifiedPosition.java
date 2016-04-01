package com.aspose.slides.examples.asposefeatures.slides.cloneslidetospecificposition;

import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeCloneToSpecifiedPosition
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeCloneToSpecifiedPosition.class);

        //Instantiate Presentation class that represents a presentation file
        Presentation pres = new Presentation(dataDir + "presentation.pptx");

        //Clone the desired slide to the end of the collection of slides in the same presentation
        ISlideCollection slds = pres.getSlides();

        //Clone the desired slide to the specified index in the same presentation
        slds.insertClone(2, pres.getSlides().get_Item(1));

        //Write the modified presentation to disk
        pres.save(dataDir + "AsposeCloneToPosition_Out.pptx", SaveFormat.Pptx);

        System.out.println("Process Completed Successfully.");
    }
}
