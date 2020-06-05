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

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate Prseetation class that represents the PPTX
        Presentation pres = new Presentation();

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

        // Add an Ole Object Frame shape
        IOleEmbeddedDataInfo dataInfo = new OleEmbeddedDataInfo(mstream.toByteArray(), "xlsx");
        IOleObjectFrame oof = sld.getShapes().addOleObjectFrame(0, 0, (float) pres.getSlideSize().getSize().getWidth(), (float) pres.getSlideSize().getSize().getHeight(), dataInfo);

        //Write the PPTX to disk
        pres.save(dataDir + "OleEmbed_out.pptx", SaveFormat.Pptx);
        //ExEnd:AddOLEObjectFrame
    }
}
