package com.aspose.slides.examples.Text;

import static com.aspose.slides.EffectSubtype.Right;
import com.aspose.slides.IAutoShape;
import com.aspose.slides.IParagraph;
import com.aspose.slides.IPortion;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITable;
import com.aspose.slides.ITextFrame;
import com.aspose.slides.ParagraphFormat;
import com.aspose.slides.PortionFormat;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.ShapeType;
import com.aspose.slides.TextFrameFormat;
import static com.aspose.slides.TextVerticalType.Vertical;
import com.aspose.slides.examples.Utils;
import com.aspose.slides.internal.ba.as;

public class SettingTextFormattingInsideTableRow {

	public static void main(String[] args) {
                
                //ExStart:SettingTextFormattingInsideTableRow

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SettingTextFormattingInsideTableRow.class);
                 Presentation presentation=new Presentation(dataDir+"");
		ISlide sld = presentation.getSlides().get_Item(0);
                //  ITable someTable = presentation.Slides[0].Shapes[0] as ITable; // let's say that the first shape on the first slide is a table
                ITable someTable = (ITable)presentation.getSlides().get_Item(0).getShapes().get_Item(0);
               
              PortionFormat portionFormat = new PortionFormat();
              portionFormat.setFontHeight(25f);
                     
                   
               someTable.getRows().get_Item(0).setTextFormat(portionFormat);
 
               // setting first row cells' text alignment and right margin in one call
               ParagraphFormat paragraphFormat = new ParagraphFormat();
               paragraphFormat.setAlignment(Right);
                     
               paragraphFormat.setMarginRight(20);
           someTable.getRows().get_Item(0).setTextFormat(paragraphFormat);
                 // setting second row cells' text vertical type
               TextFrameFormat textFrameFormat = new TextFrameFormat();
               textFrameFormat.setTextVerticalType(Vertical);
               someTable.getColumns().get_Item(0).setTextFormat(textFrameFormat);
               presentation.save(dataDir + "Textbox.pptx", SaveFormat.Pptx);


                        //ExEnd:SettingTextFormattingInsideTableRow


                
	}

}
