package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


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


 