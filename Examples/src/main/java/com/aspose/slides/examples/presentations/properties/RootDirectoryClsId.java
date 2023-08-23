package com.aspose.slides.examples.presentations.properties;/*
 * Copyright (c) 2009-2021 Aspose Pty Ltd. All Rights Reserved.
 */

import com.aspose.slides.PptOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.examples.RunExamples;

import java.util.UUID;

public class RootDirectoryClsId
{
    public static void main(String[] args)
    {
        // Output file name
        String resultPath = RunExamples.getOutPath() + "pres.ppt";

        //ExStart:RootDirectoryClsId
        Presentation pres = new Presentation();
        try {
            PptOptions pptOptions = new PptOptions();

            // set CLSID to 'Microsoft Powerpoint.Show.8'
            pptOptions.setRootDirectoryClsid(UUID.fromString("64818D10-4F9B-11CF-86EA-00AA00B929E8"));

            // Save presentation
            pres.save(resultPath, SaveFormat.Ppt, pptOptions);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:RootDirectoryClsId
    }
}
