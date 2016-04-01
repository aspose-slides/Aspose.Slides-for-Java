package com.aspose.slides.examples.featurescomparison.presentations.openexisting;

import org.docx4j.openpackaging.packages.OpcPackage;
import org.docx4j.openpackaging.packages.PresentationMLPackage;

import com.aspose.slides.examples.Utils;

public class Pptx4jOpenExistingPresentations 
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(Pptx4jOpenExistingPresentations.class);

        String inputfilepath = dataDir + "presentation.pptx";

        PresentationMLPackage presentationMLPackage = 
                (PresentationMLPackage)OpcPackage.load(new java.io.File(inputfilepath));

        System.out.println("\n\n saving .. \n\n");
        presentationMLPackage.save(new java.io.File(dataDir + "Pptx4j-Duplicate.pptx"));

        System.out.println("\n\n done .. \n\n");	
    }
}