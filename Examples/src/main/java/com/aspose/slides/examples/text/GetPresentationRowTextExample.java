package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

/*
This example demonstrates hao to get raw text of a presentation using PresentationFactory.Instance.GetPresentationText method.

In version 24.9 this method only works if you have a license.
*/
public class GetPresentationRowTextExample 
{
    public static void main(String[] args)
    {
        String presentationName = RunExamples.getDataDir_Text() + "PresentationText.pptx";

        //ExStart:CreateBoundsShapeThumbnail
        IPresentationText presentationText = PresentationFactory.getInstance().getPresentationText(presentationName, TextExtractionArrangingMode.Unarranged);
        
        System.out.println("Comments for Slide 1 : " + presentationText.getSlidesText()[0].getCommentsText());
        System.out.println("Text for Slide 1 : " + presentationText.getSlidesText()[0].getText());
        System.out.println("Notes for Slide 2 : " + presentationText.getSlidesText()[1].getNotesText());
        //ExEnd:CreateBoundsShapeThumbnail
    }
}
