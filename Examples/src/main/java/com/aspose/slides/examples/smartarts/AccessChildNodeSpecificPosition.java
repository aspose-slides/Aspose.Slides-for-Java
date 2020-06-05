package com.aspose.slides.examples.smartarts;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.io.File;


public class AccessChildNodeSpecificPosition
{
    public static void main(String[] args)
    {
        //ExStart:AccessChildNodeSpecificPosition
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_SmartArts();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate the presentation
        Presentation pres = new Presentation();

        // Accessing the first slide
        ISlide slide = pres.getSlides().get_Item(0);

        // Adding the SmartArt shape in first slide
        ISmartArt smart = slide.getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutType.StackedList);

        // Accessing the SmartArt  node at index 0
        ISmartArtNode node = smart.getAllNodes().get_Item(0);

        // Accessing the child node at position 1 in parent node
        int position = 1;
        SmartArtNode chNode = (SmartArtNode) node.getChildNodes().get_Item(position);

        // Printing the SmartArt child node parameters
        String outString = String.format("j = {0},.Text{1},  Level = {2}, Position = {3}", position, chNode.getTextFrame().getText(), chNode.getLevel(), chNode.getPosition());
        System.out.println(outString);
        //ExEnd:AccessChildNodeSpecificPosition
    }
}
