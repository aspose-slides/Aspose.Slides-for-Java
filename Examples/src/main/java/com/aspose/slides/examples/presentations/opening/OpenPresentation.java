package com.aspose.slides.examples.presentations.opening;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;





public class OpenPresentation
{
    public static void main(String[] args)
    {
        //ExStart:OpenPresentation
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationOpening();

        // Opening the presentation file by passing the file path to the constructor of Presentation class
        Presentation pres = new Presentation(dataDir + "OpenPresentation.pptx");

        // Printing the total number of slides present in the presentation
        System.out.println(pres.getSlides().size());
        //ExEnd:OpenPresentation
    }
}
