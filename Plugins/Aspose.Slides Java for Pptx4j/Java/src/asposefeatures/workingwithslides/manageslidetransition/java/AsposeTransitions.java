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

package asposefeatures.workingwithslides.manageslidetransition.java;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.TransitionType;

public class AsposeTransitions
{
	public static void main(String[] args)
	{
		String dataPath = "src/asposefeatures/workingwithslides/manageslidetransition/data/";
		
		//Instantiate Presentation class that represents a presentation file
		Presentation pres = new Presentation(dataPath + "presentation.pptx");

		//Apply circle type transition on slide 1
		pres.getSlides().get_Item(0).getSlideShowTransition().setType(TransitionType.Circle);

		//Apply comb type transition on slide 2
		pres.getSlides().get_Item(1).getSlideShowTransition().setType( TransitionType.Comb);

		//Apply zoom type transition on slide 3
		pres.getSlides().get_Item(2).getSlideShowTransition().setType(TransitionType.Zoom);

		//Write the presentation to disk
		pres.save(dataPath + "AsposeTransition_Out.pptx",SaveFormat.Pptx);
		
		System.out.println("First Transition File is saved.");
		
		//==============================================================
		
		//Instantiate a Presentation object that represents a PPT file
		Presentation presentation = new Presentation(dataPath + "presentation.pptx");

		//Apply circle type transition on slide 1
		presentation.getSlides().get_Item(0).getSlideShowTransition().setType(TransitionType.Circle);

		//Set the transition time of 3 seconds
		//Set the transition time of 5 seconds
		presentation.getSlides().get_Item(0).getSlideShowTransition().setAdvanceOnClick( true);
		presentation.getSlides().get_Item(0).getSlideShowTransition().setAdvanceAfterTime (3000);

		//Apply comb type transition on slide 2
		presentation.getSlides().get_Item(1).getSlideShowTransition().setType( TransitionType.Comb);


		//Set the transition time of 5 seconds
		presentation.getSlides().get_Item(1).getSlideShowTransition().setAdvanceOnClick( true);
		presentation.getSlides().get_Item(1).getSlideShowTransition().setAdvanceAfterTime (5000);

		//Apply zoom type transition on slide 3
		presentation.getSlides().get_Item(2).getSlideShowTransition().setType(TransitionType.Zoom);

		//Set the transition time of 7 seconds
		presentation.getSlides().get_Item(2).getSlideShowTransition().setAdvanceOnClick( true);
		presentation.getSlides().get_Item(2).getSlideShowTransition().setAdvanceAfterTime (7000);

		//Write the presentation to disk
		presentation.save(dataPath + "AsposeTransition2_Out.pptx",SaveFormat.Pptx);
		
		System.out.println("Second Transition File is saved.");
	}
}