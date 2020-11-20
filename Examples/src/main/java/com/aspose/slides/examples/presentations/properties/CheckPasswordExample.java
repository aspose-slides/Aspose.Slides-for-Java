package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.RunExamples;

public class CheckPasswordExample
{
    // The example below demonstrates how to check a password to open a presentation

    public static void main(String[] args)
    {
        //ExStart:CheckPasswordExample

        //Path for source presentation
        String pptFile = RunExamples.getDataDir_PresentationProperties() + "open_pass1.ppt";

        // Check the Password via IPresentationInfo Interface
        IPresentationInfo presentationInfo = PresentationFactory.getInstance().getPresentationInfo(pptFile);
        boolean isPasswordCorrect = presentationInfo.checkPassword("my_password");
        System.out.println("The password \"my_password\" for the presentation is " + isPasswordCorrect);

        isPasswordCorrect = presentationInfo.checkPassword("pass1");
        System.out.println("The password \"pass1\" for the presentation is " + isPasswordCorrect);

        //ExEnd:CheckPasswordExample
    }

}
