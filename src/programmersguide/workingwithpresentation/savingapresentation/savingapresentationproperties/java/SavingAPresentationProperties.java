/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithpresentation.savingapresentation.savingapresentationproperties.java;

import com.aspose.slides.*;

public class SavingAPresentationProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithpresentation/savingapresentation/savingapresentationproperties/data/";

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation();

        //Get the first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add an autoshape of type line
        sld.getShapes().addAutoShape(ShapeType.Line, 50, 150, 300, 0);

        //Setting access to document properties in password protected mode
        pres.getProtectionManager().setEncryptDocumentProperties ( false);

        //Setting Password
        pres.getProtectionManager().encrypt("pass");

        //Save your presentation to a file
        pres.save(dataDir+ "Aspose.pptx", com.aspose.slides.SaveFormat.Pptx);
        System.out.println("Program executed successfully");
    }
}




