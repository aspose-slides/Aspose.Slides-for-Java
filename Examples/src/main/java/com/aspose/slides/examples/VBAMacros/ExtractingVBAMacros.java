/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.VBAMacros;

import com.aspose.slides.IVbaModule;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Utils;


public class ExtractingVBAMacros {
    public static void main(String[] args) {
    
        //ExStart:ExtractingVBAMacros
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExtractingVBAMacros.class);
          
        // Load Presentation
	Presentation pres = new Presentation(dataDir + "VBA.pptm");
        
        if (pres.getVbaProject() != null) // check if Presentation contains VBA Project
            {
                for (IVbaModule module : pres.getVbaProject().getModules())
                {
                    System.out.println(module.getName());
                    System.out.println(module.getSourceCode());
                }
            }
        //ExEnd:ExtractingVBAMacros
    }
}
