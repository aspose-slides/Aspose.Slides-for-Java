module Asposeslidesjava
  module CreateChart
    def initialize()
        # Creating Normal Charts
        create_normal_chart()

        # Creating Scattered Chart with multiple series and different series markers
        create_scatter_chart()
    end    

    def create_normal_chart()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Access first slide
        sld = pres.getSlides().get_Item(0)

        # Add chart with default data
        chart = sld.getShapes().addChart(Rjb::import('com.aspose.slides.ChartType').ClusteredColumn, 0, 0, 500, 500)

        # Setting chart Title
        # chart.ChartTitle.TextFrameForOverriding.Text = "Sample Title";
        chart.getChartTitle().addTextFrameForOverriding("Sample Title")
        chart.getChartTitle().getTextFrameForOverriding().getTextFrameFormat().setCenterText(Rjb::import('com.aspose.slides.NullableBool').True)
        chart.getChartTitle().setHeight (20)
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
        s = chart.getChartData().getSeries().size()
        s = chart.getChartData().getCategories().size()

        # Adding new series
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 1, "Series 1"), chart.getType())
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 2, "Series 2"), chart.getType())

        # Adding new categories
        chart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 1, 0, "Caetegoty 1"))
        chart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 2, 0, "Caetegoty 2"))
        chart.getChartData().getCategories().add(fact.getCell(defaultWorksheetIndex, 3, 0, "Caetegoty 3"))

        # Take first chart series
        series = chart.getChartData().getSeries().get_Item(0)

        # Now populating series data
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 1, 1, 20))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 2, 1, 50))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 3, 1, 30))

        # Setting fill color for series
        series.getFormat().getFill().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        series.getFormat().getFill().getSolidFillColor().setColor(Rjb::import('java.awt.Color').RED)


        # Take second chart series
        series = chart.getChartData().getSeries().get_Item(1)

        # Now populating series data
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 1, 2, 30))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 2, 2, 10))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 3, 2, 60))

        # Setting fill color for series
        series.getFormat().getFill().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        series.getFormat().getFill().getSolidFillColor().setColor(Rjb::import('java.awt.Color').GREEN)

        # create custom labels for each of categories for new series
        # first label will be show Category name
        lbl = series.getDataPoints().get_Item(0).getLabel()
        lbl.getDataLabelFormat().setShowCategoryName(true)

        lbl = series.getDataPoints().get_Item(1).getLabel()
        lbl.getDataLabelFormat().setShowSeriesName(true)

        # Show value for third label
        lbl = series.getDataPoints().get_Item(2).getLabel()
        lbl.getDataLabelFormat().setShowValue(true)
        lbl.getDataLabelFormat().setShowSeriesName(true)
        lbl.getDataLabelFormat().setSeparator ("/")

        # Save presentation with chart
        pres.save(data_dir + "NormalChart.pptx", Rjb::import('com.aspose.slides.SaveFormat').Pptx)

        puts "Created normal chart, please check the output file."
    end    

    def create_scatter_chart()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new

        slide = pres.getSlides().get_Item(0)

        # Creating the default chart
        chart = slide.getShapes().addChart(Rjb::import('com.aspose.slides.ChartType').ScatterWithSmoothLines, 0, 0, 400, 400)

        # Getting the default chart data worksheet index
        defaultWorksheetIndex = 0

        # Getting the chart data worksheet
        fact = chart.getChartData().getChartDataWorkbook()

        # Delete demo series
        chart.getChartData().getSeries().clear()

        # Add new series
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 1, 1, "Series 1"), chart.getType())
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 1, 3, "Series 2"), chart.getType())

        # Take first chart series
        series = chart.getChartData().getSeries().get_Item(0)

        # Add new point (1:3) there.
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 2, 1, 1), fact.getCell(defaultWorksheetIndex, 2, 2, 3))

        # Add new point (2:10)
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 3, 1, 2), fact.getCell(defaultWorksheetIndex, 3, 2, 10))

        # Edit the type of series
        series.setType(Rjb::import('com.aspose.slides.ChartType').ScatterWithStraightLinesAndMarkers)

        # Changing the chart series marker
        series.getMarker().setSize(10)
        series.getMarker().setSymbol(Rjb::import('com.aspose.slides.MarkerStyleType').Star)

        # Take second chart series
        series = chart.getChartData().getSeries().get_Item(1)

        # Add new point (5:2) there.
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 2, 3, 5), fact.getCell(defaultWorksheetIndex, 2, 4, 2))

        # Add new point (3:1)
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 3, 3, 3), fact.getCell(defaultWorksheetIndex, 3, 4, 1))

        # Add new point (2:2)
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 4, 3, 2), fact.getCell(defaultWorksheetIndex, 4, 4, 2))

        # Add new point (5:1)
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 5, 3, 5), fact.getCell(defaultWorksheetIndex, 5, 4, 1))

        # Changing the chart series marker
        series.getMarker().setSize(10)
        series.getMarker().setSymbol(Rjb::import('com.aspose.slides.MarkerStyleType').Circle)

        pres.save(data_dir + "AsposeScatterChart.pptx", Rjb::import('com.aspose.slides.SaveFormat').Pptx)

        puts "Created scatter chart, please check the output file." 
    end
  end
end
