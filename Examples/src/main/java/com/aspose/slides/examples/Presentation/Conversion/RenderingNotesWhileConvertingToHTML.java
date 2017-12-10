package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.HtmlFormatter;
import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.ResponsiveHtmlController;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class RenderingNotesWhileConvertingToHTML {

	private static final String dataDir = Utils.getSharedDataDir(RenderingNotesWhileConvertingToHTML.class) + "Conversion/";

         //ExStart:RenderingNotesWhileConvertingToHTML
	public static void main(String[] args) {
        Presentation pres = new Presentation("Presentation.pptx");
     try {
          // Saving notes pages
        pres.save("Output.html", SaveFormat.HtmlNotes);
        } 
        finally {
        pres.dispose();
        }
         //ExEnd:RenderingNotesWhileConvertingToHTML
        }}
