package com.aspose.slides.examples.slides.layout;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;


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
