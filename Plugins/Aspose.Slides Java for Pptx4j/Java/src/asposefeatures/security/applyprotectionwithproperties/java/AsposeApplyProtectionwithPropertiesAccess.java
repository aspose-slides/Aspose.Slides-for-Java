package asposefeatures.security.applyprotectionwithproperties.java;

import com.aspose.slides.Presentation;

public class AsposeApplyProtectionwithPropertiesAccess
{
	public static void main(String[] args)
	{
		String dataPath = "src/asposefeatures/security/applyprotectionwithproperties/data/";
		
		//Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation();

		//....do some work here.....

		//Setting access to document properties in password protected mode
		pres.getProtectionManager().setEncryptDocumentProperties ( false);

		//Setting Password
		pres.getProtectionManager().encrypt("pass");

		//Save your presentation to a file
		pres.save(dataPath + "AsposeProtection-PropAccess_Out.pptx", com.aspose.slides.SaveFormat.Pptx);
		
	    //Printing the status
	    System.out.println("Protection Applied successfully!");
	}
}
