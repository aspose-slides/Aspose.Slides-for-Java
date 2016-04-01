package featurescomparison.workingwithpresentations.helloworld.java;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;

public class AsposeHelloWorld 
{
	public static void main(String[] args) 
	{
		String dataPath = "src/featurescomparison/workingwithpresentations/helloworld/data/";
		
		// Instantiate Presentation class that represents the PPTX
		Presentation pres = new Presentation();

		//Get the first slide
		ISlide sld = (ISlide)pres.getSlides().get_Item(0);

		//Add an AutoShape of Rectangle type
		IAutoShape ashp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 150, 75, 150, 50);

		//Add ITextFrame to the Rectangle
		ashp.addTextFrame("Hello World");
		
		//Write the PPTX file to disk
		pres.save(dataPath + "AsposeHelloWorld.pptx", SaveFormat.Pptx);
		System.out.println("Done.");
	}
}
