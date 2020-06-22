package com.aspose.slides.examples.slides.background;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class SetBackgroundToGradient
{
    public static void main(String[] args)
    {
        //ExStart:SetBackgroundToGradient
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Background();

        // Instantiate the Presentation class that represents the presentation file
        Presentation pres = new Presentation(dataDir + "SetBackgroundToGradient.pptx");
        try
        {

            // Apply Gradiant effect to the Background
            pres.getSlides().get_Item(0).getBackground().setType(BackgroundType.OwnBackground);
            pres.getSlides().get_Item(0).getBackground().getFillFormat().setFillType(FillType.Gradient);
            pres.getSlides().get_Item(0).getBackground().getFillFormat().getGradientFormat().setTileFlip(TileFlip.FlipBoth);

            //Write the presentation to disk
            pres.save(dataDir + "ContentBG_Grad_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SetBackgroundToGradient
    }
}
