/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.IOleObjectFrame;
import com.aspose.slides.IPPImage;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.imageio.ImageIO;

/**
 *
 * @author mfazi
 */
public class SubstitutePictureTitleOfOLEObjectFrame {
    
    public static void main(String[] args) throws IOException{
    
        //ExStart:SubstitutePictureTitleOfOLEObjectFrame

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SubstitutePictureTitleOfOLEObjectFrame.class);
        String oleSourceFile = dataDir + "book1.xlsx";
        String oleIconFile = dataDir + "aspose-logo.jpg";

        Presentation pres = new Presentation();
        try
        {
            IPPImage image = null;
            ISlide slide = pres.getSlides().get_Item(0);

            // Add Ole objects
            byte[] allbytes = Files.readAllBytes(Paths.get(oleSourceFile));
            IOleObjectFrame oof = slide.getShapes().addOleObjectFrame(20, 20, 50, 50, "Excel.Sheet.12", allbytes);
            oof.setObjectIcon(true);

            // Add image object
            byte[] imgBuf = Files.readAllBytes(Paths.get(oleIconFile));

            ByteArrayInputStream bais = new ByteArrayInputStream(imgBuf);
            try {
                image = pres.getImages().addImage(ImageIO.read(bais));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            oof.getSubstitutePictureFormat().getPicture().setImage(image);

            // Set caption to OLE icon
            oof.setSubstitutePictureTitle("Caption example");
        } finally {
            pres.dispose();
        }
        
        //ExEnd:SubstitutePictureTitleOfOLEObjectFrame
    }
}
