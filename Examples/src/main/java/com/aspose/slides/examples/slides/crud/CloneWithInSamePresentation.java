package com.aspose.slides.examples.slides.crud;

import com.aspose.slides.ISlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class CloneWithInSamePresentation
{
    public static void main(String[] args)
    {
        //ExStart:CloneWithInSamePresentation
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_CRUD();

        // Instantiate Presentation class that represents a presentation file
        Presentation pres = new Presentation(dataDir + "CloneWithInSamePresentation.pptx");
        try
        {

            // Clone the desired slide to the end of the collection of slides in the same presentation
            ISlideCollection slds = pres.getSlides();

            // Clone the desired slide to the specified index in the same presentation
            slds.insertClone(2, pres.getSlides().get_Item(1));

            // Write the modified presentation to disk
            pres.save(dataDir + "Aspose_CloneWithInSamePresentation_out.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:CloneWithInSamePresentation            
    }
}
