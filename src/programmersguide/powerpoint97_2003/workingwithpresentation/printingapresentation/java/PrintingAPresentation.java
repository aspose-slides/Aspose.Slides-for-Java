/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithpresentation.printingapresentation.java;

import com.aspose.slides.*;

public class PrintingAPresentation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithpresentation/printingapresentation/data/";

        //Load the presentation
        Presentation asposePresentation = new Presentation(dataDir + "demo.ppt");

        //Call the print method to print whole presentation to the default printer
        asposePresentation.print();

        // Display Status
        System.out.println("Print sent to default printer successfully!");
    }
}




