package com.aspose.slides.examples.vba;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;





public class AddVBAMacros
{
    public static void main(String[] args)
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_VBA();

        //ExStart:AddVBAMacros
        // Instantiate Presentation
        Presentation presentation = new Presentation();
        try
        {
            // Create new VBA Project
            presentation.setVbaProject(new VbaProject());

            // Add empty module to the VBA project
            IVbaModule module = presentation.getVbaProject().getModules().addEmptyModule("Module");

            // Set module source code
            module.setSourceCode("Sub Test(oShape As Shape) MsgBox \"Test\" End Sub");

            // Create reference to <stdole>
            VbaReferenceOleTypeLib stdoleReference =
                    new VbaReferenceOleTypeLib("stdole", "*\\G{00020430-0000-0000-C000-000000000046}#2.0#0#C:\\Windows\\system32\\stdole2.tlb#OLE Automation");

            // Create reference to Office
            VbaReferenceOleTypeLib officeReference =
                    new VbaReferenceOleTypeLib("Office", "*\\G{2DF8D04C-5BFA-101B-BDE5-00AA0044DE52}#2.0#0#C:\\Program Files\\Common Files\\Microsoft Shared\\OFFICE14\\MSO.DLL#Microsoft Office 14.0 Object Library");

            // Add references to the VBA project
            presentation.getVbaProject().getReferences().add(stdoleReference);
            presentation.getVbaProject().getReferences().add(officeReference);


            // Save Presentation
            presentation.save(dataDir + "AddVBAMacros_out.pptm", SaveFormat.Pptm);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AddVBAMacros
    }
}
