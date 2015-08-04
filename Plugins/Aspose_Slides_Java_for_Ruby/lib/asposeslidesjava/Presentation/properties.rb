module Asposeslidesjava
  module Properties
    def initialize()
        # Accessing Built-in Properties 
        get_properties()

        # Modifying Built-in Properties
        update_properties()

        # Adding Custom Document Properties
        add_custom_properties()
    end

    def get_properties()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
       
        # Instantiate the Presentation class that represents the presentation
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + "HelloWorld.pptx")

        # Create a reference to IDocumentProperties object associated with Presentation
        dp = pres.getDocumentProperties()

        # Display the builtin properties
        puts "Category : " + dp.getCategory().to_s
        puts "Current Status : " + dp.getContentStatus().to_s
        puts "Creation Date : " + dp.getCreatedTime().to_string
        puts "Author : " + dp.getAuthor().to_s
        puts "Description : " + dp.getComments().to_s
        puts "KeyWords : " + dp.getKeywords().to_s
        puts "Last Modified By : " + dp.getLastSavedBy().to_s
        puts "Supervisor : " + dp.getManager().to_s
        puts "Modified Date : " + dp.getLastSavedTime().to_string
        puts "Presentation Format : " + dp.getPresentationFormat().to_s
        puts "Last Print Date : " + dp.getLastPrinted().to_string
        puts "Is Shared between producers : " + dp.getSharedDoc().to_s
        puts "Subject : " + dp.getSubject().to_s
        puts "Title : " + dp.getTitle().to_s
    end

    def update_properties()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
       
        # Instantiate the Presentation class that represents the presentation
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + "HelloWorld.pptx")

        # Create a reference to IDocumentProperties object associated with Presentation
        dp = pres.getDocumentProperties()

        # Set the builtin properties
        dp.setAuthor ("Aspose.Slides for Java")
        dp.setTitle ("Modifying Presentation Properties")
        dp.setSubject ( "Aspose Subject")
        dp.setComments ( "Aspose Description")
        dp.setManager ( "Aspose Manager")

        # Save your presentation to a file
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "DocProps.pptx", save_format.Pptx)

        puts "Properties have been updated, Please check output file."
    end    

    def add_custom_properties()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
       
        # Instantiate the Presentation class that represents the presentation
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + "HelloWorld.pptx")

        # Getting Document Properties
        dp = pres.getDocumentProperties()

        # Adding Custom properties
        dp.set_Item("New Custom" , 12)
        dp.set_Item("My Name","Mudassir")
        dp.set_Item("Custom", 124)

        # Saving presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "CustomDemo.pptx",save_format.Pptx)

        puts "Added custom properties, please check output file."
    end    

    def remove_property()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
       
        # Instantiate the Presentation class that represents the presentation
        pres = Rjb::import('com.aspose.slides.Presentation').new(data_dir + "HelloWorld.pptx")

        # Getting Document Properties
        dp = pres.getDocumentProperties()

        # Getting property name at particular index
        property_name = dp.getPropertyName(2)

        # Removing selected property
        dp.remove(property_name)

        # Saving presentation
        save_format = Rjb::import('com.aspose.slides.SaveFormat')
        pres.save(data_dir + "RemoveDP.pptx",save_format.Pptx)

        puts "Remove document property, please check output file."
    end    
  end
end
