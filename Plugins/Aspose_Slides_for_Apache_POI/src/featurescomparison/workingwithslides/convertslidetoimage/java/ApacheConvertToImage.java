package featurescomparison.workingwithslides.convertslidetoimage.java;

import org.apache.poi.xslf.util.PPTX2PNG;

public class ApacheConvertToImage
{
	public static void main(String[] args) throws Exception
	{
		String dataPath = "src/featurescomparison/workingwithslides/convertslidetoimage/data/";
		
		PPTX2PNG.main(new String[]{dataPath + "presentation.pptx"});
	}
}
