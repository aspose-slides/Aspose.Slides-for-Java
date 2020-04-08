/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.cells.ImageFormat;
import com.aspose.cells.SheetRender;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.slides.examples.Utils;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ImageAsEMF {

    public static void main(String[] args) throws Exception {

        String dataDir = Utils.getDataDir(ImageAsEMF.class);

        //ExStart:ImageAsEMF
        Workbook book = new Workbook(dataDir + "chart.xlsx");
        Worksheet sheet = book.getWorksheets().get(0); //or get_Item()
        com.aspose.cells.ImageOrPrintOptions options = new com.aspose.cells.ImageOrPrintOptions();
        options.setHorizontalResolution(200);
        options.setVerticalResolution(200);
        options.setImageFormat(ImageFormat.getEmf());// <- check this
        //Save the workbook to stream
        SheetRender sr = new SheetRender(sheet, options);

        // Instantiate a Presentation class that represents the presentation file
        Presentation pres = new Presentation();
        try {
            pres.getSlides().removeAt(0);

            String EmfSheetName = "";
            for (int j = 0; j < sr.getPageCount(); j++) {
                EmfSheetName = dataDir + "test" + sheet.getName() + " Page" + (j + 1) + ".out.emf";
                sr.toImage(j, EmfSheetName);

                Path path = Paths.get(EmfSheetName);
                byte[] bytes = Files.readAllBytes(path);
                com.aspose.slides.IPPImage emfImage = pres.getImages().addImage(bytes);
                ISlide slide = pres.getSlides().addEmptySlide(pres.getLayoutSlides().getByType(com.aspose.slides.SlideLayoutType.Blank));
                IShape m = slide.getShapes().addPictureFrame(ShapeType.Rectangle, 0, 0,
                        (float) pres.getSlideSize().getSize().getWidth(), (float) pres.getSlideSize().getSize().getHeight(), emfImage);
            }
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ImageAsEMF
    }

}