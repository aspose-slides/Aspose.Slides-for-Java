package com.aspose.slides.examples.Slides.Media;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.IVideoFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.VideoFrame;
import com.aspose.slides.examples.Utils;

public class ExtractFlashObjects {

	public static void main(String[] args) throws IOException {
		
            //ExStart:ExtractFlashObjects
	// The path to the documents directory.
	   String dataDir = Utils.getDataDir(ExtractFlashObjects.class);
	   Presentation pres = new Presentation(dataDir+"withFlash.pptm");

           IControlCollection controls = pres.getSlides().get_Item(0).getControls();
           Control flashControl = null;
           for (IControl control : controls){
         
             if (control.getName() == "ShockwaveFlash1")
         {
                 flashControl = (Control)control;
          }
    
       }
      
        //ExEnd:ExtractFlashObjects
}
