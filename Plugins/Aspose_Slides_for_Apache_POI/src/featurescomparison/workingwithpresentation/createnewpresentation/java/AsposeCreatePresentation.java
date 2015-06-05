package featurescomparison.workingwithpresentation.createnewpresentation.java;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeCreatePresentation
{
	public static void main(String[] args)
	{
		String dataPath = "src/featurescomparison/workingwithpresentation/createnewpresentation/data/";
		
		//Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation();
		//Writing the presentation as a PPT file
		pres.save(dataPath + "NewPPT_Aspose_Out.ppt", SaveFormat.Ppt);

		//Printing the status
		System.out.println("Presentation Created successfully!");
	}
}
