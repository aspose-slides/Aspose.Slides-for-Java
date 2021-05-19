package com.aspose.slides.examples.shapes;

import com.aspose.cells.*;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.nio.file.Files;
import java.nio.file.Paths;


public class ImageAsEMF
{
    public static void main(String[] args) throws Exception
    {
        String dataDir = RunExamples.getDataDir_Shapes();
        //ExStart:ImageAsEMF
        Workbook book = new Workbook(dataDir + "chart.xlsx");
        Worksheet sheet = book.getWorksheets().get(0);
        ImageOrPrintOptions options = new ImageOrPrintOptions();
        options.setHorizontalResolution(200);
        options.setVerticalResolution(200);
        options.setImageType(ImageType.EMF);

        //Save the workbook to stream
        SheetRender sr = new SheetRender(sheet, options);
        Presentation pres = new Presentation();
        pres.getSlides().removeAt(0);

        String EmfSheetName = "";
        for (int j = 0; j < sr.getPageCount(); j++)
        {

            EmfSheetName = dataDir + "test" + sheet.getName() + " Page" + (j + 1) + ".out.emf";
            sr.toImage(j, EmfSheetName);

            byte[] bytes = Files.readAllBytes(Paths.get(EmfSheetName));
            IPPImage emfImage = pres.getImages().addImage(bytes);
            ISlide slide = pres.getSlides().addEmptySlide(pres.getLayoutSlides().getByType(SlideLayoutType.Blank));
            IShape m = slide.getShapes().addPictureFrame(ShapeType.Rectangle, 0, 0, (float) pres.getSlideSize().getSize().getWidth(), (float) pres.getSlideSize().getSize().getHeight(), emfImage);
        }

        pres.save(dataDir + "Saved.pptx", SaveFormat.Pptx);

        //ExEnd:ImageAsEMF
    }
}

