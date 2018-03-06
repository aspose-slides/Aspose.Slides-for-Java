package com.aspose.slides.examples.Presentation.Conversion;

import com.aspose.slides.EmbedAllFontsHtmlController;
import com.aspose.slides.IFontData;
import com.aspose.slides.IHtmlGenerator;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.XpsOptions;
import com.aspose.slides.examples.Utils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;

//ExStart:LinkAllFontsHtmlController
public class LinkAllFontsHtmlController extends EmbedAllFontsHtmlController
{
    private final String m_basePath;

    public LinkAllFontsHtmlController(String[] fontNameExcludeList, String basePath)
    {
        super(fontNameExcludeList);
        m_basePath = basePath;
    }

    /**
     *
     * @param generator
     * @param originalFont
     * @param substitutedFont
     * @param fontStyle
     * @param fontWeight
     * @param fontData
     * @throws IOException
     */
    
    public void writeFont
        (
            IHtmlGenerator generator,
            IFontData originalFont,
            IFontData substitutedFont,
            String fontStyle,
            String fontWeight,
            byte[] fontData)  
        {
        try {
            String fontName = substitutedFont == null ? originalFont.getFontName() : substitutedFont.getFontName();
            String path = fontName + ".woff"; // some path sanitaze may be needed
            Files.write(new File(m_basePath + path).toPath(), fontData, StandardOpenOption.CREATE);
            
            generator.addHtml("<style>");
            generator.addHtml("@font-face { ");
            generator.addHtml("font-family: '" + fontName + "'; ");
            generator.addHtml("src: url('" + path + "')");
            
            generator.addHtml(" }");
            generator.addHtml("</style>");
        } catch (IOException ex) {
            Logger.getLogger(LinkAllFontsHtmlController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
//ExEnd:LinkAllFontsHtmlController