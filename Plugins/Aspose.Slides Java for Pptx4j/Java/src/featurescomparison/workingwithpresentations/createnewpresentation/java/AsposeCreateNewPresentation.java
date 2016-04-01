package featurescomparison.workingwithpresentations.createnewpresentation.java;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeCreateNewPresentation 
{
	public static void main(String[] args) 
	{
		String dataPath = "src/featurescomparison/workingwithpresentations/createnewpresentation/data/";
		
		// Instantiate Presentation class that represents the PPTX
		Presentation pres = new Presentation();

		//Write the PPTX file to disk
		pres.save(dataPath + "Aspose-New-Presentation.pptx", SaveFormat.Pptx);
		System.out.println("Done.");
	}
}