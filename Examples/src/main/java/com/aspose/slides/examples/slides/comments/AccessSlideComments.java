package com.aspose.slides.examples.slides.comments;

import com.aspose.slides.IComment;
import com.aspose.slides.ICommentAuthor;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

/*
This project uses Automatic Package Restore feature of NuGet to resolve Aspose.Slides for .NET API reference 
when the project is build. Please check https://docs.nuget.org/consume/nuget-faq for more information. 
If you do not wish to use NuGet, you can manually download Aspose.Slides for .NET API from http://www.aspose.com/downloads, 
install it and then add its reference to this project. For any issues, questions or suggestions 
please feel free to contact us using http://www.aspose.com/community/forums/default.aspx
*/


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
