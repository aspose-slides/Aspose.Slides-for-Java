from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import ChartType
from com.aspose.slides import SaveFormat

class ChartProperties:

    def __init__(self):
                
        # Setting the RotationX, RotationY and DepthPercents properties of 3D Chart.
        self.set_rotation_and_depth()

        # Setting the GapWidth property of Chart Series
        self.set_gapwidth()
        
    def set_rotation_and_depth(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithCharts/ChartProperties'
    
        pres = Presentation()

        # Access first slide
        sld = pres.getSlides().get_Item(0)

        # Add chart with default data
        charType=ChartType
        chart = sld.getShapes().addChart(charType.StackedColumn3D, 0, 0, 500, 500)

        # Getting the chart data worksheet
        fact = chart.getChartData().getChartDataWorkbook()

        # Delete default generated series and categories
        chart.getChartData().getSeries().clear()
        chart.getChartData().getCategories().clear()

        # Adding series
        chart.getChartData().getSeries().add(fact.getCell(0, 0, 1, "Series 1"), chart.getType())
        chart.getChartData().getSeries().add(fact.getCell(0, 0, 2, "Series 2"), chart.getType())

        # Adding categories
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
        save_format = SaveFormat
        pres.save(dataDir + "3Drotation.pptx", save_format.Pptx)

        print "Done with rotation, please check the output file."
        
    def set_gapwidth(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithCharts/ChartProperties'
        
        pres = Presentation()

        # Access first slide
        sld = pres.getSlides().get_Item(0)

        # Add chart with default data
        charType=ChartType
        chart = sld.getShapes().addChart(charType.StackedColumn3D, 0, 0, 500, 500)

        # Getting the chart data worksheet
        fact = chart.getChartData().getChartDataWorkbook()

        # Delete default generated series and categories
        chart.getChartData().getSeries().clear()
        chart.getChartData().getCategories().clear()

        # Adding series
        chart.getChartData().getSeries().add(fact.getCell(0, 0, 1, "Series 1"), chart.getType())
        chart.getChartData().getSeries().add(fact.getCell(0, 0, 2, "Series 2"), chart.getType())

        # Adding categories
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
        save_format = SaveFormat
        pres.save(dataDir + "SetGapWidth.pptx", save_format.Pptx)

        print "Set Gapwidth property of chart series, please check the output file."

if __name__ == '__main__':        
    ChartProperties()