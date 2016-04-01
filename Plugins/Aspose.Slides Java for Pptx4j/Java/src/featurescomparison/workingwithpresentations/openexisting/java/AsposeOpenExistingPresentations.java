package featurescomparison.workingwithpresentations.openexisting.java;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeOpenExistingPresentations 
{
	public static void main(String[] args) 
	{
		String dataPath = "src/featurescomparison/workingwithpresentations/openexisting/data/";
		
		//Instantiate Presentation class that represents PPTX file
		Presentation pres = new Presentation(dataPath + "presentation.pptx");
		
		// Save presentation with chart
		pres.save(dataPath + "Aspose-Duplicate.pptx", SaveFormat.Pptx);	
		System.out.println("Done");	
	}
}