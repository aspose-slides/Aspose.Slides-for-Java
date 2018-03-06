package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToHTMLWithComments {

	public static void main(String[] args) {

		// The path to the documents directory.
		//ExStart:ConvertingPresentationToHTMLWithComments
               String dataDir = Utils.getDataDir(ConvertingPresentationToHTMLWithComments.class);

		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "demo.pptx");

		HtmlOptions htmlOpt = new HtmlOptions();
		htmlOpt.setIncludeComments(true);
                htmlOpt.setHtmlFormatter(HtmlFormatter.createDocumentFormatter("", false));

		// Saving the presentation to HTML
       		pres.save(dataDir + "demo.html", SaveFormat.Html, htmlOpt);
                  //ExEnd:ConvertingPresentationToHTMLWithComments
	}

}
