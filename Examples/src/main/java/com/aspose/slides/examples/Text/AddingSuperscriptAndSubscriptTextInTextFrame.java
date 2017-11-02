package com.aspose.slides.examples.Text;

import java.awt.Color;

import com.aspose.slides.FillType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.TextAutofitType;
import com.aspose.slides.examples.Utils;

public class AddingSuperscriptAndSubscriptTextInTextFrame {

	
                  public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingSuperscriptAndSubscriptTextInTextFrame.class);
                //ExStart:AddingSuperscriptAndSubscriptTextInTextFrame
		  Presentation presentation = new Presentation()
            try
              {
                  // Get slide
                  ISlide slide = presentation.getSlides().getItem(0);

                 // Create text box
                 IAutoShape shape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 200, 100);
                 ITextFrame textFrame = shape.getTextFrame();
                 textFrame.getParagraphs().clear();
 
                // Create paragraph for superscript text
                IParagraph superPar = new Paragraph();
 
              // Create portion with usual text
              IPortion portion1 = new Portion();
              portion1.setText("SlideTitle");
              superPar.getPortions().add(portion1);
 
             // Create portion with superscript text
              IPortion superPortion = new Portion();
              superPortion.getPortionFormat().setEscapement(30);
              superPortion.setText("TM");
              superPar.getPortions().add(superPortion);
 
           // Create paragraph for subscript text
              IParagraph paragraph2 = new Paragraph();
 
          // Create portion with usual text
             IPortion portion2 = new Portion();
             portion2.setText("a");
             paragraph2.getPortions().add(portion2);
 
         // Create portion with subscript text
            IPortion subPortion = new Portion();
            subPortion.getPortionFormat().setEscapement(-25);
            subPortion.setText("i");
            paragraph2.getPortions().add(subPortion);
 
        // Add paragraphs to text box
           textFrame.getParagraphs().add(superPar);
           textFrame.getParagraphs().add(paragraph2);
 
           presentation.getSlides().getItem(0).getThumbnail(2f, 2f).save("TestOut.png", ImageFormat.Png);
         } 
          finally
          {
             presentation.dispose()
          }
	   pres.save(dataDir + "formatText.pptx", SaveFormat.Pptx);
         //ExEnd:AddingSuperscriptAndSubscriptTextInTextFrame
         }
   
        }
