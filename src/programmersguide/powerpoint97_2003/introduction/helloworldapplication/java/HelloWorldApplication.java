/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.introduction.helloworldapplication.java;

import com.aspose.slides.*;

public class HelloWorldApplication
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/introduction/helloworldapplication/data/";

        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation();

        //Create a License object
        License license = new License();

        //Set the license of Aspose.Slides for Java to avoid the evaluation limitations
        //license.setLicense("Aspose.Slides.lic");

        //Adding an empty slide to the presentation and getting the reference of
        //that empty slide
        Slide slide = pres.addEmptySlide();

        //Adding a rectangle (X=2400, Y=1800, Width=1000 & Height=500) to the slide
        com.aspose.slides.Rectangle rect = slide.getShapes().addRectangle(2400, 1800, 1000, 500);

        //Hiding the lines of rectangle
        rect.getLineFormat().setShowLines(false);

        //Adding a text frame to the rectangle with "Hello World" as a default text
        rect.addTextFrame("Hello World");

        //Removing the first slide of the presentation which is always added by
        //Aspose.Slides for Java by default while creating the presentation
        pres.getSlides().removeAt(0);

        //Writing the presentation as a PPT file
        pres.write(dataDir + "hello.ppt");

        // Inform user about creation of hello.ppt
        System.out.println("hello.ptt created successfully");
    }
}




