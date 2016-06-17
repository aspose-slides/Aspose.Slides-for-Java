from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import ShapeType
from com.aspose.slides import ChartType
from com.aspose.slides import LineDashStyle
from com.aspose.slides import LineArrowheadLength
from com.aspose.slides import LineArrowheadStyle
from com.aspose.slides import PresetColor
from com.aspose.slides import FillType
from com.aspose.slides import NullableBool
from com.aspose.slides import MarkerStyleType
from java.awt import color

class CreateChart :

    def __init__(self):
        # Creating Normal Charts
        self.create_normal_chart()

        # Creating Scattered Chart with multiple series and different series markers
        self.create_scatter_chart()
    

    def create_normal_chart(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithCharts/CreateChart'
        
        pres = Presentation()

        # Access first slide
        sld = pres.getSlides().get_Item(0)

        chartType=ChartType()
        # Add chart with default data
        chart = sld.getShapes().addChart(chartType.ClusteredColumn, 0, 0, 500, 500)

        nullableBool=NullableBool()

        # Setting chart Title
        # chart.ChartTitle.TextFrameForOverriding.Text = "Sample Title"
        chart.getChartTitle().addTextFrameForOverriding("Sample Title")
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

        # Adding series
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 1, "Series 1"), chart.getType())
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 0, 2, "Series 2"), chart.getType())

        # Adding categories
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
        fillType=FillType()
        color=Color()


        series.getFormat().getFill().setFillType(fillType.Solid)
        series.getFormat().getFill().getSolidFillColor().setColor(color.RED)


        # Take second chart series
        series = chart.getChartData().getSeries().get_Item(1)

        # Now populating series data
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 1, 2, 30))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 2, 2, 10))
        series.getDataPoints().addDataPointForBarSeries(fact.getCell(defaultWorksheetIndex, 3, 2, 60))

        # Setting fill color for series

        fillType1=FillType()
        color1=Color()

        series.getFormat().getFill().setFillType(fillType1.Solid)
        series.getFormat().getFill().getSolidFillColor().setColor(color1.GREEN)

        # create custom labels for each of categories for series
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
        save_format = SaveFormat()
        pres.save(dataDir + "NormalChart.pptx", save_format.Pptx)

        print "Created normal chart, please check the output file.".PHP_EOL
   
    def create_scatter_chart(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithCharts/CreateChart'
        
        pres = Presentation()

        slide = pres.getSlides().get_Item(0)

        chartType=ChartType()

        # Creating the default chart
        chart = slide.getShapes().addChart(chartType.ScatterWithSmoothLines, 0, 0, 400, 400)

        # Getting the default chart data worksheet index
        defaultWorksheetIndex = 0

        # Getting the chart data worksheet
        fact = chart.getChartData().getChartDataWorkbook()

        # Delete demo series
        chart.getChartData().getSeries().clear()

        # Add series
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 1, 1, "Series 1"), chart.getType())
        chart.getChartData().getSeries().add(fact.getCell(defaultWorksheetIndex, 1, 3, "Series 2"), chart.getType())

        # Take first chart series
        series = chart.getChartData().getSeries().get_Item(0)

        # Add point (1:3) there.
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 2, 1, 1), fact.getCell(defaultWorksheetIndex, 2, 2, 3))

        # Add point (2:10)
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 3, 1, 2), fact.getCell(defaultWorksheetIndex, 3, 2, 10))

        # Edit the type of series
        chartType=ChartType()
        series.setType(chartType.ScatterWithStraightLinesAndMarkers)

        # Changing the chart series marker

        markerStyleType=MarkerStyleType()
        series.getMarker().setSize(10)
        series.getMarker().setSymbol(markerStyleType.Star)

        # Take second chart series
        series = chart.getChartData().getSeries().get_Item(1)

        # Add point (5:2) there.
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 2, 3, 5), fact.getCell(defaultWorksheetIndex, 2, 4, 2))

        # Add point (3:1)
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 3, 3, 3), fact.getCell(defaultWorksheetIndex, 3, 4, 1))

        # Add point (2:2)
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 4, 3, 2), fact.getCell(defaultWorksheetIndex, 4, 4, 2))

        # Add point (5:1)
        series.getDataPoints().addDataPointForScatterSeries(fact.getCell(defaultWorksheetIndex, 5, 3, 5), fact.getCell(defaultWorksheetIndex, 5, 4, 1))

        # Changing the chart series marker

        markerStyleType1=MarkerStyleType()

        series.getMarker().setSize(10)
        series.getMarker().setSymbol(markerStyleType1.Circle)

        save_format = SaveFormat()
        pres.save(dataDir + "AsposeScatterChart.pptx", save_format.Pptx)

        print "Created scatter chart, please check the output file."