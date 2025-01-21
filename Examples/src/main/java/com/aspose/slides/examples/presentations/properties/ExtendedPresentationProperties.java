package com.aspose.slides.examples.presentations.properties;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExtendedPresentationProperties 
{
    public static void main(String[] args)
    {
        //Path for source presentation
        String pptxFile = RunExamples.getDataDir_PresentationProperties() + "ExtendDocumentProperies.pptx";
        //Out path
        String resultPath = RunExamples.getOutPath() + "ExtendDocumentProperies-out1.pptx";

        //ExStart:ExtendedPresentationProperties
        Presentation presentation = new Presentation(pptxFile);
        try {
            IDocumentProperties documentProperties = presentation.getDocumentProperties();
            // Print the read-only properties
            System.out.println("Slides: " + documentProperties.getSlides());
            System.out.println("HiddenSlides: " + documentProperties.getHiddenSlides());
            System.out.println("Notes: " + documentProperties.getNotes());
            System.out.println("Paragraphs: " + documentProperties.getParagraphs());
            System.out.println("MultimediaClips: " + documentProperties.getMultimediaClips());
            System.out.println("TitlesOfParts: " + documentProperties.getTitlesOfParts());
            System.out.println("HeadingPairs: ");
            IHeadingPair[] headingPairs = documentProperties.getHeadingPairs();
            if (headingPairs.length > 0)
            {
                for (IHeadingPair headingPair : headingPairs)
                    System.out.println(headingPair.getName() + " " + headingPair.getCount());
            }
            // Change several boolean properties
            documentProperties.setScaleCrop(true);
            documentProperties.setLinksUpToDate(true);
            // Save the presentation with changed properties
            presentation.save(resultPath, SaveFormat.Pptx);

            //Use the IPresentationInfo interface to read and change the document properties
            System.out.println("\nProperties obtained by IPresentationInfo:\n");
            IPresentationInfo documentInfo = PresentationFactory.getInstance().getPresentationInfo(resultPath);
            documentProperties = documentInfo.readDocumentProperties();
            // Print the read-only properties
            System.out.println("Slides: " + documentProperties.getSlides());
            System.out.println("HiddenSlides: " + documentProperties.getHiddenSlides());
            System.out.println("Notes: " + documentProperties.getNotes());
            System.out.println("Paragraphs: " + documentProperties.getParagraphs());
            System.out.println("MultimediaClips: " + documentProperties.getMultimediaClips());
            System.out.println("TitlesOfParts: " + documentProperties.getTitlesOfParts());
            System.out.println("HeadingPairs: ");
            headingPairs = documentProperties.getHeadingPairs();
            if (headingPairs.length > 0)
            {
                for (IHeadingPair headingPair : headingPairs)
                System.out.println(headingPair.getName() + " " + headingPair.getCount());
            }
            // Change several boolean properties
            documentProperties.setHyperlinksChanged(true);
            // Save the presentation with changed properties
            documentInfo.updateDocumentProperties(documentProperties);
            documentInfo.writeBindedPresentation(resultPath);
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:ExtendedPresentationProperties
    }
}
