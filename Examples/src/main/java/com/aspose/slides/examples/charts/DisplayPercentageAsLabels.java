package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class DisplayPercentageAsLabels
{
    public static void main(String[] args)
    {
        //ExStart:DisplayPercentageAsLabels
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Create an instance of Presentation class
        Presentation presentation = new Presentation();

        ISlide slide = presentation.getSlides().get_Item(0);
        IChart chart = slide.getShapes().addChart(ChartType.StackedColumn, 20, 20, 400, 400);
        IChartSeries series = chart.getChartData().getSeries().get_Item(0);
        IChartCategory cat;
        double[] total_for_Cat = new double[chart.getChartData().getCategories().size()];
        for (int k = 0; k < chart.getChartData().getCategories().size(); k++)
        {
            cat = chart.getChartData().getCategories().get_Item(k);

            for (int i = 0; i < chart.getChartData().getSeries().size(); i++)
            {
                total_for_Cat[k] = total_for_Cat[k] + (double) (chart.getChartData().getSeries().get_Item(i).getDataPoints().get_Item(k).getValue().getData());
            }
        }

        double dataPontPercent = 0f;

        for (int x = 0; x < chart.getChartData().getSeries().size(); x++)
        {
            series = chart.getChartData().getSeries().get_Item(x);
            series.getLabels().getDefaultDataLabelFormat().setShowLegendKey(false);

            for (int j = 0; j < series.getDataPoints().size(); j++)
            {
                IDataLabel lbl = series.getDataPoints().get_Item(j).getLabel();
                dataPontPercent = (double) (series.getDataPoints().get_Item(j).getValue().getData()) / total_for_Cat[j] * 100;

                IPortion port = new Portion();
                port.setText(String.format("{0:F2} %", dataPontPercent));
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
        presentation.save(dataDir + "DisplayPercentageAsLabels_out.pptx", SaveFormat.Pptx);
        //ExEnd:DisplayPercentageAsLabels
    }
}
