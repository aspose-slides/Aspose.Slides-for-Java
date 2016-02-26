from asposeslides import Settings
from com.aspose.slides import Presentation
from com.aspose.slides import SaveFormat
from com.aspose.slides import XpsOptions

class Properties:

    def __init__(self):
                        
         
        # Accessing Built-in Properties
        self.get_properties()

        # Modifying Built-in Properties
        self.update_properties()

        # Adding Custom Document Properties
        self.add_custom_properties()

        # Removing Document Properties
        self.remove_property()
        
    def get_properties(dataDir):
    
        dataDir = Settings.dataDir + 'WorkingWithPresentation/Properties/'
        
         # Instantiate the Presentation class that represents the presentation
        pres = Presentation(dataDir + "HelloWorld.pptx")

        # Create a reference to IDocumentProperties object associated with Presentation
        dp = pres.getDocumentProperties()

        # Display the builtin properties
        print "Category : " + dp.getCategory()
        print "Current Status : " + dp.getContentStatus()
        print "Creation Date : "
        dp.getCreatedTime()
        print "Author : " + dp.getAuthor()
        print "Description : " + dp.getComments()
        print "KeyWords : " + dp.getKeywords()
        print "Last Modified By : " + dp.getLastSavedBy()
        print "Supervisor : " + dp.getManager()
        print "Modified Date : " 
        dp.getLastSavedTime()
        print "Presentation Format : "
        dp.getPresentationFormat()
        print "Last Print Date : " 
        dp.getLastPrinted()
        print "Is Shared between producers : "
        dp.getSharedDoc()
        print "Subject : "
        dp.getSubject()
        print "Title : "
        dp.getTitle()
        
    def update_properties(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithPresentation/Properties/'
        
        # Instantiate the Presentation class that represents the presentation
        pres = Presentation(dataDir + "HelloWorld.pptx")

        # Create a reference to IDocumentProperties object associated with Presentation
        dp = pres.getDocumentProperties()

        # Set the builtin properties
        dp.setAuthor ("Aspose.Slides for Java")
        dp.setTitle ("Modifying Presentation Properties")
        dp.setSubject ( "Aspose Subject")
        dp.setComments ( "Aspose Description")
        dp.setManager ( "Aspose Manager")

        # Save your presentation to a file
        save_format = SaveFormat
        pres.save(dataDir + "DocProps.pptx", save_format.Pptx)

        print "Properties have been updated, Please check output file."
        
    def add_custom_properties(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithPresentation/Properties/'
        
        #Instantiate the Presentation class that represents the presentation
        pres = Presentation(dataDir + "HelloWorld.pptx")

        # Getting Document Properties
        dp = pres.getDocumentProperties()

        # Adding Custom properties
        dp.set_Item("New Custom" , 12)
        dp.set_Item("My Name","Mudassir")
        dp.set_Item("Custom", 124)

        # Saving presentation
        save_format = SaveFormat
        pres.save(dataDir + "CustomDemo.pptx", save_format.Pptx)

        print "Added custom properties, please check output file."
        
    
    def remove_property(dataDir):
        
        dataDir = Settings.dataDir + 'WorkingWithPresentation/Properties/'
        
        # Instantiate the Presentation class that represents the presentation
        pres = Presentation(dataDir + "HelloWorld.pptx")

        # Getting Document Properties
        dp = pres.getDocumentProperties()

        # Getting property name at particular index
        property_name = dp.getPropertyName(2)

        # Removing selected property
        dp.remove(property_name)

        # Saving presentation
        save_format = SaveFormat
        pres.save(dataDir + "RemoveDP.pptx", save_format.Pptx)

        print "Remove document property, please check output file."

if __name__ == '__main__':        
    Properties()