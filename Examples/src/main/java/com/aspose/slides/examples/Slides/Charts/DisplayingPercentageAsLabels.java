package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartCategory;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.IDataLabel;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.Portion;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class DisplayingPercentageAsLabels {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(DisplayingPercentageAsLabels.class);

        //ExStart:DisplayingPercentageAsLabels
        // Creating empty presentation
        Presentation pres = new Presentation();
        try {
            // Access first slide
            ISlide slide = pres.getSlides().get_Item(0);

            IChart chart = slide.getShapes().addChart(ChartType.StackedColumn, 20, 20, 400, 400);
            IChartSeries series = chart.getChartData().getSeries().get_Item(0);
            IChartCategory cat;
            double total_value = 0.0f;

            double[] total_for_Cat = new double[chart.getChartData().getCategories().size()];

            for (int k = 0; k < chart.getChartData().getCategories().size(); k++) {
                cat = chart.getChartData().getCategories().get_Item(k);

                for (int i = 0; i < chart.getChartData().getSeries().size(); i++) {
                    total_for_Cat[k] = total_for_Cat[k] + (double) (chart.getChartData().getSeries().get_Item(i).getDataPoints().get_Item(k).getValue().getData());
                }
            }

            double dataPontPercent = 0f;

            for (int x = 0; x < chart.getChartData().getSeries().size(); x++) {
                series = chart.getChartData().getSeries().get_Item(x);
                series.getLabels().getDefaultDataLabelFormat().setShowLegendKey(false);

                for (int j = 0; j < series.getDataPoints().size(); j++) {
                    IDataLabel lbl = series.getDataPoints().get_Item(j).getLabel();
                    dataPontPercent = (double) ((series.getDataPoints().get_Item(j).getValue().getData())) / total_for_Cat[j] * 100;

                    IPortion port = new Portion();
                    port.setText(String.format("{0:F2} %.2f", dataPontPercent));
                    port.getPortionFormat().setFontHeight(8f);
                    lbl.getTextFrameForOverriding().setText("");
                    IParagraph para = lbl.getTextFrameForOverriding().getParagraphs().get_Item(0);
                    para.getPortions().add(port);

                    lbl.getDataLabelFormat().setShowSeriesName(false);
                    lbl.getDataLabelFormat().setShowPercentage(false);
                    lbl.getDataLabelFormat().setShowLegendKey(false);
                    lbl.getDataLabelFormat().setShowCategoryName(false);
                    lbl.getDataLabelFormat().setShowBubbleSize(false);
                }
            }

            // Save presentation with chart
            pres.save(dataDir + "test.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:DisplayingPercentageAsLabels
    }

}
