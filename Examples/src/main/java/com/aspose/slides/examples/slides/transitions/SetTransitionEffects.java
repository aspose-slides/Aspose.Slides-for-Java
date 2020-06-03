package com.aspose.slides.examples.slides.transitions;

import com.aspose.slides.OptionalBlackTransition;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TransitionType;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class SetTransitionEffects
{
    public static void main(String[] args)
    {
        //ExStart:SetTransitionEffects
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Transitions();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation(dataDir + "AccessSlides.pptx");

        // Set effect
        presentation.getSlides().get_Item(0).getSlideShowTransition().setType(TransitionType.Cut);
        ((OptionalBlackTransition) presentation.getSlides().get_Item(0).getSlideShowTransition().getValue()).setFromBlack(true);

        // Write the presentation to disk
        presentation.save(dataDir + "SetTransitionEffects_out.pptx", SaveFormat.Pptx);
        //ExEnd:SetTransitionEffects
    }
}
