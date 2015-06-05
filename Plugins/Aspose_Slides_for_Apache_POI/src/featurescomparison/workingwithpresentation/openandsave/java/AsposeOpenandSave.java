package featurescomparison.workingwithpresentation.openandsave.java;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeOpenandSave
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithpresentation/openandsave/data/";
		
		//Instantiate a PresentationEx object that represents a PPTX file
		Presentation pres = new Presentation(dataPath + "presentation.ppt");
		
		//Add the title slide
		ISlide slide = pres.getSlides().addEmptySlide(pres.getLayoutSlides().get_Item(0));
		
		//Save the presentation
		pres.save(dataPath + "EditedPPT_Aspose_Out.ppt", SaveFormat.Ppt);
		
		System.out.println("Presentation Edited and Saved.");
	}
}
