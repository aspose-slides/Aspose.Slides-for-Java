package com.aspose.slides.examples.Slides.CRUD;

import com.aspose.slides.ISection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ISectionCollection {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ISectionCollection.class);

        //ExStart:ISectionCollection
        // Instantiate Presentation class that represents the presentation file
        Presentation pres = new Presentation(dataDir + "Presentation1.pptx");
        try {
            pres.getSections().removeSectionWithSlides(pres.getSections().get_Item(0));
            pres.getSections().appendEmptySection("Last empty section");
            pres.getSections().addSection("First empty", pres.getSlides().get_Item(0));

            pres.save(dataDir + "Result.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ISectionCollection
    }
}
            