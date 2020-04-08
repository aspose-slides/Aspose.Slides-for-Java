/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Presentation.Saving;

import com.aspose.slides.IGroupShape;
import com.aspose.slides.ISvgImage;
import com.aspose.slides.PictureFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

/**
 * @author mfazi
 */
public class ConvertSvgImageObjectIntoGroupOfShapes {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConvertSvgImageObjectIntoGroupOfShapes.class);

        //ExStart:ConvertSvgImageObjectIntoGroupOfShapes
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation(dataDir + "image.pptx");
        try {
            PictureFrame pFrame = (PictureFrame) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            ISvgImage svgImage = pFrame.getPictureFormat().getPicture().getImage().getSvgImage();
            if (svgImage != null) {
                // Convert svg image into group of shapes
                IGroupShape groupShape = pres.getSlides().get_Item(0).getShapes().
                        addGroupShape(svgImage, pFrame.getFrame().getX(), pFrame.getFrame().getY(),
                                pFrame.getFrame().getWidth(), pFrame.getFrame().getHeight());
                // remove source svg image from presentation
                pres.getSlides().get_Item(0).getShapes().remove(pFrame);
            }
            pres.save(dataDir + "image_group.pptx", SaveFormat.Pptx);
        } finally {
            pres.dispose();
        }
        //ExEnd:ConvertSvgImageObjectIntoGroupOfShapes
    }
}
