package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.FillType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartTextFormat;
import com.aspose.slides.NullableBool;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

import java.awt.Color;

public class FontPropertiesForInvidualLegend {

    public static void main(String[] args) {

        String dataDir = Utils.getDataDir(FontPropertiesForInvidualLegend.class);

        //ExStart:FontPropertiesForInvidualLegend
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation(dataDir + "test.pptx");
        try {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400);

            IChartTextFormat tf = chart.getLegend().getEntries().get_Item(1).getTextFormat();

            tf.getPortionFormat().setFontBold(NullableBool.True);
            tf.getPortionFormat().setFontHeight(20);
            tf.getPortionFormat().setFontItalic(NullableBool.True);
            tf.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
            tf.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);

            pres.save(dataDir + "output.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:FontPropertiesForInvidualLegend
    }
}