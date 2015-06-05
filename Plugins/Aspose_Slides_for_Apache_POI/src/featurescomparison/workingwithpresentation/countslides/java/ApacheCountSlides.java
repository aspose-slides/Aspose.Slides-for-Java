package featurescomparison.workingwithpresentation.countslides.java;

import java.io.FileInputStream;

import org.apache.poi.hslf.usermodel.SlideShow;

public class ApacheCountSlides
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithpresentation/countslides/data/";
		
		SlideShow ppt = new SlideShow(new FileInputStream(dataPath + "presentation.ppt"));
		System.out.println("Total Slides in Count: " + ppt.getSlides().length);
	}
}
