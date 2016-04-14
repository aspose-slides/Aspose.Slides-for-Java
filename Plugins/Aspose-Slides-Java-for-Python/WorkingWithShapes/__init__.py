__author__ = 'fahadadeel'
import jpype

class AddingLineShape:

    def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
            self.HtmlOptions=jpype.JClass("com.aspose.slides.HtmlOptions")
            self.HtmlFormatter=jpype.JClass("com.aspose.slides.HtmlFormatter")
            self.ShapeType=jpype.JClass("com.aspose.slides.ShapeType")

    def main(self):
        # Adding Plain Line to Slide
        self.add_plain_line()

        # Adding Arrow Shaped Line to Slide
        self.add_arrow_line()

    def add_plain_line(self):
        # Create an instance of Presentation class
        pres = self.Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add an autoshape of type line
        shapeType = self.ShapeType
        sld.getShapes().addAutoShape(shapeType.Line, 50, 150, 300, 0)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat()
        pres.save(self.dataDir + "LineShape.pptx", save_format.Pptx)

        print "Added plain line to slide, please check the output file." . PHP_EOL

    def add_arrow_line(self):
        
        # Create an instance of Presentation class
        pres = self.Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add an autoshape of type line
        shapeType = self.ShapeType()
        shp = sld.getShapes().addAutoShape(shapeType.Line, 50, 150, 300, 0)

        # Apply some formatting on the line
        lineStyle = self.LineStyle()
        shp.getLineFormat().setStyle(lineStyle.ThickBetweenThin)
        shp.getLineFormat().setWidth(10)

        lineDashStyle = self.LineDashStyle()
        shp.getLineFormat().setDashStyle(lineDashStyle.DashDot)

        lineArrowheadLength = self.LineArrowheadLength()
        lineArrowheadStyle = self.LineArrowheadStyle()
        fillType = self.FillType()
        color = self.Color()
        presetColor = self.PresetColor()

        shp.getLineFormat().setBeginArrowheadLength(lineArrowheadLength.Short)
        shp.getLineFormat().setBeginArrowheadStyle(lineArrowheadStyle.Oval)

        shp.getLineFormat().setEndArrowheadLength(lineArrowheadLength.Long)
        shp.getLineFormat().setEndArrowheadStyle(lineArrowheadStyle.Triangle)

        shp.getLineFormat().getFillFormat().setFillType(fillType.Solid)
        shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(self.Color(presetColor.Maroon))

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat()
        pres.save(self.dataDir + "ArrowShape.pptx", save_format.Pptx)

        print "Added arrow shape line to slide, please check the output file." . PHP_EOL

class FillingShapes:

     def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
            self.HtmlOptions=jpype.JClass("com.aspose.slides.HtmlOptions")
            self.HtmlFormatter=jpype.JClass("com.aspose.slides.HtmlFormatter")
            self.ShapeType=jpype.JClass("com.aspose.slides.ShapeType")

     def main(self):

         # Filling Shapes with Pattern
        self.fill_shapes_with_pattern()

        # Filling Shapes with Picture
        self.fill_shapes_with_picture()

        # Filling Shapes with Solid Color
        self.fill_shapes_with_solid_color()

     def fill_shapes_with_pattern(self):

         # Create an instance of Presentation class
        pres = self.Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shapeType = self.ShapeType
        shp = sld.getShapes().addAutoShape(shapeType.Rectangle, 50, 150, 75, 150)

        # Set the fill type to Pattern
        fillType = self.FillType()
        shp.getFillFormat().setFillType(fillType.Pattern)

        # Set the pattern style
        patternStyle = self.PatternStyle()
        shp.getFillFormat().getPatternFormat().setPatternStyle(patternStyle.Trellis)

        # Set the pattern back and fore colors
        color = self.Color()
        shp.getFillFormat().getPatternFormat().getBackColor().setColor(color.LIGHT_GRAY)
        shp.getFillFormat().getPatternFormat().getForeColor().setColor(color.YELLOW)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat()
        pres.save(self.dataDir + "RectShpPatt.pptx", save_format.Pptx)

        print "Filled shapes with Pattern, please check the output file." . PHP_EOL

     def fill_shapes_with_picture(self):

         # Create an instance of Presentation class
        pres = self.Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shapeType = self.ShapeType()
        shp = sld.getShapes().addAutoShape(shapeType.Rectangle, 50, 150, 75, 150)

        # Set the fill type to Picture
        fillType = self.FillType()
        shp.getFillFormat().setFillType(fillType.Picture)

        # Set the picture fill mode
        pictureFillMode = self.PictureFillMode()
        shp.getFillFormat().getPictureFillFormat().setPictureFillMode(pictureFillMode.Tile)

        # Set the picture
        imgx = pres.getImages().addImage(self.FileInprinttream(self.File(self.dataDir + "night.jpg")))

        shp.getFillFormat().getPictureFillFormat().getPicture().setImage(imgx)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat()
        pres.save(self.dataDir + "RectShpPic.pptx", save_format.Pptx)

        print "Filled shapes with Picture, please check the output file." . PHP_EOL

     def fill_shapes_with_solid_color(self):

         # Create an instance of Presentation class
        pres = self.Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shapeType = self.ShapeType()
        shp = sld.getShapes().addAutoShape(shapeType.Rectangle, 50, 150, 75, 150)

        # Set the fill type to Solid
        fillType = self.FillType()
        shp.getFillFormat().setFillType(fillType.Solid)

        # Set the color of the rectangle
        color = self.Color()
        shp.getFillFormat().getSolidFillColor().setColor(color.YELLOW)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat()
        pres.save(self.dataDir + "RectShpSolid.pptx", save_format.Pptx)

        print "Filled shapes with Solid Color, please check the output file."

class FindShape:

     def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

     def main(self):
            # Create an instance of Presentation class
            pres=self.Presentation
            pres = pres(self.dataDir + 'Aspose.pptx')

            # Get the first slide
            slide = pres.getSlides().get_Item(0)

            shape = self.find_shape(slide)

            print "Shape: " 
            print shape

     def find_shape(self,alttext):

         #Iterating through all shapes inside the slide
        i = 0
        pres=self.Presentation()
        slide = pres.getSlides().get_Item(0)
        while (i < slide.getShapes().size()):
            # If the alternative text of the slide matches with the required one then return the shape
            if (slide.getShapes().get_Item(i).getAlternativeText() == alttext):
                return slide.getShapes().get_Item(i)

            i+=1
        
        return None

class FormatLines:

     def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
            self.ShapeType=jpype.JClass("com.aspose.slides.ShapeType")

     def main(self):

         # Formatting the Lines of Shapes
        self.format_lines()

        # Formatting the Join Styles
        self.format_join_styles()

     def format_lines(self):

         # Create an instance of Presentation class
        pres = self.Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add autoshape of rectangle type
        shapeType = self.ShapeType
        shp = sld.getShapes().addAutoShape(shapeType.Rectangle, 50, 150, 75, 150)

        # Set the fill color of the rectangle shape
        fillType = self.FillType()
        color = self.Color()
        shp.getFillFormat().setFillType(fillType.Solid)
        shp.getFillFormat().getSolidFillColor().setColor(color.WHITE)

        # Apply some formatting on the line of the rectangle

        lineStyle = self.LineStyle()
        shp.getLineFormat().setStyle(lineStyle.ThickThin)
        shp.getLineFormat().setWidth(7)

        lineDashStyle = self.LineDashStyle()
        shp.getLineFormat().setDashStyle(lineDashStyle.Dash)

        # set the color of the line of rectangle
        shp.getLineFormat().getFillFormat().setFillType(fillType.Solid)
        shp.getLineFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat()
        pres.save(self.dataDir + "RectShpLn.pptx", save_format.Pptx)

        print "Formatted lines, please check the output file." . PHP_EOL

     def format_join_styles(self):

         # Create an instance of Presentation class
        pres = self.Presentation()

        # Get the first slide
        sld = pres.getSlides().get_Item(0)

        # Add three autoshapes of rectangle type
        shape_type = self.ShapeType()
        shp1 = sld.getShapes().addAutoShape(shape_type.Rectangle, 50, 100, 150, 75)
        shp2 = sld.getShapes().addAutoShape(shape_type.Rectangle, 300, 100, 150, 75)
        shp3 = sld.getShapes().addAutoShape(shape_type.Rectangle, 50, 250, 150, 75)

        # Set the fill color of the rectangle shape
        fill_type = self.FillType()
        color = self.Color()
        shp1.getFillFormat().setFillType(fill_type.Solid)
        shp1.getFillFormat().getSolidFillColor().setColor(color.BLACK)
        shp2.getFillFormat().setFillType(fill_type.Solid)
        shp2.getFillFormat().getSolidFillColor().setColor(color.BLACK)
        shp3.getFillFormat().setFillType(fill_type.Solid)
        shp3.getFillFormat().getSolidFillColor().setColor(color.BLACK)

        # Set the line width
        shp1.getLineFormat().setWidth(15)
        shp2.getLineFormat().setWidth(15)
        shp3.getLineFormat().setWidth (15)

        # Set the color of the line of rectangle
        shp1.getLineFormat().getFillFormat().setFillType(fill_type.Solid)
        shp1.getLineFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)
        shp2.getLineFormat().getFillFormat().setFillType(fill_type.Solid)
        shp2.getLineFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)
        shp3.getLineFormat().getFillFormat().setFillType(fill_type.Solid)
        shp3.getLineFormat().getFillFormat().getSolidFillColor().setColor(color.BLUE)

        # Set the Join Style
        line_join_style = self.LineJoinStyle()
        shp1.getLineFormat().setJoinStyle(line_join_style.Miter)
        shp2.getLineFormat().setJoinStyle(line_join_style.Bevel)
        shp3.getLineFormat().setJoinStyle(line_join_style.Round)

        # Add text to each rectangle
        shp1.getTextFrame().setText ("This is Miter Join Style")
        shp2.getTextFrame().setText( "This is Bevel Join Style")
        shp3.getTextFrame().setText ("This is Round Join Style")

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat()
        pres.save(self.dataDir + "RectShpLnJoin.pptx", save_format.Pptx)

        print "Formatted join styles, please check the output file." . PHP_EOL


class Frame:

    def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
            self.AudioPlayModePreset=jpype.JClass("com.aspose.slides.AudioPlayModePreset")
            self.AudioVolumeMode=jpype.JClass("com.aspose.slides.AudioVolumeMode")
            self.VideoPlayModePreset=jpype.JClass("com.aspose.slides.VideoPlayModePreset")
            self.FileInputStream=jpype.JClass("java.io.FileInputStream")
            self.File=jpype.JClass("java.io.File")

    def main(self):

            # Adding Picture Frame to Slide
            self.add_picture_frame()
    
            # Adding Audio Frame to Slide
            self.add_audio_frame()
    
            # Adding Audio Frame to Slide
            self.add_video_frame()

    def add_picture_frame(self):

            # Create an instance of Presentation class
        pres = self.Presentation()

        # Get the first slide
        sId = pres.getSlides().get_Item(0)

        # Instantiate the Image class
        imgx = pres.getImages().addImage(self.FileInprinttream(self.File(self.dataDir + "aspose-logo.jpg")))

        # Add Picture Frame with height and width equivalent of Picture
        shapeType = self.ShapeType()
        sId.getShapes().addPictureFrame(shapeType.Rectangle, 50, 150, imgx.getWidth(), imgx.getHeight(), imgx)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat()
        pres.save(self.dataDir + "RectPicFrame.pptx", save_format.Pptx)

        print "Added picture frame to slide, please check the output file."

    def add_audio_frame(self):

        # Create an instance of Presentation class
        pres = self.Presentation()

        # Get the first slide
        sId = pres.getSlides().get_Item(0)

        # Load the wav sound file to stram
        fstr=self.FileInputStream()
        file=self.File()
        fstr = fstr.file.new(self.dataDir + "Bass-Drum.wav")

        # Add Audio Frame
        af = sId.getShapes().addAudioFrameEmbedded(50, 150, 100, 100, fstr)

        # Set Play Mode and Volume of the Audio
        audioPlayModePreset=self.AudioPlayModePreset()
        AudioVolumeMode=self.AudioVolumeMode()
        af.setPlayMode(audioPlayModePreset.Auto)
        af.setVolume(AudioVolumeMode.Loud)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat()
        pres.save(self.data_dir + "AudioFrameEmbed.pptx", save_format.Pptx)

        print "Added audio frame to slide, please check the output file." .PHP_EOL

    def add_video_frame(self):

        # Create an instance of Presentation class
        pres = self.Presentation()

        # Get the first slide
        sId = pres.getSlides().get_Item(0)

        # Add Video Frame
        vf = sId.getShapes().addVideoFrame(50, 150, 300, 150, self.dataDir + "Wildlife.mp4")

        # Set Play Mode and Volume of the Video
        videoPlayModePreset=self.VideoPlayModePreset()
        audioVolumeMode=self.AudioVolumeMode()
        vf.setPlayMode(videoPlayModePreset.Auto)
        vf.setVolume(audioVolumeMode.Loud)

        # Write the presentation as a PPTX file
        save_format = self.SaveFormat()
        pres.save(self.dataDir + "VideoFrame.pptx", save_format.Pptx)

        print "Added video frame to slide, please check the output file.".PHP_EOL

class RotatingShapes:

    def __init__(self, dataDir):
                print "init func"
                self.dataDir = dataDir
                self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
                self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
                self.ShapeType=jpype.JClass("com.aspose.slides.ShapeType")

    def main(self):

                 # Create an instance of Presentation class
                pres = self.Presentation()
        
                # Get the first slide
                sld = pres.getSlides().get_Item(0)
        
                # Add autoshape of rectangle type
                shapeType = self.ShapeType
                shp = sld.getShapes().addAutoShape(shapeType.Rectangle, 50, 150, 75, 150)
        
                # Rotate the shape to 90 degree
                shp.setRotation(90)
        
                # Write the presentation as a PPTX file
                save_format = self.SaveFormat()
                pres.save(self.dataDir + "RectShpRot.pptx", save_format.Pptx)
        
                print "Rotated shape, please check the output file." . PHP_EOL
