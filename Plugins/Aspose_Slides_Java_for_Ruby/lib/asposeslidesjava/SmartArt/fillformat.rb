module Asposeslidesjava
  module FillFormat
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new

        # Get the first slide
        slide = pres.getSlides().get_Item(0)

        # Adding SmartArt shape and nodes
        chevron = slide.getShapes().addSmartArt(10, 10, 800, 60, Rjb::import('com.aspose.slides.SmartArtLayoutType').ClosedChevronProcess)
        node = chevron.getAllNodes().addNode()
        node.getTextFrame().setText("Some text")

        # Setting node fill color
        item = node.getShapes().get_Item(0)
        item.getFillFormat().setFillType(Rjb::import('com.aspose.slides.FillType').Solid)
        item.getFillFormat().getSolidFillColor().setColor(Rjb::import('java.awt.Color').RED)

        # Write the presentation as a PPTX file  
        pres.save(data_dir + "FillFormat.pptx", Rjb::import('com.aspose.slides.SaveFormat').Pptx)

        puts "Set fill format for smartart node, please check the output file."
    end
  end
end
