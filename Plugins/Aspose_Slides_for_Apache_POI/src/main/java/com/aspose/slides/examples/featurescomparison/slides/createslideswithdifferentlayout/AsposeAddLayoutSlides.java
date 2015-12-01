package com.aspose.slides.examples.featurescomparison.slides.createslideswithdifferentlayout;

import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeAddLayoutSlides
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeAddLayoutSlides.class);

        //Instantiate Presentation class that represents the presentation file
        Presentation pres = new Presentation();

        //Instantiate SlideCollection class
        ISlideCollection slds = pres.getSlides();

        for (int i = 0; i < pres.getLayoutSlides().size(); i++)
        {
            //Add an empty slide to the Slides collection
            slds.addEmptySlide(pres.getLayoutSlides().get_Item(i));

        }
        //Do some work on the newly added slide

	//Save the PPTX file to the Disk
        pres.save(dataDir + "LayoutSlides_Aspose_Out.pptx", SaveFormat.Pptx);

        //Printing the status
        System.out.println("Slides added successfully!");
    }
}
