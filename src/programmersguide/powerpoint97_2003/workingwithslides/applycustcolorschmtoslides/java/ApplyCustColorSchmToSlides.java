/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithslides.applycustcolorschmtoslides.java;

import com.aspose.slides.*;

public class ApplyCustColorSchmToSlides
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithslides/applycustcolorschmtoslides/data/";
        
        //Access Presentation
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Set Color at different indices
        pres.getMainMaster().setSchemeColor(0, new java.awt.Color(PresetColorEx.Aqua));
        pres.getMainMaster().setSchemeColor(1,  new java.awt.Color(PresetColorEx.Azure));
        pres.getMainMaster().setSchemeColor(2,  new java.awt.Color(PresetColorEx.Bisque));
        pres.getMainMaster().setSchemeColor(3,  new java.awt.Color(PresetColorEx.BlueViolet));
        pres.getMainMaster().setSchemeColor(4,  new java.awt.Color(PresetColorEx.Brown));
        pres.getMainMaster().setSchemeColor(5,  new java.awt.Color(PresetColorEx.DarkBlue));
        pres.getMainMaster().setSchemeColor(6,  new java.awt.Color(PresetColorEx.DarkTurquoise));
        pres.getMainMaster().setSchemeColor(7,  new java.awt.Color(PresetColorEx.ForestGreen));
        pres.getMainMaster().setSchemeColor(8,  new java.awt.Color(PresetColorEx.Gainsboro));

        // Or set scheme color using ColorSchemeIndex enumeration. Use any one option
        pres.getMainMaster().setSchemeColor(ColorSchemeIndex.Accent1,  new java.awt.Color(PresetColorEx.Aqua));
        pres.getMainMaster().setSchemeColor(ColorSchemeIndex.Accent2,  new java.awt.Color(PresetColorEx.Azure));
        pres.getMainMaster().setSchemeColor(ColorSchemeIndex.Accent3,  new java.awt.Color(PresetColorEx.Bisque));
        pres.getMainMaster().setSchemeColor(ColorSchemeIndex.Background1 ,  new java.awt.Color(PresetColorEx.BlueViolet));
        pres.getMainMaster().setSchemeColor(ColorSchemeIndex.Background2 ,  new java.awt.Color(PresetColorEx.Brown));
        pres.getMainMaster().setSchemeColor(ColorSchemeIndex.Fill ,  new java.awt.Color(PresetColorEx.DarkBlue));
        pres.getMainMaster().setSchemeColor(ColorSchemeIndex.Text1,  new java.awt.Color(PresetColorEx.DarkTurquoise));
        pres.getMainMaster().setSchemeColor(ColorSchemeIndex.Text2,  new java.awt.Color(PresetColorEx.ForestGreen));

        //Save Presentation
        pres.write(dataDir + "demo.out.ppt");
        
        //Print Message
        System.out.println("Scheme applied successfully.");        
    }
}