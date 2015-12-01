package com.aspose.slides.examples.featurescomparison.presentation.createnewpresentation;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeCreatePresentation
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeCreatePresentation.class);

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation();
        //Writing the presentation as a PPT file
        pres.save(dataDir + "NewPPT_Aspose_Out.ppt", SaveFormat.Ppt);

        //Printing the status
        System.out.println("Presentation Created successfully!");
    }
}
