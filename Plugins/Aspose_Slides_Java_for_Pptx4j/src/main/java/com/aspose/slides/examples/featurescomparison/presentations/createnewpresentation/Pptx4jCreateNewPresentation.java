/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.
    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 
    You may obtain a copy of the License at 
        http://www.apache.org/licenses/LICENSE-2.0 
    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.
    
    NOTICE: ORIGINAL FILE MODIFIED
*/

package com.aspose.slides.examples.featurescomparison.presentations.createnewpresentation;

import org.docx4j.openpackaging.packages.PresentationMLPackage;
import org.docx4j.openpackaging.parts.PartName;
import org.docx4j.openpackaging.parts.PresentationML.MainPresentationPart;
import org.docx4j.openpackaging.parts.PresentationML.SlideLayoutPart;
import org.docx4j.openpackaging.parts.PresentationML.SlidePart;

import com.aspose.slides.examples.Utils;

public class Pptx4jCreateNewPresentation 
{	
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(Pptx4jCreateNewPresentation.class);

        // Create skeletal package, including a MainPresentationPart and a SlideLayoutPart
        PresentationMLPackage presentationMLPackage = PresentationMLPackage.createPackage(); 

        // Need references to these parts to create a slide
        // Please note that these parts *already exist* - they are
        // created by createPackage() above.  See that method
        // for instruction on how to create and add a part.
        MainPresentationPart pp = (MainPresentationPart)presentationMLPackage.getParts().getParts().get(
                        new PartName("/ppt/presentation.xml"));		
        SlideLayoutPart layoutPart = (SlideLayoutPart)presentationMLPackage.getParts().getParts().get(
                        new PartName("/ppt/slideLayouts/slideLayout1.xml"));

        // OK, now we can create a slide
        SlidePart slidePart = presentationMLPackage.createSlidePart(pp, layoutPart, 
                        new PartName("/ppt/slides/slide1.xml"));

        presentationMLPackage.save(new java.io.File(dataDir + "Pptx4j-New-Presentation.pptx"));

        System.out.println("\n\n done .. \n\n");		
    }	
}