package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.ResponsiveHtmlController;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingPresentationToResponsiveHTML {

	private static final String dataDir = Utils.getSharedDataDir(ConvertingPresentationToResponsiveHTML.class) + "Conversion/";

	public static void main(String[] args) {
		Presentation pres = new Presentation(dataDir + "presentation.pptx");
		try {
			ResponsiveHtmlController controller = new ResponsiveHtmlController();
			HtmlOptions htmlOptions = new HtmlOptions();
			htmlOptions.setHtmlFormatter(HtmlFormatter.createCustomFormatter(controller));

			pres.save(dataDir + "pres_out.html", SaveFormat.Html, htmlOptions);
		} finally {
			if (pres != null)
				pres.dispose();
		}
	}
}
