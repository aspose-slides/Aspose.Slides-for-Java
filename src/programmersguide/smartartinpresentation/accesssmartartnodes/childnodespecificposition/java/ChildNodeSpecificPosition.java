/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.smartartinpresentation.accesssmartartnodes.childnodespecificposition.java;

import com.aspose.slides.*;

public class ChildNodeSpecificPosition
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/smartartinpresentation/accesssmartartnodes/childnodespecificposition/data/";

        //Instantiate the presentation
        Presentation pres = new Presentation();

        //Accessing the first slide
        ISlide slide = pres.getSlides().get_Item(0);

        //Adding the SmartArt shape in first slide
        ISmartArt smart = slide.getShapes().addSmartArt(0, 0, 400, 400, SmartArtLayoutType.StackedList);

        //Accessing the SmartArt  node at index 0
        ISmartArtNode node = smart.getAllNodes().get_Item(0);

        //Accessing the child node at position 1 in parent node
        int position = 1;
        SmartArtNode chNode = (SmartArtNode)((SmartArtNodeCollection)node.getChildNodes()).getNodeByPosition(position);

        //Printing the SmartArt child node parameters
        System.out.print("Text = "+chNode.getTextFrame().getText()+",  Level = "+chNode.getLevel()+", Position = "+chNode.getPosition());
    }
}




