package featurescomparison.workingwithpresentation.deleteslides.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xslf.usermodel.XMLSlideShow;

public class ApacheDeleteSlides
{
	public static void main(String[] args)throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithpresentation/deleteslides/data/";
		
		XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(dataPath + "presentation.pptx"));
		
		ppt.removeSlide(0); // 0-based index of a slide to be removed
		
		FileOutputStream out = new FileOutputStream(dataPath + "DeleteSlide_Apache_Out.ppt");
		ppt.write(out);
		out.close();
		
		//Printing the status
        System.out.println("Slide removed successfully!");
	}
}
