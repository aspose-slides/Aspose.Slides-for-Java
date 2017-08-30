package com.aspose.slides.examples.Slides.CRUD;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class ISectionCollection {

	public static void main(String[] args) {
              //ExStart:ISectionCollection
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ISectionCollection.class);
		Presentation pres=new Presentation(path+"Presentation1.pptx");
               ISection section = (ISection) pres.getSections().get_Item(2);
               //pres.getSections().reorderSectionWithSlides((section, 0);
               pres.getSections().removeSectionWithSlides(pres.getSections().get_Item(0));
               pres.getSections().appendEmptySection("Last empty section");
               pres.getSections().addSection("First empty", pres.getSlides().get_Item(0));
               pres.save(path+"Result.pptx",SaveFormat.Pptx);
            //ExEnd:ISectionCollection
   }
             }
            