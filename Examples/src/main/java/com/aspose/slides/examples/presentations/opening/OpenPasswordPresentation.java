package com.aspose.slides.examples.presentations.opening;

import com.aspose.slides.LoadOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;





public class OpenPasswordPresentation
{
    public static void main(String[] args)
    {
        //ExStart:OpenPasswordPresentation
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_PresentationOpening();

        // creating instance of load options to set the presentation access password
        LoadOptions loadOptions = new LoadOptions();

        // Setting the access password
        loadOptions.setPassword("pass");

        // Opening the presentation file by passing the file path and load options to the constructor of Presentation class
        Presentation pres = new Presentation(dataDir + "OpenPasswordPresentation.pptx", loadOptions);

        // Printing the total number of slides present in the presentation
        System.out.println(pres.getSlides().size());
        //ExEnd:OpenPasswordPresentation
    }
}
