/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Slides.Comments;

import static com.aspose.slides.CategoryAxisType.Date;
import com.aspose.slides.IComment;
import com.aspose.slides.ICommentAuthor;
import com.aspose.slides.ISlide;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.Utils;
import java.awt.geom.Point2D;
import java.util.Date;

/**
 *
 * @author mfazi
 */
public class AddParentComments {
    
    public static void main(String[] args) {
    
        //ExStart:AddParentComments

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddParentComments.class);
        Presentation pres = new Presentation();
        try
        {
            // Add comment
            ICommentAuthor author1 = pres.getCommentAuthors().addAuthor("Author_1", "A.A.");
            IComment comment1 = author1.getComments().addComment("comment1", pres.getSlides().get_Item(0), new Point2D.Float(10, 10), new Date());

            // Add reply for comment1
            ICommentAuthor author2 = pres.getCommentAuthors().addAuthor("Autror_2", "B.B.");
            IComment reply1 = author2.getComments().addComment("reply 1 for comment 1", pres.getSlides().get_Item(0), new Point2D.Float(10, 10), new Date());
            reply1.setParentComment(comment1);

            // Add reply for comment1
            IComment reply2 = author2.getComments().addComment("reply 2 for comment 1", pres.getSlides().get_Item(0),  new Point2D.Float(10, 10), new Date());
            reply2.setParentComment(comment1);

            // Add reply to reply
            IComment subReply = author1.getComments().addComment("subreply 3 for reply 2", pres.getSlides().get_Item(0),  new Point2D.Float(10, 10), new Date());
            subReply.setParentComment(reply2);

            IComment comment2 = author2.getComments().addComment("comment 2", pres.getSlides().get_Item(0), new Point2D.Float(10, 10), new Date());
            IComment comment3 = author2.getComments().addComment("comment 3", pres.getSlides().get_Item(0), new Point2D.Float(10, 10), new Date());

            IComment reply3 = author1.getComments().addComment("reply 4 for comment 3", pres.getSlides().get_Item(0), new Point2D.Float(10, 10), new Date());
            reply3.setParentComment(comment3);

            // Display hierarchy on console
            ISlide slide = pres.getSlides().get_Item(0);
            IComment[] comments = slide.getSlideComments(null);
            for (int i = 0; i < comments.length; i++)
            {
                IComment comment = comments[i];
                while (comment.getParentComment() != null)
                {
                    System.out.print("\t");
                    comment = comment.getParentComment();
                }

                System.out.println(comments[i].getAuthor().getName() +  " : " + comments[i].getText());
                System.out.println();
            }
            pres.save(dataDir + "parent_comment.pptx",SaveFormat.Pptx);
            // Remove comment1 and all its replies
            comment1.remove();
            
            pres.save(dataDir + "remove_comment.pptx",SaveFormat.Pptx);
        }
        finally {
            pres.dispose();
        }
        
        //ExEnd:AddParentComments
    }
}
