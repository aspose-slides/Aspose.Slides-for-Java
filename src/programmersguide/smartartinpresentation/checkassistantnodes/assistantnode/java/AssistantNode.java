/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.smartartinpresentation.checkassistantnodes.assistantnode.java;

import com.aspose.slides.*;

public class AssistantNode
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/smartartinpresentation/checkassistantnodes/assistantnode/data/";

        //Creating a presentation instance
        Presentation pres = new Presentation(dataDir+ "AddSmartArtNode.pptx");

        //Traverse through every shape inside first slide
        for(IShape shape : pres.getSlides().get_Item(0).getShapes())
        {
            //Check if shape is of SmartArt type
            if (shape instanceof ISmartArt)
            {
                //Typecast shape to SmartArtEx
                ISmartArt smart = (SmartArt)shape;

                //Traversing through all nodes of SmartArt shape
                for(int i = 0; i < smart.getAllNodes().getCount(); i++)
                {
                    ISmartArtNode node  =    smart.getAllNodes().get_Item(i);

                    String tc = node.getTextFrame().getText();

                    //Check if node is Assitant node
                    if (node.isAssistant())
                    {
                        //Setting Assitant node to false and making it normal node
                        node.setAssistant(false);
                    }
                }
            }
        }
        //Save Presentation
        pres.save(dataDir+ "ChangeAssitantNode.pptx", SaveFormat.Pptx);
    }
}




