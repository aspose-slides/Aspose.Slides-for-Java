/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithslidesinpresentation.cloningslidesinpresentation.anotherpresentationwithmaster.java;

import com.aspose.slides.*;

public class AnotherPresentationWithMaster
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithslidesinpresentation/cloningslidesinpresentation/anotherpresentationwithmaster/data/";

        //Instantiate Presentation class to load the source presentation file

        Presentation srcPres = new Presentation(dataDir+ "demo.pptx");

//Instantiate Presentation class for destination presentation (where slide is to be cloned)

        Presentation destPres = new Presentation();

//Instantiate ISlide from the collection of slides in source presentation along with
//master slide
        ISlide  SourceSlide= srcPres.getSlides().get_Item(0);


        //Clone the desired master slide from the source presentation to the collection of masters in the
             //destination presentation
        IMasterSlideCollection masters=destPres.getMasters();
        IMasterSlide SourceMaster = SourceSlide.getLayoutSlide().getMasterSlide();

        //Clone the desired master slide from the source presentation to the collection of masters in the
        //destination presentation
        IMasterSlide iSlide = masters.addClone(SourceMaster);

        //Clone the desired slide from the source presentation with the desired master to the end of the
        //collection of slides in the destination presentation
        ISlideCollection slds = destPres.getSlides();
        slds.addClone(SourceSlide,iSlide);

        //Clone the desired master slide from the source presentation to the collection of masters in the//destination presentation
        //Save the destination presentation to disk
        destPres.save(dataDir+ "helloworld_dest3.pptx",SaveFormat.Pptx);
        System.out.println("Program executed successfully");
    }
}




