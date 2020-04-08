package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.ISlide;
import com.aspose.slides.LayoutTargetType;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;


public class SetLayoutMode {

    public static void main(String[] args) {


        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir(SetLayoutMode.class) + "Charts/";

        //ExStart:SetLayoutMode
        // Instantiate the Presentation class that represents the presentation
        Presentation presentation = new Presentation();
        try {
            ISlide slide = presentation.getSlides().get_Item(0);
            IChart chart = slide.getShapes().addChart(ChartType.ClusteredColumn, 20, 100, 600, 400);

            chart.getPlotArea().setX(0.2f);
            chart.getPlotArea().setY(0.2f);
            chart.getPlotArea().setWidth(0.7f);
            chart.getPlotArea().setHeight(0.7f);

            chart.getPlotArea().setLayoutTargetType(LayoutTargetType.Inner);

            presentation.save(dataDir + "SetLayoutMode.pptx", SaveFormat.Pptx);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SetLayoutMode
    }
}
