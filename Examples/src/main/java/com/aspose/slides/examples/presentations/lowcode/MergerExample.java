package com.aspose.slides.examples.presentations.lowcode;

import com.aspose.slides.Merger;
import com.aspose.slides.examples.RunExamples;

public class MergerExample
{
    public static void main(String[] args)
    {
        String pptxFileName1 = RunExamples.getDataDir_Slides_Presentations_LowCode() + "ForEachPortion.pptx";
        String pptxFileName2 = RunExamples.getDataDir_Slides_Presentations_LowCode() + "ConvertExample.pptx";
        String pptxFileName3 = RunExamples.getDataDir_Slides_Presentations_LowCode() + "MultipleMaster.pptx";
        String outPpptxFile = RunExamples.getOutPath() + "Merged-out.pptx";

        //ExStart:MergerExample
        Merger.process(new String[] { pptxFileName1, pptxFileName2, pptxFileName3 }, outPpptxFile);
        //ExEnd:MergerExample
    }
}
