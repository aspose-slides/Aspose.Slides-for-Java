/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithcharts.formattingchartentities.java;

import com.aspose.slides.*;

public class FormattingChartEntities
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithcharts/formattingchartentities/data/";

        //Instantiating presentation
        PresentationEx pres = new PresentationEx();

        //Accessing the first slide
        SlideEx slide = pres.getSlides().get_Item(0);

        //Adding the sample chart
        ChartEx chart = slide.getShapes().addChart(ChartTypeEx.LineWithMarkers, 50, 50, 500, 400);

        //Setting Chart Titile
        chart.hasTitle(true);
        PortionEx chartTitle = chart.getChartTitle().getText().getParagraphs().get_Item(0).getPortions().get_Item(0);
        chartTitle.setText("Sample Chart");
        chartTitle.getPortionFormat().getFillFormat().setFillType(FillTypeEx.Solid);
        chartTitle.getPortionFormat().getFillFormat().getSolidFillColor().setPresetColor(PresetColorEx.Gray);
        chartTitle.getPortionFormat().setFontHeight((float)20);
        chartTitle.getPortionFormat().setFontBold(NullableBool.True);
        chartTitle.getPortionFormat().setFontItalic(NullableBool.True);

        //Setting Major grid lines format for value axis
        chart.getValueAxis().getMajorGridLines().getFillFormat().setFillType(FillTypeEx.Solid);
        chart.getValueAxis().getMajorGridLines().getFillFormat().getSolidFillColor().setPresetColor(PresetColorEx.Blue);
        chart.getValueAxis().getMajorGridLines().setWidth((float)5);

        //Setting Minor grid lines format for value axis
        chart.getValueAxis().getMinorGridLines().getFillFormat().setFillType(FillTypeEx.Solid);
        chart.getValueAxis().getMinorGridLines().getFillFormat().getSolidFillColor().setPresetColor(PresetColorEx.Red);
        chart.getValueAxis().getMinorGridLines().setWidth ((float)3);

        //Setting value axis number format
        chart.getValueAxis().setSourceLinked (false);
        chart.getValueAxis().setDisplayUnit(DisplayUnitType.Thousands);
        chart.getValueAxis().setNumberFormat( "0.0%");

        //Setting chart maximum, minimum values
        chart.getValueAxis().isAutomaticMajorUnit(false);
        chart.getValueAxis().isAutomaticMaxValue(false);
        chart.getValueAxis().isAutomaticMinorUnit(false);
        chart.getValueAxis().isAutomaticMinValue(false);

        chart.getValueAxis().setMaxValue(15f);
        chart.getValueAxis().setMinValue( -2f);
        chart.getValueAxis().setMinorUnit(0.5f);
        chart.getValueAxis().setMajorUnit(2.0f);

        //Setting Value Axis Text Properties
        TextFrameEx txtVal = chart.getValueAxis().getTextProperties();
        PortionFormatEx format= txtVal.getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat();
        format.setFontBold(NullableBool.True);
        format.setFontHeight(16);
        format.setFontItalic(NullableBool.True);
        format.getFillFormat().setFillType( FillTypeEx.Solid);
        format.getFillFormat().getSolidFillColor().setPresetColor(PresetColorEx.DarkGreen);
        format.setLatinFont(new FontDataEx("Times New Roman"));

        //Setting value axis title
        chart.getValueAxis().hasTitle(true);
        PortionEx valtitle = chart.getValueAxis().getTitle().getText().getParagraphs().get_Item(0).getPortions().get_Item(0);
        valtitle.setText("Primary Axis");
        valtitle.getPortionFormat().getFillFormat().setFillType(FillTypeEx.Solid);
        valtitle.getPortionFormat().getFillFormat().getSolidFillColor().setPresetColor(PresetColorEx.Gray);
        valtitle.getPortionFormat().setFontHeight( 20);
        valtitle.getPortionFormat().setFontBold (NullableBool.True);
        valtitle.getPortionFormat().setFontItalic( NullableBool.True);

        //Setting value axis line format
        chart.getValueAxis().getAxisLine().setWidth((float)10);
        chart.getValueAxis().getAxisLine().getFillFormat().setFillType( FillTypeEx.Solid);
        chart.getValueAxis().getAxisLine().getFillFormat().getSolidFillColor().setPresetColor ( PresetColorEx.Red);

        //Setting Major grid lines format for Category axis
        chart.getCategoryAxis().getMajorGridLines().getFillFormat().setFillType(FillTypeEx.Solid);
        chart.getCategoryAxis().getMajorGridLines().getFillFormat().getSolidFillColor().setPresetColor(PresetColorEx.Green);
        chart.getCategoryAxis().getMajorGridLines().setWidth(5);

        //Setting Minor grid lines format for Category axis
        chart.getCategoryAxis().getMinorGridLines().getFillFormat().setFillType(FillTypeEx.Solid);
        chart.getCategoryAxis().getMinorGridLines().getFillFormat().getSolidFillColor().setPresetColor(PresetColorEx.Yellow);
        chart.getCategoryAxis().getMinorGridLines().setWidth(3);

        //Setting Category Axis Text Properties
        TextFrameEx txtCat = chart.getCategoryAxis().getTextProperties();
        format=txtCat.getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat();
        format.setFontBold(NullableBool.True);
        format.setFontHeight (16);
        format.setFontItalic( NullableBool.True);
        format.getFillFormat().setFillType(FillTypeEx.Solid) ;
        format.getFillFormat().getSolidFillColor().setPresetColor(PresetColorEx.Blue);
        format.setLatinFont(new FontDataEx("Arial"));

        //Setting Category Titile
        chart.getCategoryAxis().hasTitle(true);
        PortionEx catTitle = chart.getCategoryAxis().getTitle().getText().getParagraphs().get_Item(0).getPortions().get_Item(0);
        catTitle.setText("Sample Category");
        catTitle.getPortionFormat().getFillFormat().setFillType(FillTypeEx.Solid);
        catTitle.getPortionFormat().getFillFormat().getSolidFillColor().setPresetColor(PresetColorEx.Gray);
        catTitle.getPortionFormat().setFontHeight( 20);
        catTitle.getPortionFormat().setFontBold(NullableBool.True);
        catTitle.getPortionFormat().setFontItalic(NullableBool.True);

        //Setting category axis lable position
        chart.getCategoryAxis().setTickLabelPosition(TickLabelPositionType.Low);

        //Setting category axis lable rotation angle
        //chart.getCategoryAxis().setRotationAngle(45);->>will be added in Aspose.Slides for Java 7.1.0 and onwards

        //Setting Legends Text Properties
        TextFrameEx txtleg = chart.getLegend().getTextProperties();
        format=txtleg.getParagraphs().get_Item(0).getParagraphFormat().getDefaultPortionFormat();
        format.setFontBold(NullableBool.True);
        format.setFontHeight(16);
        format.setFontItalic(NullableBool.True);
        format.getFillFormat().setFillType(FillTypeEx.Solid);
        format.getFillFormat().getSolidFillColor().setPresetColor( PresetColorEx.DarkRed);

        //Set show chart legends without overlapping chart
        chart.getLegend().setOverlay(true);

        //Setting secondary value axis
        chart.getSecondValueAxis().isVisible(true);
        chart.getSecondValueAxis().getAxisLine().setStyle(LineStyleEx.ThickBetweenThin);
        chart.getSecondValueAxis().getAxisLine().setWidth(20);

        //Setting secondary value axis Number format
        chart.getSecondValueAxis().setSourceLinked(false);
        chart.getSecondValueAxis().setDisplayUnit(DisplayUnitType.Hundreds);
        chart.getSecondValueAxis().setNumberFormat("0.0%");

        //Setting chart maximum, minimum values
        chart.getSecondValueAxis().isAutomaticMajorUnit(false);
        chart.getSecondValueAxis().isAutomaticMaxValue(false);
        chart.getSecondValueAxis().isAutomaticMinorUnit(false);
        chart.getSecondValueAxis().isAutomaticMinValue(false);

        chart.getSecondValueAxis().setMaxValue(20f);
        chart.getSecondValueAxis().setMinValue(-5f);
        chart.getSecondValueAxis().setMinorUnit(0.5f);
        chart.getSecondValueAxis().setMajorUnit(2.0f);

        //Ploting first series on secondary value axis
        chart.getChartData().getSeries().get_Item(0).setPlotOnSecondAxis(true);

        //Setting chart back wall color
        chart.getChartFormat().getFill().setFillType(FillTypeEx.Solid);
        chart.getChartFormat().getFill().getSolidFillColor().setPresetColor(PresetColorEx.Orange);

        //Setting Plot area color
        chart.getPlotArea().getFormat().getFill().setFillType(FillTypeEx.Solid);
        chart.getPlotArea().getFormat().getFill().getSolidFillColor().setPresetColor(PresetColorEx.LightCyan);

        //Save Presentation
        pres.write(dataDir + "ChartAxis.pptx");

        // Status
        System.out.println("Chart updated successfully.");
    }
}




