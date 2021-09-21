![GitHub all releases](https://img.shields.io/github/downloads/aspose-slides/Aspose.slides-for-Java/total) ![GitHub](https://img.shields.io/github/license/aspose-slides/Aspose.slides-for-java)
# Java PowerPoint API

[Aspose.Slides](https://products.aspose.com/slides/java) a Java PowerPoint API for presentation manipulation and management. It allows developers to read, write, convert and manipulate PowerPoint presentations in Java applications with the ability to manipulate all document elements such as slides, tables, text, charts, shapes, images and SmartArt diagrams and more.

<p align="center">
  <a title="Download complete Aspose.Slides for Java source code" href="https://github.com/asposeslides/Aspose_Slides_Java/archive/master.zip">
	<img src="https://raw.github.com/AsposeExamples/java-examples-dashboard/master/images/downloadZip-Button-Large.png" />
  </a>
</p>

Directory | Description
--------- | -----------
[Examples](https://github.com/aspose-slides/Aspose.Slides-for-Java/tree/master/Examples)  | A collection of Java examples that help you learn how to use product features.
[Plugins](https://github.com/aspose-slides/Aspose.Slides-for-Java/tree/master/Plugins)  | Plugins to help integrate Aspose.Slides for Java in different environments.


## PowerPoint File Manipulation via Java

Checkout the [product overview](https://docs.aspose.com/slides/java/product-overview/) to know all about Aspose.Slides for Java. 

- Load & convert presentations to other formats.
- Create presentations from scratch. 
- Manipulate all of presentation elements via intuitive object model.
- Create or embed charts.
- Create or manipulate shapes.

## Read & Write Presentations

**Microsoft PowerPoint:** PPT, PPTX, PPS, POT, PPSX, PPTM, PPSM, POTX, POTM\
**OpenOffice:** ODP, OTP

## Save Presentations As

**Fixed Layout:** PDF, PDF/A, XPS
**Image:** JPEG, PNG, BMP, TIFF, GIF, SVG
**Web:** HTML, SWF

## Supported Environments

- **Microsoft Windows:** Windows Desktop & Server (x86, x64)
- **macOS:** Mac OS X
- **Linux:** Ubuntu, OpenSUSE, CentOS, and others
- **Java Versions:** `J2SE 6.0 (1.6)` or above

## Get Started with Aspose.Slides for Java

Aspose hosts all Java APIs at the [Aspose Repository](https://repository.aspose.com/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-slides). You can easily use Aspose.Slides for Java API directly in your Maven projects with simple configurations. For the detailed instructions please visit [Installing Aspose.Slides for Java from Maven Repository](https://docs.aspose.com/slides/java/installation/) documentation page.

## Convert Presentation to PDF

```java
// instantiate a Presentation object that represents a presentation file
Presentation pres = new Presentation("demo.pptx");
try {
    // save the presentation to PDF with default options
    pres.save("output.pdf", SaveFormat.Pdf);
} finally {
    if (pres != null) pres.dispose();
}
```

## Create Presentation from Scratch

```java
// instantiate Presentation
Presentation pres = new Presentation();
try {
    // get the first slide
    ISlide sld = (ISlide) pres.getSlides().get_Item(0);
    
    // add an AutoShape of Rectangle type
    IAutoShape ashp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 150, 75, 150, 50);
    
    // add ITextFrame to the Rectangle
    ashp.addTextFrame("Hello World");
    
    // change the text color to Black (which is White by default)
    ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat()
            .setFillType(FillType.Solid);
    ashp.getTextFrame().getParagraphs().get_Item(0).getPortions().get_Item(0).getPortionFormat().getFillFormat()
            .getSolidFillColor().setColor(java.awt.Color.BLACK);
    
    // change the line color of the rectangle to White
    ashp.getShapeStyle().getLineColor().setColor(java.awt.Color.WHITE);
    
    // remove any fill formatting in the shape
    ashp.getFillFormat().setFillType(FillType.NoFill);
    
    // save the presentation to disk
    pres.save("output.pptx", SaveFormat.Pptx);
} finally {
    if (pres != null) pres.dispose();
}
```

[Home](https://www.aspose.com/) | [Product Page](https://products.aspose.com/slides/java) | [Docs](https://docs.aspose.com/slides/java/) | [Demos](https://products.aspose.app/slides/family) | [API Reference](https://apireference.aspose.com/slides/java) | [Examples](https://github.com/aspose-slides/Aspose.Slides-for-Java) | [Blog](https://blog.aspose.com/category/slides/) | [Search](https://search.aspose.com/) | [Free Support](https://forum.aspose.com/c/slides) | [Temporary License](https://purchase.aspose.com/temporary-license)
