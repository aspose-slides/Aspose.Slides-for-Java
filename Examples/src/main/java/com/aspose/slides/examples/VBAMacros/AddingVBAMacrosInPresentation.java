package com.aspose.slides.examples.VBAMacros;

import com.aspose.slides.IVbaModule;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;
import com.aspose.slides.VbaProject;
import com.aspose.slides.VbaReferenceOleTypeLib;
import com.aspose.slides.examples.Utils;

public class AddingVBAMacrosInPresentation {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddingVBAMacrosInPresentation.class);

        //ExStart:AddingVBAMacrosInPresentation
        // Instantiate Presentation
        Presentation pres = new Presentation();
        try {
            // Create new VBA Project
            pres.setVbaProject(new VbaProject());

            // Add empty module to the VBA project
            IVbaModule module = pres.getVbaProject().getModules().addEmptyModule("Module");

            // Set module source code
            module.setSourceCode("Sub Test(oShape As Shape)MsgBox Test End Sub");

            // Create reference to <stdole>
            VbaReferenceOleTypeLib stdoleReference = new VbaReferenceOleTypeLib("stdole", "*\\G{00020430-0000-0000-C000-000000000046}#2.0#0#C:\\Windows\\system32\\stdole2.tlb#OLE Automation");

            // Create reference to Office
            VbaReferenceOleTypeLib officeReference = new VbaReferenceOleTypeLib("Office",
                    "*\\G{2DF8D04C-5BFA-101B-BDE5-00AA0044DE52}#2.0#0#C:\\Program Files\\Common Files\\Microsoft Shared\\OFFICE14\\MSO.DLL#Microsoft Office 14.0 Object Library");

            // Add references to the VBA project
            pres.getVbaProject().getReferences().add(stdoleReference);
            pres.getVbaProject().getReferences().add(officeReference);

            pres.save(dataDir + "test.pptm", SaveFormat.Pptm);
        } finally {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AddingVBAMacrosInPresentation
    }

}
