package com.aspose.slides.examples.featurescomparison.presentations.openexisting;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeOpenExistingPresentations 
{
    public static void main(String[] args) 
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeOpenExistingPresentations.class);

        //Instantiate Presentation class that represents PPTX file
        Presentation pres = new Presentation(dataDir + "presentation.pptx");

        // Save presentation with chart
        pres.save(dataDir + "Aspose-Duplicate.pptx", SaveFormat.Pptx);

        System.out.println("Done");	
    }
}