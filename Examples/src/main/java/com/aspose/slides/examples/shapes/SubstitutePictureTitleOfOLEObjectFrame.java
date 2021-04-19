package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class SubstitutePictureTitleOfOLEObjectFrame
{
    public static void main(String[] args) throws IOException
    {

        //ExStart:SubstitutePictureTitleOfOLEObjectFrame
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();
        String oleSourceFile = dataDir + "ExcelObject.xlsx";
        String oleIconFile = dataDir + "Image.png";

        Presentation pres = new Presentation();
        try
        {
            ISlide slide = pres.getSlides().get_Item(0);

            // Add Ole objects
            byte[] allbytes = Files.readAllBytes(Paths.get(dataDir + "book1.xlsx"));
            IOleEmbeddedDataInfo dataInfo = new OleEmbeddedDataInfo(allbytes, "xlsx");
            IOleObjectFrame oof = slide.getShapes().addOleObjectFrame(20, 20, 50, 50, dataInfo);
            oof.setObjectIcon(true);

            // Add image object
            byte[] imgBuf = Files.readAllBytes(Paths.get(dataDir + "aspose-logo.jpg"));
            IPPImage image = pres.getImages().addImage(imgBuf);

            oof.getSubstitutePictureFormat().getPicture().setImage(image);

            // Set caption to OLE icon
            oof.setSubstitutePictureTitle("Caption example");
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SubstitutePictureTitleOfOLEObjectFrame
    }
}

