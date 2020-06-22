package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.RunExamples;


public class CreateNewPresentation
{
    public static void main(String[] args)
    {
        //ExStart:CreateNewPresentation
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Conversion();

        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation();
        try
        {
            // Get the first slide
            ISlide slide = presentation.getSlides().get_Item(0);

            // Add an autoshape of type line
            slide.getShapes().addAutoShape(ShapeType.Line, 50, 150, 300, 0);
            presentation.save(dataDir + "NewPresentation_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:CreateNewPresentation
    }
}


 