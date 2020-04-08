package com.aspose.slides.examples.Slides.Shapes;

import java.io.FileOutputStream;

import com.aspose.slides.IOleObjectFrame;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AccessingAnOLEObjectFrameFromASlide {

    public static void main(String[] args) throws Exception {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AccessingAnOLEObjectFrameFromASlide.class);

        //ExStart:AccessingAnOLEObjectFrameFromASlide
        // Load the PPTX to PresentationEx object
        Presentation pres = new Presentation(dataDir + "AccessingOLEObjectFrame.pptx");
        try {
            // Access the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Cast the shape to OleObjectFrameEx
            IOleObjectFrame oof = (IOleObjectFrame) sld.getShapes().get_Item(0);

            // Read the OLE Object and write it to disk
            if (oof != null) {
                FileOutputStream fstr;
                fstr = new FileOutputStream(dataDir + "book1.xlsx");
                byte[] buf = oof.getObjectData();
                fstr.write(buf, 0, buf.length);
                fstr.flush();
                fstr.close();
                System.out.println("Excel OLE Object written as excel1.xls file");
            }

            // Write the PPTX to disk
            pres.save(dataDir + "OleEmbed.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AccessingAnOLEObjectFrameFromASlide
    }

}
