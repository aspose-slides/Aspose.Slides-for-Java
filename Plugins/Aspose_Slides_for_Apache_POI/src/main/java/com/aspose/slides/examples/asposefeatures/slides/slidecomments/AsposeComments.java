package com.aspose.slides.examples.asposefeatures.slides.slidecomments;

import com.aspose.slides.IComment;
import com.aspose.slides.ICommentAuthor;
import com.aspose.slides.ICommentCollection;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;

public class AsposeComments
{
    public static void main(String[] args)
    {
	// The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeComments.class);
	
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
	author.getComments().addComment("Hello Aspose, this is slide comment",
		pres.getSlides().get_Item(0), point, date);

	// Adding slide comment for an author on slide 1
	author.getComments().addComment("Hello Aspose, this is second slide comment",
		pres.getSlides().get_Item(1), point, date);

	// Accessing ISlide 1
	ISlide slide = pres.getSlides().get_Item(0);

	// if null is passed as an argument then it will bring comments from all
	// authors on selected slide
	IComment[] Comments = slide.getSlideComments(author);

	// Accessing the comment at index 0 for slide 1
	String str = Comments[0].getText();

	pres.save(dataDir + "AsposeComments.pptx", SaveFormat.Pptx);

	if (Comments.length > 0)
	{
	    // Select comments collection of Author at index 0
	    ICommentCollection commentCollection = Comments[0].getAuthor().getComments();

	    String Comment = commentCollection.get_Item(0).getText();
	}

	// ======================================
	// Accessing Slide Comments
	// ======================================

	// Presentation pres = new Presentation("data/AsposeComments.pptx");
	for (ICommentAuthor author1 : pres.getCommentAuthors())
	{
	    for (IComment comment : author1.getComments())
	    {
		System.out.println("ISlide :" + comment.getSlide().getSlideNumber()
			+ " has comment: " + comment.getText() + " with Author: "
			+ comment.getAuthor().getName() + " posted on time :"
			+ comment.getCreatedTime() + "\n");
	    }
	}

	System.out.println("Done");
    }
}