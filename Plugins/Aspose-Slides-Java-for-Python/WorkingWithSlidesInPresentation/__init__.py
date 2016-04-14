__author__ = 'fahadadeel'
import jpype

class AccessSlides:

    def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

    def main(self):

            # Using Slides Collection to Access Slide by Index
        AccessSlides.get_slide_by_index(self.dataDir)

        # Using Slides Collection to Access Slide by ID
        AccessSlides.get_slide_by_id(self.dataDir)

    def get_slide_by_index(self):

        # Instantiate Presentation class that represents the presentation file
        pres = self.Presentation(self.dataDir + 'Aspose.pptx')

        # Accessing a slide using its slide index
        slide = pres.getSlides().get_Item(0)

        print "Slide: " . slide

    def get_slide_by_id(self):

        # Instantiate Presentation class that represents the presentation file
        pres=self.Presentation()
        pres = pres(self.dataDir + 'Aspose.pptx')

        # Getting Slide ID
        id = pres.getSlides().get_Item(0).getSlideId()

        # Accessing Slide by ID
        slide = pres.getSlideById(id)

        print "Slide: " . slide

class AddSlides:

     def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

     def main(self):
         # Instantiate Presentation class that represents the presentation file
        pres = self.Presentation()

        # Instantiate SlideCollection calss
        slides = pres.getSlides()

        i = 0
        while (i < pres.getLayoutSlides().size()):

            # Add an empty slide to the Slides collection
            slides.addEmptySlide(pres.getLayoutSlides().get_Item(i))
            i+=1

        

        #Do some work on the newly added slide

        # Saving the presentation
        save_format = self.SaveFormat
        pres.save(self.dataDir + "EmptySlide.pptx", save_format.Pptx)

        print "Document has been created, please check the output file."

class Background:

        def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
            self.BackgroundType=jpype.JClass("com.aspose.slides.BackgroundType")
            self.FillType=jpype.JClass("com.aspose.slides.FillType")
            self.PictureFillMode=jpype.JClass("com.aspose.slides.PictureFillMode")
            self.Color=jpype.JClass("java.awt.Color")
            self.File=jpype.JClass("java.io.File")
            self.FileInputStream=jpype.JClass("java.io.FileInputStream")

        def main(self):
            
            # Setting the Background Color of a Master Slide
            self.set_background_color_of_master_slide()

            # Setting the Background Color of a Normal Slide
            self.set_background_color_of_normal_slide()

            # Setting the Slide Background to an Image
            self.set_image_as_background_color()

        def set_background_color_of_master_slide(self):

            # Instantiate Presentation class that represents the presentation file
            pres = self.Presentation()

            # Set the background color of the Master Slide to Forest Green
            backgroundType = self.BackgroundType
            fillType = self.FillType
            color = self.Color

            pres.getMasters().get_Item(0).getBackground().setType(backgroundType.OwnBackground)
            pres.getMasters().get_Item(0).getBackground().getFillFormat().setFillType(fillType.Solid)
            pres.getMasters().get_Item(0).getBackground().getFillFormat().getSolidFillColor().setColor(color.GREEN)

            # Saving the presentation
            save_format = self.SaveFormat
            pres.save(self.dataDir + "MasterBG.pptx", save_format.Pptx)

            print "Set background color of master slide, please check the output file."

        def set_background_color_of_normal_slide(self):

            # Instantiate Presentation class that represents the presentation file
            pres = self.Presentation()

            # Set the background color of the Normal slide to Blue

            backgroundType = self.BackgroundType
            fillType = self.FillType
            color = self.Color

            pres.getSlides().get_Item(0).getBackground().setType(backgroundType.OwnBackground)
            pres.getSlides().get_Item(0).getBackground().getFillFormat().setFillType(fillType.Solid)
            pres.getSlides().get_Item(0).getBackground().getFillFormat().getSolidFillColor().setColor(color.BLUE)

            # Saving the presentation
            save_format = self.SaveFormat
            pres.save(self.dataDir + "ContentBG.pptx", save_format.Pptx)

            print "Set background color of normal slide, please check the output file."

        def set_image_as_background_color(self):

            # Instantiate Presentation class that represents the presentation file
            pres = self.Presentation
    
            # Set the background with Image
    
            backgroundType = self.BackgroundType
            fillType = self.FillType
            pictureFillMode = self.PictureFillMode
    
            pres.getSlides().get_Item(0).getBackground().setType(backgroundType.OwnBackground)
            pres.getSlides().get_Item(0).getBackground().getFillFormat().setFillType(fillType.Picture)
            pres.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat().setPictureFillMode(pictureFillMode.Stretch)
    
            # Set the picture
            imgx = pres.getImages().addImage(self.FileInputStream(self.File(self.dataDir + 'night.jpg')))
    
            # Image imgx = pres.getImages().addImage(image)
            # Add image to presentation's images collection
    
            pres.getSlides().get_Item(0).getBackground().getFillFormat().getPictureFillFormat().getPicture().setImage(imgx)
    
            # Saving the presentation
            save_format = self.SaveFormat
            pres.save(self.dataDir + "ContentBG_Image.pptx", save_format.Pptx)
    
            print "Set image as background, please check the output file."

class ChangingPosition:

        def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

        def main(self):

            # Instantiate Presentation class that represents the presentation file
            pres = self.Presentation(self.dataDir + 'Aspose.pptx')
    
            # Get the slide whose position is to be changed
            slide = pres.getSlides().get_Item(0)
    
            # Set the self.position for the slide
            slide.setSlideNumber(1)
    
            # Saving the presentation
            save_format = self.SaveFormat
            pres.save(self.dataDir + "Aspose_Position.pptx", save_format.Pptx)
    
            print "Changes slide position, please check the output file."

class CloneSlides:

        def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

        def main(self):
            
            # Within the Same Presentation from One Position to the End
            self.clone_to_end_of_presentation()
    
            # From One Position to Anther within the Same Presentation
            self.clone_to_aonther_position()
    
            # In Another Presentation at the End of the Existing Slides
            self.clone_to_other_presentation_at_end_of_existing_slide()

        def clone_to_end_of_presentation(self):

            # Instantiate Presentation class that represents the presentation file
            pres = self.Presentation(self.dataDir + 'Aspose.pptx')

            # Clone the desired slide to the end of the collection of slides in the same presentation
            slides = pres.getSlides()
            slides.addClone(pres.getSlides().get_Item(0))

            # Saving the presentation file
            save_format = self.SaveFormat
            pres.save(self.dataDir + "Aspose_Cloned.pptx", save_format.Pptx)

            print "Slide has been cloned, please check the output file." 

        def clone_to_aonther_position(self):

            # Instantiate Presentation class that represents the presentation file
            pres = self.Presentation(self.dataDir + 'Aspose.pptx')

            # Clone the desired slide to the end of the collection of slides in the same presentation
            slides = pres.getSlides()

            # Clone the desired slide to the specified index in the same presentation
            slides.insertClone(1, pres.getSlides().get_Item(0))

            # Saving the presentation file
            save_format = self.SaveFormat
            pres.save(self.dataDir + "Aspose_Cloned.pptx", save_format.Pptx)

            print "Slide has been cloned, please check the output file." 

        def clone_to_other_presentation_at_end_of_existing_slide(self):

            # Instantiate Presentation class that represents the presentation file
            src_pres = self.Presentation(self.dataDir + 'Aspose.pptx')
    
            # Instantiate Presentation class for destination PPTX (where slide is to be cloned)
            dest_pres = self.Presentation()
    
            # Clone the desired slide from the source presentation to the end of the collection of slides in destination presentation
            slds = dest_pres.getSlides()
    
            slds.addClone(src_pres.getSlides().get_Item(0))
    
            # Saving the presentation file
            save_format = self.SaveFormat
            dest_pres.save(self.dataDir + "Aspose_dest2.pptx", save_format.Pptx)
    
            print "Slide has been cloned, please check the output file."

class CreatingSvg:

        def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
            self.FileOutputStream=jpype.JClass("java.io.FileOutputStream")

        def main(self):

            # Instantiate Presentation class that represents the presentation file
            pres = self.Presentation
            pres = pres(self.dataDir + 'Aspose.pptx')
    
            # Getting last slide index
            last_slide_position = pres.getSlides().size()
    
            #Iterating through every presentation slide and generating SVG image
            i = 0
            while (i < last_slide_position):
    
                # Accessing Slides
                slide = pres.getSlides().get_Item(i)
    
                # Getting and saving the slide SVG image
                slide.writeAsSvg(self.FileOutputStream(self.dataDir + "SvgImage#i.svg"))
    
                i+=1
            print "Created SVG images, please check output files."

class Hyperlinks:

        def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

        def main(self):

            # Instantiate Presentation class that represents the presentation file
            pres = self.Presentation
            pres = pres(self.dataDir + 'Aspose.pptx')
    
            # Removing the hyperlinks from presentation
            pres.getHyperlinkQueries().removeAllHyperlinks()
    
            # Saving the presentation
            save_format = self.SaveFormat
            pres.save(self.dataDir + "Hyperlinks.pptx", save_format.Pptx)
    
            print "Removed hyperlinks successfully, please check the output file."

class RemoveSlides:

        def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

        def main(self):
            
            # Using Slides Collection to Remove Slide by Index
            self.remove_slide_by_index()

            # Using Slides Collection to Remove Slide by ID
            self.remove_slide_by_id()

        def remove_slide_by_index(self):

            # Instantiate Presentation class that represents the presentation file
            pres = self.Presentation(self.dataDir + 'Aspose.pptx')

            # Accessing a slide using its slide index
            slide = pres.getSlides().get_Item(0)

            # Removing a slide using its reference
            pres.getSlides().remove(slide)

            # Saving the presentation file
            save_format = self.SaveFormat
            pres.save(self.dataDir + "Modified.pptx", save_format.Pptx)

            print "Removed slide by Index, please check the output file."

        def remove_slide_by_id(self):

            # Instantiate Presentation class that represents the presentation file
            pres = self.Presentation(self.dataDir + 'Aspose.pptx')
    
            # Removing a slide using its slide index
            pres.getSlides().removeAt(0)
    
            # Saving the presentation file
            save_format = self.SaveFormat
            pres.save(self.dataDir + "Modified.pptx", save_format.Pptx)
    
            print "Removed slide by ID, please check the output file."

class SizeAndLayout:

        def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
            self.SlideSizeType=jpype.JClass("com.aspose.slides.SlideSizeType")
            self.slidesOptions=jpype.JClass("com.aspose.slides.PdfOptions")

        def main(self):

            # Setting the Size and Type of a slide
            self.set_size_and_type()

            # Setting the page size when generating slides
            self.set_page_size_for_slides()

        def set_size_and_type(self):

            # Instantiate Presentation class that represents the presentation file
            pres = self.Presentation(self.dataDir + 'Aspose.pptx')
            aux_pres = self.Presentation()

            slide = pres.getSlides().get_Item(0)

            # Set the slide size of generated presentations to that of source
            aux_pres.getSlideSize().setType(pres.getSlideSize().getType())
            aux_pres.getSlideSize().setSize(pres.getSlideSize().getSize())

            # Clone required slide
            aux_pres.getSlides().addClone(pres.getSlides().get_Item(0))
            aux_pres.getSlides().removeAt(0)

            # Saving the presentation
            save_format = self.SaveFormat
            pres.save(self.dataDir + "Slide_Size_Type.pptx", save_format.Pptx)

            print "Set slide size and type, please check the output file."

        def set_page_size_for_slides(self):

            # Instantiate Presentation class that represents the presentation file
            pres = self.Presentation()
    
            # Set SlideSize.Type Property
            slideSizeType = self.SlideSizeType
            pres.getSlideSize().setType(slideSizeType.A4Paper)
    
            # Set different properties of slides Options
            opts = self.slidesOptions
            opts.setSufficientResolution(600)
    
            # Saving the presentation
            save_format = self.SaveFormat
            pres.save(self.dataDir + "Export.slides", save_format.slides, opts)
    
            print "Set page size for slides, please check the output file."

class Thumbnail:

       def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
            self.ImageIO=jpype.JClass("javax.ImageIO")
            self.File=jpype.JClass("java.io.File")

       def main(self):

           # Generating a Thumbnail from a Slide
            self.create_thumbnail()

            # Generating a Thumbnail from a Slide with User Defined Dimensions
            self.create_thumbnail_custom_size()

            # Generating a Thumbnail from a Slide in Notes Slides View
            self.create_thumbnail_in_notes_slides_view()

            # Generating a Thumbnail of User Defined Window from a Slide
            self.create_thumbnail_of_user_defined_window()

       def create_thumbnail(self):

           # Instantiate Presentation class that represents the presentation file
            pres=self.Presentation
            pres = pres(self.dataDir + 'Aspose.pptx')

            # Access the first slide
            slide = pres.getSlides().get_Item(0)

            # Create a full scale image
            image = slide.getThumbnail()

            # Save the image to disk in JPEG format
            imageIO = self.ImageIO()

            imageIO.write(image, "jpeg", self.File(self.dataDir + "ContentBG_tnail.jpg"))

            print "Created thumbnail, please check the output file."

       def create_thumbnail_custom_size(self):

           # Instantiate Presentation class that represents the presentation file
            pres=self.Presentation()
            pres = pres(self.dataDir + 'Aspose.pptx')

            # Access the first slide
            slide = pres.getSlides().get_Item(0)

            # User defined dimension
            desired_x = 1200
            desired_y = 800

            # Getting scaled value  of X and Y
            scale_x = (1.0 / pres.getSlideSize().getSize().getWidth()) * desired_x
            scale_y = (1.0 / pres.getSlideSize().getSize().getHeight()) * desired_y

            # Create a full scale image
            image = slide.getThumbnail(scale_x, scale_y)

            # Save the image to disk in JPEG format
            imageIO = self.ImageIO()
            imageIO.write(image, "jpeg", self.File(self.dataDir + "ContentBG_tnail.jpg"))

            print "Created thumbnail with custom size, please check the output file."

       def create_thumbnail_in_notes_slides_view(self):

           # Instantiate Presentation class that represents the presentation file
            pres=self.Presentation()
            pres = pres(self.dataDir + 'Aspose.pptx')

            # Access the first slide
            slide = pres.getSlides().get_Item(0)

            # User defined dimension
            desired_x = 1200
            desired_y = 800

            # Getting scaled value  of X and Y
            scale_x = (1.0 / pres.getSlideSize().getSize().getWidth()) * desired_x
            scale_y = (1.0 / pres.getSlideSize().getSize().getHeight()) * desired_y

            # Create a full scale image
            image = slide.getNotesSlide().getThumbnail(scale_x, scale_y)

            # Save the image to disk in JPEG format
            imageIO = self.ImageIO()
            imageIO.write(image, "jpeg", self.File(self.dataDir + "ContentBG_tnail.jpg"))

            print "Created thumbnail in notes slides view, please check the output file."

       def create_thumbnail_of_user_defined_window(self):

           # Instantiate Presentation class that represents the presentation file
            pres=self.Presentation()
            pres = pres(self.dataDir + 'Aspose.pptx')
    
            # Access the first slide
            slide = pres.getSlides().get_Item(0)
    
            # Create a full scale image
            image = slide.getThumbnail(1,1)
    
            # Getting the image of desired window inside generated slide thumnbnail
            # BufferedImage window = image.getSubimage(windowX, windowY, windowsWidth, windowHeight)
            window_image = image.getSubimage(100, 100, 200, 200)
    
            # Save the image to disk in JPEG format
            imageIO = self.ImageIO()
            imageIO.write(image, "jpeg", self.File(self.dataDir + "ContentBG_tnail.jpg"))
    
            print "Created thumbnail of user defined window, please check the output file."

class Transitions:

        def __init__(self, dataDir):
            print "init func"
            self.dataDir = dataDir
            self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
            self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
            self.TransitionType=jpype.JClass("com.aspose.slides.TransitionType")

        def main(self):

            # Instantiate Presentation class that represents the presentation file
            pres = self.Presentation(self.dataDir + 'Aspose.pptx')
    
            transition_type = self.TransitionType
    
            # Apply circle type transition on slide 1
            pres.getSlides().get_Item(0).getSlideShowTransition().setType(transition_type.Circle)
    
            # Apply comb type transition on slide 2
            pres.getSlides().get_Item(0).getSlideShowTransition().setType(transition_type.Comb)
    
            # Saving the presentation
            save_format = self.SaveFormat
            pres.save(self.dataDir + "SimpleTransition.pptx", save_format.Pptx)
    
            print "Done with simple transition, please check the output file." 

