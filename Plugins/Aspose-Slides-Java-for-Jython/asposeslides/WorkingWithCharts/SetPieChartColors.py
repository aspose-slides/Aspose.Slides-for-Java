from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import ChartType
from com.aspose.slides import SaveFormat
from com.aspose.slides import NullableBool
from com.aspose.slides import FillType
from com.aspose.slides import LineStyle
from java.awt import Color
from com.aspose.slides import LineDashStyle
from com.aspose.slides import PresetColor

class SetPieChartColors:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'WorkingWithCharts/SetPieChartColors/'
        
        pres = Presentation()

        # Access first slide
        sld = pres.getSlides().get_Item(0)

        # Add chart with default data
        chart_type = ChartType
        chart = sld.getShapes().addChart(chart_type.Pie, 100, 100, 400, 400)

        nullableBool=NullableBool

        # Setting chart Title
        chart.getChartTitle().addTextFrameForOverriding("Sample Title")
        chart.getChartTitle().getTextFrameForOverriding().getTextFrameFormat().setCenterText(nullableBool.True)
        chart.getChartTitle().setHeight(20)
        chart.hasTitle()

        # Set first series to Show Values
        chart.getChartData().getSeries().get_Item(0).getLabels().getDefaultDataLabelFormat().setShowValue(True)

        # Setting the index of chart data sheet
        defaultWorksheetIndex = 0

        # Getting the chart data worksheet
        fact = chart.getChartData().getChartDataWorkbook()

        # Delete default generated series and categories
        chart.getChartData().getSeries().clear()
        chart.getChartData().getCategories().clear()

        # Adding categories
        chart.getChartData().getCategories().add(fact.getCell(0, 1, 0, "First Qtr"))
        chart.getChartData().getCategories().add(fact.getCell(0, 2, 0, "2nd Qtr"))
        chart.getChartData().getCategories().add(fact.getCell(0, 3, 0, "3rd Qtr"))

        # Adding series
        series = chart.getChartData().getSeries().add(fact.getCell(0, 0, 1, "Series 1"), chart.getType())

        # Now populating series data
        series.getDataPoints().addDataPointForPieSeries(fact.getCell(defaultWorksheetIndex, 1, 1, 20))
        series.getDataPoints().addDataPointForPieSeries(fact.getCell(defaultWorksheetIndex, 2, 1, 50))
        series.getDataPoints().addDataPointForPieSeries(fact.getCell(defaultWorksheetIndex, 3, 1, 30))

        # Not working in version
        # Adding points and setting sector color
        chart.getChartData().getSeriesGroups().get_Item(0).isColorVaried()

        fill_type = FillType
        line_style = LineStyle
        color = Color
        line_dash_style = LineDashStyle
        preset_color = PresetColor

        point = series.getDataPoints().get_Item(0)
        point.getFormat().getFill().setFillType(fill_type.Solid)
        point.getFormat().getFill().getSolidFillColor().setColor(color.CYAN)

        # Setting Sector border
        point.getFormat().getLine().getFillFormat().setFillType(fill_type.Solid)
        point.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(color.GRAY)
        point.getFormat().getLine().setWidth(3.0)
        point.getFormat().getLine().setStyle(line_style.ThinThick)
        point.getFormat().getLine().setDashStyle(line_dash_style.DashDot)


        point1 = series.getDataPoints().get_Item(1)
        point1.getFormat().getFill().setFillType(fill_type.Solid)
        point1.getFormat().getFill().getSolidFillColor().setColor(Color(preset_color.Brown))

        # Setting Sector border
        point1.getFormat().getLine().getFillFormat().setFillType(fill_type.Solid)
        point1.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(color.BLUE)
        point1.getFormat().getLine().setWidth(3.0)
        point1.getFormat().getLine().setStyle(line_style.Single)
        point1.getFormat().getLine().setDashStyle(line_dash_style.LargeDashDot)

        point2 = series.getDataPoints().get_Item(2)
        point2.getFormat().getFill().setFillType(fill_type.Solid)
        point2.getFormat().getFill().getSolidFillColor().setColor(Color(preset_color.Coral))

        # Setting Sector border
        point2.getFormat().getLine().getFillFormat().setFillType(fill_type.Solid)
        point2.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(color.RED)
        point2.getFormat().getLine().setWidth(2.0)
        point2.getFormat().getLine().setStyle(line_style.ThinThin)
        point2.getFormat().getLine().setDashStyle(line_dash_style.LargeDashDotDot)

        # Create custom labels for each of categories for series
        lbl1 = series.getDataPoints().get_Item(0).getLabel()

        lbl1.getDataLabelFormat().setShowValue(True)

        lbl2 = series.getDataPoints().get_Item(1).getLabel()
        lbl2.getDataLabelFormat().setShowValue (True)
        lbl2.getDataLabelFormat().setShowLegendKey(True)
        lbl2.getDataLabelFormat().setShowPercentage(True)

        lbl3 = series.getDataPoints().get_Item(2).getLabel()
        lbl3.getDataLabelFormat().setShowSeriesName(True)
        lbl3.getDataLabelFormat().setShowPercentage (True)

        # Showing Leader Lines for Chart
        series.getLabels().getDefaultDataLabelFormat().setShowLeaderLines(True)

        # Setting Rotation Angle for Pie Chart Sectors
        chart.getChartData().getSeriesGroups().get_Item(0).setFirstSliceAngle(180)

        # Save presentation with chart
        save_format = SaveFormat
        pres.save(dataDir + "AsposePieChart.pptx", save_format.Pptx)

        print "Set pie chart sector colors, please check the output file."

if __name__ == '__main__':        
    SetPieChartColors()