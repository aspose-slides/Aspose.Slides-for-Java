package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.io.IOException;

public class WordArt {

    public static void main(String[] args) throws IOException
    {
        //ExStart:WordArt
        String resultPath = RunExamples.getOutPath() +  "WordArt_out.pptx";

        Presentation pres = new Presentation();
        try {
            // Create shape and text frame
            IAutoShape shape = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 314, 122, 400, 215.433f);

            ITextFrame textFrame = shape.getTextFrame();

            Portion portion = (Portion)textFrame.getParagraphs().get_Item(0).getPortions().get_Item(0);
            portion.setText("Aspose.Slides");
            FontData fontData = new FontData("Arial Black");
            portion.getPortionFormat().setLatinFont(fontData);
            portion.getPortionFormat().setFontHeight(36);

            // Set format of the text
            portion.getPortionFormat().getFillFormat().setFillType(FillType.Pattern);
            portion.getPortionFormat().getFillFormat().getPatternFormat().getForeColor().setColor(Color.getColor("16762880"));
            portion.getPortionFormat().getFillFormat().getPatternFormat().getBackColor().setColor(Color.WHITE);
            portion.getPortionFormat().getFillFormat().getPatternFormat().setPatternStyle(PatternStyle.SmallGrid);

            portion.getPortionFormat().getLineFormat().getFillFormat().setFillType(FillType.Solid);
            portion.getPortionFormat().getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.BLACK);

            // Add a shadow effect for the text
            portion.getPortionFormat().getEffectFormat().enableOuterShadowEffect();
            portion.getPortionFormat().getEffectFormat().getOuterShadowEffect().getShadowColor().setColor(Color.BLACK);
            portion.getPortionFormat().getEffectFormat().getOuterShadowEffect().setScaleHorizontal(100);
            portion.getPortionFormat().getEffectFormat().getOuterShadowEffect().setScaleVertical(65);
            portion.getPortionFormat().getEffectFormat().getOuterShadowEffect().setBlurRadius(4.73);
            portion.getPortionFormat().getEffectFormat().getOuterShadowEffect().setDirection(230);
            portion.getPortionFormat().getEffectFormat().getOuterShadowEffect().setDistance(2);
            portion.getPortionFormat().getEffectFormat().getOuterShadowEffect().setSkewHorizontal(30);
            portion.getPortionFormat().getEffectFormat().getOuterShadowEffect().setSkewVertical(0);
            portion.getPortionFormat().getEffectFormat().getOuterShadowEffect().getShadowColor().getColorTransform().add(ColorTransformOperation.SetAlpha, 0.32f);

            // Add reflection
            portion.getPortionFormat().getEffectFormat().enableReflectionEffect();
            portion.getPortionFormat().getEffectFormat().getReflectionEffect().setBlurRadius(0.5);
            portion.getPortionFormat().getEffectFormat().getReflectionEffect().setDistance(4.72);
            portion.getPortionFormat().getEffectFormat().getReflectionEffect().setStartPosAlpha(0f);
            portion.getPortionFormat().getEffectFormat().getReflectionEffect().setEndPosAlpha(60f);
            portion.getPortionFormat().getEffectFormat().getReflectionEffect().setDirection(90);
            portion.getPortionFormat().getEffectFormat().getReflectionEffect().setScaleHorizontal(100);
            portion.getPortionFormat().getEffectFormat().getReflectionEffect().setScaleVertical(-100);
            portion.getPortionFormat().getEffectFormat().getReflectionEffect().setStartReflectionOpacity(60f);
            portion.getPortionFormat().getEffectFormat().getReflectionEffect().setEndReflectionOpacity(0.9f);
            portion.getPortionFormat().getEffectFormat().getReflectionEffect().setRectangleAlign(RectangleAlignment.BottomLeft);

            // Add glow effect
            portion.getPortionFormat().getEffectFormat().enableGlowEffect();
            portion.getPortionFormat().getEffectFormat().getGlowEffect().getColor().setR((byte)255);
            portion.getPortionFormat().getEffectFormat().getGlowEffect().getColor().getColorTransform().add(ColorTransformOperation.SetAlpha, 0.54f);
            portion.getPortionFormat().getEffectFormat().getGlowEffect().setRadius(7);

            // Add transformation
            textFrame.getTextFrameFormat().setTransform(TextShapeType.ArchUpPour);

            // Add 3D effects to the shape
            shape.getThreeDFormat().getBevelBottom().setBevelType(BevelPresetType.Circle);
            shape.getThreeDFormat().getBevelBottom().setHeight(10.5);
            shape.getThreeDFormat().getBevelBottom().setWidth(10.5);

            shape.getThreeDFormat().getBevelTop().setBevelType(BevelPresetType.Circle);
            shape.getThreeDFormat().getBevelTop().setHeight(12.5);
            shape.getThreeDFormat().getBevelTop().setWidth(11);

            shape.getThreeDFormat().getExtrusionColor().setColor(Color.getColor("16762880"));
            shape.getThreeDFormat().setExtrusionHeight(6);

            shape.getThreeDFormat().getContourColor().setColor(Color.getColor("12058624"));
            shape.getThreeDFormat().setContourWidth(1.5);

            shape.getThreeDFormat().setDepth(3);

            shape.getThreeDFormat().setMaterial(MaterialPresetType.Plastic);

            shape.getThreeDFormat().getLightRig().setDirection(LightingDirection.Top);
            shape.getThreeDFormat().getLightRig().setLightType(LightRigPresetType.Balanced);
            shape.getThreeDFormat().getLightRig().setRotation(0, 0, 40);

            shape.getThreeDFormat().getCamera().setCameraType(CameraPresetType.PerspectiveContrastingRightFacing);

            // Add 3D effects to the text
            textFrame = shape.getTextFrame();

            textFrame.getTextFrameFormat().getThreeDFormat().getBevelBottom().setBevelType(BevelPresetType.Circle);
            textFrame.getTextFrameFormat().getThreeDFormat().getBevelBottom().setHeight(3.5);
            textFrame.getTextFrameFormat().getThreeDFormat().getBevelBottom().setWidth(3.5);

            textFrame.getTextFrameFormat().getThreeDFormat().getBevelTop().setBevelType(BevelPresetType.Circle);
            textFrame.getTextFrameFormat().getThreeDFormat().getBevelTop().setHeight(12.5);
            textFrame.getTextFrameFormat().getThreeDFormat().getBevelTop().setWidth(11);

            textFrame.getTextFrameFormat().getThreeDFormat().getExtrusionColor().setColor(Color.ORANGE);
            textFrame.getTextFrameFormat().getThreeDFormat().setExtrusionHeight(6);

            textFrame.getTextFrameFormat().getThreeDFormat().getContourColor().setColor(Color.getColor("12058624"));
            textFrame.getTextFrameFormat().getThreeDFormat().setContourWidth(1.5);

            textFrame.getTextFrameFormat().getThreeDFormat().setDepth(3);

            textFrame.getTextFrameFormat().getThreeDFormat().setMaterial(MaterialPresetType.Plastic);

            textFrame.getTextFrameFormat().getThreeDFormat().getLightRig().setDirection(LightingDirection.Top);
            textFrame.getTextFrameFormat().getThreeDFormat().getLightRig().setLightType(LightRigPresetType.Balanced);
            textFrame.getTextFrameFormat().getThreeDFormat().getLightRig().setRotation(0, 0, 40);

            textFrame.getTextFrameFormat().getThreeDFormat().getCamera().setCameraType(CameraPresetType.PerspectiveContrastingRightFacing);

            pres.save(resultPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:WordArt
    }
    
}
