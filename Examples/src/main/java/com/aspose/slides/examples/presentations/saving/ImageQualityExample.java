package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.IImage;
import com.aspose.slides.ImageFormat;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.ByteArrayOutputStream;

public class ImageQualityExample
{
    public static void main(String[] args)
    {
        //Path for source presentation
        String pptxFile = RunExamples.getDataDir_PresentationSaving() + "ImageQuality.pptx";
        //Out path
        String imagePath = RunExamples.getOutPath() + "ImageQuality-out.jpg";

        //ExStart:ImageQualityExample
        Presentation presentation = new Presentation(pptxFile);
        try {
            IImage image = presentation.getImages().get_Item(0).getImage();

            // Saves the first image to the memory stream in JPEG format with quality 80.
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            image.save(baos, ImageFormat.Jpeg, 100);

            // Saves the first image to the file in JPEG format with high quality.
            image.save(imagePath, ImageFormat.Jpeg, 100);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ImageQualityExample
    }
}
