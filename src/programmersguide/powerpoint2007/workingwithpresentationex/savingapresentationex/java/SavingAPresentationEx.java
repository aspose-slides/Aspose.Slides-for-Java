/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithpresentationex.savingapresentationex.java;

import com.aspose.slides.*;

import java.io.FileOutputStream;

public class SavingAPresentationEx
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithpresentationex/savingapresentationex/data/";


        // 1.
        // Save to file
        //Instantiate a PresentationEx object that represents a PPTX file
        PresentationEx pres1 = new PresentationEx();

        //....do some work here.....
        processPresentation(pres1);

        //Save your presentation to a file
        pres1.write(dataDir + "toFile.pptx");

        System.out.println("Presentation saved to a file successfully.");



        // 2.
        // Save to stream
        //Instantiate a PresentationEx object that represents a PPTX file
        PresentationEx pres2 = new PresentationEx();

        //....do some work here.....
        processPresentation(pres2);

        try
        {
            FileOutputStream outStream = new FileOutputStream(dataDir + "toStream.pptx");

            //Saving the presentation to the output stream of Http Response
            pres2.write(outStream);
            outStream.close();

            System.out.println("Presentation saved to a file stream successfully.");
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }



        // 3.
        // Save with password protection
        //Instantiate a Presentation object that represents a PPTX file
        PresentationEx pres3 = new PresentationEx();

        //....do some work here.....
        processPresentation(pres3);

        //Setting Password
        pres3.encrypt("test");

        //Save your presentation to a file
        pres3.write(dataDir + "passwordProtected.pptx");

        System.out.println("Password protected Presentation saved successfully.");



        // 4.
        // Saving a Password Protected Presentation but with Read Access to Document Properties
        //Instantiate a Presentation object that represents a PPTX file
        PresentationEx pres4 = new PresentationEx();

        //....do some work here.....
        processPresentation(pres4);

        //Setting access to document properties in password protected mode
        pres4.setEncryptDocumentProperties(false);

        //Setting Password
        pres4.encrypt("test");

        //Save your presentation to a file
        pres4.write(dataDir + "passwordProtectedReadOnlyProperties.pptx");

        System.out.println("Password protected Presentation with read only properties is saved successfully.");



        // 5.
        // Saving Presentation in Read Only Mode
        //Instantiate a Presentation object that represents a PPTX file
        PresentationEx pres5 = new PresentationEx();

        //....do some work here.....
        processPresentation(pres5);

        //Setting Write protection Password
        pres5.setWriteProtection("test");

        //Save your presentation to a file
        pres5.write(dataDir + "readOnlyPresentation.pptx");

        System.out.println("Read only Presentation saved successfully.");



        // 6.
        // Removing Write Protection from a Presentation
        //Opening the presentation file
        PresentationEx pres6 = new PresentationEx(dataDir + "readOnlyPresentation.pptx");

        //Checking if presentation is write protected
        if(pres6.isWriteProtected())
            //Removing Write protection
            pres6.removeWriteProtection();

        //Saving presentation
        pres6.write(dataDir + "writeProtectionRemoved.pptx");

        System.out.println("Write protection disabled and saved as \"writeProtectionRemoved.pptx\" successfully.");
    }

    public static void processPresentation(PresentationEx pres)
    {
        //Get the first slide
        SlideEx sld = pres.getSlides().get_Item(0);

        //Add an AutoShape of Rectangle type
        int idx = sld.getShapes().addAutoShape(ShapeTypeEx.Rectangle, 150, 75,150 , 50);
        AutoShapeEx ashp = (AutoShapeEx)sld.getShapes().get_Item(idx);

        //Add TextFrame to the Rectangle
        ashp.addTextFrame("Hello World");

        //Change the text color to Black (which is White by default)
        ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getFillFormat().setFillType(FillTypeEx.Solid);
        ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getFillFormat().getSolidFillColor().setColor(java.awt.Color.black);

        //Change the line color of the rectangle to White
        ashp.getShapeStyle().getLineColor().setColor(java.awt.Color.white);

        //Remove any fill formatting in the shape
        ashp.getFillFormat().setFillType(FillTypeEx.NoFill);
    }
}




