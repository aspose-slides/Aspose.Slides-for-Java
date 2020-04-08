package com.aspose.slides.examples.Presentation.Creation;

import com.aspose.slides.IPresentation;
import com.aspose.slides.ISection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;


public class CloneSlideIntoSpecifiedSection {

    public static final void main(String[] args) {

        String dataDir = Utils.getDataDir(CloneSlideIntoSpecifiedSection.class);

        //ExStart:CloneSlideIntoSpecifiedSection
        // Instantiate a Presentation object that represents a presentation file
        IPresentation presentation = new Presentation();
        try {
            presentation.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 200, 50, 300, 100);
            presentation.getSections().addSection("Section 1", presentation.getSlides().get_Item(0));

            ISection section2 = presentation.getSections().appendEmptySection("Section 2");
            presentation.getSlides().addClone(presentation.getSlides().get_Item(0), section2);

            presentation.save(dataDir + "CloneSlideIntoSpecifiedSection.pptx", SaveFormat.Pptx);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:CloneSlideIntoSpecifiedSection
    }
}
