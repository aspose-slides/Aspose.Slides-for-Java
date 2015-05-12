/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.textinpresentation.textboxhyperlink.java;

import com.aspose.slides.*;

public class TextBoxHyperlink
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/textinpresentation/textboxhyperlink/data/";

        //Instantiate Presentation class that represents PPTX
        Presentation pres = new Presentation();

        //Access first slide
        ISlide slide = pres.getSlides().get_Item(0);

        //Add an AutoShape of Rectangle Type
        IShape pptxShape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 150, 150, 150, 50);

        //Cast the shape to AutoShape
        IAutoShape pptxAutoShape = (IAutoShape)pptxShape;

        //Access ITextFrame associated with the AutoShape
        pptxAutoShape.addTextFrame("");

        ITextFrame ITextFrame = pptxAutoShape.getTextFrame();

        //Add some text to the frame
        ITextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).setText("Aspose.Slides");

        //Set Hyperlink for the portion text
        IHyperlinkManager HypMan = ITextFrame.getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getHyperlinkManager();
        HypMan.setExternalHyperlinkClick("http://www.aspose.com");

        //Save the PPTX to Disk
        pres.save(dataDir+ "hLinkPPTX.pptx", SaveFormat.Pptx);

    }
}




