package featurescomparison.workingwithpresentation.addslides.java;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeAddSlides
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithpresentation/addslides/data/";
		
		//Instantiate a PresentationEx object that represents a PPTX file
		Presentation pres = new Presentation(dataPath + "presentation.pptx");
		
		//Add Slide
		ISlide slide = pres.getSlides().addEmptySlide(pres.getLayoutSlides().get_Item(0));
		
		//Save the presentation
		pres.save(dataPath + "SlidesAdded_Aspose_Out.pptx", SaveFormat.Pptx);
		
		System.out.println("Slide Added and Saved.");
	}
}