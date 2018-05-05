package com.aspose.slides.examples.Slides.Shapes;

import com.aspose.slides.Presentation;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;


public class ExportShapeToSVG {
    
//ExStart:ExportShapeToSVG 
public static void main(String[] args) {
String dataDir = Utils.getDataDir(ExportShapeToSVG.class);
String pptxFileName = "Presentation.pptx";
Presentation pres = new Presentation(pptxFileName);
try{
OutputStream stream = new ByteArrayOutputStream();
pres.getSlides().get_Item(0).getShapes().get_Item(0).writeAsSvg(stream);
}finally {
pres.dispose();
}

  }
//ExEnd:ExportShapeToSVG 
}