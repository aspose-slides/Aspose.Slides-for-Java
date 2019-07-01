package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.IHtmlFormattingController;
import com.aspose.slides.IHtmlGenerator;
import com.aspose.slides.INotesCommentsLayoutingOptions;
import com.aspose.slides.IPresentation;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.NotesPositions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ConvertingAnIndividualSlideToHTML {

	public static void main(String[] args) {
		CustomHtmlExport();
	}

	public static void CustomHtmlExport() {
		//ExStart:ConvertingAnIndividualSlideToHTML
             // The path to the documents directory.
		String dataDir = Utils.getDataDir(ConvertingAnIndividualSlideToHTML.class);

		// Instantiate a Presentation object that represents a presentation file
		Presentation pres = new Presentation(dataDir + "Presentation.pptx");

		// Setting HTML Options
		HtmlOptions opts = new HtmlOptions();
		
                opts.setHtmlFormatter(HtmlFormatter.createCustomFormatter(new CustomFormattingController()));

                INotesCommentsLayoutingOptions options = opts.getNotesCommentsLayouting();
                        options.setNotesPosition(NotesPositions.BottomFull);
		// Saving to individual files
		for (int i = 0; i < pres.getSlides().size(); i++)
			pres.save(dataDir + "slide" + (i + 1) + ".html", new int[] { i + 1 }, SaveFormat.Html, opts);
	}

	private static class CustomFormattingController implements IHtmlFormattingController {
		private String SlideHeader = "<div class=\"slide\" name=\"slide\" id=\"slide{0}\">";
		private String SlideFooter = "</div>";

		public CustomFormattingController() {
		}

		public void writeDocumentStart(IHtmlGenerator generator, IPresentation presentation) {
		}

		public void writeDocumentEnd(IHtmlGenerator generator, IPresentation presentation) {
		}

		public void writeSlideStart(IHtmlGenerator generator, ISlide slide) {
			generator.addHtml(String.format(SlideHeader, generator.getSlideIndex() + 1));
		}

		public void writeSlideEnd(IHtmlGenerator generator, ISlide slide) {
			generator.addHtml(SlideFooter);
		}

		public void writeShapeStart(IHtmlGenerator generator, IShape shape) {
		}

		public void writeShapeEnd(IHtmlGenerator generator, IShape shape) {
		}
	}
                   //ExEnd:ConvertingAnIndividualSlideToHTML
}
