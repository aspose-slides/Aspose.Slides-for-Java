module Asposeslidesjava
  module ChartSeries
    def initialize()
        # Adding Chart Series Overlap for Charts
        add_overlap_for_chart()
    end    

    def add_overlap_for_chart()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Adding chart
        chart = pres.getSlides().get_Item(0).getShapes().addChart(Rjb::import('com.aspose.slides.ChartType').ClusteredColumn, 50, 50, 600, 400, true)
        series = chart.getChartData().getSeries()
        if series.get_Item(0).getOverlap() == 0
           # Setting series overlap
           series.get_Item(0).getParentSeriesGroup().setOverlap(-30)
        end

        # Saving the presentation
        pres.save(data_dir + "Overlap.pptx", Rjb::import('com.aspose.slides.SaveFormat').Pptx)

        puts "Added chart series overlap for charts, please check the output file."
    end    
  end
end
