package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;





public class ApplyBevelEffects
{
    public static void main(String[] args)
    {
        //ExStart:ApplyBevelEffects
        // The path to the documents directory.                    
        String dataDir = RunExamples.getDataDir_Shapes();

        // Create an instance of Presentation class
        Presentation pres = new Presentation();
        ISlide slide = pres.getSlides().get_Item(0);

        // Add a shape on slide
        IAutoShape shape = slide.getShapes().addAutoShape(ShapeType.Ellipse, 30, 30, 100, 100);
        shape.getFillFormat().setFillType(FillType.Solid);
        shape.getFillFormat().getSolidFillColor().setColor(Color.GREEN);
        ILineFillFormat format = shape.getLineFormat().getFillFormat();
        format.setFillType(FillType.Solid);
        format.getSolidFillColor().setColor(Color.ORANGE);
        shape.getLineFormat().setWidth(2.0);

        // Set ThreeDFormat properties of shape
        shape.getThreeDFormat().setDepth((short) 4);
        shape.getThreeDFormat().getBevelTop().setBevelType(BevelPresetType.Circle);
        shape.getThreeDFormat().getBevelTop().setHeight(6);
        shape.getThreeDFormat().getBevelTop().setWidth(6);
        shape.getThreeDFormat().getCamera().setCameraType(CameraPresetType.OrthographicFront);
        shape.getThreeDFormat().getLightRig().setLightType(LightRigPresetType.ThreePt);
        shape.getThreeDFormat().getLightRig().setDirection(LightingDirection.Top);

        // Write the presentation as a PPTX file
        pres.save(dataDir + "Bavel_out.pptx", SaveFormat.Pptx);
        //ExEnd:ApplyBevelEffects
    }
}

