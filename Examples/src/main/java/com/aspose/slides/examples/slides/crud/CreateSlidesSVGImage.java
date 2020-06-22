package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CreateSlidesSVGImage
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:CreateSlidesSVGImage
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Instantiate a Presentation class that represents the presentation file

        Presentation pres = new Presentation(dataDir + "CreateSlidesSVGImage.pptx");
        try
        {

            // Access the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Create a memory stream object
            ByteArrayOutputStream svgStream = new ByteArrayOutputStream();

            // Generate SVG image of slide and save in memory stream
            sld.writeAsSvg(svgStream);

            // Save memory stream to file
            FileOutputStream fileStream = new FileOutputStream(dataDir + "Aspose_out.svg");
            try
            {
                svgStream.writeTo(fileStream);

            }
            finally
            {
                if (fileStream != null) fileStream.close();
            }
            svgStream.close();
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:CreateSlidesSVGImage
    }
}
