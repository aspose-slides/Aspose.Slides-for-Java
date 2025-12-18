package com.aspose.slides.examples.presentations.lowcode;


import com.aspose.slides.Convert;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.RunExamples;

public class ConvertToImage
{
    public static void main(String[] args)
    {
        String pptxFileName = RunExamples.getDataDir_Slides_Presentations_LowCode() + "ConvertExample.pptx";
        String outPathJpeg = RunExamples.getOutPath() + "ConvertedToJpeg.jpg";
        String outPathPng = RunExamples.getOutPath() + "ConvertedToPng.png";
        String outPathTiff = RunExamples.getOutPath() + "ConvertedToTiff.tiff";

        //ExStart:ConvertToImage
        Presentation pres = new Presentation(pptxFileName);
        try {
            Convert.toJpeg(pres, outPathJpeg);
            Convert.toPng(pres, outPathPng);
            Convert.toTiff(pres, outPathTiff);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:ConvertToImage
    }
}
