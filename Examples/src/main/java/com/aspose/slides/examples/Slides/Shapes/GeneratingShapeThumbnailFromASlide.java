package com.aspose.slides.examples.Slides.Shapes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class GeneratingShapeThumbnailFromASlide {

    public static void main(String[] args) throws IOException {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GeneratingShapeThumbnailFromASlide.class);

        //ExStart:GeneratingShapeThumbnailFromASlide
        // Instantiate a Presentation class that represents the presentation file
        Presentation p = new Presentation(dataDir + "Thumbnail.pptx");
        try {
            // Create a full scale image
            BufferedImage image = p.getSlides().get_Item(0).getShapes().get_Item(0).getThumbnail();

            // Save the image to disk in PNG format
            ImageIO.write(image, "jpeg", new File(dataDir + "ContentBG_tnail.jpg"));
        } finally {
            if (p != null) p.dispose();
        }
        //ExEnd:GeneratingShapeThumbnailFromASlide
    }

}
