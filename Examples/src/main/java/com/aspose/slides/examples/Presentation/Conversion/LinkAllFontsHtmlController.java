package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.XpsOptions;
import com.aspose.slides.examples.Utils;

ExStart:LinkAllFontsHtmlController
Public class LinkAllFontsHtmlController extends EmbedAllFontsHtmlController
{
    private final String m_basePath;

    public LinkAllFontsHtmlController(String[] fontNameExcludeList, String basePath)
    {
        super(fontNameExcludeList);
        m_basePath = basePath;
    }

    public void writeFont(
            IHtmlGenerator generator,
            IFontData originalFont,
            IFontData substitutedFont,
            String fontStyle,
            String fontWeight,
            byte[] fontData) {
        String fontName = substitutedFont == null ? originalFont.getFontName() : substitutedFont.getFontName();
        String path = fontName + ".woff"; // some path sanitaze may be needed
        Files.write(new File(m_basePath + path).toPath(), fontData, StandardOpenOption.CREATE);

        generator.addHtml("<style>");
        generator.addHtml("@font-face { ");
        generator.addHtml("font-family: '" + fontName + "'; ");
        generator.addHtml("src: url('" + path + "')");

        generator.addHtml(" }");
        generator.addHtml("</style>");
    }
}
 ExEnd:LinkAllFontsHtmlController