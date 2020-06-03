package com.aspose.slides.examples.slides.layout;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SlideSizeScaleType;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class SetSizeAndType
{
    public static void main(String[] args)
    {
        //ExStart:SetSizeAndType
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Layout();

        // Instantiate a Presentation object that represents a presentation file 
        Presentation presentation = new Presentation(dataDir + "AccessSlides.pptx");
        Presentation auxPresentation = new Presentation();

        ISlide slide = presentation.getSlides().get_Item(0);

        // Set the slide size of generated presentations to that of source
        auxPresentation.getSlideSize().setSize(presentation.getSlideSize().getType(), SlideSizeScaleType.EnsureFit);

        auxPresentation.getSlides().insertClone(0, slide);
        auxPresentation.getSlides().removeAt(0);
        // Save Presentation to disk
        auxPresentation.save(dataDir + "Set_Size&Type_out.pptx", SaveFormat.Pptx);
        //ExEnd:SetSizeAndType
    }
}
