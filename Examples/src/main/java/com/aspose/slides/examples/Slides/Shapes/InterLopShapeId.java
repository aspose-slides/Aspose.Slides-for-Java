package com.aspose.slides.examples.Slides.Shapes;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.aspose.slides.IVideoFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.VideoPlayModePreset;
import com.aspose.slides.examples.Utils;

public class InterLopShapeId {

    public static void main(String[] args) {
        
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(InterLopShapeId.class);

        //ExStart:InterLopShapeId
        Presentation pres = new Presentation(dataDir + "Presentation.pptx");
        try {
            // Getting unique shape identifier in slide scope
            long officeInteropShapeId = pres.getSlides().get_Item(0).getShapes().get_Item(0).getOfficeInteropShapeId();
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:InterLopShapeId
    }
}