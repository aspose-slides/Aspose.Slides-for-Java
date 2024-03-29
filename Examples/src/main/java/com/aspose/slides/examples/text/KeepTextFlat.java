package com.aspose.slides.examples.text;

import com.aspose.slides.AutoShape;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class KeepTextFlat
{
    // This example demonstrates setting keep text out of 3D scene.
    public static void main(String[] args)
    {
        //ExStart:KeepTextFlat

        String pptxFileName = RunExamples.getDataDir_Text() + "KeepTextFlat.pptx";
        String resultPath = RunExamples.getOutPath() + "KeepTextFlat_out.png";

        Presentation pres = new Presentation(pptxFileName);
        try {
            IAutoShape shape1 = (AutoShape) pres.getSlides().get_Item(0).getShapes().get_Item(0);
            IAutoShape shape2 = (AutoShape) pres.getSlides().get_Item(0).getShapes().get_Item(1);

            shape1.getTextFrame().getTextFrameFormat().setKeepTextFlat(false);
            shape2.getTextFrame().getTextFrameFormat().setKeepTextFlat(true);

            ImageIO.write(pres.getSlides().get_Item(0).getThumbnail(4 / 3f, 4 / 3f), "PNG",
                    new File(resultPath));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pres != null) pres.dispose();
        }

        //ExEnd:KeepTextFlat
    }

}
