package com.aspose.slides.examples.slides;

import com.aspose.slides.ISection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class ISectionCollection
{
    public static void main(String[] args)
    {
        //ExStart:ISectionCollection
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        Presentation pres = new Presentation(dataDir + "Presentation1.pptx");
        ISection section = pres.getSections().get_Item(2);
        pres.getSections().reorderSectionWithSlides(section, 0);
        pres.getSections().removeSectionWithSlides(pres.getSections().get_Item(0));
        pres.getSections().appendEmptySection("Last empty section");
        pres.getSections().addSection("First empty", pres.getSlides().get_Item(0));
        pres.getSections().get_Item(0).setName("New section name");
        pres.save(dataDir + "resultsection1.pptx", SaveFormat.Pptx);
    }

    //ExEnd:ISectionCollection
}

