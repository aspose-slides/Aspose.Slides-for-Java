package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.XpsOptions;
import com.aspose.slides.examples.Utils;

//ExStart:CustomHeaderAndFontsController
Public class LinkAllFontsHtmlController extends EmbedAllFontsHtmlController
{
    private final String m_basePath;

    public class CustomHeaderAndFontsController extends EmbedAllFontsHtmlController {
    // Custom header template
    final static String Header = "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
            "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=9\">\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"%s\">\n" +
            "</head>";


    private final String m_cssFileName;

    public CustomHeaderAndFontsController(String cssFileName) {
        m_cssFileName = cssFileName;
    }

    @Override
    public void writeDocumentStart(IHtmlGenerator generator, IPresentation presentation) {
        generator.addHtml(String.format(Header, m_cssFileName));
        writeAllFonts(generator, presentation);
    }

    @Override
    public void writeAllFonts(IHtmlGenerator generator, IPresentation presentation) {
        generator.addHtml("<!-- Embedded fonts -->");
        super.writeAllFonts(generator, presentation);
    }
  //ExEnd:CustomHeaderAndFontsController
}
}
 ExEnd:LinkAllFontsHtmlController