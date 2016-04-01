package featurescomparison.workingwithpresentations.converttohtml.java;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeConvertToHTML 
{
	public static void main(String[] args) 
	{
		String dataPath = "src/featurescomparison/workingwithpresentations/converttohtml/data/";
		
		//Instantiate Presentation class that represents PPTX file
		Presentation pres = new Presentation(dataPath + "presentation.pptx");

		HtmlOptions htmlOpt = new HtmlOptions();
		htmlOpt.setHtmlFormatter(HtmlFormatter.createDocumentFormatter("",false));

		//Saving the presentation to HTML
		pres.save(dataPath + "AsposeHTML.html", SaveFormat.Html, htmlOpt);	
	}
}
