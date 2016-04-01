package com.aspose.slides.examples.featurescomparison.presentations.converttohtml;

import java.util.Iterator;
import java.util.Map;

import org.docx4j.openpackaging.packages.PresentationMLPackage;
import org.docx4j.openpackaging.parts.Part;
import org.docx4j.openpackaging.parts.PresentationML.SlidePart;
import org.pptx4j.convert.out.svginhtml.SvgExporter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aspose.slides.examples.Utils;

public class Pptx4jConvertToHTML 
{
    protected static Logger log = LoggerFactory.getLogger(Pptx4jConvertToHTML.class);

    public static void main(String[] args) throws Exception 
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(Pptx4jConvertToHTML.class);

        String inputfilepath = dataDir + "pptx-basic.xml";

        // Where to save images
        SvgExporter.setImageDirPath(dataDir);

        PresentationMLPackage presentationMLPackage = 
                (PresentationMLPackage)PresentationMLPackage.load(new java.io.File(inputfilepath));		

        // TODO - render slides in document order!
        Iterator partIterator = presentationMLPackage.getParts().getParts().entrySet().iterator();
        while (partIterator.hasNext()) {    	
            Map.Entry pairs = (Map.Entry)partIterator.next();

            Part p = (Part)pairs.getValue();
            if (p instanceof SlidePart) {
                System.out.println(
                                SvgExporter.svg(presentationMLPackage, (SlidePart)p)
                                );
            }
	}
		
        // NB: file suffix must end with .xhtml in order to see the SVG in a browser
        System.out.println("Done...");
    }	
}