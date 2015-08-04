module Asposeslidesjava    
    module SetPieChartColors
        def initialize()
            data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                    
            # Instantiate Presentation class that represents the presentation file
            pres = Rjb::import('com.aspose.slides.Presentation').new

            # Access first slide
            sld = pres.getSlides().get_Item(0)

            # Add chart with default data
            chart_type = Rjb::import('com.aspose.slides.ChartType')
            chart = sld.getShapes().addChart(chart_type.Pie, 100, 100, 400, 400)

            # Setting chart Title
            chart.getChartTitle().addTextFrameForOverriding("Sample Title")
            chart.getChartTitle().getTextFrameForOverriding().getTextFrameFormat().setCenterText(Rjb::import('com.aspose.slides.NullableBool').True)
            chart.getChartTitle().setHeight(20)
            chart.hasTitle(true)

            # Set first series to Show Values
            chart.getChartData().getSeries().get_Item(0).getLabels().getDefaultDataLabelFormat().setShowValue(true)

            # Setting the index of chart data sheet
            defaultWorksheetIndex = 0

            # Getting the chart data worksheet
            fact = chart.getChartData().getChartDataWorkbook()

            # Delete default generated series and categories
            chart.getChartData().getSeries().clear()
            chart.getChartData().getCategories().clear()

            # Adding new categories
            chart.getChartData().getCategories().add(fact.getCell(0, 1, 0, "First Qtr"))
            chart.getChartData().getCategories().add(fact.getCell(0, 2, 0, "2nd Qtr"))
            chart.getChartData().getCategories().add(fact.getCell(0, 3, 0, "3rd Qtr"))

            # Adding new series
            series = chart.getChartData().getSeries().add(fact.getCell(0, 0, 1, "Series 1"), chart.getType())

            # Now populating series data
            series.getDataPoints().addDataPointForPieSeries(fact.getCell(defaultWorksheetIndex, 1, 1, 20))
            series.getDataPoints().addDataPointForPieSeries(fact.getCell(defaultWorksheetIndex, 2, 1, 50))
            series.getDataPoints().addDataPointForPieSeries(fact.getCell(defaultWorksheetIndex, 3, 1, 30))

            # Not working in new version
            # Adding new points and setting sector color
            chart.getChartData().getSeriesGroups().get_Item(0).isColorVaried(true)

            fill_type = Rjb::import('com.aspose.slides.FillType')
            line_style = Rjb::import('com.aspose.slides.LineStyle')
            color = Rjb::import('java.awt.Color')
            line_dash_style = Rjb::import('com.aspose.slides.LineDashStyle')
            preset_color = Rjb::import('com.aspose.slides.PresetColor')

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
            point1.getFormat().getFill().getSolidFillColor().setColor(Rjb::import('java.awt.Color').new(preset_color.Brown))

            # Setting Sector border
            point1.getFormat().getLine().getFillFormat().setFillType(fill_type.Solid)
            point1.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(color.BLUE)
            point1.getFormat().getLine().setWidth(3.0)
            point1.getFormat().getLine().setStyle(line_style.Single)
            point1.getFormat().getLine().setDashStyle(line_dash_style.LargeDashDot)

            point2 = series.getDataPoints().get_Item(2)
            point2.getFormat().getFill().setFillType(fill_type.Solid)
            point2.getFormat().getFill().getSolidFillColor().setColor(Rjb::import('java.awt.Color').new(preset_color.Coral))

            # Setting Sector border
            point2.getFormat().getLine().getFillFormat().setFillType(fill_type.Solid)
            point2.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(color.RED)
            point2.getFormat().getLine().setWidth(2.0)
            point2.getFormat().getLine().setStyle(line_style.ThinThin)
            point2.getFormat().getLine().setDashStyle(line_dash_style.LargeDashDotDot)

            # Create custom labels for each of categories for new series
            lbl1 = series.getDataPoints().get_Item(0).getLabel()
            
            lbl1.getDataLabelFormat().setShowValue(true)

            lbl2 = series.getDataPoints().get_Item(1).getLabel()
            lbl2.getDataLabelFormat().setShowValue (true)
            lbl2.getDataLabelFormat().setShowLegendKey(true)
            lbl2.getDataLabelFormat().setShowPercentage(true)

            lbl3 = series.getDataPoints().get_Item(2).getLabel()
            lbl3.getDataLabelFormat().setShowSeriesName(true)
            lbl3.getDataLabelFormat().setShowPercentage (true)

            # Showing Leader Lines for Chart
            series.getLabels().getDefaultDataLabelFormat().setShowLeaderLines(true)

            # Setting Rotation Angle for Pie Chart Sectors
            chart.getChartData().getSeriesGroups().get_Item(0).setFirstSliceAngle(180)

            # Save presentation with chart
            pres.save(data_dir + "AsposePieChart.pptx", Rjb::import('com.aspose.slides.SaveFormat').Pptx)

            puts "Set pie chart sector colors, please check the output file."
        end
    end
end
