package com.aspose.slides.examples.Slides.CRUD;

import com.aspose.slides.IBaseSlide;
import com.aspose.slides.IPPImage;
import com.aspose.slides.ISvgImage;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.SvgImage;
import com.aspose.slides.examples.Utils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InsertSvgIntoSlide {

    public static void main(String[] args) throws IOException {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(InsertSvgIntoSlide.class);

        //ExStart:InsertSvgIntoSlide
        // Instantiate Presentation class that represents the presentation file
        Presentation p = new Presentation();
        try {
            String svgContent = new String(Files.readAllBytes(Paths.get(dataDir)), StandardCharsets.UTF_8);
            ISvgImage svgImage = new SvgImage(svgContent);
            IPPImage emfImage = p.getImages().addImage(svgImage);

            p.getSlides().get_Item(0).getShapes().addPictureFrame(ShapeType.Rectangle, 0, 0, emfImage.getWidth(), emfImage.getHeight(), emfImage);

            p.save(dataDir + "output.pptx", SaveFormat.Pptx);
        } finally {
            if (p != null) p.dispose();
        }
        //ExEnd:InsertSvgIntoSlide
    }

}
