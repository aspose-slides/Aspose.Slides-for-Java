package com.aspose.slides.examples.Slides.CRUD;

import com.aspose.slides.BulletType;
import com.aspose.slides.IMasterNotesSlide;
import com.aspose.slides.IParagraphFormat;
import com.aspose.slides.ISlide;
import com.aspose.slides.ITextStyle;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AddNotesSlideWithNotesStyle {

	public static void main(String[] args) {
//ExStart:AddNotesSlideWithNotesStyle

		
	// The path to the documents directory.
	String dataDir = Utils.getDataDir(AddNotesSlideWithNotesStyle.class);
		
		
	// Instantiate a Presentation object that represents a presentation file
	Presentation pres = new Presentation(dataDir + "demo.pptx");


	IMasterNotesSlide notesMaster = pres.getMasterNotesSlideManager().getMasterNotesSlide();
 
	if (notesMaster != null) 
	{
		// Get MasterNotesSlide text style
		ITextStyle notesStyle = notesMaster.getNotesStyle();
 
		//Set symbol bullet for the first level paragraphs
		IParagraphFormat paragraphFormat = notesStyle.getLevel(0);
		paragraphFormat.getBullet().setType(BulletType.Symbol);
	}
 	pres.save(dataDir + "NotesSlideWithNotesStyle.pptx", SaveFormat.Pptx);
		

	//ExEnd:AddNotesSlideWithNotesStyle
	}

}