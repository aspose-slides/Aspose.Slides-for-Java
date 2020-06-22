package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SVGOptions;
import com.aspose.slides.examples.RunExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


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
