from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import ChartType
from com.aspose.slides import SaveFormat

class ChartSeries:

    def __init__(self):
                
        # Adding Chart Series Overlap for Charts
        self.add_overlap_for_chart()
        
    def add_overlap_for_chart(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithCharts/ChartSeries'
    
        # Instantiate Presentation class that represents the presentation file
        pres = Presentation()

        # Adding chart
        chartType = ChartType

        chart = pres.getSlides().get_Item(0).getShapes().addChart(chartType.ClusteredColumn, 50, 50, 600, 400, True)

        series = chart.getChartData().getSeries()
        if (series.get_Item(0).getOverlap() == 0):
        # Setting series overlap
            series . get_Item(0) . getParentSeriesGroup().setOverlap(-30)
        
        # Saving the presentation
        save_format = SaveFormat
        pres.save(dataDir + "Overlap.pptx", save_format.Pptx)

        print "Added chart series overlap for charts, please check the output file."

if __name__ == '__main__':        
    ChartSeries()