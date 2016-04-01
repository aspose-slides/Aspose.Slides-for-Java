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

package asposefeatures.workingwithslides.slidecomments.java;

import com.aspose.slides.IComment;
import com.aspose.slides.ICommentAuthor;
import com.aspose.slides.ICommentCollection;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeComments
{
	public static void main(String[] args)
	{
		String dataPath = "src/asposefeatures/workingwithslides/slidecomments/data/";
		
		// ======================================
		// Adding Slide Comments
		// ======================================
		Presentation pres = new Presentation();
		
		// Adding Empty slide
		pres.getSlides().addEmptySlide(pres.getLayoutSlides().get_Item(0));
		
		// Adding Author
		ICommentAuthor author = pres.getCommentAuthors().addAuthor("Aspose", "AS");
		
		// Position of comments
		java.awt.geom.Point2D.Float point = new java.awt.geom.Point2D.Float(0.2f, 0.2f);
		java.util.Date date = new java.util.Date();
		
		// Adding slide comment for an author on slide 1
		author.getComments().addComment("Hello Mudassir, this is slide comment",
				pres.getSlides().get_Item(0), point, date);
		
		// Adding slide comment for an author on slide 1
		author.getComments().addComment("Hello Mudassir, this is second slide comment",
				pres.getSlides().get_Item(1), point, date);
		
		// Accessing ISlide 1
		ISlide slide = pres.getSlides().get_Item(0);
		
		// if null is passed as an argument then it will bring comments from all
		// authors on selected slide
		IComment[] Comments = slide.getSlideComments(author);
		
		// Accessing the comment at index 0 for slide 1
		String str = Comments[0].getText();
		
		pres.save(dataPath + "AsposeComments_Out.pptx", SaveFormat.Pptx);
		
		if (Comments.length > 0)
		{
			// Select comments collection of Author at index 0
			ICommentCollection commentCollection = Comments[0].getAuthor().getComments();
		
			String comment = commentCollection.get_Item(0).getText();
		}
		
		// ======================================
		// Accessing Slide Comments
		// ======================================
		
		// Presentation pres = new Presentation("data/AsposeComments.pptx");
		for (ICommentAuthor author1 : pres.getCommentAuthors())
		{
			for (IComment comment : author1.getComments())
			{
				System.out.println("ISlide :"
					+ comment.getSlide().getSlideNumber()
					+ " has comment: " + comment.getText()
					+ " with Author: " + comment.getAuthor().getName()
					+ " posted on time :" + comment.getCreatedTime() + "\n");
			}
		}
		System.out.println("Done");				
	}
}