module Asposeslidesjava
  module ChartLegend
    def initialize()
        # Setting Custom Location and Size for Chart legend
        set_location_and_size()
    end 

    def set_location_and_size()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Creating empty presentation
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get reference of the slide
        slide = pres.getSlides().get_Item(0)

        # Add a clustered column chart on the slide
        chart = slide.getShapes().addChart(Rjb::import('com.aspose.slides.ChartType').ClusteredColumn, 50, 50, 500, 500)

        # Set Legend Properties
        chart.getLegend().setX(50 / chart.getWidth())
        chart.getLegend().setY (50 / chart.getHeight())
        chart.getLegend().setWidth(100 / chart.getWidth())
        chart.getLegend().setHeight(100 / chart.getHeight())

        # Saving the presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "Legend.pptx", save_format.Pptx)

        puts "Set custom location and size of chart legend, please check the output file."       
    end   
  end
end
