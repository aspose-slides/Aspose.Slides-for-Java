/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithtextinpresentationex.creatingtextboxwithhyperlink.java;

import com.aspose.slides.*;

public class CreatingTextBoxWithHyperlink
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithtextinpresentationex/creatingtextboxwithhyperlink/data/";

        //Instantiate a PresentationEx class that represents a PPTX
        PresentationEx pptxPresentation = new PresentationEx();

        //Get first slide
        SlideEx slide = pptxPresentation.getSlides().get_Item(0);

        //Add an AutoShape of Rectangle Type
        int index = slide.getShapes().addAutoShape(ShapeTypeEx.Rectangle, 150, 150, 150, 50);

        //Get a reference to the added shape
        com.aspose.slides.ShapeEx pptxShape = slide.getShapes().get_Item(index);

        //Cast the shape to AutoShape
        AutoShapeEx pptxAutoShape = (AutoShapeEx)pptxShape;

        //Access TextFrame associated with the AutoShape
        TextFrameEx TextFrame = pptxAutoShape.getTextFrame();

        //Add some text to the frame
        TextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).setText("Aspose.Slides");

        //Set Hyperlink for the portion text
        HyperlinkEx HLink = new HyperlinkEx("http://www.aspose.com");
        TextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).setHLinkClick(HLink);

        //Save the PPTX Presentation
        pptxPresentation.write(dataDir + "output.pptx");

        // Status
        System.out.println("Process completed successfully.");

    }
}




