package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class ExportShapeToSVG {

    public static void main(String[] args) throws IOException {

        String dataDir = Utils.getDataDir(ExportShapeToSVG.class);

        //ExStart:ExportShapeToSVG
        // Instantiate Presentation class
        Presentation pres = new Presentation(dataDir + "Presentation.pptx");
        try {
            OutputStream stream = new ByteArrayOutputStream();
            pres.getSlides().get_Item(0).getShapes().get_Item(0).writeAsSvg(stream);
            stream.close();
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ExportShapeToSVG
    }

}