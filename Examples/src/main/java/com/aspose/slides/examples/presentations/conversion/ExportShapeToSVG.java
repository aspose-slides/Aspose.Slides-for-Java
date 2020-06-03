package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class ExportShapeToSVG
{
    //ExStart:ExportShapeToSVG
    public static void main(String[] args) throws IOException
    {

        String outSvgFileName = "SingleShape.svg";
        String dataDir = RunExamples.getDataDir_Conversion();
        Presentation pres = new Presentation(dataDir + "TestExportShapeToSvg.pptx");
        try
        {
            FileOutputStream stream = new FileOutputStream(new File(dataDir + outSvgFileName));
            try
            {
                pres.getSlides().get_Item(0).getShapes().get_Item(0).writeAsSvg(stream);


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


    }


    //ExEnd:ExportShapeToSVG
}
