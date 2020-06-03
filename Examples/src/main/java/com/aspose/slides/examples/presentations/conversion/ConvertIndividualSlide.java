package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class ConvertIndividualSlide
{
    //ExStart:ConvertIndividualSlide
    public static void main(String[] args)
    {
        String dataDir = RunExamples.getDataDir_Conversion();
        Presentation presentation = new Presentation(dataDir + "Individual-Slide.pptx");
        try
        {
            HtmlOptions htmlOptions = new HtmlOptions();

            htmlOptions.setHtmlFormatter(HtmlFormatter.createCustomFormatter(new CustomFormattingController()));

            INotesCommentsLayoutingOptions notesOptions = htmlOptions.getNotesCommentsLayouting();
            notesOptions.setNotesPosition(NotesPositions.BottomFull);

            // Saving File              
            for (int i = 0; i < presentation.getSlides().size(); i++)
                presentation.save(dataDir + "Individual Slide" + i + 1 + "_out.html", new int[]{i + 1}, SaveFormat.Html, htmlOptions);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
    }

    public static class CustomFormattingController implements IHtmlFormattingController
    {
        public void /*IHtmlFormattingController.*/writeDocumentStart(IHtmlGenerator generator, IPresentation presentation)
        {
        }

        public void /*IHtmlFormattingController.*/writeDocumentEnd(IHtmlGenerator generator, IPresentation presentation)
        {
        }

        public void /*IHtmlFormattingController.*/writeSlideStart(IHtmlGenerator generator, ISlide slide)
        {
            generator.addHtml(String.format(SlideHeader, generator.getSlideIndex() + 1));
        }

        public void /*IHtmlFormattingController.*/writeSlideEnd(IHtmlGenerator generator, ISlide slide)
        {
            generator.addHtml(SlideFooter);
        }

        public void /*IHtmlFormattingController.*/writeShapeStart(IHtmlGenerator generator, IShape shape)
        {
        }

        public void /*IHtmlFormattingController.*/writeShapeEnd(IHtmlGenerator generator, IShape shape)
        {
        }

        private static String SlideHeader = "<div class=\"slide\" name=\"slide\" id=\"slide{0}\">";
        private static String SlideFooter = "</div>";
    }
    //ExEnd:ConvertIndividualSlide
}
