package com.aspose.slides.examples.Text;

import java.awt.Color;

import com.aspose.slides.BulletType;
import com.aspose.slides.ColorType;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.NumberedBulletStyle;
import com.aspose.slides.Paragraph;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class AddColumnInTextBoxes {

	public static void main(String[] args) {
                
                 //ExStart:AddColumnInTextBoxes
    		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddColumnInTextBoxes.class);
                Presentation presentation = new Presentation();
      {
               // Get the first slide of presentation
               ISlide slide = presentation.getSlides().get_Item(0);

              // Add an AutoShape of Rectangle type
              IAutoShape aShape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 100, 100, 300, 300);

             // Add TextFrame to the Rectangle
            aShape.addTextFrame("All these columns are limited to be within a single text container -- " +
            "you can add or delete text and the new or remaining text automatically adjusts " +
            "itself to flow within the container. You cannot have text flow from one container " +
            "to other though -- we told you PowerPoint's column options for text are limited!");
 
             // Get text format of TextFrame
             ITextFrameFormat format = aShape.getTextFrame().getTextFrameFormat();

            // Specify number of columns in TextFrame
            format.setColumnCount(3);

           // Specify spacing between columns
            format.setColumnSpacing(10);

          // Save created presentation
          presentation.save("ColumnCount.pptx", SaveFormat.Pptx);
      }

             //ExEnd:AddColumnInTextBoxes
    }

}
