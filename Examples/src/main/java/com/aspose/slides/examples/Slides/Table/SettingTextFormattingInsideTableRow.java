package com.aspose.slides.examples.Text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.examples.Utils;

public class SettingTextFormattingInsideTableRow {

	public static void main(String[] args) {
                
                //ExStart:SettingTextFormattingInsideTableRow

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingTextFormattingInsideTableRow.class);

		ISlide sld = presentation.getSlides().get_Item(0);
                  ITable someTable = presentation.Slides[0].Shapes[0] as ITable; // let's say that the first shape on the first slide is a table
 
               // setting first row cells' font height
               PortionFormat portionFormat = new PortionFormat();
               portionFormat.FontHeight = 25;
               someTable.Rows[0].SetTextFormat(portionFormat);
 
               // setting first row cells' text alignment and right margin in one call
               ParagraphFormat paragraphFormat = new ParagraphFormat();
               paragraphFormat.Alignment = TextAlignment.Right;
               paragraphFormat.MarginRight = 20;
               someTable.Rows[0].SetTextFormat(paragraphFormat);
 
               // setting second row cells' text vertical type
               TextFrameFormat textFrameFormat = new TextFrameFormat();
              textFrameFormat.TextVerticalType = TextVerticalType.Vertical;
                someTable.Rows[1].SetTextFormat(textFrameFormat);

		 // Save the PPTX to Disk
		pres.save(dataDir + "Textbox.pptx", SaveFormat.Pptx);


                        //ExEnd:SettingTextFormattingInsideTableRow


                
	}

}
