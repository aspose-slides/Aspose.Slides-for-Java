package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class SetFileTypeForAnEmbeddingObject
{
    public static void main(String[] args) throws IOException
    {

        //ExStart:SetFileTypeForAnEmbeddingObject

        Presentation pres = new Presentation();
        try
        {
            // The path to the documents directory.
            String dataDir = RunExamples.getDataDir_Shapes();

            // Add known Ole objects
            byte[] fileBytes = Files.readAllBytes(Paths.get(dataDir + "test.zip"));

            // Create Ole embedded file info
            IOleEmbeddedDataInfo dataInfo = new OleEmbeddedDataInfo(fileBytes, "zip");

            // Create OLE object
            IOleObjectFrame oleFrame = pres.getSlides().get_Item(0).getShapes().addOleObjectFrame(150, 20, 50, 50, dataInfo);
            oleFrame.setObjectIcon(true);


            pres.save(dataDir + "SetFileTypeForAnEmbeddingObject.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

        //ExEnd:SetFileTypeForAnEmbeddingObject

    }
}

