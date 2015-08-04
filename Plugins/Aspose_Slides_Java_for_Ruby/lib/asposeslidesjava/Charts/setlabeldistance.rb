module Asposeslidesjava
  module SetLabelDistance
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate Presentation class that represents the presentation file
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Access first slide
        sld = pres.getSlides().get_Item(0)

        # Adding a chart on slide
        ch = sld.getShapes().addChart(Rjb::import('com.aspose.slides.ChartType').ClusteredColumn, 20, 20, 500, 300)
        
        # Setting the position of label from axis
        ch.getAxes().getHorizontalAxis().setLabelOffset(500)

        # Saving the presentation
        pres.save(data_dir + "Position.pptx", Rjb::import('com.aspose.slides.SaveFormat').Pptx)

        puts "Set label distance, please check the output file."
    end    
  end
end
