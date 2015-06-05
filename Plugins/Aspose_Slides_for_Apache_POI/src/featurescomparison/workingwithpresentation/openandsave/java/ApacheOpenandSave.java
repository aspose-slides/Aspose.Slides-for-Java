package featurescomparison.workingwithpresentation.openandsave.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;

public class ApacheOpenandSave
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithpresentation/openandsave/data/";
		
		XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(dataPath + "presentation.pptx"));
		
		//append a new slide to the end
		XSLFSlide blankSlide = ppt.createSlide();
		
		//save changes in a file
		FileOutputStream out = new FileOutputStream(dataPath + "EditedPPT_Apache_Out.pptx");
		ppt.write(out);
		out.close();

		System.out.println("Presentation Edited and Saved.");
	}
}
