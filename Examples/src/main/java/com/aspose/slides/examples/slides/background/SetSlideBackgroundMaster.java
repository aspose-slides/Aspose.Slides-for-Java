package com.aspose.slides.examples.slides.background;

import com.aspose.slides.BackgroundType;
import com.aspose.slides.FillType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.io.File;


public class SetSlideBackgroundMaster
{
    public static void main(String[] args)
    {
        //ExStart:SetSlideBackgroundMaster
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

            // Set the background color of the Master ISlide to Forest Green
            pres.getMasters().get_Item(0).getBackground().setType(BackgroundType.OwnBackground);
            pres.getMasters().get_Item(0).getBackground().getFillFormat().setFillType(FillType.Solid);
            pres.getMasters().get_Item(0).getBackground().getFillFormat().getSolidFillColor().setColor(Color.GREEN);

            // Write the presentation to disk
            pres.save(dataDir + "SetSlideBackgroundMaster_out.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SetSlideBackgroundMaster
    }
}
