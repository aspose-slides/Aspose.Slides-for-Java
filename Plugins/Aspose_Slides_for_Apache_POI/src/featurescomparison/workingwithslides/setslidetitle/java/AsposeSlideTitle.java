package featurescomparison.workingwithslides.setslidetitle.java;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeSlideTitle
{
	public static void main(String[] args)
	{
		String dataPath = "src/featurescomparison/workingwithslides/setslidetitle/data/";
		
		//Create a presentation
		Presentation pres = new Presentation();
		
		//Add the title slide
		ISlide slide = pres.getSlides().addEmptySlide(pres.getLayoutSlides().get_Item(0));
		
		//Set the title text
		((IAutoShape)slide.getShapes().get_Item(0)).getTextFrame().setText("Slide Title Heading");
		
		//Set the sub title text
		((IAutoShape)slide.getShapes().get_Item(1)).getTextFrame().setText("Slide Title Sub-Heading");

	    //Write output to disk
	    pres.save(dataPath + "Aspose_SlideTitle_Out.pptx",SaveFormat.Pptx);
	    
	    System.out.println("Presentation with Title Saved.");
	}
}
