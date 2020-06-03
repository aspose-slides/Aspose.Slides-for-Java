package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class AddingSuperscriptAndSubscriptTextInTextFrame
{
    public static void main(String[] args)
    {

        //ExStart:AddingSuperscriptAndSubscriptTextInTextFrame
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Text();
        Presentation presentation = new Presentation();
        try
        {
            // Get slide
            ISlide slide = presentation.getSlides().get_Item(0);

            // Create text box
            IAutoShape shape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 200, 100);
            ITextFrame textFrame = shape.getTextFrame();
            textFrame.getParagraphs().clear();

            // Create paragraph for superscript text
            IParagraph superPar = new Paragraph();

            // Create portion with usual text
            IPortion portion1 = new Portion();
            portion1.setText("SlideTitle");
            superPar.getPortions().add(portion1);

            // Create portion with superscript text
            IPortion superPortion = new Portion();
            superPortion.getPortionFormat().setEscapement(30);
            superPortion.setText("TM");
            superPar.getPortions().add(superPortion);

            // Create paragraph for subscript text
            IParagraph paragraph2 = new Paragraph();

            // Create portion with usual text
            IPortion portion2 = new Portion();
            portion2.setText("a");
            paragraph2.getPortions().add(portion2);

            // Create portion with subscript text
            IPortion subPortion = new Portion();
            subPortion.getPortionFormat().setEscapement(-25);
            subPortion.setText("i");
            paragraph2.getPortions().add(subPortion);

            // Add paragraphs to text box
            textFrame.getParagraphs().add(superPar);
            textFrame.getParagraphs().add(paragraph2);

            presentation.save(RunExamples.OutPath + "TestOut.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AddingSuperscriptAndSubscriptTextInTextFrame
    }
}
