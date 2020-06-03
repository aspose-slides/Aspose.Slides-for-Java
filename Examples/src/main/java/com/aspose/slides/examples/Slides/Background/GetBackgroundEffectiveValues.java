package com.aspose.slides.examples.slides.background;

import com.aspose.slides.FillType;
import com.aspose.slides.IBackgroundEffectiveData;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


public class GetBackgroundEffectiveValues
{

    public static void main(String[] args)
    {
        //ExStart:GetBackgroundEffectiveValues
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Background();

        // Instantiate the Presentation class that represents the presentation file
        Presentation pres = new Presentation(dataDir + "SamplePresentation.pptx");

        IBackgroundEffectiveData effBackground = pres.getSlides().get_Item(0).getBackground().getEffective();

        if (effBackground.getFillFormat().getFillType() == FillType.Solid)
            System.out.println("Fill color: " + effBackground.getFillFormat().getSolidFillColor());
        else
            System.out.println("Fill type: " + effBackground.getFillFormat().getFillType());

        //ExEnd:GetBackgroundEffectiveValues
    }

}

