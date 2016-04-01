package featurescomparison.workingwithslides.addautoshapes.java;

import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;

public class Aspose4jAutoShapes 
{
	public static void main(String[] args) 
	{
		String dataPath = "src/featurescomparison/workingwithslides/addautoshapes/data/";
		
		//Instantiate PresentationEx class that represents the PPTX file
		Presentation pres = new Presentation();

		//Get the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		for (int i = 1 ; i <= ShapeType.ChartPlus ; i++)
		{
			System.out.println(i + ". Done.");
			//Add an auto shape of type line
			sld.getShapes().addAutoShape(i, 50, 100, 150, 100);
			sld = pres.getSlides().addEmptySlide(pres.getLayoutSlides().get_Item(0));
		}
		//Write the PPTX to Disk
		pres.save(dataPath + "AsposeShapes.pptx", SaveFormat.Pptx);
		
		System.out.println("Done...");
	}
}
