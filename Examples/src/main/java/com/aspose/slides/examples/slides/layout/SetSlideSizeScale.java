package com.aspose.slides.examples.slides.layout;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class SetSlideSizeScale
{
    public static void main(String[] args)
    {

        //ExStart:SetSlideSizeScale
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Layout();

        // ExStart:SettSizeAndType
        // Instantiate a Presentation object that represents a presentation file 
        Presentation presentation = new Presentation(dataDir + "AccessSlides.pptx");
        Presentation auxPresentation = new Presentation();

        ISlide slide = presentation.getSlides().get_Item(0);

        // Set the slide size of generated presentations to that of source
        presentation.getSlideSize().setSize(540, 720, SlideSizeScaleType.EnsureFit); // Method SetSize is used for set slide size with scale content to ensure fit
        presentation.getSlideSize().setSize(SlideSizeType.A4Paper, SlideSizeScaleType.Maximize); // Method SetSize is used for set slide size with maximize size of content


        // Save Presentation to disk
        auxPresentation.save(dataDir + "Set_Size&Type_out.pptx", SaveFormat.Pptx);
        //ExEnd:SetSlideSizeScale


    }
}

