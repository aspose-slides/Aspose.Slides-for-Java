/**
 * Copyright (c) Aspose 2002-2014. All Rights Reserved.
 *
 * LICENSE: This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://opensource.org/licenses/gpl-3.0.html>;.
 *
 * @author  Shoaib Khan <shoaib.khan@aspose.com>
 * 
 * @link	https://asposeapachepoi.codeplex.com/
 * @link	https://sourceforge.net/projects/asposeforapachepoi/
 * @link    https://github.com/asposemarketplace/Aspose_for_Apache_POI
 * @link	https://bitbucket.org/asposemarketplace/aspose-for-apache-poi
 */

package asposefeatures.workingwithpresentation.replacetxtinplaceholders.java;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeReplaceTxtInPlaceHolders
{
    public static void main(String[] args)
    {
	String dataPath = "src/asposefeatures/workingwithpresentation/replacetxtinplaceholders/data/";
	
	// Instantiate Presentation class that represents PPTX
	Presentation pres = new Presentation(dataPath + "demo.pptx");

	// Access first slide
	ISlide slide = pres.getSlides().get_Item(0);

	IShape shape = null;

	// Iterate through the shapes and set a reference to the table found
	for (int i = 0; i < slide.getShapes().size(); i++)
	{
	    shape = slide.getShapes().get_Item(i);
	    if (shape.getPlaceholder() != null)
	    {
		// Change the text of each placeholder
		((IAutoShape) shape).getTextFrame().setText("This is Placeholder");
	    }
	}

	// Write the PPTX to Disk
	pres.save(dataPath + "AsposeReplaceTxt.pptx", SaveFormat.Pptx);

	// Status
	System.out.println("Process completed successfully.");
    }
}
