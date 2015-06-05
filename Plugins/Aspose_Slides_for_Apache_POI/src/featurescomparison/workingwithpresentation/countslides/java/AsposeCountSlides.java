package featurescomparison.workingwithpresentation.countslides.java;

import com.aspose.slides.Presentation;

public class AsposeCountSlides
{
	public static void main(String[] args)
	{
		String dataPath = "src/featurescomparison/workingwithpresentation/countslides/data/";
		
		//Instantiate a PresentationEx object that represents a PPTX file
		Presentation pres = new Presentation(dataPath + "presentation.pptx");
		
		System.out.println("Total Slides in Count: " + pres.getSlides().size());
	}
}
