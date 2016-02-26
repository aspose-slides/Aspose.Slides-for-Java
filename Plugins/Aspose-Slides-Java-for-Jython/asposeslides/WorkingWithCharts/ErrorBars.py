from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import ChartType
from com.aspose.slides import SaveFormat
from com.aspose.slides import ErrorBarValueType
from com.aspose.slides import ErrorBarType
from com.aspose.slides import DataSourceType

class ErrorBars:

    def __init__(self):
                
        # Adding Fixed Error Bar Value for Chart
        self.add_fixed_error_bar_value()

        # Adding Custom Error Bar Value for Chart
        self.add_custom_error_bar_value()
       
    def add_fixed_error_bar_value(dataDir):

        dataDir = Settings.dataDir + 'WorkingWithCharts/ErrorBars'
        
        pres = Presentation()

        # Creating a bubble chart
        chartType=ChartType
        chart = pres.getSlides().get_Item(0).getShapes().addChart(chartType.Bubble, 50, 50, 400, 300, True)

        # Adding Error bars and setting its format
        error_bar_x = chart.getChartData().getSeries().get_Item(0).getErrorBarsXFormat()
        error_bar_y = chart.getChartData().getSeries().get_Item(0).getErrorBarsYFormat()


        errorBarValueType = ErrorBarValueType
        errorBarType = ErrorBarType

        error_bar_x.setValueType(errorBarValueType.Fixed)

        error_bar_x.setValue(0.1)

        error_bar_y.setValueType(errorBarValueType.Percentage)
        error_bar_y.setValue(5)
        error_bar_x.setType(errorBarType.Plus)
        error_bar_y.getFormat().getLine().setWidth(2.0)
        #error_bar_x.hasEndCap(True)

        # Save presentation with chart
        save_format = SaveFormat
        pres.save(dataDir + "ErrorBar.pptx", save_format.Pptx)

        print "Added fixed error bar value for chart, please check the output file."
        
    def add_custom_error_bar_value(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithCharts/ErrorBars'
        
        pres = Presentation()

        slide = pres.getSlides().get_Item(0)

        # Creating a bubble chart
        chartType = ChartType
        chart = pres.getSlides().get_Item(0).getShapes().addChart(chartType.Bubble, 50, 50, 400, 300, True)

        # Adding custom Error bars and setting its format
        error_bar_value_type = ErrorBarValueType
        series = chart.getChartData().getSeries().get_Item(0)
        error_bar_x = series.getErrorBarsXFormat()
        error_bar_y = series.getErrorBarsYFormat()

        #error_bar_x.isVisible(True)
        #error_bar_y.isVisible(True)

        error_bar_x.setValueType(error_bar_value_type.Custom)
        error_bar_y.setValueType(error_bar_value_type.Custom)

        #Accessing chart series data point and setting error bars values for individual point
        data_source_type = DataSourceType
        points = series.getDataPoints()
        points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForXPlusValues(data_source_type.DoubleLiterals)
        points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForXMinusValues(data_source_type.DoubleLiterals)
        points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForYPlusValues(data_source_type.DoubleLiterals)
        points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForYMinusValues(data_source_type.DoubleLiterals)

        # Setting error bars for chart series points
        i = 0
        while i < points.size():
            points.get_Item(i).getErrorBarsCustomValues().getXMinus().setAsLiteralDouble(i + 1)
            points.get_Item(i).getErrorBarsCustomValues().getXPlus().setAsLiteralDouble(i + 1)
            points.get_Item(i).getErrorBarsCustomValues().getYMinus().setAsLiteralDouble(i + 1)
            points.get_Item(i).getErrorBarsCustomValues().getYPlus().setAsLiteralDouble(i + 1)
            i+=1
        

        save_format = SaveFormat
        pres.save(dataDir + "ErrorBarsCustomValues.pptx", save_format.Pptx)

        print "Added custom error bars values for chart, please check the output file."

if __name__ == '__main__':        
    ErrorBars()