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

        // Access the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        // Cast the shape to OleObjectFrame
        OleObjectFrame oof = (OleObjectFrame) sld.getShapes().get_Item(0);

        // Read the OLE Object and write it to disk
        if (oof != null)
        {
            FileOutputStream fstr = new FileOutputStream(new File(dataDir + "excelFromOLE_out.xlsx"));
            byte[] buf = oof.getObjectData();
            fstr.write(buf, 0, buf.length);
            fstr.flush();
            fstr.close();
        }
        //ExEnd:AccessOLEObjectFrame
    }
}
