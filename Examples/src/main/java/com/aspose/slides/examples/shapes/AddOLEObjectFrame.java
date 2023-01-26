package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class AddOLEObjectFrame
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:AddOLEObjectFrame

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();
        String outPath = RunExamples.getOutPath();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();
        try
        {
            // Access the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Load an cel file to stream
            FileInputStream fs = new FileInputStream(dataDir + "book1.xlsx");
            ByteArrayOutputStream mstream = new ByteArrayOutputStream();
            byte[] buf = new byte[4096];

            while (true)
            {
                int bytesRead = fs.read(buf, 0, buf.length);
                if (bytesRead <= 0)
                    break;
                mstream.write(buf, 0, bytesRead);
            }
            // Create data object for embedding
            IOleEmbeddedDataInfo dataInfo = new OleEmbeddedDataInfo(mstream.toByteArray(), "xlsx");

            // Add an Ole Object Frame shape
            IOleObjectFrame oleObjectFrame = sld.getShapes().addOleObjectFrame(0, 0, (float)pres.getSlideSize().getSize().getWidth(),
                    (float)pres.getSlideSize().getSize().getHeight(), dataInfo);

            //Write the PPTX to disk
            pres.save(outPath + "OleEmbed_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:AddOLEObjectFrame
    }
}
