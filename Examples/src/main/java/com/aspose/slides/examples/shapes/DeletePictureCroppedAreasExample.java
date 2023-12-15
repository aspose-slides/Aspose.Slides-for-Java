package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.File;

public class DeletePictureCroppedAreasExample
{
    public static void main(String[] args)
    {
        // Path to source presentation
        String presentationName = RunExamples.getDataDir_Shapes() + "CroppedImage.pptx";
        // Path to output document
        String outFilePath = RunExamples.getOutPath() + "CroppedImage-out.pptx";

        //ExStart:DeletePictureCroppedAreasExample
        Presentation pres = new Presentation(presentationName);
        try {
            // Gets the first slide
            ISlide slide = pres.getSlides().get_Item(0);

            // Gets the PictureFrame
            IPictureFrame picFrame = (IPictureFrame)slide.getShapes().get_Item(0);

            // Deletes cropped areas of the PictureFrame image
            IPPImage croppedImage = picFrame.getPictureFormat().deletePictureCroppedAreas();

            // Save result
            pres.save(outFilePath, SaveFormat.Pptx);

            // Check size
            System.out.println(String.format("Source presentation length\t = %d", new File(presentationName).length()));
            System.out.println(String.format("Resulting presentation length\t = %d", new File(outFilePath).length()));
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:DeletePictureCroppedAreasExample
    }
}
