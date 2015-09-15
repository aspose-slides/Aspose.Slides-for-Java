/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.slides.examples.Presentation1.OpenpPresentation1;

import com.aspose.slides.*;
import com.aspose.slides.examples.Utils;

public class OpenPasswordPresentation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(OpenPasswordPresentation.class);

        //Loading Pass protected Presentation1

        //creating instance of load options to set the Presentation1 access password
        com.aspose.slides.LoadOptions loadOptions = new com.aspose.slides.LoadOptions();

        //Setting the access password
        loadOptions.setPassword ("pass");

        //Opening the Presentation1 file by passing the file path and load options to the constructor of Presentation class
        Presentation pres = new Presentation(dataDir+ "Aspose.pptx", loadOptions);

        //Printing the total number of Slides1 present in the Presentation1
        System.out.println(pres.getSlides().size());
        System.out.println("Program executed successfully");
    }
}




