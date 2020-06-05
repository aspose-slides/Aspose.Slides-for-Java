package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;


public class FontPropertiesForInvidualLegend
{
    public static void main(String[] args)
    {

        //ExStart:FontPropertiesForInvidualLegend
        String dataDir = RunExamples.getDataDir_Charts();
        Presentation pres = new Presentation(dataDir + "test.pptx");
        try
        {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400);

            IChartTextFormat tf = chart.getLegend().getEntries().get_Item(1).getTextFormat();

            tf.getPortionFormat().setFontBold(NullableBool.True);

            tf.getPortionFormat().setFontHeight(20);

            tf.getPortionFormat().setFontItalic(NullableBool.True);

            tf.getPortionFormat().getFillFormat().setFillType(FillType.Solid);

            tf.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.BLUE);
            pres.save(dataDir + "output.pptx", SaveFormat.Pptx);

        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:FontPropertiesForInvidualLegend
    }
}

