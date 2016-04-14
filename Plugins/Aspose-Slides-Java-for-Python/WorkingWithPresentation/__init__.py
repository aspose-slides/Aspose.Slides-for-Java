__author__ = 'fahadadeel'
import jpype

class ConvertingToHtml:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.HtmlOptions=jpype.JClass("com.aspose.slides.HtmlOptions")
        self.HtmlFormatter=jpype.JClass("com.aspose.slides.HtmlFormatter")


    def main(self):

        self.convert_to_html()


    def convert_to_html(self):

        # Instantiate a Presentation object that represents a PPTX file
        pres=self.Presentation
        pres = pres(self.dataDir + "Aspose.pptx")

        html_opt = self.HtmlOptions()
        html_formatter = self.HtmlFormatter
        html_opt.setHtmlFormatter(html_formatter.createDocumentFormatter("",False))

        # Saving the presentation to HTML format
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Aspose.html", save_format.Html, html_opt)

        print "Document has been converted, please check the output file."

class ConvertingToNotes:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

    def main(self):
        # Converting Presentation to TIFF Notes
        self.convert_to_tiff_notes()

        # Converting Presentation to TIFF Notes
        self.convert_to_pdf_notes()

    def convert_to_tiff_notes(self):

        # Instantiate a Presentation object that represents a PPTX file
        pres=self.Presentation
        pres = pres(self.dataDir + "Aspose.pptx")

        # Saving the presentation
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Notes.tiff", save_format.TiffNotes)

        print "Document has been converted, please check the output file."


    def convert_to_pdf_notes(self):

        # Instantiate a Presentation object that represents a PPTX file
        pres = self.Presentation
        pres = pres(self.dataDir + "Aspose.pptx")

        # Saving the presentation
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Notes.pdf", save_format.pdf)

        print "Document has been converted, please check the output file."

class ConvertingToslides:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

    def main(self):

        # Instantiate a Presentation object that represents a PPTX file
        pres = self.presentation()
        pres = pres(self.dataDir + "Aspose.pptx")

        # Saving the PPTX presentation to slides format
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Aspose.slides", save_format.slides)

        print "Document has been converted, please check the output file."

class ConvertingToTiff:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.TiffOptions=jpype.JClass("com.aspose.slides.TiffOptions")
        self.TiffCompressionTypes=jpype.JClass("com.aspose.slides.TiffCompressionTypes")
        self.Dimension=jpype.JClass("java.awt.Dimension")

    def main(self):

        # Converting Presentation to TIFF with default size
        self.convert_with_default_size()

        # Converting Presentation to TIFF with custom size
        self.convert_with_custom_size()

    def convert_with_default_size(self):

        pres = self.Presentation
        pres = pres(self.dataDir + "Aspose.pptx")

        # Saving the PPTX presentation to Tiff format
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Aspose.tiff", save_format.Tiff)

        print "Document has been converted, please check the output file."

    def convert_with_custom_size(self):

        # Instantiate a Presentation object that represents a PPTX file
        pres= self.Presentation
        pres = pres(self.dataDir + "Aspose.pptx")

        # Instantiate the TiffOptions class
        opts = self.TiffOptions()

        # Setting compression type
        tiff_compression_types = self.TiffCompressionTypes
        opts.setCompressionType (tiff_compression_types.Default)

        #Setting image DPI
        opts.setDpiX(200)
        opts.setDpiY(100)

        # Set Image Size
        opts.setImageSize(self.Dimension(1728, 1078))

        # Save the presentation to TIFF with specified image size
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Aspose-Custom-Size.tiff", save_format.Tiff,opts)

        print "Document has been converted, please check the output file."


class ConvertingToXps:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")
        self.XpsOptions=jpype.JClass("com.aspose.slides.XpsOptions")

    def main(self):

        # Converting Presentation to TIFF with default size
        self.convert_with_default_size()

        # Converting Presentation to TIFF with custom size
        self.convert_with_custom_size()

    def convert_with_default_size(self):
        
        # Instantiate a Presentation object that represents a PPTX file
        pres=self.Presentation
        pres = pres(self.dataDir + "Aspose.pptx")

        # Saving the presentation to XPS format
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Aspose.xps", save_format.Xps)

        print "Document has been converted, please check the output file."

    def convert_with_custom_size(self):

        # Instantiate a Presentation object that represents a PPTX file
        pres = self.Presentation(self.dataDir + "Aspose.pptx")

        # Instantiate the TiffOptions class
        opts = self.XpsOptions()

        # Save MetaFiles as PNG
        opts.SaveMetafilesAsPng = True

        # Save the presentation to TIFF with specified image size
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Aspose-Custom-Size.xps", save_format.Xps, opts)

        print "Document has been converted, please check the output file."


class OdpToPptx:

     def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

     def main(self):

        pres= self.Presentation
        pres = pres(self.dataDir + "Source.odp")

        # Saving the PPTX presentation to PPTX format
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Source.pptx", save_format.Pptx)

        print "Document has been converted, please check the output file."

class PptToPptx:

     def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

     def main(self):

         # Instantiate a Presentation object that represents a PPTX file
        pres= self.Presentation
        pres = pres(self.dataDir + "Presentation1.pptx")

        # Saving the PPTX presentation to PPTX format
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Aspose.pptx", save_format.Pptx)

        print "Document has been converted, please check the output file."

class Properties:

      def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

      def main(self):
        self.get_properties()

        # Modifying Built-in Properties
        self.update_properties()

        # Adding Custom Document Properties
        self.add_custom_properties()

        # Removing Document Properties
        self.remove_property()

      def get_properties(self):

          # Instantiate the Presentation class that represents the presentation
        pres = self.Presentation
        pres = pres(self.dataDir + "HelloWorld.pptx")

        # Create a reference to IDocumentProperties object associated with Presentation
        dp = pres.getDocumentProperties()

        # Display the builtin properties
        print "Category : " + dp.getCategory() 
        print "Current Status : " + dp.getContentStatus() 
        print "Creation Date : "
        print dp.getCreatedTime() 
        print "Author : " + dp.getAuthor() 
        print "Description : " + dp.getComments() 
        print "KeyWords : " + dp.getKeywords() 
        print "Last Modified By : " + dp.getLastSavedBy() 
        print "Supervisor : " + dp.getManager() 
        print "Modified Date : " 
        print dp.getLastSavedTime() 
        #print "Presentation Format : " + dp.getPresentationFormat() 
        print "Last Print Date : "
        print dp.getLastPrinted() 
        print "Is Shared between producers : " 
        print dp.getSharedDoc() 
        print "Subject : " + dp.getSubject() 
        print "Title : " + dp.getTitle()

      def update_properties(self):

          # Instantiate the Presentation class that represents the presentation
        pres = self.Presentation(self.dataDir + "HelloWorld.pptx")

        # Create a reference to IDocumentProperties object associated with Presentation
        dp = pres.getDocumentProperties()

        # Set the builtin properties
        dp.setAuthor ("Aspose.Slides for Java")
        dp.setTitle ("Modifying Presentation Properties")
        dp.setSubject ( "Aspose Subject")
        dp.setComments ( "Aspose Description")
        dp.setManager ( "Aspose Manager")

        # Save your presentation to a file
        save_format = self.SaveFormat
        pres.save(self.dataDir + "DocProps.pptx", save_format.Pptx)

        print "Properties have been updated, Please check output file."

      def add_custom_properties(self):

          # Instantiate the Presentation class that represents the presentation
        pres = self.Presentation(self.dataDir + "HelloWorld.pptx")

        # Getting Document Properties
        dp = pres.getDocumentProperties()

        # Adding Custom properties
        dp.set_Item("self.Custom" , 12)
        dp.set_Item("My Name","Mudassir")
        dp.set_Item("Custom", 124)

        # Saving presentation
        save_format = self.SaveFormat
        pres.save(self.dataDir + "CustomDemo.pptx", save_format.Pptx)

        print "Added custom properties, please check output file."

      def remove_property(self):

        # Instantiate the Presentation class that represents the presentation
        pres = self.Presentation(self.dataDir + "HelloWorld.pptx")

        # Getting Document Properties
        dp = pres.getDocumentProperties()

        # Getting property name at particular index
        property_name = dp.getPropertyName(1)

        # Removing selected property
        dp.remove(property_name)

        # Saving presentation
        save_format = self.SaveFormat
        pres.save(self.dataDir + "RemoveDP.pptx", save_format.Pptx)

        print "Remove document property, please check output file."

class Zoom:

      def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

      def main(self):

        pres = self.Presentation()

        pres.getViewProperties().getNotesViewProperties().setScale(50)

        # Save the presentation as a PPTX file
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Zoom.pptx", save_format.Pptx)

        print "Set zoom value, please check the output file."
        
class ConvertingToPdf:

    def __init__(self, dataDir):
        print "init func"
        self.dataDir = dataDir
        self.Presentation=jpype.JClass("com.aspose.slides.Presentation")
        self.SaveFormat=jpype.JClass("com.aspose.slides.SaveFormat")

    def main(self):

        # Instantiate a Presentation object that represents a PPTX file
        pres = self.Presentation(self.dataDir + "Aspose.pptx")

        # Saving the PPTX presentation to Pdf format
        save_format = self.SaveFormat
        pres.save(self.dataDir + "Aspose.pdf", save_format.Pdf)

        print "Document has been converted, please check the output file."