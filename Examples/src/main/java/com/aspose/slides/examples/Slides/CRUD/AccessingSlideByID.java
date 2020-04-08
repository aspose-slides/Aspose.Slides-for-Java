package com.aspose.slides.examples.Slides.CRUD;

import com.aspose.slides.IBaseSlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class AccessingSlideByID {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AccessingSlideByID.class);

        //ExStart:AccessingSlideByID
        // Instantiate a Presentation object that represents a presentation file
        Presentation presentation = new Presentation(dataDir + "demo.pptx");
        try {
            // Getting Slide ID
            int id = (int) presentation.getSlides().get_Item(0).getSlideId();

            // Accessing Slide by ID
            IBaseSlide slide = presentation.getSlideById(id);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AccessingSlideByID
    }

}
