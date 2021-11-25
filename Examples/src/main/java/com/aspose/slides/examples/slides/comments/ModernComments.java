/*
 * Copyright (c) 2009-2021. Aspose Pty Ltd. All Rights Reserved.
 */

package com.aspose.slides.examples.slides.comments;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;
import java.awt.geom.Point2D;
import java.util.Date;

public class ModernComments
{
    public static void main(String[] args)
    {
        //ExStart:ModernComments
        // The path to the output file.
        String outPptxFile = RunExamples.getOutPath() +  "ModernComments_out.pptx";

        // Instantiate Presentation class
        Presentation pres = new Presentation();
        try
        {
            // Add author
            ICommentAuthor newAuthor = pres.getCommentAuthors().addAuthor("Some Author", "SA");

            // Add comment
            IModernComment modernComment = newAuthor.getComments().addModernComment("This is a modern comment", pres.getSlides().get_Item(0), null, new Point2D.Float(100, 100), new Date());

            // Save presentation
            pres.save(outPptxFile, SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ModernComments
    }
}
