package com.aspose.slides.examples.smartarts;

import com.aspose.slides.IShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SmartArt;
import com.aspose.slides.SmartArtLayoutType;
import com.aspose.slides.examples.RunExamples;

/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class AccessSmartArtParticularLayout
{
    public static void main(String[] args)
    {
        //ExStart:AccessSmartArtParticularLayout
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        Presentation presentation = new Presentation(dataDir + "AccessSmartArtShape.pptx");
        try
        {
            // Traverse through every shape inside first slide
            for (IShape shape : presentation.getSlides().get_Item(0).getShapes())
            {
                // Check if shape is of SmartArt type
                if (shape instanceof SmartArt)
                {
                    // Typecast shape to SmartArtEx
                    SmartArt smart = (SmartArt) shape;

                    // Checking SmartArt Layout
                    if (smart.getLayout() == SmartArtLayoutType.BasicBlockList)
                    {
                        System.out.println("Do some thing here....");
                    }
                }
            }
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AccessSmartArtParticularLayout
    }
}

