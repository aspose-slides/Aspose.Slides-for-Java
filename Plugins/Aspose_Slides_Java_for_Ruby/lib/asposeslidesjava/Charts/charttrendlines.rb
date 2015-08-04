module Asposeslidesjava
  module ChartTrendLines
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Creating empty presentation
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Creating a clustered column chart
        chart = pres.getSlides().get_Item(0).getShapes().addChart(Rjb::import('com.aspose.slides.ChartType').ClusteredColumn, 20, 20, 500, 400)

        # Adding ponential trend line for chart series 1
        tredLinep = chart.getChartData().getSeries().get_Item(0).getTrendLines().add(Rjb::import('com.aspose.slides.TrendlineType').Exponential)
        tredLinep.setDisplayEquation(false)
        tredLinep.setDisplayRSquaredValue(false)

        # Adding Linear trend line for chart series 1
        tredLineLin = chart.getChartData().getSeries().get_Item(0).getTrendLines().add(Rjb::import('com.aspose.slides.TrendlineType').Linear)
        tredLineLin.setTrendlineType(Rjb::import('com.aspose.slides.TrendlineType').Linear)
        tredLineLin.getFormat().getLine().getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        tredLineLin.getFormat().getLine().getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').RED)


        # Adding Logarithmic trend line for chart series 2
        tredLineLog = chart.getChartData().getSeries().get_Item(1).getTrendLines().add(Rjb::import('com.aspose.slides.TrendlineType').Logarithmic)
        tredLineLog.setTrendlineType(Rjb::import('com.aspose.slides.TrendlineType').Logarithmic)
        tredLineLog.addTextFrameForOverriding("New log trend line")

        # Adding MovingAverage trend line for chart series 2
        tredLineMovAvg = chart.getChartData().getSeries().get_Item(1).getTrendLines().add(Rjb::import('com.aspose.slides.TrendlineType').MovingAverage)
        tredLineMovAvg.setTrendlineType(Rjb::import('com.aspose.slides.TrendlineType').MovingAverage)
        tredLineMovAvg.setPeriod(3)
        tredLineMovAvg.setTrendlineName("New TrendLine Name")

        # Adding Polynomial trend line for chart series 3
        tredLinePol = chart.getChartData().getSeries().get_Item(2).getTrendLines().add(Rjb::import('com.aspose.slides.TrendlineType').Polynomial)
        tredLinePol.setTrendlineType(Rjb::import('com.aspose.slides.TrendlineType').Polynomial)
        tredLinePol.setForward(1)
        tredLinePol.setOrder(3)

        # Adding Power trend line for chart series 3
        tredLinePower = chart.getChartData().getSeries().get_Item(1).getTrendLines().add(Rjb::import('com.aspose.slides.TrendlineType').Power)
        tredLinePower.setTrendlineType(Rjb::import('com.aspose.slides.TrendlineType').Power)
        tredLinePower.setBackward(1)

        # Saving the presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "ChartTrendLines.pptx", save_format.Pptx)

        puts "Done with chart trend lines, please check the output file."
    end    
  end
end
