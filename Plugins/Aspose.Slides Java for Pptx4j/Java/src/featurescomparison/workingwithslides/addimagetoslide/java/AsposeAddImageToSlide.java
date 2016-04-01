package featurescomparison.workingwithslides.addimagetoslide.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.aspose.slides.IPPImage;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;

/**
 * 
 * @author Shoaib Khan
 *
 */
public class AsposeAddImageToSlide
{
	public static void main(String[] args)
	{
		String dataPath = "src/featurescomparison/workingwithslides/addimagetoslide/data/";
		
		//Instantiate Presentation class that represents the PPTX
		Presentation pres = new Presentation();

		//Get the first slide
		ISlide sld = pres.getSlides().get_Item(0);

		//Instantiate the Image class
		IPPImage imgx = null;

		try{
		    imgx = pres.getImages().addImage(new FileInputStream(new File(dataPath + "greentick.png")));
		}
		catch(IOException e){}

		//Add Picture Frame with height and width equivalent of Picture
		sld.getShapes().addPictureFrame(ShapeType.Rectangle, 50, 150, imgx.getWidth(), imgx.getHeight(), imgx);

		//Write the PPTX file to disk
		pres.save(dataPath + "ImageInSlide-Aspose.pptx", SaveFormat.Pptx);
		System.out.println("Done.");
	}
}