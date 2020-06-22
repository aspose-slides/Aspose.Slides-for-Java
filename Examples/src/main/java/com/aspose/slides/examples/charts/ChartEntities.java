package com.aspose.slides.examples.charts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.io.File;


public class ChartEntities
{
    public static void main(String[] args)
    {
        //ExStart:ChartEntities
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Charts();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiating presentation// Instantiating presentation
        Presentation pres = new Presentation();
        try
        {
            // Accessing the first slide
            ISlide slide = pres.getSlides().get_Item(0);

            // Adding the sample chart
            IChart chart = slide.getShapes().addChart(ChartType.LineWithMarkers, 50, 50, 500, 400);

            // Setting Chart Titile
            chart.setTitle(true);
            chart.getChartTitle().addTextFrameForOverriding("");
            IPortion chartTitle = chart.getChartTitle().getTextFrameForOverriding().getParagraphs().get_Item(0).getPortions().get_Item(0);
            chartTitle.setText("Sample Chart");
            chartTitle.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
            chartTitle.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.GRAY);
            chartTitle.getPortionFormat().setFontHeight(20);
            chartTitle.getPortionFormat().setFontBold(NullableBool.True);
            chartTitle.getPortionFormat().setFontItalic(NullableBool.True);

            // Setting Major grid lines format for value axis
            chart.getAxes().getVerticalAxis().getMajorGridLinesFormat().getLine().getFillFormat().setFillType(FillType.Solid);
            chart.getAxes().getVerticalAxis().getMajorGridLinesFormat().getLine().getFillFormat().getSolidFillColor().setColor(Color.BLUE);
            chart.getAxes().getVerticalAxis().getMajorGridLinesFormat().getLine().setWidth(5);
            chart.getAxes().getVerticalAxis().getMajorGridLinesFormat().getLine().setDashStyle(LineDashStyle.DashDot);

            // Setting Minor grid lines format for value axis
            chart.getAxes().getVerticalAxis().getMinorGridLinesFormat().getLine().getFillFormat().setFillType(FillType.Solid);
            chart.getAxes().getVerticalAxis().getMinorGridLinesFormat().getLine().getFillFormat().getSolidFillColor().setColor(Color.RED);
            chart.getAxes().getVerticalAxis().getMinorGridLinesFormat().getLine().setWidth(3);

            // Setting value axis number format
            chart.getAxes().getVerticalAxis().setNumberFormatLinkedToSource(false);
            chart.getAxes().getVerticalAxis().setDisplayUnit(DisplayUnitType.Thousands);
            chart.getAxes().getVerticalAxis().setNumberFormat("0.0%");

            // Setting chart maximum, minimum values
            chart.getAxes().getVerticalAxis().setAutomaticMajorUnit(false);
            chart.getAxes().getVerticalAxis().setAutomaticMaxValue(false);
            chart.getAxes().getVerticalAxis().setAutomaticMinorUnit(false);
            chart.getAxes().getVerticalAxis().setAutomaticMinValue(false);

            chart.getAxes().getVerticalAxis().setMaxValue(15f);
            chart.getAxes().getVerticalAxis().setMinValue(-2f);
            chart.getAxes().getVerticalAxis().setMinorUnit(0.5f);
            chart.getAxes().getVerticalAxis().setMajorUnit(2.0f);

            // Setting Value Axis Text Properties
            IChartPortionFormat txtVal = chart.getAxes().getVerticalAxis().getTextFormat().getPortionFormat();
            txtVal.setFontBold(NullableBool.True);
            txtVal.setFontHeight(16);
            txtVal.setFontItalic(NullableBool.True);
            txtVal.getFillFormat().setFillType(FillType.Solid);
            txtVal.getFillFormat().getSolidFillColor().setColor(Color.GREEN);
            txtVal.setLatinFont(new FontData("Times New Roman"));

            // Setting value axis title
            chart.getAxes().getVerticalAxis().setTitle(true);
            chart.getAxes().getVerticalAxis().getTitle().addTextFrameForOverriding("");
            IPortion valtitle = chart.getAxes().getVerticalAxis().getTitle().getTextFrameForOverriding().getParagraphs().get_Item(0).getPortions().get_Item(0);
            valtitle.setText("Primary Axis");
            valtitle.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
            valtitle.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.GRAY);
            valtitle.getPortionFormat().setFontHeight(20);
            valtitle.getPortionFormat().setFontBold(NullableBool.True);
            valtitle.getPortionFormat().setFontItalic(NullableBool.True);

            // Setting value axis line format : Now Obselete
            // chart.getAxes().getVerticalAxis().aVerticalAxis.l.AxisLine.setWidth(10);
            // chart.getAxes().getVerticalAxis().AxisLine.getFillFormat().setFillType(FillType.Solid);
            // Chart.getAxes().getVerticalAxis().AxisLine.getFillFormat().getSolidFillColor().Color = Color.Red;

            // Setting Major grid lines format for Category axis
            chart.getAxes().getHorizontalAxis().getMajorGridLinesFormat().getLine().getFillFormat().setFillType(FillType.Solid);
            chart.getAxes().getHorizontalAxis().getMajorGridLinesFormat().getLine().getFillFormat().getSolidFillColor().setColor(Color.GREEN);
            chart.getAxes().getHorizontalAxis().getMajorGridLinesFormat().getLine().setWidth(5);

            // Setting Minor grid lines format for Category axis
            chart.getAxes().getHorizontalAxis().getMinorGridLinesFormat().getLine().getFillFormat().setFillType(FillType.Solid);
            chart.getAxes().getHorizontalAxis().getMinorGridLinesFormat().getLine().getFillFormat().getSolidFillColor().setColor(Color.YELLOW);
            chart.getAxes().getHorizontalAxis().getMinorGridLinesFormat().getLine().setWidth(3);

            // Setting Category Axis Text Properties
            IChartPortionFormat txtCat = chart.getAxes().getHorizontalAxis().getTextFormat().getPortionFormat();
            txtCat.setFontBold(NullableBool.True);
            txtCat.setFontHeight(16);
            txtCat.setFontItalic(NullableBool.True);
            txtCat.getFillFormat().setFillType(FillType.Solid);
            txtCat.getFillFormat().getSolidFillColor().setColor(Color.BLUE);
            txtCat.setLatinFont(new FontData("Arial"));

            // Setting Category Titile
            chart.getAxes().getHorizontalAxis().setTitle(true);
            chart.getAxes().getHorizontalAxis().getTitle().addTextFrameForOverriding("");

            IPortion catTitle = chart.getAxes().getHorizontalAxis().getTitle().getTextFrameForOverriding().getParagraphs().get_Item(0).getPortions().get_Item(0);
            catTitle.setText("Sample Category");
            catTitle.getPortionFormat().getFillFormat().setFillType(FillType.Solid);
            catTitle.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Color.GRAY);
            catTitle.getPortionFormat().setFontHeight(20);
            catTitle.getPortionFormat().setFontBold(NullableBool.True);
            catTitle.getPortionFormat().setFontItalic(NullableBool.True);

            // Setting category axis lable position
            chart.getAxes().getHorizontalAxis().setTickLabelPosition(TickLabelPositionType.Low);

            // Setting category axis lable rotation angle
            chart.getAxes().getHorizontalAxis().setTickLabelRotationAngle(45);

            // Setting Legends Text Properties
            IChartPortionFormat txtleg = chart.getLegend().getTextFormat().getPortionFormat();
            txtleg.setFontBold(NullableBool.True);
            txtleg.setFontHeight(16);
            txtleg.setFontItalic(NullableBool.True);
            txtleg.getFillFormat().setFillType(FillType.Solid);
            txtleg.getFillFormat().getSolidFillColor().setColor(Color.RED);

            // Set show chart legends without overlapping chart

            chart.getLegend().setOverlay(true);

            // Ploting first series on secondary value axis
            // Chart.getChartData().getSeries().get_Item(0).PlotOnSecondAxis = true;

            // Setting chart back wall color
            chart.getBackWall().setThickness(1);
            chart.getBackWall().getFormat().getFill().setFillType(FillType.Solid);
            chart.getBackWall().getFormat().getFill().getSolidFillColor().setColor(Color.ORANGE);

            chart.getFloor().getFormat().getFill().setFillType(FillType.Solid);
            chart.getFloor().getFormat().getFill().getSolidFillColor().getColor();
            // Setting Plot area color
            chart.getPlotArea().getFormat().getFill().setFillType(FillType.Solid);
            chart.getPlotArea().getFormat().getFill().getSolidFillColor().setColor(new Color(PresetColor.LightCyan));

            // Save Presentation
            pres.save(dataDir + "FormattedChart_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ChartEntities
    }
}
