
package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.OleObjectFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ExtractEmbeddedFileDataFromOLEObject {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //ExStart:ExtractEmbeddedFileDataFromOLEObject

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExtractEmbeddedFileDataFromOLEObject.class);

        String pptxFileName = dataDir +"TestOlePresentation.pptx";
        
        Presentation pres = new Presentation(pptxFileName);
        
        int objectnum = 0;
        for (ISlide sld : pres.getSlides())
        {
            for (IShape shape : sld.getShapes())
            {
                if (shape instanceof OleObjectFrame)
                {
                    objectnum++;
                    OleObjectFrame oleFrame = (OleObjectFrame)shape ;
                    byte[] data = oleFrame.getEmbeddedFileData();
                    String fileExtention = oleFrame.getEmbeddedFileExtension();

                    String extractedPath = dataDir +"ExtractedObject_out" + objectnum + fileExtention;

                        
            FileOutputStream outputStream = new FileOutputStream(extractedPath);
            outputStream.write(data);
            outputStream.close();
                    
                }
            }
        }
        
        //ExEnd:ExtractEmbeddedFileDataFromOLEObject
    }
}
