package com.aspose.slides.examples.activex;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;


public class LinkingVideoActiveXControl
{
    public static void main(String[] args)
    {
        //ExStart:LinkingVideoActiveXControl
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_ActiveX();
        String dataVideo = RunExamples.getDataDir_Video();

        // Instantiate Presentation class that represents PPTX file
        Presentation presentation = new Presentation(dataDir + "template.pptx");

        // Create empty presentation instance
        Presentation newPresentation = new Presentation();

        // Remove default slide
        newPresentation.getSlides().removeAt(0);

        // Clone slide with Media Player ActiveX Control
        newPresentation.getSlides().insertClone(0, presentation.getSlides().get_Item(0));

        // Access the Media Player ActiveX control and set the video path
        newPresentation.getSlides().get_Item(0).getControls().get_Item(0).getProperties().set_Item("URL", dataVideo + "Wildlife.mp4");

        // Save the Presentation
        newPresentation.save(dataDir + "LinkingVideoActiveXControl_out.pptx", SaveFormat.Pptx);
        //ExEnd:LinkingVideoActiveXControl
    }
}
