package featurescomparison.workingwithslides.moveslide.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;

public class ApacheMoveSlides
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithslides/moveslide/data/";
		
		XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(dataPath + "presentation.pptx"));

		//add slides
	    ppt.createSlide();
	    ppt.createSlide();
	    ppt.createSlide();

	    XSLFSlide[] slides = ppt.getSlides();
	    ppt.setSlideOrder(slides[0], 4); 
	    
	    //save changes in a file
	    FileOutputStream out = new FileOutputStream(dataPath + "Apache_ReOrdered_Slides_Out.pptx");
	    ppt.write(out);
	    out.close();
	    
		System.out.println("Slides ReOrdered Successfuly.");
	}
}