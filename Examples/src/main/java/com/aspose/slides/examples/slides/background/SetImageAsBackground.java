package com.aspose.slides.examples.slides.background;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class SetImageAsBackground
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:SetImageAsBackground
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Background();

        // Instantiate the Presentation class that represents the presentation file
        Presentation pres = new Presentation(dataDir + "SetImageAsBackground.pptx");
        try
        {

            // Set the background with Image
            pres.getSlides().get_Item(0).getBackground().setType(BackgroundType.OwnBackground);
            pres.getSlides().get_Item(0).getBackground().getFillFormat().setFillType(FillType.Picture);
            pres.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat().setPictureFillMode(PictureFillMode.Stretch);

            // Set the picture
            BufferedImage img = ImageIO.read(new File(dataDir + "Tulips.jpg"));
            // Add image to presentation's images collection
            IPPImage imgx = pres.getImages().addImage(img);

            pres.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat().getPicture().setImage(imgx);

            // Write the presentation to disk
            pres.save(dataDir + "ContentBG_Img_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SetImageAsBackground
    }
}
