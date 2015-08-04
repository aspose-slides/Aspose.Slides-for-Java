module Asposeslidesjava
  module OleObject
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/Shapes/'
                
        # Create an instance of Presentation class
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + 'OleEmbed.pptx')

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Cast the shape to OleObjectFrameEx
        oof = sld.getShapes().get_Item(0)

        # Read the OLE Object and write it to disk
        if oof != nil
            fstr = Rjb::import('java.io.FileOutputStream').new(data_dir + "excelFromOLEObject.xlsx")
            buf = oof.getObjectData()
            fstr.write(buf, 0, buf.length)
            fstr.flush()
            fstr.close()
            puts "Excel OLE Object written as excelFromOLEObject.xlsx file"
        end
    end
  end
end
