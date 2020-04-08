package com.aspose.slides.examples.Slides.Charts;

import com.aspose.slides.ChartType;
import com.aspose.slides.FillType;
import com.aspose.slides.FontData;
import com.aspose.slides.IChart;
import com.aspose.slides.IChartDataPoint;
import com.aspose.slides.IChartDataWorkbook;
import com.aspose.slides.IChartSeries;
import com.aspose.slides.IDataLabel;
import com.aspose.slides.ISlide;
import com.aspose.slides.LineDashStyle;
import com.aspose.slides.LineStyle;
import com.aspose.slides.NullableBool;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TextAutofitType;
import com.aspose.slides.examples.Utils;


public class AddDoughnutCallout {

    public static void main(String[] args) {

        String dataDir = Utils.getDataDir(AddDoughnutCallout.class);

        //ExStart:AddDoughnutCallout
        // Instantiate the Presentation class that represents the presentation
        Presentation pres = new Presentation();
        try {
            ISlide slide = pres.getSlides().get_Item(0);
            IChart chart = slide.getShapes().addChart(ChartType.Doughnut, 10, 10, 500, 500, false);
            IChartDataWorkbook workBook = chart.getChartData().getChartDataWorkbook();
            chart.getChartData().getSeries().clear();
            chart.getChartData().getCategories().clear();
            chart.setLegend(false);
            int seriesIndex = 0;
            while (seriesIndex < 15) {
                IChartSeries series = chart.getChartData().getSeries().add(workBook.getCell(0, 0, seriesIndex + 1, "SERIES " + seriesIndex), chart.getType());
                series.setExplosion(0);
                series.getParentSeriesGroup().setDoughnutHoleSize((byte) 20);
                series.getParentSeriesGroup().setFirstSliceAngle(351);
                seriesIndex++;
            }
            int categoryIndex = 0;
            while (categoryIndex < 15) {
                chart.getChartData().getCategories().add(workBook.getCell(0, categoryIndex + 1, 0, "CATEGORY " + categoryIndex));
                int i = 0;
                while (i < chart.getChartData().getSeries().size()) {
                    IChartSeries iCS = chart.getChartData().getSeries().get_Item(i);
                    IChartDataPoint dataPoint = iCS.getDataPoints().addDataPointForDoughnutSeries(workBook.getCell(0, categoryIndex + 1, i + 1, 1));
                    dataPoint.getFormat().getFill().setFillType(FillType.Solid);
                    dataPoint.getFormat().getLine().getFillFormat().setFillType(FillType.Solid);
                    dataPoint.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(java.awt.Color.WHITE);
                    dataPoint.getFormat().getLine().setWidth(1);
                    dataPoint.getFormat().getLine().setStyle(LineStyle.Single);
                    dataPoint.getFormat().getLine().setDashStyle(LineDashStyle.Solid);
                    if (i == chart.getChartData().getSeries().size() - 1) {
                        IDataLabel lbl = dataPoint.getLabel();
                        lbl.getTextFormat().getTextBlockFormat().setAutofitType(TextAutofitType.Shape);
                        lbl.getDataLabelFormat().getTextFormat().getPortionFormat().setFontBold(NullableBool.True);
                        lbl.getDataLabelFormat().getTextFormat().getPortionFormat().setLatinFont(new FontData("DINPro-Bold"));
                        lbl.getDataLabelFormat().getTextFormat().getPortionFormat().setFontHeight(12);
                        lbl.getDataLabelFormat().getTextFormat().getPortionFormat().getFillFormat().setFillType(FillType.Solid);
                        lbl.getDataLabelFormat().getTextFormat().getPortionFormat().getFillFormat().getSolidFillColor().setColor(java.awt.Color.LIGHT_GRAY);
                        lbl.getDataLabelFormat().getFormat().getLine().getFillFormat().getSolidFillColor().setColor(java.awt.Color.WHITE);
                        lbl.getDataLabelFormat().setShowValue(false);
                        lbl.getDataLabelFormat().setShowCategoryName(true);
                        lbl.getDataLabelFormat().setShowSeriesName(false);
                        //lbl.getDataLabelFormat().setShowLabelAsDataCallout(true);
                        lbl.getDataLabelFormat().setShowLeaderLines(true);
                        lbl.getDataLabelFormat().setShowLabelAsDataCallout(false);
                        chart.validateChartLayout();
                        lbl.setX(lbl.getX() + (float) 0.5);
                        lbl.setY(lbl.getY() + (float) 0.5);
                    }
                    i++;
                }
                categoryIndex++;
            }
            pres.save(dataDir + "chart.pptx", SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddDoughnutCallout
    }
}