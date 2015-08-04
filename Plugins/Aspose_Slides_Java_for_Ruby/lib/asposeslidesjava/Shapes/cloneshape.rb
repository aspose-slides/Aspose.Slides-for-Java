module Asposeslidesjava
  module CloneShape
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        srcPres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'demo.pptx')

        # Accessing source slide shape collection
        sourceShapes = srcPres.getSlides().get_Item(0).getShapes()

        blankLayout = srcPres.getMasters().get_Item(0).getLayoutSlides().getByType(Rjb::import('com.aspose.slides.SlideLayoutType').Blank)

        destSlide = srcPres.getSlides().addEmptySlide(blankLayout)

        # Accessing destination slide shape collection
        destShapes = destSlide.getShapes()

        # Clone shapes by using different methods
        destShapes.addClone(sourceShapes.get_Item(1), 50, 150 + sourceShapes.get_Item(0).getHeight())
        destShapes.addClone(sourceShapes.get_Item(2))
        destShapes.addClone(sourceShapes.get_Item(3), 50, 200, 50, 50)
        destShapes.insertClone(0, sourceShapes.get_Item(0), 50, 150)

        # Write the presentation as a PPTX file 
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        srcPres.save(data_dir + "CloneShape.pptx", save_format.Pptx)

        puts "Cloned shape, please check the output file."
    end
  end
end
