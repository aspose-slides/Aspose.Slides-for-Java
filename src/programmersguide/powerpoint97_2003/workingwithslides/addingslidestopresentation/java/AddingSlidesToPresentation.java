/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint97_2003.workingwithslides.addingslidestopresentation.java;

import com.aspose.slides.*;

public class AddingSlidesToPresentation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint97_2003/workingwithslides/addingslidestopresentation/data/";

        /***********************  Adding Empty Slide in a Presentation ******************************/
        //Instantiate a Presentation object that represents a PPT file
        Presentation pres = new Presentation(dataDir + "demo.ppt");

        //Adding an empty slide to the presentation and getting the reference of that empty slide
        Slide slide1 = pres.addEmptySlide();

        //Writing the presentation as a PPT file
        pres.write(dataDir + "EmptySlide.ppt");

        /***********************  Adding Body Slide in a Presentation ******************************/

        pres = new Presentation(dataDir + "demo.ppt");

        //Adding a body slide to the presentation and getting the reference of that body slide
        Slide slide2 = pres.addBodySlide();

        //Writing the presentation as a PPT file
        pres.write(dataDir + "BodySlide.ppt");

        /***********************  Adding Double Body Slide in a Presentation ******************************/

        //Instantiate a Presentation object that represents a PPT file
        pres = new Presentation(dataDir + "demo.ppt");

        //Adding a double body slide to the presentation and getting the reference of that double body slide
        Slide slide3 = pres.addDoubleBodySlide();

        //Writing the presentation as a PPT file
        pres.write(dataDir + "DoubleBodySlide.ppt");

        /***********************  Adding Header Slide in a Presentation ******************************/

        //Instantiate a Presentation object that represents a PPT file
        pres = new Presentation(dataDir + "demo.ppt");

        //Adding a header slide to the presentation and getting the reference of that header slide
        Slide slide4 = pres.addHeaderSlide();

        //Writing the presentation as a PPT file
        pres.write(dataDir + "HeaderSlide.ppt");

        /***********************  Adding Title Slide in a Presentation ******************************/

        //Instantiate a Presentation object that represents a PPT file
        pres = new Presentation(dataDir + "demo.ppt");

        //Adding a title slide to the presentation and getting the reference of that title slide
        Slide slide5 = pres.addTitleSlide();

        //Writing the presentation as a PPT file
        pres.write(dataDir + "TitleSlide.ppt");

        //Printing the status
        System.out.println("Slides added successfully!");

    }
}




