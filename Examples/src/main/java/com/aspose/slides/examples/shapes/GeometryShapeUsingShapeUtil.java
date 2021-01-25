package com.aspose.slides.examples.shapes;

import com.aspose.slides.GeometryShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.RunExamples;
import com.aspose.slides.PathFillModeType;
import com.aspose.slides.ShapeUtil;

import java.awt.*;
import java.awt.font.GlyphVector;
import java.awt.image.BufferedImage;

public class GeometryShapeUsingShapeUtil {

    public static void main(String[] args) throws Exception {
        //ExStart:GeometryShapeAddSegment

        // Output file name
        String resultPath = RunExamples.getOutPath() + "GeometryShapeUsingShapeUtil.pptx";

        Presentation pres = new Presentation();
        try
        {
            // Create new shape
            GeometryShape shape = (GeometryShape)pres.getSlides().get_Item(0).
                    getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 300, 100);

            // Get geometry path of the shape
            IGeometryPath originalPath = shape.getGeometryPaths()[0];
            originalPath.setFillMode(PathFillModeType.None);

            // Create new graphics path with text
            Shape graphicsPath = generateShapeFromText(new java.awt.Font("Arial", Font.PLAIN, 40), "Text in shape");

            // Convert graphics path to geometry path
            IGeometryPath textPath = ShapeUtil.graphicsPathToGeometryPath(graphicsPath);
            textPath.setFillMode(PathFillModeType.Normal);

            // Set combination of new geometry path and origin geometry path to the shape
            shape.setGeometryPaths(new IGeometryPath[] { originalPath, textPath });

            // Save the presentation
            //pres.save(resultPath, SaveFormat.Pptx);
            pres.save(resultPath, SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }

    }

    public static Shape generateShapeFromText(Font font, String text) {
        BufferedImage img = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();

        try
        {
            GlyphVector glyphVector = font.createGlyphVector(g2.getFontRenderContext(), text);

            return glyphVector.getOutline(20f, ((float) -glyphVector.getVisualBounds().getY()) + 10);
        }
        finally {
            g2.dispose();
        }
    }

    //ExEnd:GeometryShapeAddSegment

}
