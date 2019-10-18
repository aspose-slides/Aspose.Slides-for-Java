

package com.aspose.slides.examples.Presentation.Saving;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class SaveToStream {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {

		
		//ExStart:SaveToStream
                
                // The path to the documents directory.
                String dataDir = Utils.getDataDir(SaveToStream.class);

		
		// Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation();

                IAutoShape shape = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 200, 200, 200, 200);

                // Add text to shape
                shape.getTextFrame().setText( "This demo shows how to Create PowerPoint file and save it to Stream.");
		                
                OutputStream os = new FileOutputStream(dataDir + "Save_As_Stream_out.pptx");
                
		pres.save(os, com.aspose.slides.SaveFormat.Pptx);

                os.close();
              //ExEnd:SaveToStream
	}

}
