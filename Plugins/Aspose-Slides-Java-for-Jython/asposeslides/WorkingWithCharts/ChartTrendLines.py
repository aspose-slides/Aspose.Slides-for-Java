from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import ChartType
from com.aspose.slides import SaveFormat
from com.aspose.slides import TrendlineType
from com.aspose.slides import FillType
from java.awt import Color

class ChartTrendLines:

    def __init__(self):
                
        dataDir = Settings.dataDir + 'WorkingWithCharts/ChartTrendLines'
        
        # Creating empty presentation
        pres =Presentation()

        # Creating a clustered column chart
        chartType=ChartType
        chart = pres.getSlides().get_Item(0).getShapes().addChart(chartType.ClusteredColumn, 20, 20, 500, 400)

        # Adding ponential trend line for chart series 1
        trendlineType=TrendlineType
        tredLinep = chart.getChartData().getSeries().get_Item(0).getTrendLines().add(trendlineType.Exponential)
        tredLinep.setDisplayEquation(False)
        tredLinep.setDisplayRSquaredValue(False)

        # Adding Linear trend line for chart series 1
        fillType=FillType
        color=Color

        tredLineLin = chart.getChartData().getSeries().get_Item(0).getTrendLines().add(trendlineType.Linear)
        tredLineLin.setTrendlineType(trendlineType.Linear)
        tredLineLin.getFormat().getLine().getFillFormat().setFillType(fillType.Solid)
        tredLineLin.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(color.RED)


        # Adding Logarithmic trend line for chart series 2
        tredLineLog = chart.getChartData().getSeries().get_Item(1).getTrendLines().add(trendlineType.Logarithmic)
        tredLineLog.setTrendlineType(trendlineType.Logarithmic)
        tredLineLog.addTextFrameForOverriding("New log trend line")

        # Adding MovingAverage trend line for chart series 2
        tredLineMovAvg = chart.getChartData().getSeries().get_Item(1).getTrendLines().add(trendlineType.MovingAverage)
        tredLineMovAvg.setTrendlineType(trendlineType.MovingAverage)
        tredLineMovAvg.setPeriod(3)
        tredLineMovAvg.setTrendlineName("New TrendLine Name")

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
        save_format = SaveFormat
        pres.save(dataDir + "ChartTrendLines.pptx", save_format.Pptx)

        print "Done with chart trend lines, please check the output file."

if __name__ == '__main__':        
    ChartTrendLines()