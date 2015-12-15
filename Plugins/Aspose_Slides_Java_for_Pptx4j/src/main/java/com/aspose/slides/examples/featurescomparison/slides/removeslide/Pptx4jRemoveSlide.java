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

package com.aspose.slides.examples.featurescomparison.slides.removeslide;

import org.docx4j.openpackaging.packages.OpcPackage;
import org.docx4j.openpackaging.packages.PresentationMLPackage;
import org.docx4j.openpackaging.parts.PresentationML.MainPresentationPart;
import org.docx4j.relationships.Relationship;

import com.aspose.slides.examples.Utils;

public class Pptx4jRemoveSlide
{
    public static void main(String[] args) throws Exception 
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(Pptx4jRemoveSlide.class);

        String inputfilepath = dataDir + "presentation.pptx";

        PresentationMLPackage presentationMLPackage = 
                (PresentationMLPackage)OpcPackage.load(new java.io.File(inputfilepath));

        MainPresentationPart mpp = presentationMLPackage.getMainPresentationPart();

        //mpp.removeSlide(10);
        Relationship rel = mpp.getRelationshipsPart().getRelationshipByID("rId2");
        mpp.removeSlide(rel);

        System.out.println("\n\n saving .. \n\n");
        String outputfilepath = dataDir + "RemovedSlide-Pptx4j.pptx";
        presentationMLPackage.save(new java.io.File(outputfilepath));

        System.out.println("\n\n done .. \n\n");		
    }	
}