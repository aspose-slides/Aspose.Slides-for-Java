package com.aspose.slides.examples.slides.comments;

import com.aspose.slides.IComment;
import com.aspose.slides.ICommentAuthor;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;




public class AccessSlideComments
{
    public static void main(String[] args)
    {
        //ExStart:AccessSlideComments
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Comments();

        // Instantiate Presentation class
        Presentation presentation = new Presentation(dataDir + "Comments1.pptx");
        try
        {
            for (ICommentAuthor commentAuthor : presentation.getCommentAuthors())
            {
                ICommentAuthor author = commentAuthor;
                for (IComment comment1 : author.getComments())
                {
                    IComment comment = comment1;
                    System.out.println("ISlide :" + comment.getSlide().getSlideNumber() + " has comment: " + comment.getText() + " with Author: " + comment.getAuthor().getName() + " posted on time :" + comment.getCreatedTime() + "\n");
                }
            }
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AccessSlideComments
    }
}
