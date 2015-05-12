/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.textinpresentation.paragraphindent.java;

import com.aspose.slides.*;

public class ParagraphIndent
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/textinpresentation/paragraphindent/data/";

        //Instantiate Presentation Class
        Presentation pres = new Presentation();

        //Get first slide
        ISlide sld = pres.getSlides().get_Item(0);

        //Add a Rectangle Shape
        IAutoShape rect = sld.getShapes().addAutoShape(ShapeType.Rectangle,100, 100, 500, 150);

        //Add TextFrame to the Rectangle
        ITextFrame tf = rect.addTextFrame("This is first line \rThis is second line \rThis is third line");

        //Set the text to fit the shape
        tf.getTextFrameFormat().setAutofitType(TextAutofitType.Shape);

        //Hide the lines of the Rectangle
        rect.getLineFormat().getFillFormat().setFillType(FillType.Solid);

        //Get first Paragraph in the TextFrame and set its Indent
        IParagraph para1 = tf.getParagraphs().get_Item(0);

        //Setting paragraph bullet style and symbol
        para1.getParagraphFormat().getBullet().setType(BulletType.Symbol);
        para1.getParagraphFormat().getBullet().setChar((char)(8226));
        para1.getParagraphFormat().setAlignment(TextAlignment.Left);

        para1.getParagraphFormat().setDepth((short)2);
        para1.getParagraphFormat().setIndent(30);

        //Get second Paragraph in the TextFrame and set its Indent
        IParagraph para2 = tf.getParagraphs().get_Item(1);
        para2.getParagraphFormat().getBullet().setType(BulletType.Symbol);
        para2.getParagraphFormat().getBullet().setChar((char)(8226));
        para2.getParagraphFormat().setAlignment(TextAlignment.Left);
        para2.getParagraphFormat().setDepth((short)2);
        para2.getParagraphFormat().setIndent(40);

        //Get third Paragraph in the TextFrame and set its Indent
        IParagraph para3 = tf.getParagraphs().get_Item(2);
        para3.getParagraphFormat().getBullet().setType(BulletType.Symbol);
        para3.getParagraphFormat().getBullet().setChar((char)(8226));
        para3.getParagraphFormat().setAlignment(TextAlignment.Left);
        para3.getParagraphFormat().setDepth((short)2);
        para3.getParagraphFormat().setIndent(50);

        //Write the Presentation to disk
        pres.save(dataDir+ "InOutDent.pptx", SaveFormat.Pptx);

    }
}




