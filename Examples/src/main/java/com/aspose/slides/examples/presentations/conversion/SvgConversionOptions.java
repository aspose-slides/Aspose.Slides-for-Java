/*
 * Copyright (c) 2009-2022. Aspose Pty Ltd. All Rights Reserved.
 */

package com.aspose.slides.examples.presentations.conversion;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.FileOutputStream;
import java.io.IOException;

public class SvgConversionOptions
{

    public static void main(String[] args)
    {
        String presentationName = RunExamples.getDataDir_Conversion() + "SvgShapesConversion.pptx";
        String outPath = RunExamples.getOutPath() + "SvgShapesConversion.svg";

        //ExStart:SvgConversionOptions
        Presentation presentation = new Presentation(presentationName);
        try {
            // Create new SVG option
            SVGOptions svgOptions = new SVGOptions();

            // Set UseFrameSize property to include frame in a rendering area.
            svgOptions.setUseFrameSize(true);

            // Set UseFrameRotation property to exclude rotation of the shape when rendering.
            svgOptions.setUseFrameRotation(false);

            // Save a shape to svg using SvgOptions
            FileOutputStream stream = new FileOutputStream(outPath);
            try {
                presentation.getSlides().get_Item(0).getShapes().get_Item(0).writeAsSvg(stream, svgOptions);
            } finally {
                if (stream != null) stream.close();
            }
        } catch(IOException e) {
        } finally {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:SvgConversionOptions
    }

}
