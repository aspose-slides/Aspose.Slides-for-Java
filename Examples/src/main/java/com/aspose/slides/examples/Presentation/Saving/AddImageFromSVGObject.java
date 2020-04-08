/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Presentation.Saving;

import com.aspose.slides.IPPImage;
import com.aspose.slides.ISvgImage;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.SvgImage;
import com.aspose.slides.examples.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author mfazi
 */
public class AddImageFromSVGObject {

    public static void main(String[] args) throws IOException {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddImageFromSVGObject.class);

        //ExStart:AddImageFromSVGObject
        // Instantiate the Presentation class that represents the presentation
        Presentation p = new Presentation();
        try {
            String svgContent = new String(Files.readAllBytes(Paths.get(dataDir + "sample.svg")));
            ISvgImage svgImage = new SvgImage(svgContent);
            IPPImage ppImage = p.getImages().addImage(svgImage);
            p.getSlides().get_Item(0).getShapes().addPictureFrame(ShapeType.Rectangle, 0, 0, ppImage.getWidth(), ppImage.getHeight(), ppImage);
            p.save(dataDir + "presentation.pptx", SaveFormat.Pptx);
        } finally {
            p.dispose();
        }
        //ExEnd:AddImageFromSVGObject
    }

}
