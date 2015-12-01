package com.aspose.slides.examples.asposefeatures.presentationsecurity.protectionwithpropertiesaccess;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class AsposeApplyProtectionwithPropertiesAccess
{
    public static void main(String[] args)
    {
	// The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeApplyProtectionwithPropertiesAccess.class);
	
	// Instantiate a Presentation object that represents a PPT file
	Presentation pres = new Presentation();

	// ....do some work here.....

	// Setting access to document properties in password protected mode
	pres.getProtectionManager().setEncryptDocumentProperties(false);

	// Setting Password
	pres.getProtectionManager().encrypt("pass");

	// Save your presentation to a file
	pres.save(dataDir + "AsposeProtection-PropAccess.pptx", com.aspose.slides.SaveFormat.Pptx);

	// Printing the status
	System.out.println("Protection Applied successfully!");
    }
}
