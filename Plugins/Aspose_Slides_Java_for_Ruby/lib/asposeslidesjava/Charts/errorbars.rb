module Asposeslidesjava
  module ErrorBars
    def initialize()
        # Adding Fixed Error Bar Value for Chart
        add_fixed_error_bar_value()

        # Adding Custom Error Bar Value for Chart
        add_custom_error_bar_value()
    end    

    def add_fixed_error_bar_value()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Creating a bubble chart
        chart = pres.getSlides().get_Item(0).getShapes().addChart(Rjb::import('com.aspose.slides.ChartType').Bubble, 50, 50, 400, 300, true)

        # Adding Error bars and setting its format
        error_bar_x = chart.getChartData().getSeries().get_Item(0).getErrorBarsXFormat()
        error_bar_y = chart.getChartData().getSeries().get_Item(0).getErrorBarsYFormat()

        #error_bar_x.isVisible(true)
        #error_bar_y.isVisible(true)
        error_bar_x.setValueType(Rjb::import('com.aspose.slides.ErrorBarValueType').Fixed)
        error_bar_x.setValue(0.1)
        error_bar_y.setValueType(Rjb::import('com.aspose.slides.ErrorBarValueType').Percentage)
        error_bar_y.setValue(5)
        error_bar_x.setType(Rjb::import('com.aspose.slides.ErrorBarType').Plus)
        error_bar_y.getFormat().getLine().setWidth(2.0)
        #error_bar_x.hasEndCap(true)

        # Save presentation with chart
        pres.save(data_dir + "ErrorBar.pptx", Rjb::import('com.aspose.slides.SaveFormat').Pptx)

        puts "Added fixed error bar value for chart, please check the output file."
    end    

    def add_custom_error_bar_value()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new

        slide = pres.getSlides().get_Item(0)

        # Creating a bubble chart
        chart = pres.getSlides().get_Item(0).getShapes().addChart(Rjb::import('com.aspose.slides.ChartType').Bubble, 50, 50, 400, 300, true)

        # Adding custom Error bars and setting its format
        error_bar_value_type = Rjb::import('com.aspose.slides.ErrorBarValueType')
        series = chart.getChartData().getSeries().get_Item(0)
        error_bar_x = series.getErrorBarsXFormat()
        error_bar_y = series.getErrorBarsYFormat()
        #error_bar_x.isVisible(true)
        #error_bar_y.isVisible(true)
        error_bar_x.setValueType(error_bar_value_type.Custom)
        error_bar_y.setValueType(error_bar_value_type.Custom)
           
        #Accessing chart series data point and setting error bars values for individual point
        data_source_type = Rjb::import('com.aspose.slides.DataSourceType')
        points = series.getDataPoints()
        points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForXPlusValues(data_source_type.DoubleLiterals)
        points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForXMinusValues(data_source_type.DoubleLiterals)
        points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForYPlusValues(data_source_type.DoubleLiterals)
        points.getDataSourceTypeForErrorBarsCustomValues().setDataSourceTypeForYMinusValues(data_source_type.DoubleLiterals)
            
        # Setting error bars for chart series points
        i = 0
        while i < points.size()
            points.get_Item(i).getErrorBarsCustomValues().getXMinus().setAsLiteralDouble(i + 1)
            points.get_Item(i).getErrorBarsCustomValues().getXPlus().setAsLiteralDouble(i + 1)
            points.get_Item(i).getErrorBarsCustomValues().getYMinus().setAsLiteralDouble(i + 1)
            points.get_Item(i).getErrorBarsCustomValues().getYPlus().setAsLiteralDouble(i + 1)
            i +=1
        end

        pres.save(data_dir + "ErrorBarsCustomValues.pptx", Rjb::import('com.aspose.slides.SaveFormat').Pptx)

        puts "Added custom error bars values for chart, please check the output file." 
    end
  end
end
