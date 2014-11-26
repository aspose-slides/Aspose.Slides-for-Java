/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.smartartinpresentation.addremovenodes.removenodespecificposition.java;

import com.aspose.slides.*;

public class RemoveNodeSpecificPosition
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/smartartinpresentation/addremovenodes/removenodespecificposition/data/";
        //Load the desired the presentation
        Presentation pres = new Presentation(dataDir+ "AddSmartArtNode.pptx");

        //Traverse through every shape inside first slide
        for(IShape shape : pres.getSlides().get_Item(0).getShapes())
        {

            //Check if shape is of SmartArt type
            if (shape instanceof SmartArt)
            {
                //Typecast shape to SmartArt
                SmartArt smart = (SmartArt)shape;

                if (smart.getAllNodes().getCount() > 0)
                {
                    //Accessing SmartArt node at index 0
                    ISmartArtNode node = smart.getAllNodes().get_Item(0);

                    if (node.getChildNodes().getCount() >= 2)
                    {
                        //Removing the child node at position 1
                        ((SmartArtNodeCollection)node.getChildNodes()).removeNodeByPosition(1);
                    }

                }
            }

        }

        //Save Presentation
        pres.save(dataDir+ "RemoveSmartArtNodeByPosition.pptx", SaveFormat.Pptx);

    }
}




