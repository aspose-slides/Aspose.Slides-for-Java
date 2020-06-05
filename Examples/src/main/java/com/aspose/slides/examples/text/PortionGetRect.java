package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.*;
import java.awt.geom.Rectangle2D;


public class PortionGetRect
{
    public static void main(String[] args)
    {
        String outPath = RunExamples.getOutPath();

        Presentation pres = new Presentation();
        try
        {
            // Create table
            ITable tbl = pres.getSlides().get_Item(0).getShapes().addTable(50, 50, new double[]{50, 70}, new double[]{50, 50, 50});

            // Create paragraths
            IParagraph paragraph0 = new Paragraph();
            paragraph0.getPortions().add(new Portion("Text "));
            paragraph0.getPortions().add(new Portion("in0"));
            paragraph0.getPortions().add(new Portion(" Cell"));

            IParagraph paragraph1 = new Paragraph();
            paragraph1.setText("On0");

            IParagraph paragraph2 = new Paragraph();
            paragraph2.getPortions().add(new Portion("Hi there "));
            paragraph2.getPortions().add(new Portion("col0"));

            ICell cell = tbl.get_Item(1, 1);

            // Add text into the table cell
            cell.getTextFrame().getParagraphs().clear();
            cell.getTextFrame().getParagraphs().add(paragraph0);
            cell.getTextFrame().getParagraphs().add(paragraph1);
            cell.getTextFrame().getParagraphs().add(paragraph2);

            // Add TextFrame
            IAutoShape autoShape = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle, 400, 100, 60, 120);
            autoShape.getTextFrame().setText("Text in shape");
            autoShape.getTextFrame().getParagraphs().get_Item(0).getParagraphFormat().setAlignment(TextAlignment.Left);

            // Getting coordinates of the left top corner of the table cell.
            double x = tbl.getX() + cell.getOffsetX();
            double y = tbl.getY() + cell.getOffsetY();

            // Using IParagrap.getRect() and IPortion.getRect() methods in order to add frame to portions and paragraphs.
            for (IParagraph para : cell.getTextFrame().getParagraphs())
            {
                if ("".equals(para.getText()))
                    continue;

                Rectangle2D.Float rect = (Rectangle2D.Float) para.getRect().clone();
                IAutoShape shape =
                        (IAutoShape) pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle,
                                (float) rect.getX() + (float) x, (float) rect.getY() + (float) y, (float) rect.getWidth(), (float) rect.getHeight());

                shape.getFillFormat().setFillType(FillType.NoFill);
                shape.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.YELLOW);
                shape.getLineFormat().getFillFormat().setFillType(FillType.Solid);


                for (IPortion portion : para.getPortions())
                {
                    if (portion.getText().contains("0"))
                    {
                        rect = portion.getRect();
                        shape =
                                pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle,
                                        (float) rect.getX() + (float) x, (float) rect.getY() + (float) y, (float) rect.getWidth(), (float) rect.getHeight());

                        shape.getFillFormat().setFillType(FillType.NoFill);
                    }
                }
            }

            // Add frame to AutoShape paragraphs.
            for (IParagraph para : autoShape.getTextFrame().getParagraphs())
            {
                Rectangle2D.Float rect = (Rectangle2D.Float) para.getRect().clone();
                IAutoShape shape =
                        (IAutoShape) pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Rectangle,
                                (float) rect.getX() + autoShape.getX(), (float) rect.getY() + autoShape.getY(), (float) rect.getWidth(), (float) rect.getHeight());

                shape.getFillFormat().setFillType(FillType.NoFill);
                shape.getLineFormat().getFillFormat().getSolidFillColor().setColor(Color.YELLOW);
                shape.getLineFormat().getFillFormat().setFillType(FillType.Solid);

            }

            pres.save(outPath + "GetRect_Out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
    }
}

