package com.aspose.slides.examples.slides;

import com.aspose.slides.ISection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


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

