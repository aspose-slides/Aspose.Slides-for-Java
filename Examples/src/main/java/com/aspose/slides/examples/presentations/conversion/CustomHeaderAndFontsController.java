package com.aspose.slides.examples.presentations.conversion;






import com.aspose.slides.EmbedAllFontsHtmlController;
import com.aspose.slides.IHtmlGenerator;
import com.aspose.slides.IPresentation;

//ExStart:CustomHeaderAndFontsController
public class CustomHeaderAndFontsController extends EmbedAllFontsHtmlController
{
    // Custom header template
    private static String Header = "<!DOCTYPE html>\\n" +
            "<html>\n" +
            "<head>\n" +
            "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
            "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=9\">\n" +
            "<link rel=\"stylesheet\" type=\"text/css\" href=\"{0}\">\n" +
            "</head>";


    private String m_cssFileName;

    public CustomHeaderAndFontsController(String cssFileName)
    {
        m_cssFileName = cssFileName;
    }

    @Override
    public  void writeDocumentStart(IHtmlGenerator generator, IPresentation presentation)
    {
        generator.addHtml(String.format(Header, m_cssFileName));
        writeAllFonts(generator, presentation);
    }

    @Override
    public  void writeAllFonts(IHtmlGenerator generator, IPresentation presentation)
    {
        generator.addHtml("<!-- Embedded fonts -->");
        super.writeAllFonts(generator, presentation);
    }
}
//ExEnd:CustomHeaderAndFontsController
  
    

    
   
