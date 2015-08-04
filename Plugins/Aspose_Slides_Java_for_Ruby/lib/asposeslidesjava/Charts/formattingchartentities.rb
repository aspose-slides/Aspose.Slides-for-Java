module Asposeslidesjava
  module FormattingChartEntities
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Accessing the first slide
        slide = pres.getSlides().get_Item(0)

        # Adding the sample chart
        chart = slide.getShapes().addChart(Rjb::import('com.aspose.slides.ChartType').LineWithMarkers, 50, 50, 500, 400)

        # Setting Chart Titile
        chart.hasTitle(true)
        chart.getChartTitle().addTextFrameForOverriding("")
        chartTitle = chart.getChartTitle().getTextFrameForOverriding().getParagraphs().get_Item(0).getPortions().get_Item(0)
        chartTitle.setText("Sample Chart")
        chartTitle.getPortionFormat().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        chartTitle.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').GRAY)
        chartTitle.getPortionFormat().setFontHeight (20)
        chartTitle.getPortionFormat().setFontBold(Rjb::import('com.aspose.slides.NullableBool').True)
        chartTitle.getPortionFormat().setFontItalic(Rjb::import('com.aspose.slides.NullableBool').True)

        # Setting Major grid lines format for value axis
        chart.getAxes().getVerticalAxis().getMajorGridLinesFormat().getLine().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        chart.getAxes().getVerticalAxis().getMajorGridLinesFormat().getLine().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').BLUE)
        chart.getAxes().getVerticalAxis().getMajorGridLinesFormat().getLine().setWidth(5)
        chart.getAxes().getVerticalAxis().getMajorGridLinesFormat().getLine().setDashStyle(Rjb::import('com.aspose.slides.LineDashStyle').DashDot)

        # Setting Minor grid lines format for value axis
        chart.getAxes().getVerticalAxis().getMinorGridLinesFormat().getLine().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        chart.getAxes().getVerticalAxis().getMinorGridLinesFormat().getLine().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').RED)
        chart.getAxes().getVerticalAxis().getMinorGridLinesFormat().getLine().setWidth(3)

        # Setting value axis number format
        chart.getAxes().getVerticalAxis().isNumberFormatLinkedToSource(false)
        chart.getAxes().getVerticalAxis().setDisplayUnit(Rjb::import('com.aspose.slides.DisplayUnitType').Thousands)
        chart.getAxes().getVerticalAxis().setNumberFormat("0.0%")

        # Setting chart maximum, minimum values
        chart.getAxes().getVerticalAxis().isAutomaticMajorUnit(false)
        chart.getAxes().getVerticalAxis().isAutomaticMaxValue(false)
        chart.getAxes().getVerticalAxis().isAutomaticMinorUnit(false)
        chart.getAxes().getVerticalAxis().isAutomaticMinValue(false)

        chart.getAxes().getVerticalAxis().setMaxValue(15)
        chart.getAxes().getVerticalAxis().setMinValue(-2)
        chart.getAxes().getVerticalAxis().setMinorUnit(0.5)
        chart.getAxes().getVerticalAxis().setMajorUnit(2.0)

        # Setting Value Axis Text Properties
        txtVal = chart.getAxes().getVerticalAxis().getTextFormat().getPortionFormat()
        txtVal.setFontBold(Rjb::import('com.aspose.slides.NullableBool').True)
        txtVal.setFontHeight(16)
        txtVal.setFontItalic(Rjb::import('com.aspose.slides.NullableBool').True)
        txtVal.getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        txtVal.getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').new(Rjb::import('com.aspose.slides.PresetColor').DarkGreen))
        txtVal.setLatinFont(Rjb::import('com.aspose.slides.FontData').new("Times New Roman"))

        # Setting value axis title
        chart.getAxes().getVerticalAxis().hasTitle(true)
        chart.getAxes().getVerticalAxis().getTitle().addTextFrameForOverriding("")
        valtitle = chart.getAxes().getVerticalAxis().getTitle().getTextFrameForOverriding().getParagraphs().get_Item(0).getPortions().get_Item(0)
        valtitle.setText("Primary Axis")
        valtitle.getPortionFormat().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        valtitle.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').GRAY)
        valtitle.getPortionFormat().setFontHeight(20)
        valtitle.getPortionFormat().setFontBold(Rjb::import('com.aspose.slides.NullableBool').True)
        valtitle.getPortionFormat().setFontItalic(Rjb::import('com.aspose.slides.NullableBool').True)

        # Setting Major grid lines format for Category axis
        chart.getAxes().getHorizontalAxis().getMajorGridLinesFormat().getLine().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        chart.getAxes().getHorizontalAxis().getMajorGridLinesFormat().getLine().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').GREEN)
        chart.getAxes().getHorizontalAxis().getMajorGridLinesFormat().getLine().setWidth(5)

        # Setting Minor grid lines format for Category axis
        chart.getAxes().getHorizontalAxis().getMinorGridLinesFormat().getLine().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        chart.getAxes().getHorizontalAxis().getMinorGridLinesFormat().getLine().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').YELLOW)
        chart.getAxes().getHorizontalAxis().getMinorGridLinesFormat().getLine().setWidth(3)

        #Setting Category Axis Text Properties
        txtCat = chart.getAxes().getHorizontalAxis().getTextFormat().getPortionFormat()
        txtCat.setFontBold(Rjb::import('com.aspose.slides.NullableBool').True)
        txtCat.setFontHeight(16)
        txtCat.setFontItalic(Rjb::import('com.aspose.slides.NullableBool').True)
        txtCat.getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid) 
        txtCat.getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').BLUE)
        txtCat.setLatinFont(Rjb::import('com.aspose.slides.FontData').new("Arial"))

        # Setting Category Titile
        chart.getAxes().getHorizontalAxis().hasTitle(true)
        chart.getAxes().getHorizontalAxis().getTitle().addTextFrameForOverriding("")

        catTitle = chart.getAxes().getHorizontalAxis().getTitle().getTextFrameForOverriding().getParagraphs().get_Item(0).getPortions().get_Item(0)
        catTitle.setText("Sample Category")
        catTitle.getPortionFormat().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        catTitle.getPortionFormat().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').GRAY)
        catTitle.getPortionFormat().setFontHeight(20)
        catTitle.getPortionFormat().setFontBold(Rjb::import('com.aspose.slides.NullableBool').True)
        catTitle.getPortionFormat().setFontItalic(Rjb::import('com.aspose.slides.NullableBool').True)

        # Setting category axis lable position
        chart.getAxes().getHorizontalAxis().setTickLabelPosition(Rjb::import('com.aspose.slides.TickLabelPositionType').Low)

        # Setting category axis lable rotation angle
        chart.getAxes().getHorizontalAxis().setTickLabelRotationAngle(45)

        # Setting Legends Text Properties
        txtleg = chart.getLegend().getTextFormat().getPortionFormat()
        txtleg.setFontBold(Rjb::import('com.aspose.slides.NullableBool').True)
        txtleg.setFontHeight(16)
        txtleg.setFontItalic(Rjb::import('com.aspose.slides.NullableBool').True)
        txtleg.getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        txtleg.getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').new(Rjb::import('com.aspose.slides.PresetColor').DarkRed))

        # Set show chart legends without overlapping chart
        chart.getLegend().setOverlay(true)
        #chart.ChartData.Series[0].PlotOnSecondAxis=true;
        chart.getChartData().getSeries().get_Item(0).setPlotOnSecondAxis(true)

        # Setting secondary value axis
        chart.getAxes().getSecondaryVerticalAxis().isVisible(true)
        chart.getAxes().getSecondaryVerticalAxis().getFormat().getLine().setStyle(Rjb::import('com.aspose.slides.LineStyle').ThickBetweenThin)
        chart.getAxes().getSecondaryVerticalAxis().getFormat().getLine().setWidth(20)

        # Setting secondary value axis Number format
        chart.getAxes().getSecondaryVerticalAxis().isNumberFormatLinkedToSource(false)
        chart.getAxes().getSecondaryVerticalAxis().setDisplayUnit(Rjb::import('com.aspose.slides.DisplayUnitType').Hundreds)
        chart.getAxes().getSecondaryVerticalAxis().setNumberFormat ("0.0%")

        # Setting chart maximum, minimum values
        chart.getAxes().getSecondaryVerticalAxis().isAutomaticMajorUnit(false)
        chart.getAxes().getSecondaryVerticalAxis().isAutomaticMaxValue(false)
        chart.getAxes().getSecondaryVerticalAxis().isAutomaticMinorUnit(false)
        chart.getAxes().getSecondaryVerticalAxis().isAutomaticMinValue(false)

        chart.getAxes().getSecondaryVerticalAxis().setMaxValue(20)
        chart.getAxes().getSecondaryVerticalAxis().setMinValue(-5)
        chart.getAxes().getSecondaryVerticalAxis().setMinorUnit(0.5)
        chart.getAxes().getSecondaryVerticalAxis().setMajorUnit(2.0)


        # Setting chart back wall color
        chart.getBackWall().setThickness(1)
        chart.getBackWall().getFormat().getFill().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        chart.getBackWall().getFormat().getFill().getSolidFillColor().setColor(Rjb::import('java.awt.Color').ORANGE)

        chart.getFloor().getFormat().getFill().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        chart.getFloor().getFormat().getFill().getSolidFillColor().setColor(Rjb::import('java.awt.Color').RED)

        # Setting Plot area color
        chart.getPlotArea().getFormat().getFill().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        chart.getPlotArea().getFormat().getFill().getSolidFillColor().setColor(Rjb::import('java.awt.Color').new(Rjb::import('com.aspose.slides.PresetColor').LightCyan))

        # Save Presentation
        pres.save(data_dir + "FormattedChart.pptx", Rjb::import('com.aspose.slides.SaveFormat').Pptx)

        puts "Formatted chart entities, please check the output file."
    end    
  end
end
