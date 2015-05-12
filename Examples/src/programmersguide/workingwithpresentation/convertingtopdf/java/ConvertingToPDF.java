/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithpresentation.convertingtopdf.java;

import com.aspose.slides.*;

public class ConvertingToPDF
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithpresentation/convertingtopdf/data/";

        //Instantiate a Presentation object that represents a presentation file
        Presentation pres = new Presentation(dataDir+ "Aspose.pptx");


        //Save the presentation to PDF with default options
        pres.save(dataDir+ "demoDefault.pdf", SaveFormat.Pdf);
        System.out.println("Program executed successfully");
    }
}




