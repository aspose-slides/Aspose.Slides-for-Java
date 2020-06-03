package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;





public class Apply3DRotationEffectOnShape
{
    public static void main(String[] args)
    {
        //ExStart:Apply3DRotationEffecrOnShapes
        // The path to the documents directory.                    
        String dataDir = RunExamples.getDataDir_Shapes();

        // Create an instance of Presentation class
        Presentation pres = new Presentation();
        IShape autoShape = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 30, 30, 200, 200);

        autoShape.getThreeDFormat().setDepth((short) 6);
        autoShape.getThreeDFormat().getCamera().setRotation(40, 35, 20);
        autoShape.getThreeDFormat().getCamera().setCameraType(CameraPresetType.IsometricLeftUp);
        autoShape.getThreeDFormat().getLightRig().setLightType(LightRigPresetType.Balanced);

        autoShape = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Line, 30, 300, 200, 200);
        autoShape.getThreeDFormat().setDepth((short) 6);
        autoShape.getThreeDFormat().getCamera().setRotation(0, 35, 20);
        autoShape.getThreeDFormat().getCamera().setCameraType(CameraPresetType.IsometricLeftUp);
        autoShape.getThreeDFormat().getLightRig().setLightType(LightRigPresetType.Balanced);


        pres.save(dataDir + "Rotation_out.pptx", SaveFormat.Pptx);
        //ExEnd:Apply3DRotationEffecrOnShapes
    }
}

