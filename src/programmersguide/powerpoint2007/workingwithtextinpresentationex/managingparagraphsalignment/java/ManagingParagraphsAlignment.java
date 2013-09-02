/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithtextinpresentationex.managingparagraphsalignment.java;

import com.aspose.slides.*;

public class ManagingParagraphsAlignment
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithtextinpresentationex/managingparagraphsalignment/data/";

        //Instantiate a Presentation object that represents a PPTX file
        PresentationEx pres = new PresentationEx(dataDir + "demo.pptx");

        //Accessing first slide
        SlideEx slide = pres.getSlides().get_Item(0);

        //Accessing the first and second placeholder in the slide and typecasting it as AutoShape
        TextFrameEx tf1 = ((AutoShapeEx)slide.getShapes().get_Item(0)).getTextFrame();
        TextFrameEx tf2 = ((AutoShapeEx)slide.getShapes().get_Item(1)).getTextFrame();

        //Change the text in both placeholders
        tf1.setText("Center Align by Aspose");
        tf2.setText("Center Align by Aspose");

        //Getting the first paragraph of the placeholders
        ParagraphEx para1 = tf1.getParagraphs().get_Item(0);
        ParagraphEx para2 = tf2.getParagraphs().get_Item(0);

        //Aligning the text paragraph to center
        para1.getParagraphFormat().setAlignment(TextAlignmentEx.Center);
        para2.getParagraphFormat().setAlignment(TextAlignmentEx.Center);

        //Writing the presentation as a PPTX file
        pres.write(dataDir + "output.pptx");

        // Status
        System.out.println("Process completed successfully.");


    }
}




