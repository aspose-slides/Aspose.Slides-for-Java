package com.aspose.slides.examples.featurescomparison.presentation.openandsave;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeOpenandSave
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeOpenandSave.class);

        //Instantiate a PresentationEx object that represents a PPTX file
        Presentation pres = new Presentation(dataDir + "presentation.ppt");

        //Add the title slide
        ISlide slide = pres.getSlides().addEmptySlide(pres.getLayoutSlides().get_Item(0));

        //Save the presentation
        pres.save(dataDir + "EditedPPT_Aspose_Out.ppt", SaveFormat.Ppt);

        System.out.println("Presentation Edited and Saved.");
    }
}
