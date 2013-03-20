/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithpresentation.lockingapresentation.java;

import com.aspose.slides.*;

public class LockingAPresentation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithpresentation/lockingapresentation/data/";

        //Instantiate presentation class
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        Slide sld=null;
        Shape shp=null;

        //Loop through all the slides in the presentation
        for(int i=0;i<pres.getSlides().getCount();i++)
        {
            sld = pres.getSlides().get_Item(i);
            //Loop through all the shapes in the slide
            for (int j=0;j<sld.getShapes().getCount();j++)
            {
                shp =sld.getShapes().get_Item(j);
                //Lock each shape to be protected against the select
                shp.setProtection(ShapeProtection.LockSelect);
            }
        }

        //Write the presentation to disk
        pres.write(dataDir + "demoLock.ppt");

        System.out.println("Locked presentation is saved successfully!");
    }
}




