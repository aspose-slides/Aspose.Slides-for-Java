package com.aspose.slides.examples.slides.background;

import com.aspose.slides.BackgroundType;
import com.aspose.slides.FillType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.io.File;





public class SetSlideBackgroundNormal
{
    public static void main(String[] args)
    {
        //ExStart:SetSlideBackgroundNormal
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Background();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate the Presentation class that represents the presentation file
        Presentation pres = new Presentation();
        try
        {

            // Set the background color of the first ISlide to Blue
            pres.getSlides().get_Item(0).getBackground().setType(BackgroundType.OwnBackground);
            pres.getSlides().get_Item(0).getBackground().getFillFormat().setFillType(FillType.Solid);
            pres.getSlides().get_Item(0).getBackground().getFillFormat().getSolidFillColor().setColor(Color.BLUE);
            pres.save(dataDir + "ContentBG_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SetSlideBackgroundNormal
    }
}
