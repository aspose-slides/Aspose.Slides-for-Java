package com.aspose.slides.examples.Slides.Shapes;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.LineArrowheadLength;
import com.aspose.slides.LineArrowheadStyle;
import com.aspose.slides.LineDashStyle;
import com.aspose.slides.LineStyle;
import com.aspose.slides.Presentation;
import com.aspose.slides.PresetColor;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class AddingArrowShapedLineToSlide {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddingArrowShapedLineToSlide.class);

        //ExStart:AddingArrowShapedLineToSlide
        // Instantiate PresentationEx class that represents the PPTX file
        Presentation pres = new Presentation();
        try {
            // Get the first slide
            ISlide sld = pres.getSlides().get_Item(0);

            // Add an AutoShape of type line
            IAutoShape shp = sld.getShapes().addAutoShape(ShapeType.Line, 50, 150, 300, 0);

            // Apply some formatting on the line
            shp.getLineFormat().setStyle(LineStyle.ThickBetweenThin);
            shp.getLineFormat().setWidth(10);

            shp.getLineFormat().setDashStyle(LineDashStyle.DashDot);

            shp.getLineFormat().setBeginArrowheadLength(LineArrowheadLength.Short);
            shp.getLineFormat().setBeginArrowheadStyle(LineArrowheadStyle.Oval);

            shp.getLineFormat().setEndArrowheadLength(LineArrowheadLength.Long);
            shp.getLineFormat().setEndArrowheadStyle(LineArrowheadStyle.Triangle);

            shp.getLineFormat().getFillFormat().setFillType(FillType.Solid);
            shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(new Color(PresetColor.Maroon));

            // Write the PPTX to Disk
            pres.save(dataDir + "LineShape2.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddingArrowShapedLineToSlide
    }

}
