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
 * @author  Shoaib Khan
 * 
 * @link	https://asposejavadocx4j.codeplex.com/
 * @link	https://sourceforge.net/projects/asposejavafordocx4j/
 * @link	https://github.com/asposemarketplace/Aspose_Java_for_Docx4j
 * @link    https://bitbucket.org/asposemarketplace/aspose-java-for-docx4j/
 */

package asposefeatures.workingwithsmartart.managesmartart.java;

import com.aspose.slides.IShape;
import com.aspose.slides.ISlide;
import com.aspose.slides.ISmartArt;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.SmartArtLayoutType;

public class AsposeSmartArt
{
	public static void main(String[] args)
	{
		String dataPath = "src/asposefeatures/workingwithsmartart/managesmartart/data/";
		
		//==================
		//Adding Smart Art
		//==================
		
		//Instantiate Presentation Class
		Presentation pres = new Presentation();
		
		//Get first slide
		ISlide slide = pres.getSlides().get_Item(0);
		
		//Add Smart Art Shape
		ISmartArt smart = slide.getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutType.BasicBlockList);
		
		//Saving presentation
		pres.save(dataPath + "AsposeSmartArt_Out.pptx", SaveFormat.Pptx);
			    
		//=====================
		//Accessing Smart Art
		//=====================
		//Get first slide
		ISlide slide0 = pres.getSlides().get_Item(0);
		
		//Traverse through every shape inside first slide
		for(IShape shape : slide0.getShapes())
		{
		    //Check if shape is of SmartArt type
		    if (shape instanceof ISmartArt)
		    {
		        //Typecast shape to SmartArtEx
		        ISmartArt smartArt = (ISmartArt)shape;
		    }
		}
		System.out.println("Smart Art added and Accessed.");
	}
}