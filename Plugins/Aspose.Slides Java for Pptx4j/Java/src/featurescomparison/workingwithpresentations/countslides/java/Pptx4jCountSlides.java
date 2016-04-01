package featurescomparison.workingwithpresentations.countslides.java;

/*
 *  Copyright 2014, Plutext Pty Ltd.
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.docx4j.openpackaging.packages.OpcPackage;
import org.docx4j.openpackaging.packages.PresentationMLPackage;

public class Pptx4jCountSlides {
	
	protected static Logger log = LoggerFactory.getLogger(Pptx4jCountSlides.class);
			
	public static void main(String[] args) throws Exception 
	{
		String dataPath = "src/featurescomparison/workingwithpresentations/countslides/data/";
		
		String inputfilepath = dataPath + "presentation.pptx";
		
		PresentationMLPackage presentationMLPackage = 
			(PresentationMLPackage)OpcPackage.load(new java.io.File(inputfilepath));
		
		System.out.println("Total Slides: " + presentationMLPackage.getMainPresentationPart().getSlideCount());		
	}	
}