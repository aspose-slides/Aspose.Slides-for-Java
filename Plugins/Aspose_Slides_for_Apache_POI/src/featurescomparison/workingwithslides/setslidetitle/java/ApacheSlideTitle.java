package featurescomparison.workingwithslides.setslidetitle.java;

import java.io.FileOutputStream;

import org.apache.poi.hslf.model.Slide;
import org.apache.poi.hslf.model.TextBox;
import org.apache.poi.hslf.usermodel.SlideShow;

public class ApacheSlideTitle
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithslides/setslidetitle/data/";
		
		SlideShow ppt = new SlideShow();
		Slide slide = ppt.createSlide();
		TextBox title = slide.addTitle();
		title.setText("Hello, World!");
	    
	    //save changes 
	    FileOutputStream out = new FileOutputStream(dataPath + "Apache_SlideTitle_Out.ppt");
	    ppt.write(out);
	    out.close();
	    
		System.out.println("Presentation with Title Saved.");
	}
}