package featurescomparison.workingwithslides.traverseslide.java;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;

public class AsposeTraverseSlides
{
	public static void main(String[] args)
	{
		String dataPath = "src/featurescomparison/workingwithslides/traverseslide/data/";
		
		//Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataPath + "presentation.pptx");

		//Accessing slides
		for (ISlide slide : pres.getSlides())
		{
			System.out.println(slide.getSlideNumber());			
		}
		System.out.println("Done...");
	}
}