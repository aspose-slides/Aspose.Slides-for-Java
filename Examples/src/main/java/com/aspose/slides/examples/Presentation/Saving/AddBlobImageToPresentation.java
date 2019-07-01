/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Presentation.Saving;

import com.aspose.slides.IPPImage;
import com.aspose.slides.LoadingStreamBehavior;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;
import java.io.FileInputStream;
import java.io.IOException;


public class AddBlobImageToPresentation {
    
    public static void main(String[] args) {
        //ExStart:AddBlobImageToPresentation
       
       // The path to the documents directory.
       String dataDir = Utils.getDataDir(AddBlobImageToPresentation.class);
       
       // supposed we have the large image file we want to include into the presentation
    String pathToLargeImage = dataDir + "large_image.jpg";
        // create a new presentation which will contain this image
    Presentation pres = new Presentation();
    try
    {
        FileInputStream fip = new FileInputStream(pathToLargeImage);
        try
        {
            // let's add the image to the presentation - we choose KeepLocked behavior, because we not
            // have an intent to access the "largeImage.png" file.
            IPPImage img = pres.getImages().addImage(fip, LoadingStreamBehavior.KeepLocked);
            pres.getSlides().get_Item(0).getShapes().addPictureFrame(ShapeType.Rectangle, 0, 0, 300, 200, img);
  
            // save the presentation. Despite that the output presentation will be
            // large, the memory consumption will be low the whole lifetime of the pres object
            pres.save(dataDir + "presentationWithLargeImage.pptx", SaveFormat.Pptx);
        }
        finally {
            fip.close();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } finally {
        pres.dispose();
    }
       
       //ExEnd:AddBlobImageToPresentation
       
    }
    
}
