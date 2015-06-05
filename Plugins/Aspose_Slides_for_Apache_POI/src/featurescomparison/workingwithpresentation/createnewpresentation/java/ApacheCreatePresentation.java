package featurescomparison.workingwithpresentation.createnewpresentation.java;

import java.io.FileOutputStream;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.usermodel.SlideShow;

public class ApacheCreatePresentation
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithpresentation/createnewpresentation/data/";
		
		//create a new empty slide show
		SlideShow ppt = new SlideShow();
		//add first slide
		Slide s1 = ppt.createSlide();
		//save changes in a file
		FileOutputStream out = new FileOutputStream(dataPath + "NewPPT_Apache_Out.ppt");
		ppt.write(out);
		out.close();

		//Printing the status
        System.out.println("Presentation Created successfully!");
	}
}
