package com.aspose.slides.examples.presentations.conversion;


import com.aspose.slides.EmbedAllFontsHtmlController;
import com.aspose.slides.IFontData;
import com.aspose.slides.IHtmlGenerator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


//ExStart:LinkAllFontsHtmlController
public class LinkAllFontsHtmlController extends EmbedAllFontsHtmlController
{
    private String m_basePath;

    public LinkAllFontsHtmlController(String[] fontNameExcludeList, String basePath)
    {
        super(fontNameExcludeList);

        m_basePath = basePath;
    }

    @Override
    public /*override*/ void writeFont(
            IHtmlGenerator generator,
            IFontData originalFont,
            IFontData substitutedFont,
            String fontStyle,
            String fontWeight,
            byte[] fontData)
    {
        String fontName = substitutedFont == null ? originalFont.getFontName() : substitutedFont.getFontName();
        String path = String.format("{0}.woff", fontName); // some path sanitaze may be needed
        try
        {
            Files.write(Paths.get(m_basePath + File.separator + path), fontData);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        generator.addHtml("<style>");
        generator.addHtml("@font-face { ");
        generator.addHtml(String.format("font-family: '{0}'; ", fontName));
        generator.addHtml(String.format("src: url('{0}')", path));

        generator.addHtml(" }");
        generator.addHtml("</style>");
    }

}
//  ExEnd:LinkAllFontsHtmlController

