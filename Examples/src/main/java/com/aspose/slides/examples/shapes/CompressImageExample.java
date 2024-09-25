package com.aspose.slides.examples.shapes;


import com.aspose.slides.IPictureFrame;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.io.File;
import java.io.IOException;

public class CompressImageExample
{

    public static void main(String[] args) throws IOException
    {
        // Path to source presentation
        String presentationName = RunExamples.getDataDir_Shapes() + "CroppedImage.pptx";
        // Path to output document
        String outFilePath = RunExamples.getOutPath() + "CompressImage-out.pptx";
        
        //ExStart:CompressImageExample
        Presentation pres = new Presentation(presentationName);
        try {
            ISlide slide = pres.getSlides().get_Item(0);
            // Get the PictureFrame from the slide
            IPictureFrame picFrame = (IPictureFrame) slide.getShapes().get_Item(0);
            // Compress the image with a target resolution of 150 DPI (Web resolution) and remove cropped areas
            boolean result = picFrame.getPictureFormat().compressImage(true, 150f);
            // Check the result of the compression
            if (result)
            {
                System.out.println("Image successfully compressed.");
            }
            else
            {
                System.out.println("Image compression failed or no changes were necessary.");
            }
            // Save result
            pres.save(outFilePath, SaveFormat.Pptx);

            // Check size
            System.out.println("Source presentation length = " + new File(presentationName).length());
            System.out.println("Resulting presentation length = " + new File(outFilePath).length());
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:CompressImageExample
    }
    
}
