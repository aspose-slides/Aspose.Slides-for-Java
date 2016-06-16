/** 
 * Copyright 2001-2016 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.slides.examples.Slides.Layout;

import com.aspose.slides.ILayoutSlide;
import com.aspose.slides.IMasterLayoutSlideCollection;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SlideLayoutType;
import com.aspose.slides.examples.Utils;

public class AddingLayoutSlidesToPresentation {

	public static void main(String[] args) {

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AddingLayoutSlidesToPresentation.class);

		String presName = "demo.pptx";

		// Instantiate Presentation class that represents the presentation file
		Presentation pres = new Presentation(dataDir + presName);

		// Try to search by layout slide type
		IMasterLayoutSlideCollection layoutSlides = pres.getMasters().get_Item(0).getLayoutSlides();
		ILayoutSlide layoutSlide = null;

		if (layoutSlides.getByType(SlideLayoutType.TitleAndObject) != null)
			layoutSlide = layoutSlides.getByType(SlideLayoutType.TitleAndObject);
		else
			layoutSlide = layoutSlides.getByType(SlideLayoutType.Title);

		if (layoutSlide == null) {
			// The situation when a presentation doesn't contain some type of layouts.
			// Technographics.pptx presentation only contains Blank and Custom layout types.
			// But layout slides with Custom types has different slide names, like "Title", "Title and Content", etc. 
			// And it is possible to use these names for layout slide selection.
			// Also it is possible to use the set of placeholder shape types. For example,
			// Title slide should have only Title placeholder type, etc.
			for (ILayoutSlide titleAndObjectLayoutSlide : layoutSlides) {
				if (titleAndObjectLayoutSlide.getName() == "Title and Object") {
					layoutSlide = titleAndObjectLayoutSlide;
					break;
				}
			}
			if (layoutSlide == null) {
				for (ILayoutSlide titleLayoutSlide : layoutSlides) {
					if (titleLayoutSlide.getName() == "Title") {
						layoutSlide = titleLayoutSlide;
						break;
					}
				}
				if (layoutSlide == null) {
					layoutSlide = layoutSlides.getByType(SlideLayoutType.Blank);
					if (layoutSlide == null) {
						layoutSlide = layoutSlides.add(SlideLayoutType.TitleAndObject, "Title and Object");
					}
				}
			}
		}

		// Adding empty slide with added layout slide
		pres.getSlides().insertEmptySlide(0, layoutSlide);

		// Save presentation
		pres.save(dataDir + "output.pptx", SaveFormat.Pptx);

	}

}
