package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class AccessLayoutFormats
{
    public static void main(String[] args)
    {

        //ExStart:AccessLayoutFormats

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationProperties();

        Presentation pres = new Presentation(dataDir + "pres.pptx");
        try
        {
            for (ILayoutSlide layoutSlide : pres.getLayoutSlides())
            {
                IFillFormat[] fillFormats = new IFillFormat[layoutSlide.getShapes().size()];
                int i = 0;
                for (IShape shape : layoutSlide.getShapes())
                {

                    fillFormats[i] = shape.getFillFormat();

                    i++;
                }

                ILineFormat[] lineFormats = new ILineFormat[layoutSlide.getShapes().size()];
                int j = 0;
                for (IShape shape : layoutSlide.getShapes())
                {

                    lineFormats[j] = shape.getLineFormat();

                    j++;
                }
            }
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AccessLayoutFormats

    }

}

