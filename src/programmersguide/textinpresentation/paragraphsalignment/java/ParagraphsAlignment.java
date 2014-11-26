/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.textinpresentation.paragraphsalignment.java;

import com.aspose.slides.*;

public class ParagraphsAlignment
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/textinpresentation/paragraphsalignment/data/";
        //Instantiate a Presentation object that represents a PPTX file
        Presentation pres = new Presentation(dataDir+ "leftalign.pptx");

        //Accessing first slide
        ISlide slide = pres.getSlides().get_Item(0);

        //Accessing the first and second placeholder in the slide and typecasting it as AutoShape
        ITextFrame tf1 = ((IAutoShape)slide.getShapes().get_Item(0)).getTextFrame();
        ITextFrame tf2 = ((IAutoShape)slide.getShapes().get_Item(1)).getTextFrame();

        //Change the text in both placeholders
        tf1.setText("Center Align by Aspose");
        tf2.setText("Center Align by Aspose");

        //Getting the first paragraph of the placeholders
        IParagraph para1 = tf1.getParagraphs().get_Item(0);
        IParagraph para2 = tf2.getParagraphs().get_Item(0);

        //Aligning the text paragraph to center
        para1.getParagraphFormat().setAlignment(TextAlignment.Center);
        para2.getParagraphFormat().setAlignment(TextAlignment.Center);

        //Writing the presentation as a PPTX file
        pres.save(dataDir+ "Centeralign.pptx", SaveFormat.Pptx);
        
    }
}




