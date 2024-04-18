package com.aspose.slides.examples.rendering.printing;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;

public class Rendering3D {

    // This example demonstrates creating and rendering presentation with 3D graphics.

    public static void main(String[] args)
    {
        //ExStart:RenderComments
        String outPptxFile = RunExamples.getOutPath() + "sandbox_3d.pptx";
        String outPngFile = RunExamples.getOutPath() + "sample_3d.png";

        Presentation pres = new Presentation();
        try
        {
            IAutoShape shape = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 200, 150, 200, 200);
            shape.getTextFrame().setText("3D");
            shape.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat().setFontHeight(64);

            shape.getThreeDFormat().getCamera().setCameraType(CameraPresetType.OrthographicFront);
            shape.getThreeDFormat().getCamera().setRotation(20, 30, 40);
            shape.getThreeDFormat().getLightRig().setLightType(LightRigPresetType.Flat);
            shape.getThreeDFormat().getLightRig().setDirection(LightingDirection.Top);
            shape.getThreeDFormat().setMaterial(MaterialPresetType.Powder);
            shape.getThreeDFormat().setExtrusionHeight(100);
            shape.getThreeDFormat().getExtrusionColor().setColor(Color.BLUE);

            pres.getSlides().get_Item(0).getImage(2, 2).save(outPngFile, ImageFormat.Png);
            pres.save(outPptxFile, SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RenderComments
    }

}
