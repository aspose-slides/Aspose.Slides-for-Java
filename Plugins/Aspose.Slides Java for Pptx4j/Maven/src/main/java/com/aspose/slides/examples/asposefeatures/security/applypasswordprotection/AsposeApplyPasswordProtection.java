package com.aspose.slides.examples.asposefeatures.security.applypasswordprotection;

import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;

public class AsposeApplyPasswordProtection
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeApplyPasswordProtection.class);

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation();

        //....do some work here.....

        //Setting Password
        pres.getProtectionManager().encrypt("pass");

        //Save your presentation to a file
        pres.save(dataDir + "AsposeProtection_Out.pptx", com.aspose.slides.SaveFormat.Pptx);

        //Printing the status
        System.out.println("Protection Applied successfully!");
    }
}
