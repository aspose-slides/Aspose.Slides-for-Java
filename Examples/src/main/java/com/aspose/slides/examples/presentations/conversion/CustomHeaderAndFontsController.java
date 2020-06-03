package com.aspose.slides.examples.presentations.conversion;



/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


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
    public /*override*/ void writeDocumentStart(IHtmlGenerator generator, IPresentation presentation)
    {
        generator.addHtml(String.format(Header, m_cssFileName));
        writeAllFonts(generator, presentation);
    }

    @Override
    public /*override*/ void writeAllFonts(IHtmlGenerator generator, IPresentation presentation)
    {
        generator.addHtml("<!-- Embedded fonts -->");
        super.writeAllFonts(generator, presentation);
    }
}
//ExEnd:CustomHeaderAndFontsController
  
    

    
   
