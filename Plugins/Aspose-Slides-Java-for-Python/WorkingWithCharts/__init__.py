__author__ = 'fahadadeel'
import jpype

class CreateChart:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.ChartType=jpype.JClass("com.aspose.slides.ChartType")
        self.NullableBool=jpype.JClass("com.aspose.slides.NullableBool")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.MarkerStyleType=jpype.JClass("com.aspose.slides.MarkerStyleType")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.Color=jpype.JClass("java.awt.Color")

    def main(self):

        # Creating Normal Charts
        self.create_normal_chart()

        # Creating Scattered Chart with multiple series and different series markers
        self.create_scatter_chart()

    def create_normal_chart(self):
        
        # Instantiate Presentation class that represents the presentation file
        pres = self.Presentation()

        # Access first slide
        sld = pres.getSlides().get_Item(0)

        # Add chart with default data
        chartTye = self.ChartType
        chart = sld.getShapes().addChart(chartTye.ClusteredColumn, 0, 0, 500, 500)

        # Setting chart Title
        # chart.ChartTitle.TextFrameForOverriding.Text = "Sample Title"
        chart.getChartTitle().addTextFrameForOverriding("Sample Title")
        nullableBool = self.NullableBool()
        chart.getChartTitle().getTextFrameForOverriding().getTextFrameFormat().setCenterText(nullableBool.True)
        chart.getChartTitle().setHeight (20)
        chart.hasTitle(True)

        # Set first series to Show Values
        chart.getChartData().getSeries().get_Item(0).getLabels().getDefaultDataLabelFormat().setShowValue(True)

        # Setting the index of chart data sheet
        defaultWorksheetIndex = 0

        # Getting the chart data worksheet
        fact = chart.getChartData().getChartDataWorkbook()

        # Delete default generated series and categories
        chart.getChartData().getSeries().clear()
        chart.getChartData().getCategories().clear()
        s = chart.getChartData().getSeries().size()
        s = chart.getChartData().getCategories().size()

        # Adding self.series
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 1, "Series 1"), chart.getType())
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 2, "Series 2"), chart.getType())

        # Adding self.categories
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
        fillType=self.FillType()
        color=self.Color()
        series.getFormat().getFill().setFillType(fillType.Solid)
        series.getFormat().getFill().getSolidFillColor().setColor(color.RED)


        # Take second chart series
        series = chart.getChartData().getSeries().get_Item(1)

        # Now populating series data
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 1, 2, 30))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 2, 2, 10))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 3, 2, 60))

        # Setting fill color for series
        fillType=self.FillType()
        color=self.Color()
        series.getFormat().getFill().setFillType(fillType.Solid)
        series.getFormat().getFill().getSolidFillColor().setColor(color.GREEN)

        # create custom labels for each of categories for self.series
        # first label will be show Category name
        lbl = series.getDataPoints().get_Item(0).getLabel()
        lbl.getDataLabelFormat().setShowCategoryName(True)

        lbl = series.getDataPoints().get_Item(1).getLabel()
        lbl.getDataLabelFormat().setShowSeriesName(True)

        # Show value for third label
        lbl = series.getDataPoints().get_Item(2).getLabel()
        lbl.getDataLabelFormat().setShowValue(True)
        lbl.getDataLabelFormat().setShowSeriesName(True)
        lbl.getDataLabelFormat().setSeparator ("/")

        # Save presentation with chart

        saveFormat = self.SaveFormat
        pres.save(self.dataDir + "NormalChart.pptx", saveFormat.Pptx)

        print "Created normal chart, please check the output file." . PHP_EOL

    def create_scatter_chart(self):
        pres = self.Presentation

        slide = pres.getSlides().get_Item(0)

        chartType=self.ChartType()

        # Creating the default chart
        chart = slide.getShapes().addChart(chartType.ScatterWithSmoothLines, 0, 0, 400, 400)

        # Getting the default chart data worksheet index
        defaultWorksheetIndex = 0

        # Getting the chart data worksheet
        fact = chart.getChartData().getChartDataWorkbook()

        # Delete demo series
        chart.getChartData().getSeries().clear()

        # Add self.series
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 1, 1, "Series 1"), chart.getType())
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 1, 3, "Series 2"), chart.getType())

        # Take first chart series
        series = chart.getChartData().getSeries().get_Item(0)

        # Add self.point (1:3) there.
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 2, 1, 1), fact.getCell(defaultWorksheetIndex, 2, 2, 3))

        # Add self.point (2:10)
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 3, 1, 2), fact.getCell(defaultWorksheetIndex, 3, 2, 10))

        # Edit the type of series
        chartType=self.ChartType()
        series.setType(chartType.ScatterWithStraightLinesAndMarkers)

        # Changing the chart series marker

        markerStyleType=self.MarkerStyleType()
        series.getMarker().setSize(10)
        series.getMarker().setSymbol(markerStyleType.Star)

        # Take second chart series
        series = chart.getChartData().getSeries().get_Item(1)

        # Add self.point (5:2) there.
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 2, 3, 5), fact.getCell(defaultWorksheetIndex, 2, 4, 2))

        # Add self.point (3:1)
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 3, 3, 3), fact.getCell(defaultWorksheetIndex, 3, 4, 1))

        # Add self.point (2:2)
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 4, 3, 2), fact.getCell(defaultWorksheetIndex, 4, 4, 2))

        # Add self.point (5:1)
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 5, 3, 5), fact.getCell(defaultWorksheetIndex, 5, 4, 1))

        # Changing the chart series marker

        markerStyleType1=self.MarkerStyleType()

        series.getMarker().setSize(10)
        series.getMarker().setSymbol(markerStyleType1.Circle)

        save_format = self.SaveFormat
        pres.save(self.dataDir + "AsposeScatterChart.pptx", save_format.Pptx)

        print "Created scatter chart, please check the output file."


class ChartLegend:

     def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.ChartType=jpype.JClass("com.aspose.slides.ChartType")
        self.NullableBool=jpype.JClass("com.aspose.slides.NullableBool")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.MarkerStyleType=jpype.JClass("com.aspose.slides.MarkerStyleType")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.Color=jpype.JClass("java.awt.Color")


     def main(self):

        # Setting Custom Location and Size for Chart legend
        self.set_location_and_size()

     def set_location_and_size(self):

         # Creating empty presentation
        pres = self.Presentation()

        # Get reference of the slide
        slide = pres.getSlides().get_Item(0)

        # Add a clustered column chart on the slide

        chartType=self.ChartType

        chart = slide.getShapes.addChart(chartType.ClusteredColumn, 50, 50, 500, 500)

        # Set Legend Properties
        chart.getLegend().setX(50 / chart.getWidth())
        chart.getLegend().setY (50 / chart.getHeight())
        chart.getLegend().setWidth(100 / chart.getWidth())
        chart.getLegend().setHeight(100 / chart.getHeight())

        # Saving the presentation
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Legend.pptx", save_format.Pptx)

        print "Set custom location and size of chart legend, please check the output file."


class ChartProperties:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.ChartType=jpype.JClass("com.aspose.slides.ChartType")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

    def main(self):

        # Setting the RotationX, RotationY and DepthPercents properties of 3D Chart.
        self.set_rotation_and_depth()

        # Setting the GapWidth property of Chart Series
        self.set_gapwidth()


    def set_rotation_and_depth(self):

        pres = self.Presentation()

        # Access first slide
        sld = pres.getSlides().get_Item(0)

        # Add chart with default data
        charType=self.ChartType
        chart = sld.getShapes().addChart(charType.StackedColumn3D, 0, 0, 500, 500)

        # Getting the chart data worksheet
        fact = chart.getChartData().getChartDataWorkbook()

        # Delete default generated series and categories
        chart.getChartData().getSeries().clear()
        chart.getChartData().getCategories().clear()

        # Adding self.series
        chart.getChartData().getSeries().add(fact.getCell(0, 0, 1, "Series 1"), chart.getType())
        chart.getChartData().getSeries().add(fact.getCell(0, 0, 2, "Series 2"), chart.getType())

        # Adding self.categories
        chart.getChartData().getCategories().add(fact.getCell(0, 1, 0, "Caetegoty 1"))
        chart.getChartData().getCategories().add(fact.getCell(0, 2, 0, "Caetegoty 2"))
        chart.getChartData().getCategories().add(fact.getCell(0, 3, 0, "Caetegoty 3"))

        # Set Rotation3D properties
        chart.getRotation3D().setRightAngleAxes(True)
        chart.getRotation3D().setRotationX(40)
        chart.getRotation3D().setRotationY(270)
        chart.getRotation3D().setDepthPercents(150)

        # Take first chart series
        series = chart.getChartData().getSeries().get_Item(0)

        # Populating series data
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 1, 1, 20))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 2, 1, 50))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 3, 1, 30))

        # Take second chart series
        series = chart.getChartData().getSeries().get_Item(1)

        # Populating series data
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 1, 2, 30))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 2, 2, 10))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 3, 2, 60))

        # Saving the presentation
        save_format = self.SaveFormat
        pres.save(self.dataDir + "3Drotation.pptx", save_format.Pptx)

        print "Done with rotation, please check the output file."
    

    def set_gapwidth(self):

        pres = self.Presentation()

        # Access first slide
        sld = pres.getSlides().get_Item(0)

        # Add chart with default data
        charType=self.ChartType()
        chart = sld.getShapes().addChart(charType.StackedColumn3D, 0, 0, 500, 500)

        # Getting the chart data worksheet
        fact = chart.getChartData().getChartDataWorkbook()

        # Delete default generated series and categories
        chart.getChartData().getSeries().clear()
        chart.getChartData().getCategories().clear()

        # Adding self.series
        chart.getChartData().getSeries().add(fact.getCell(0, 0, 1, "Series 1"), chart.getType())
        chart.getChartData().getSeries().add(fact.getCell(0, 0, 2, "Series 2"), chart.getType())

        # Adding self.categories
        chart.getChartData().getCategories().add(fact.getCell(0, 1, 0, "Caetegoty 1"))
        chart.getChartData().getCategories().add(fact.getCell(0, 2, 0, "Caetegoty 2"))
        chart.getChartData().getCategories().add(fact.getCell(0, 3, 0, "Caetegoty 3"))

        # Take first chart series
        series = chart.getChartData().getSeries().get_Item(0)

        # Populating series data
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 1, 1, 20))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 2, 1, 50))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 3, 1, 30))

        # Take second chart series
        series = chart.getChartData().getSeries().get_Item(1)

        # Populating series data
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 1, 2, 30))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 2, 2, 10))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(0, 3, 2, 60))

        # Set GapWidth value
        series.getParentSeriesGroup().setGapWidth(75)

        # Saving the presentation
        save_format = self.SaveFormat
        pres.save(self.dataDir + "SetGapWidth.pptx", save_format.Pptx)

        print "Set Gapwidth property of chart series, please check the output file."


class ChartSeries:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.ChartType=jpype.JClass("com.aspose.slides.ChartType")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

    def main(self):

        # Adding Chart Series Overlap for Charts
        self.add_overlap_for_chart()

    def add_overlap_for_chart(self):
    
        # Instantiate Presentation class that represents the presentation file
        pres = self.Presentation()

        # Adding chart
        chartType = self.ChartType

        chart = pres.getSlides().get_Item(0).getShapes().addChart(chartType.ClusteredColumn, 50, 50, 600, 400, True)

        series = chart.getChartData().getSeries()
        if (series.get_Item(0).getOverlap() == 0):
        # Setting series overlap
            series . get_Item(0) . getParentSeriesGroup().setOverlap(-30)
        

        # Saving the presentation
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Overlap.pptx", save_format.Pptx)

        print "Added chart series overlap for charts, please check the output file."

class ChartTrendLines:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.ChartType=jpype.JClass("com.aspose.slides.ChartType")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.TrendlineType=jpype.JClass("com.aspose.slides.TrendlineType")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.Color=jpype.JClass("java.awt.Color")


    def main(self):

        # Creating empty presentation
        pres =self.Presentation()

        # Creating a clustered column chart
        chartType=self.ChartType
        chart = pres.getSlides().get_Item(0).getShapes().addChart(chartType.ClusteredColumn, 20, 20, 500, 400)

        # Adding ponential trend line for chart series 1
        trendlineType=self.TrendlineType()
        tredLinep = chart.getChartData().getSeries().get_Item(0).getTrendLines().add(trendlineType.Exponential)
        tredLinep.setDisplayEquation(False)
        tredLinep.setDisplayRSquaredValue(False)

        # Adding Linear trend line for chart series 1
        fillType=self.FillType()
        color=self.Color()

        tredLineLin = chart.getChartData().getSeries().get_Item(0).getTrendLines().add(trendlineType.Linear)
        tredLineLin.setTrendlineType(trendlineType.Linear)
        tredLineLin.getFormat().getLine().getFillFormat().setFillType(fillType.Solid)
        tredLineLin.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(color.RED)


        # Adding Logarithmic trend line for chart series 2
        tredLineLog = chart.getChartData().getSeries().get_Item(1).getTrendLines().add(trendlineType.Logarithmic)
        tredLineLog.setTrendlineType(trendlineType.Logarithmic)
        tredLineLog.addTextFrameForOverriding("self.log trend line")

        # Adding MovingAverage trend line for chart series 2
        tredLineMovAvg = chart.getChartData().getSeries().get_Item(1).getTrendLines().add(trendlineType.MovingAverage)
        tredLineMovAvg.setTrendlineType(trendlineType.MovingAverage)
        tredLineMovAvg.setPeriod(3)
        tredLineMovAvg.setTrendlineName("self.TrendLine Name")

        # Adding Polynomial trend line for chart series 3
        tredLinePol = chart.getChartData().getSeries().get_Item(2).getTrendLines().add(trendlineType.Polynomial)
        tredLinePol.setTrendlineType(trendlineType.Polynomial)
        tredLinePol.setForward(1)
        tredLinePol.setOrder(3)

        # Adding Power trend line for chart series 3
        tredLinePower = chart.getChartData().getSeries().get_Item(1).getTrendLines().add(trendlineType.Power)
        tredLinePower.setTrendlineType(trendlineType.Power)
        tredLinePower.setBackward(1)

        # Saving the presentation
        save_format = self.SaveFormat
        pres.save(self.dataDir + "ChartTrendLines.pptx", save_format.Pptx)

        print "Done with chart trend lines, please check the output file."

class ErrorBars:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.ChartType=jpype.JClass("com.aspose.slides.ChartType")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.ErrorBarValueType=jpype.JClass("com.aspose.slides.ErrorBarValueType")
        self.DataSourceType=jpype.JClass("com.aspose.slides.DataSourceType")
        self.ErrorBarType=jpype.JClass("com.aspose.slides.ErrorBarType")


    def main(self):
        # Adding Fixed Error Bar Value for Chart
        self.add_fixed_error_bar_value()

        # Adding Custom Error Bar Value for Chart
        self.add_custom_error_bar_value()

    def add_fixed_error_bar_value(self):

        pres = self.Presentation()

        # Creating a bubble chart
        chartType=self.ChartType
        chart = pres.getSlides().get_Item(0).getShapes().addChart(chartType.Bubble, 50, 50, 400, 300, True)

        # Adding Error bars and setting its format
        error_bar_x = chart.getChartData().getSeries().get_Item(0).getErrorBarsXFormat()
        error_bar_y = chart.getChartData().getSeries().get_Item(0).getErrorBarsYFormat()



        #error_bar_x.isVisible(True)
        #error_bar_y.isVisible(True)

        errorBarValueType = self.ErrorBarValueType()
        errorBarType = self.ErrorBarType()

        error_bar_x.setValueType(errorBarValueType.Fixed)

        error_bar_x.setValue(0.1)

        error_bar_y.setValueType(errorBarValueType.Percentage)
        error_bar_y.setValue(5)
        error_bar_x.setType(errorBarType.Plus)
        error_bar_y.getFormat().getLine().setWidth(2.0)
        #error_bar_x.hasEndCap(True)

        # Save presentation with chart
        save_format = self.SaveFormat
        pres.save(self.dataDir + "ErrorBar.pptx", save_format.Pptx)

        print "Added fixed error bar value for chart, please check the output file."

    def add_custom_error_bar_value(self):
    
        pres = self.Presentation()

        slide = pres.getSlides().get_Item(0)

        # Creating a bubble chart
        chartType = self.ChartType()
        chart = pres.getSlides().get_Item(0).getShapes().addChart(chartType.Bubble, 50, 50, 400, 300, True)

        # Adding custom Error bars and setting its format
        error_bar_value_type = self.ErrorBarValueType()
        series = chart.getChartData().getSeries().get_Item(0)
        error_bar_x = series.getErrorBarsXFormat()
        error_bar_y = series.getErrorBarsYFormat()

        #error_bar_x.isVisible(True)
        #error_bar_y.isVisible(True)

        error_bar_x.setValueType(error_bar_value_type.Custom)
        error_bar_y.setValueType(error_bar_value_type.Custom)

        #Accessing chart series data point and setting error bars values for individual point
        data_source_type = self.DataSourceType()
        points = series.getDataPoints()
        points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForXPlusValues(data_source_type.DoubleLiterals)
        points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForXMinusValues(data_source_type.DoubleLiterals)
        points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForYPlusValues(data_source_type.DoubleLiterals)
        points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForYMinusValues(data_source_type.DoubleLiterals)

        # Setting error bars for chart series points
        i = 0
        while (i < points.size()):
            points.get_Item(i).getErrorBarsCustomValues().getXMinus().setAsLiteralDouble(i + 1)
            points.get_Item(i).getErrorBarsCustomValues().getXPlus().setAsLiteralDouble(i + 1)
            points.get_Item(i).getErrorBarsCustomValues().getYMinus().setAsLiteralDouble(i + 1)
            points.get_Item(i).getErrorBarsCustomValues().getYPlus().setAsLiteralDouble(i + 1)
            i+=1
        

        save_format = self.SaveFormat
        pres.save(self.dataDir + "ErrorBarsCustomValues.pptx", save_format.Pptx)

        print "Added custom error bars values for chart, please check the output file."

class ExistingChart:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.ChartType=jpype.JClass("com.aspose.slides.ChartType")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.ErrorBarValueType=jpype.JClass("com.aspose.slides.ErrorBarValueType")
        self.DataSourceType=jpype.JClass("com.aspose.slides.DataSourceType")
        self.ErrorBarType=jpype.JClass("com.aspose.slides.ErrorBarType")


    def main(self):

        # Instantiate Presentation class that represents the presentation file
        pres = self.Presentation(self.dataDir + "AsposeChart.pptx")

        # Access first slide
        sld = pres.getSlides().get_Item(0)

        # Add chart with default data
        chart = sld.getShapes().get_Item(0)

        # Setting the index of chart data sheet
        defaultWorksheetIndex = 0

        # Getting the chart data worksheet
        fact = chart.getChartData().getChartDataWorkbook()

        # Changing chart Category Name
        fact.getCell(defaultWorksheetIndex, 1, 0, "Modified Category 1")
        fact.getCell(defaultWorksheetIndex, 2, 0, "Modified Category 2")


        # Take first chart series
        series = chart.getChartData().getSeries().get_Item(0)

        # Now updating series data
        fact.getCell(defaultWorksheetIndex, 0, 1, "New_Series1") # modifying series name
        series.getDataPoints().get_Item(0).getValue().setData(90)
        series.getDataPoints().get_Item(1).getValue().setData(123)
        series.getDataPoints().get_Item(2).getValue().setData(44)

        # Take Second chart series
        series = chart.getChartData().getSeries().get_Item(1)

        # Now updating series data
        fact.getCell(defaultWorksheetIndex, 0, 2, "New_Series2") #modifying series name
        series.getDataPoints().get_Item(0).getValue().setData(23)
        series.getDataPoints().get_Item(1).getValue().setData(67)
        series.getDataPoints().get_Item(2).getValue().setData(99)


        # Now, Adding a self.series
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 3, "Series 3"), chart.getType())

        # Take 3rd chart series
        series = chart.getChartData().getSeries().get_Item(2)

        # Now populating series data
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 1, 3, 20))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 2, 3, 50))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 3, 3, 30))

        chartType=self.ChartType
        chart.setType(chartType.ClusteredCylinder)


        # Saving the presentation to HTML format
        save_format = self.SaveFormat
        pres.save(self.dataDir + "AsposeChartModified.pptx", save_format.Pptx)

        print "Updated chart, please check the output file."

class FormattingChartEntities:

     def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.Color=jpype.JClass("java.awt.Color")
        self.ChartType=jpype.JClass("com.aspose.slides.ChartType")
        self.NullableBool=jpype.JClass("com.aspose.slides.NullableBool")
        self.LineDashStyle=jpype.JClass("com.aspose.slides.LineDashStyle")
        self.DisplayUnitType=jpype.JClass("com.aspose.slides.DisplayUnitType")
        self.FontData=jpype.JClass("com.aspose.slides.FontData")
        self.PresetColor=jpype.JClass("com.aspose.slides.PresetColor")
        self.TickLabelPositionType=jpype.JClass("com.aspose.slides.TickLabelPositionType")
        self.LineStyle=jpype.JClass("com.aspose.slides.LineStyle")


     def main(self):

         # Instantiate Presentation class that represents the presentation file
        pres = self.Presentation()

        # Accessing the first slide
        slide = pres.getSlides().get_Item(0)

        # Adding the sample chart
        chartType=self.ChartType
        chart = slide.getShapes().addChart(chartType.LineWithMarkers, 50, 50, 500, 400)

        # Setting Chart Titile
        chart.hasTitle(True)
        chart.getChartTitle().addTextFrameForOverriding("")
        chartTitle = chart.getChartTitle().getTextFrameForOverriding().getParagraphs().get_Item(0).getPortions().get_Item(0)
        chartTitle.setText("Sample Chart")

        fillType=self.FillType()
        color=self.Color()
        nullableBool=self.NullableBool()
        lineDashStyle=self.LineDashStyle()

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

        displayUnitType=self.DisplayUnitType()
        chart.getAxes().getVerticalAxis().isNumberFormatLinkedToSource(False)
        chart.getAxes().getVerticalAxis().setDisplayUnit(displayUnitType.Thousands)
        chart.getAxes().getVerticalAxis().setNumberFormat("0.0%")

        # Setting chart maximum, minimum values
        chart.getAxes().getVerticalAxis().isAutomaticMajorUnit(False)
        chart.getAxes().getVerticalAxis().isAutomaticMaxValue(False)
        chart.getAxes().getVerticalAxis().isAutomaticMinorUnit(False)
        chart.getAxes().getVerticalAxis().isAutomaticMinValue(False)

        chart.getAxes().getVerticalAxis().setMaxValue(15)
        chart.getAxes().getVerticalAxis().setMinValue(-2)
        chart.getAxes().getVerticalAxis().setMinorUnit(0.5)
        chart.getAxes().getVerticalAxis().setMajorUnit(2.0)

        # Setting Value Axis Text Properties

        fontData=self.FontData()
        presetColor=self.PresetColor()

        txtVal = chart.getAxes().getVerticalAxis().getTextFormat().getPortionFormat()
        txtVal.setFontBold(nullableBool.True)
        txtVal.setFontHeight(16)
        txtVal.setFontItalic(nullableBool.True)
        txtVal.getFillFormat().setFillType(fillType.Solid)
        txtVal.getFillFormat().getSolidFillColor().setColor(self.Color(presetColor.DarkGreen))
        txtVal.setLatinFont(self.FontData("Times self.Roman"))

        # Setting value axis title
        chart.getAxes().getVerticalAxis().hasTitle(True)
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
        txtCat.setLatinFont(self.FontData("Arial"))

        # Setting Category Titile
        chart.getAxes().getHorizontalAxis().hasTitle(True)
        chart.getAxes().getHorizontalAxis().getTitle().addTextFrameForOverriding("")

        catTitle = chart.getAxes().getHorizontalAxis().getTitle().getTextFrameForOverriding().getParagraphs().get_Item(0).getPortions().get_Item(0)
        catTitle.setText("Sample Category")
        catTitle.getPortionFormat().getFillFormat().setFillType(fillType.Solid)
        catTitle.getPortionFormat().getFillFormat().getSolidFillColor().setColor(color.GRAY)
        catTitle.getPortionFormat().setFontHeight(20)
        catTitle.getPortionFormat().setFontBold(nullableBool.True)
        catTitle.getPortionFormat().setFontItalic(nullableBool.True)

        # Setting category axis lable position
        tickLabelPositionType = self.TickLabelPositionType()
        chart.getAxes().getHorizontalAxis().setTickLabelPosition(tickLabelPositionType.Low)

        # Setting category axis lable rotation angle
        chart.getAxes().getHorizontalAxis().setTickLabelRotationAngle(45)

        # Setting Legends Text Properties
        txtleg = chart.getLegend().getTextFormat().getPortionFormat()
        txtleg.setFontBold(nullableBool.True)
        txtleg.setFontHeight(16)
        txtleg.setFontItalic(nullableBool.True)
        txtleg.getFillFormat().setFillType(fillType.Solid)
        txtleg.getFillFormat().getSolidFillColor().setColor(self.Color(presetColor.DarkRed))

        # Set show chart legends without overlapping chart
        chart.getLegend().setOverlay(True)
        #chart.ChartData.Series[0].PlotOnSecondAxis=True
        chart.getChartData().getSeries().get_Item(0).setPlotOnSecondAxis(True)

        # Setting secondary value axis
        lineStyle = self.LineStyle()
        chart.getAxes().getSecondaryVerticalAxis().isVisible(True)
        chart.getAxes().getSecondaryVerticalAxis().getFormat().getLine().setStyle(lineStyle.ThickBetweenThin)
        chart.getAxes().getSecondaryVerticalAxis().getFormat().getLine().setWidth(20)

        # Setting secondary value axis Number format
        chart.getAxes().getSecondaryVerticalAxis().isNumberFormatLinkedToSource(False)
        displayUnitType=self.DisplayUnitType()
        chart.getAxes().getSecondaryVerticalAxis().setDisplayUnit(displayUnitType.Hundreds)
        chart.getAxes().getSecondaryVerticalAxis().setNumberFormat ("0.0%")

        # Setting chart maximum, minimum values
        chart.getAxes().getSecondaryVerticalAxis().isAutomaticMajorUnit(False)
        chart.getAxes().getSecondaryVerticalAxis().isAutomaticMaxValue(False)
        chart.getAxes().getSecondaryVerticalAxis().isAutomaticMinorUnit(False)
        chart.getAxes().getSecondaryVerticalAxis().isAutomaticMinValue(False)

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
        chart.getPlotArea().getFormat().getFill().getSolidFillColor().setColor(self.Color(presetColor.LightCyan))

        # Save Presentation
        save_format = self.SaveFormat
        pres.save(self.dataDir + "FormattedChart.pptx", save_format.Pptx)

        print "Formatted chart entities, please check the output file."

class SetLabelDistance:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.ChartType=jpype.JClass("com.aspose.slides.ChartType")

    def main(self):

        # Instantiate Presentation class that represents the presentation file
        pres = self.Presentation()

        # Access first slide
        sld = pres.getSlides().get_Item(0)

        # Adding a chart on slide
        chartType=self.ChartType
        ch = sld.getShapes().addChart(chartType.ClusteredColumn, 20, 20, 500, 300)

        # Setting the position of label from axis
        ch.getAxes().getHorizontalAxis().setLabelOffset(500)

        # Saving the presentation
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Position.pptx", save_format.Pptx)

        print "Set label distance, please check the output file."


class SetPieChartColors:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.ChartType=jpype.JClass("com.aspose.slides.ChartType")
        self.NullableBool=jpype.JClass("com.aspose.slides.NullableBool")
        self.FillType=jpype.JClass("com.aspose.slides.FillType")
        self.LineStyle=jpype.JClass("com.aspose.slides.LineStyle")
        self.LineDashStyle=jpype.JClass("com.aspose.slides.LineDashStyle")
        self.Color=jpype.JClass("java.awt.Color")
        self.PresetColor=jpype.JClass("com.aspose.slides.PresetColor")

    def main(self):

        pres = self.Presentation()

        # Access first slide
        sld = pres.getSlides().get_Item(0)

        # Add chart with default data
        chart_type = self.ChartType
        chart = sld.getShapes().addChart(chart_type.Pie, 100, 100, 400, 400)

        nullableBool=self.NullableBool()

        # Setting chart Title
        chart.getChartTitle().addTextFrameForOverriding("Sample Title")
        chart.getChartTitle().getTextFrameForOverriding().getTextFrameFormat().setCenterText(nullableBool.True)
        chart.getChartTitle().setHeight(20)
        chart.hasTitle(True)

        # Set first series to Show Values
        chart.getChartData().getSeries().get_Item(0).getLabels().getDefaultDataLabelFormat().setShowValue(True)

        # Setting the index of chart data sheet
        defaultWorksheetIndex = 0

        # Getting the chart data worksheet
        fact = chart.getChartData().getChartDataWorkbook()

        # Delete default generated series and categories
        chart.getChartData().getSeries().clear()
        chart.getChartData().getCategories().clear()

        # Adding self.categories
        chart.getChartData().getCategories().add(fact.getCell(0, 1, 0, "First Qtr"))
        chart.getChartData().getCategories().add(fact.getCell(0, 2, 0, "2nd Qtr"))
        chart.getChartData().getCategories().add(fact.getCell(0, 3, 0, "3rd Qtr"))

        # Adding self.series
        series = chart.getChartData().getSeries().add(fact.getCell(0, 0, 1, "Series 1"), chart.getType())

        # Now populating series data
        series.getDataPoints().addDataPointForPieSeries(fact.getCell(defaultWorksheetIndex, 1, 1, 20))
        series.getDataPoints().addDataPointForPieSeries(fact.getCell(defaultWorksheetIndex, 2, 1, 50))
        series.getDataPoints().addDataPointForPieSeries(fact.getCell(defaultWorksheetIndex, 3, 1, 30))

        # Not working in self.version
        # Adding self.points and setting sector color
        chart.getChartData().getSeriesGroups().get_Item(0).isColorVaried(True)

        fill_type = self.FillType()
        line_style = self.LineStyle()
        color = self.Color()
        line_dash_style = self.LineDashStyle()
        preset_color = self.PresetColor()

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
        point1.getFormat().getFill().getSolidFillColor().setColor(self.Color(preset_color.Brown))

        # Setting Sector border
        point1.getFormat().getLine().getFillFormat().setFillType(fill_type.Solid)
        point1.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(color.BLUE)
        point1.getFormat().getLine().setWidth(3.0)
        point1.getFormat().getLine().setStyle(line_style.Single)
        point1.getFormat().getLine().setDashStyle(line_dash_style.LargeDashDot)

        point2 = series.getDataPoints().get_Item(2)
        point2.getFormat().getFill().setFillType(fill_type.Solid)
        point2.getFormat().getFill().getSolidFillColor().setColor(self.Color(preset_color.Coral))

        # Setting Sector border
        point2.getFormat().getLine().getFillFormat().setFillType(fill_type.Solid)
        point2.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(color.RED)
        point2.getFormat().getLine().setWidth(2.0)
        point2.getFormat().getLine().setStyle(line_style.ThinThin)
        point2.getFormat().getLine().setDashStyle(line_dash_style.LargeDashDotDot)

        # Create custom labels for each of categories for self.series
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
        save_format = self.SaveFormat
        pres.save(self.dataDir + "AsposePieChart.pptx", save_format.Pptx)

        print "Set pie chart sector colors, please check the output file."