package com.aspose.slides.examples.slides.layout;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class ManageHeaderFooterText
{
    public static void main(String[] args)
    {

        //ExStart:ManageHeaderFooterText

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Layout();

        // Load Presentation
        Presentation pres = new Presentation(dataDir + "headerTest.pptx");

        // Setting Footer
        pres.getHeaderFooterManager().setAllFootersText("My Footer text");
        pres.getHeaderFooterManager().setAllFootersVisibility(true);

        // Access and Update Header
        IMasterNotesSlide masterNotesSlide = pres.getMasterNotesSlideManager().getMasterNotesSlide();
        if (null != masterNotesSlide)
        {
            updateHeaderFooterText(masterNotesSlide);
        }

        // Save presentation
        pres.save(dataDir + "HeaderFooterJava.pptx", SaveFormat.Pptx);

        //ExEnd:ManageHeaderFooterText

    }

    //ExStart:UpdateHeaderFooterText
    // Method to set Header/Footer Text
    public static void updateHeaderFooterText(IBaseSlide master)
    {
        for (IShape shape : master.getShapes())
        {
            if (shape.getPlaceholder() != null)
            {
                if (shape.getPlaceholder().getType() == PlaceholderType.Header)
                {
                    ((IAutoShape) shape).getTextFrame().setText("HI there new header");
                }
            }
        }
    }
    //ExEnd:UpdateHeaderFooterText
}

