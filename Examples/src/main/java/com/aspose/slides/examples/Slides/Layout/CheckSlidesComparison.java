package com.aspose.slides.examples.slides.layout;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class CheckSlidesComparison
{
    public static void main(String[] args)
    {
        //ExStart:CheckSlidesComparison
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Layout();
        Presentation presentation1 = new Presentation(dataDir + "AccessSlides.pptx");
        try
        {
            Presentation presentation2 = new Presentation(dataDir + "HelloWorld.pptx");
            try
            {
                for (int i = 0; i < presentation1.getMasters().size(); i++)
                {
                    for (int j = 0; j < presentation2.getMasters().size(); j++)
                    {
                        if (presentation1.getMasters().get_Item(i).equals(presentation2.getMasters().get_Item(j))) ;
                        System.out.println(String.format("SomePresentation1 MasterSlide#{0} is equal to SomePresentation2 MasterSlide#{1}", i, j));
                    }


                }
            }
            finally
            {
                if (presentation2 != null) presentation2.dispose();
            }
        }
        finally
        {
            if (presentation1 != null) presentation1.dispose();
        }
        //ExEnd:CheckSlidesComparison
    }
}
