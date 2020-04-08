package com.aspose.slides.examples.Slides.Media;

import com.aspose.slides.Control;
import com.aspose.slides.IControl;
import com.aspose.slides.IControlCollection;

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

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExtractFlashObjects.class);

        //ExStart:ExtractFlashObjects
        // Loading a presentation
        Presentation pres = new Presentation(dataDir + "withFlash.pptm");

        IControlCollection controls = pres.getSlides().get_Item(0).getControls();
        Control flashControl = null;
        for (IControl control : controls) {

            if (control.getName() == "ShockwaveFlash1") {
                flashControl = (Control) control;
            }
        }
        //ExEnd:ExtractFlashObjects
    }
}


