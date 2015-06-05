package asposefeatures.presentationsecurity.accesspropertiesofprotectedpresentation.java;

import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.Presentation;

public class AsposeAccessDocPropertiesOfProtectedFile
{
    public static void main(String[] args)
    {
	String dataPath = "src/asposefeatures/presentationsecurity/accesspropertiesofprotectedpresentation/data/";
	
	// Accessing the Document Properties of a Password Protected
	// Presentation without Password
	// creating instance of load options to set the presentation access
	// password
	com.aspose.slides.LoadOptions loadOptions = new com.aspose.slides.LoadOptions();

	// Setting the access password to null
	loadOptions.setPassword(null);

	// Setting the access to document properties
	loadOptions.setOnlyLoadDocumentProperties(true);

	// Opening the presentation file by passing the file path and load
	// options to the constructor of Presentation class
	Presentation pres = new Presentation(dataPath + "AsposeProtection-PropAccess.pptx", loadOptions);

	// Getting Document Properties
	IDocumentProperties docProps = pres.getDocumentProperties();

	System.out.println("Properties Count: " + docProps.getCount());
    }
}