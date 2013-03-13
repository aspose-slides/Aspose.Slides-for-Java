/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithpresentation.openpresentation.openwithpassword.java;

import com.aspose.slides.*;

public class OpenWithPassword
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithpresentation/openpresentation/openwithpassword/data/";

        //Creating instance of load options to set the presentation access password
        com.aspose.slides.LoadOptions loadOptions = new com.aspose.slides.LoadOptions();

        //Setting the access password
        loadOptions.setPassword("123456");

        //Opening the presentation file by passing the file path to the constructor
        //of Presentation class
        Presentation pres = new Presentation(dataDir + "simplePasswordProtected.ppt", loadOptions);

        //Printing the total number of slides present in the presentation
        System.out.println("Slides Count: "+Integer.toString(pres.getSlides().getCount()));
    }
}




