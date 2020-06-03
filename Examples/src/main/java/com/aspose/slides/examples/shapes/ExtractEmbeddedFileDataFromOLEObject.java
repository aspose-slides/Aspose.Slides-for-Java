package com.aspose.slides.examples.shapes;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.OleObjectFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.FileOutputStream;
import java.io.IOException;


public class ExtractEmbeddedFileDataFromOLEObject
{
    public static void main(String[] args) throws IOException
    {

        //ExStart:ExtractEmbeddedFileDataFromOLEObject

        // The documents directory path.
        String dataDir = RunExamples.getDataDir_Shapes();

        String pptxFileName = dataDir + "TestOlePresentation.pptx";
        Presentation pres = new Presentation(pptxFileName);
        try
        {
            int objectnum = 0;
            for (ISlide sld : pres.getSlides())
            {
                for (IShape shape : sld.getShapes())
                {
                    if (shape instanceof OleObjectFrame)
                    {
                        objectnum++;
                        OleObjectFrame oleFrame = (OleObjectFrame) shape;
                        byte[] data = oleFrame.getEmbeddedFileData();
                        String fileExtention = oleFrame.getEmbeddedFileExtension();
                        String extractedPath = dataDir + "ExtractedObject_out" + objectnum + fileExtention;
                        FileOutputStream fs = new FileOutputStream(extractedPath);
                        fs.write(data, 0, data.length);
                    }
                }
            }
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:ExtractEmbeddedFileDataFromOLEObject

    }
}

