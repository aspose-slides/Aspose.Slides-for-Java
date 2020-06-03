package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class RuleBasedFontsReplacement
{
    public static void main(String[] args) throws IOException
    {
        //ExStart:RuleBasedFontsReplacement
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();

        // Load presentation
        Presentation presentation = new Presentation(dataDir + "Fonts.pptx");

        // Load source font to be replaced
        IFontData sourceFont = new FontData("SomeRareFont");

        // Load the replacing font
        IFontData destFont = new FontData("Arial");

        // Add font rule for font replacement
        IFontSubstRule fontSubstRule = new FontSubstRule(sourceFont, destFont, FontSubstCondition.WhenInaccessible);

        // Add rule to font substitute rules collection
        IFontSubstRuleCollection fontSubstRuleCollection = new FontSubstRuleCollection();
        fontSubstRuleCollection.add(fontSubstRule);

        // Add font rule collection to rule list
        presentation.getFontsManager().setFontSubstRuleList(fontSubstRuleCollection);

        // Arial font will be used instead of SomeRareFont when inaccessible
        BufferedImage bmp = presentation.getSlides().get_Item(0).getThumbnail(1f, 1f);

        // Save the image to disk in JPEG format
        ImageIO.write(bmp, "jpeg", new File(dataDir + "Thumbnail_out.jpg"));
        //ExEnd:RuleBasedFontsReplacement
    }
}
