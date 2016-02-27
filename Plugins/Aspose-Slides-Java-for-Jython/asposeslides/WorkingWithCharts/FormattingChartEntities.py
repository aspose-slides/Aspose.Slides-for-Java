from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import ChartType
from com.aspose.slides import SaveFormat
from com.aspose.slides import FillType
from com.aspose.slides import NullableBool
from com.aspose.slides import LineDashStyle
from java.awt import Color
from com.aspose.slides import DisplayUnitType
from com.aspose.slides import FontData
from com.aspose.slides import PresetColor
from com.aspose.slides import TickLabelPositionType
from com.aspose.slides import LineStyle

class FormattingChartEntities:

    def __init__(self):
        
        dataDir = Settings.dataDir + 'WorkingWithCharts/FormattingChartEntities/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Presentation()

        # Accessing the first slide
        slide = pres.getSlides().get_Item(0)

        # Adding the sample chart
        chartType=ChartType
        chart = slide.getShapes().addChart(chartType.LineWithMarkers, 50, 50, 500, 400)

        # Setting Chart Titile
        chart.hasTitle()
        chart.getChartTitle().addTextFrameForOverriding("")
        chartTitle = chart.getChartTitle().getTextFrameForOverriding().getParagraphs().get_Item(0).getPortions().get_Item(0)
        chartTitle.setText("Sample Chart")

        fillType=FillType
        color=Color
        nullableBool=NullableBool
        lineDashStyle=LineDashStyle

        chartTitle.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        chartTitle.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.GRAY)
        chartTitle.getPortionFormat().setFontHeight (20)
        chartTitle.getPortionFormat().setFontBold(nullableBool.True)
        chartTitle.getPortionFormat().setFontItalic(nullableBool.True)

        # Setting Major grid lines format for value axis
        chart.getAxes().getVerticalAxis().getMajorGridLinesFormat().getLine().getFillFormat().setFillType(fillType.Solid)
        chart.getAxes().getVerticalAxis().getMajorGridLinesFormat().getLine().getFillFormat().getSolidFillColor().setColor(color.BLUE)
        chart.getAxes().getVerticalAxis().getMajorGridLinesFormat().getLine().setWidth(5)
        chart.getAxes().getVerticalAxis().getMajorGridLinesFormat().getLine().setDashStyle(lineDashStyle.DashDot)

        # Setting Minor grid lines format for value axis
        chart.getAxes().getVerticalAxis().getMinorGridLinesFormat().getLine().getFillFormat().setFillType(fillType.Solid)
        chart.getAxes().getVerticalAxis().getMinorGridLinesFormat().getLine().getFillFormat().getSolidFillColor().setColor(color.RED)
        chart.getAxes().getVerticalAxis().getMinorGridLinesFormat().getLine().setWidth(3)

        # Setting value axis number format

        displayUnitType=DisplayUnitType
        chart.getAxes().getVerticalAxis().isNumberFormatLinkedToSource()
        chart.getAxes().getVerticalAxis().setDisplayUnit(displayUnitType.Thousands)
        chart.getAxes().getVerticalAxis().setNumberFormat("0.0%")

        # Setting chart maximum, minimum values
        chart.getAxes().getVerticalAxis().isAutomaticMajorUnit()
        chart.getAxes().getVerticalAxis().isAutomaticMaxValue()
        chart.getAxes().getVerticalAxis().isAutomaticMinorUnit()
        chart.getAxes().getVerticalAxis().isAutomaticMinValue()

        chart.getAxes().getVerticalAxis().setMaxValue(15)
        chart.getAxes().getVerticalAxis().setMinValue(-2)
        chart.getAxes().getVerticalAxis().setMinorUnit(0.5)
        chart.getAxes().getVerticalAxis().setMajorUnit(2.0)

        # Setting Value Axis Text Properties

        fontData=FontData
        presetColor=PresetColor

        txtVal = chart.getAxes().getVerticalAxis().getTextFormat().getPortionFormat()
        txtVal.setFontBold(nullableBool.True)
        txtVal.setFontHeight(16)
        txtVal.setFontItalic(nullableBool.True)
        txtVal.getFillFormat().setFillType(fillType.Solid)
        txtVal.getFillFormat().getSolidFillColor().setColor(Color(presetColor.DarkGreen))
        txtVal.setLatinFont(FontData("Times New Roman"))

        # Setting value axis title
        chart.getAxes().getVerticalAxis().hasTitle()
        chart.getAxes().getVerticalAxis().getTitle().addTextFrameForOverriding("")
        valtitle = chart.getAxes().getVerticalAxis().getTitle().getTextFrameForOverriding().getParagraphs().get_Item(0).getPortions().get_Item(0)
        valtitle.setText("Primary Axis")
        valtitle.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        valtitle.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.GRAY)
        valtitle.getPortionFormat().setFontHeight(20)
        valtitle.getPortionFormat().setFontBold(nullableBool.True)
        valtitle.getPortionFormat().setFontItalic(nullableBool.True)

        # Setting Major grid lines format for Category axis
        chart.getAxes().getHorizontalAxis().getMajorGridLinesFormat().getLine().getFillFormat().setFillType(fillType.Solid)
        chart.getAxes().getHorizontalAxis().getMajorGridLinesFormat().getLine().getFillFormat().getSolidFillColor().setColor(color.GREEN)
        chart.getAxes().getHorizontalAxis().getMajorGridLinesFormat().getLine().setWidth(5)

        # Setting Minor grid lines format for Category axis
        chart.getAxes().getHorizontalAxis().getMinorGridLinesFormat().getLine().getFillFormat().setFillType(fillType.Solid)
        chart.getAxes().getHorizontalAxis().getMinorGridLinesFormat().getLine().getFillFormat().getSolidFillColor().setColor(color.YELLOW)
        chart.getAxes().getHorizontalAxis().getMinorGridLinesFormat().getLine().setWidth(3)

        #Setting Category Axis Text Properties
        txtCat = chart.getAxes().getHorizontalAxis().getTextFormat().getPortionFormat()
        txtCat.setFontBold(nullableBool.True)
        txtCat.setFontHeight(16)
        txtCat.setFontItalic(nullableBool.True)
        txtCat.getFillFormat().setFillType(fillType.Solid)
        txtCat.getFillFormat().getSolidFillColor().setColor(color.BLUE)
        txtCat.setLatinFont(FontData("Arial"))

        # Setting Category Titile
        chart.getAxes().getHorizontalAxis().hasTitle()
        chart.getAxes().getHorizontalAxis().getTitle().addTextFrameForOverriding("")

        catTitle = chart.getAxes().getHorizontalAxis().getTitle().getTextFrameForOverriding().getParagraphs().get_Item(0).getPortions().get_Item(0)
        catTitle.setText("Sample Category")
        catTitle.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        catTitle.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.GRAY)
        catTitle.getPortionFormat().setFontHeight(20)
        catTitle.getPortionFormat().setFontBold(nullableBool.True)
        catTitle.getPortionFormat().setFontItalic(nullableBool.True)

        # Setting category axis lable position
        tickLabelPositionType = TickLabelPositionType
        chart.getAxes().getHorizontalAxis().setTickLabelPosition(tickLabelPositionType.Low)

        # Setting category axis lable rotation angle
        chart.getAxes().getHorizontalAxis().setTickLabelRotationAngle(45)

        # Setting Legends Text Properties
        txtleg = chart.getLegend().getTextFormat().getPortionFormat()
        txtleg.setFontBold(nullableBool.True)
        txtleg.setFontHeight(16)
        txtleg.setFontItalic(nullableBool.True)
        txtleg.getFillFormat().setFillType(fillType.Solid)
        txtleg.getFillFormat().getSolidFillColor().setColor(Color(presetColor.DarkRed))

        # Set show chart legends without overlapping chart
        chart.getLegend().setOverlay(True)
        #chart.ChartData.Series[0].PlotOnSecondAxis=True
        chart.getChartData().getSeries().get_Item(0).setPlotOnSecondAxis(True)

        # Setting secondary value axis
        lineStyle = LineStyle
        chart.getAxes().getSecondaryVerticalAxis().isVisible()
        chart.getAxes().getSecondaryVerticalAxis().getFormat().getLine().setStyle(lineStyle.ThickBetweenThin)
        chart.getAxes().getSecondaryVerticalAxis().getFormat().getLine().setWidth(20)

        # Setting secondary value axis Number format
        chart.getAxes().getSecondaryVerticalAxis().isNumberFormatLinkedToSource()
        displayUnitType=DisplayUnitType
        chart.getAxes().getSecondaryVerticalAxis().setDisplayUnit(displayUnitType.Hundreds)
        chart.getAxes().getSecondaryVerticalAxis().setNumberFormat ("0.0%")

        # Setting chart maximum, minimum values
        chart.getAxes().getSecondaryVerticalAxis().isAutomaticMajorUnit()
        chart.getAxes().getSecondaryVerticalAxis().isAutomaticMaxValue()
        chart.getAxes().getSecondaryVerticalAxis().isAutomaticMinorUnit()
        chart.getAxes().getSecondaryVerticalAxis().isAutomaticMinValue()

        chart.getAxes().getSecondaryVerticalAxis().setMaxValue(20)
        chart.getAxes().getSecondaryVerticalAxis().setMinValue(-5)
        chart.getAxes().getSecondaryVerticalAxis().setMinorUnit(0.5)
        chart.getAxes().getSecondaryVerticalAxis().setMajorUnit(2.0)


        # Setting chart back wall color
        chart.getBackWall().setThickness(1)
        chart.getBackWall().getFormat().getFill().setFillType(fillType.Solid)
        chart.getBackWall().getFormat().getFill().getSolidFillColor().setColor(color.ORANGE)

        chart.getFloor().getFormat().getFill().setFillType(fillType.Solid)
        chart.getFloor().getFormat().getFill().getSolidFillColor().setColor(color.RED)

        # Setting Plot area color
        chart.getPlotArea().getFormat().getFill().setFillType(fillType.Solid)
        chart.getPlotArea().getFormat().getFill().getSolidFillColor().setColor(Color(presetColor.LightCyan))

        # Save Presentation
        save_format = SaveFormat
        pres.save(dataDir + "FormattedChart.pptx", save_format.Pptx)

        print "Formatted chart entities, please check the output file."

if __name__ == '__main__':        
    FormattingChartEntities()