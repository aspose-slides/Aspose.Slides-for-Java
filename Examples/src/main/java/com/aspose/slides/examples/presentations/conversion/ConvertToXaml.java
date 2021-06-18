package com.aspose.slides.examples.presentations.conversion;/*
 * Copyright (c) 2009-2021 Aspose Pty Ltd. All Rights Reserved.
 */

import com.aspose.slides.IXamlOutputSaver;
import com.aspose.slides.Presentation;
import com.aspose.slides.XamlOptions;
import com.aspose.slides.examples.RunExamples;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConvertToXaml
{
    //ExStart:ConvertToXaml
    public static void main(String[] args)
    {
        // Path to source presentation
        String presentationFileName = RunExamples.getDataDir_Conversion() + "XamlEtalon.pptx";

        Presentation pres = new Presentation(presentationFileName);
        try {
            // Create convertion options
            XamlOptions xamlOptions = new XamlOptions();
            xamlOptions.setExportHiddenSlides(true);

            // Define your own output-saving service
            NewXamlSaver newXamlSaver = new NewXamlSaver();
            xamlOptions.setOutputSaver(newXamlSaver);

            // Convert slides
            pres.save(xamlOptions);

            // Save XAML files to an output directory

            for (Map.Entry<String, String> pair : newXamlSaver.getResults().entrySet()) {
                FileWriter writer = new FileWriter(RunExamples.getOutPath() + pair.getKey(), true);
                writer.append(pair.getValue());
                writer.close();
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if (pres != null) pres.dispose();
        }
    }


    /**
     * Represents an output saver implementation for transfer data to the external storage.
     */
    static class NewXamlSaver implements IXamlOutputSaver
    {
        private Map<String, String> m_result =  new HashMap<String, String>();

        public Map<String, String> getResults()
        {
            return m_result;
        }

        public void save(String path, byte[] data)
        {
            String name = new File(path).getName();
            m_result.put(name, new String(data, StandardCharsets.UTF_8));
        }
    }
    //ExEnd:ConvertToXaml

}
