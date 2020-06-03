package com.aspose.slides.examples.presentations.saving;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ViewType;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class SaveAsPredefinedViewType
{
    public static void main(String[] args)
    {
        //ExStart:SaveAsPredefinedViewType
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationSaving();

        // Opening the presentation file
        Presentation presentation = new Presentation();

        // Setting view type 
        presentation.getViewProperties().setLastView(ViewType.SlideMasterView);

        // Saving presentation
        presentation.save(dataDir + "SetViewType_out.pptx", SaveFormat.Pptx);
        //ExEnd:SaveAsPredefinedViewType
    }
}

