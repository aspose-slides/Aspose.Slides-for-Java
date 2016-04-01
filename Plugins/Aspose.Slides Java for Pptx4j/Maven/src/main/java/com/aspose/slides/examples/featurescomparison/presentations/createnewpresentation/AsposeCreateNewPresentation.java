package com.aspose.slides.examples.featurescomparison.presentations.createnewpresentation;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeCreateNewPresentation 
{
    public static void main(String[] args) 
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeCreateNewPresentation.class);

        // Instantiate Presentation class that represents the PPTX
        Presentation pres = new Presentation();

        //Write the PPTX file to disk
        pres.save(dataDir + "Aspose-New-Presentation.pptx", SaveFormat.Pptx);

        System.out.println("Done.");
    }
}