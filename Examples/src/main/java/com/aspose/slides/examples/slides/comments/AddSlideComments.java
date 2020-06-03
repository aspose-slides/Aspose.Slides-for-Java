package com.aspose.slides.examples.slides.comments;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.geom.Point2D;
import java.util.Date;


/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


public class AddSlideComments
{
    public static void main(String[] args)
    {
        //ExStart:AddSlideComments
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Comments();

        // Instantiate Presentation class
        Presentation presentation = new Presentation();
        try
        {
            // Adding Empty slide
            presentation.getSlides().addEmptySlide(presentation.getLayoutSlides().get_Item(0));

            // Adding Author
            ICommentAuthor author = presentation.getCommentAuthors().addAuthor("Jawad", "MF");

            // Position of comments
            Point2D.Float point = new Point2D.Float();
            point.x = 0.2f;
            point.y = 0.2f;

            // Adding slide comment for an author on slide 1
            author.getComments().addComment("Hello Jawad, this is slide comment", presentation.getSlides().get_Item(0), (Point2D.Float) point.clone(), new Date());

            // Adding slide comment for an author on slide 1
            author.getComments().addComment("Hello Jawad, this is second slide comment", presentation.getSlides().get_Item(1), (Point2D.Float) point.clone(), new Date());

            // Accessing ISlide 1
            ISlide slide = presentation.getSlides().get_Item(0);

            // if null is passed as an argument then it will bring comments from all authors on selected slide
            IComment[] Comments = slide.getSlideComments(author);

            // Accessin the comment at index 0 for slide 1
            String str = Comments[0].getText();

            presentation.save(dataDir + "Comments_out.pptx", SaveFormat.Pptx);

            if (Comments.length > 0)
            {
                // Select comments collection of Author at index 0
                ICommentCollection commentCollection = Comments[0].getAuthor().getComments();
                String Comment = commentCollection.get_Item(0).getText();
            }
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AddSlideComments
    }
}
