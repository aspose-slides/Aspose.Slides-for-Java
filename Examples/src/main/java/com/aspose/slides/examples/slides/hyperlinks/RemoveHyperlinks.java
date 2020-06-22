package com.aspose.slides.examples.slides.hyperlinks;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class RemoveHyperlinks
{
    public static void main(String[] args)
    {
        //ExStart:RemoveHyperlinks
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Hyperlink();

        // Instantiate Presentation class
        Presentation presentation = new Presentation(dataDir + "Hyperlink.pptx");
        try
        {
            // Removing the hyperlinks from presentation
            presentation.getHyperlinkQueries().removeAllHyperlinks();

            //Writing the presentation as a PPTX file
            presentation.save(dataDir + "RemovedHyperlink_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:RemoveHyperlinks
    }
}
