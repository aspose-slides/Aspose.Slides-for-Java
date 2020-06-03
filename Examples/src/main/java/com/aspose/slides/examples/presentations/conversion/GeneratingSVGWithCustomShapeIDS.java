package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SVGOptions;
import com.aspose.slides.examples.RunExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class GeneratingSVGWithCustomShapeIDS
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:GeneratingSVGWithCustomShapeIDS
        String dataDir = RunExamples.getDataDir_Conversion();
        Presentation pres = new Presentation(dataDir + "presentation.pptx");
        try
        {
            FileOutputStream stream = new FileOutputStream(new File(dataDir + "pptxFileName.svg"));
            try
            {
                SVGOptions svgOptions = new SVGOptions();
                svgOptions.setShapeFormattingController(new CustomSvgShapeFormattingController());

                pres.getSlides().get_Item(0).writeAsSvg(stream, svgOptions);
            }
            finally
            {
                if (stream != null) stream.close();
            }
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:GeneratingSVGWithCustomShapeIDS        
    }
}
