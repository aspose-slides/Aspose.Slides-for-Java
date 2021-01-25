package com.aspose.slides.examples.shapes;

import com.aspose.slides.ISlide;
import com.aspose.slides.OleObjectFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class AccessOLEObjectFrame
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:AccessOLEObjectFrame

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Load the PPTX to Presentation object
        Presentation pres = new Presentation(dataDir + "AccessingOLEObjectFrame.pptx");
        try
        {
            // Access the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Cast the shape to OleObjectFrame
            OleObjectFrame oleObjectFrame = (OleObjectFrame) sld.getShapes().get_Item(0);

            // Read the OLE Object and write it to disk
            if (oleObjectFrame != null)
            {
                // Get embedded file data
                byte[] data = oleObjectFrame.getEmbeddedFileData();

                // Get embedded file extention
                String fileExtention = oleObjectFrame.getEmbeddedFileExtension();

                // Create path for saving the extracted file
                String extractedPath = dataDir + "excelFromOLE_out" + fileExtention;

                // Save extracted data
                FileOutputStream fstr = new FileOutputStream(extractedPath);
                try {
                    fstr.write(data, 0, data.length);
                } finally {
                    fstr.close();
                }
            }
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:AccessOLEObjectFrame
    }
}
