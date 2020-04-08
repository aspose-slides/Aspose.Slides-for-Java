package com.aspose.slides.examples.Slides.Rendering;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class GeneratingThumbnailFromSlideInNotesSlidesView {

    public static void main(String[] args) throws IOException {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GeneratingThumbnailFromSlideInNotesSlidesView.class);

        //ExStart:GeneratingThumbnailFromSlideInNotesSlidesView
        // Instantiate a Presentation class that represents the presentation file
        Presentation pres = new Presentation(dataDir + "ThumbnailFromSlideInNotes.pptx");
        try {
            // Access the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // User defined dimension
            int desiredX = 1200;
            int desiredY = 800;

            // Getting scaled value of X and Y
            float ScaleX = (float) (1.0 / pres.getSlideSize().getSize().getWidth()) * desiredX;
            float ScaleY = (float) (1.0 / pres.getSlideSize().getSize().getHeight()) * desiredY;

            // Create a full scale image
            BufferedImage image = sld.getThumbnail(ScaleY, ScaleY);

            // Save the image to disk in JPEG format
            ImageIO.write(image, "jpeg", new File(dataDir + "ContentBG_tnail.jpg"));
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GeneratingThumbnailFromSlideInNotesSlidesView

    }
}
