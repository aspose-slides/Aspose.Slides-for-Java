package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.NullableBool;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class SettingFontPropertiesForTable {
    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SettingFontPropertiesForTable.class);

        //ExStart:SettingFontPropertiesForTable
        Presentation pres = new Presentation();
        try {
            IChart chart = pres.getSlides().get_Item(0).getShapes().addChart(ChartType.ClusteredColumn, 50, 50, 600, 400);

            chart.setDataTable(true);
            chart.getChartDataTable().getTextFormat().getPortionFormat().setFontBold(NullableBool.True);
            chart.getChartDataTable().getTextFormat().getPortionFormat().setFontHeight(20);

            pres.save(dataDir + "output.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:SettingFontPropertiesForTable
    }
}