package com.aspose.slides.examples.Presentation.Properties;

import com.aspose.slides.DocumentProperties;
import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.IPPImage;
import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.Presentation;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SupportForAddingEMZFilesIntoImagesCollection {

	public static void main(String args[]) throws FileNotFoundException, IOException {
        //ExStart:SupportForAddingEMZFilesIntoImagesCollection
        String dataDir = Utils.getDataDir(SupportForAddingEMZFilesIntoImagesCollection.class); 
        String imagePath="";
        Presentation presentation = new Presentation();
     try{
        FileInputStream imageFile = new FileInputStream(imagePath);
    try {
        IPPImage image = presentation.getImages().addImage(imageFile);
        presentation.getSlides().get_Item(0).getShapes().addPictureFrame(ShapeType.Rectangle, 0, 0, (float) presentation.getSlideSize().getSize().getWidth(), (float)               presentation.getSlideSize().getSize().getHeight(), image);
    }  finally {
        imageFile.close();
    }
    }    
     finally {
        presentation.dispose();
       }
      //ExEnd:SupportForAddingEMZFilesIntoImagesCollection
 
    }
}
