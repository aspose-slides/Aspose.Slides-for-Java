package com.aspose.slides.examples.slides.hyperlinks;/*
 * Copyright (c) 2009-2021 Aspose Pty Ltd. All Rights Reserved.
 */

import com.aspose.slides.IAutoShape;
import com.aspose.slides.Presentation;
import com.aspose.slides.ShapeType;

public class MacroHyperLink
{
    public static void main(String[] args)
    {
        String macroName = "TestMacro";
        Presentation pres = new Presentation();
        try {
            IAutoShape shape = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.BlankButton, 20, 20, 80, 30);
            shape.getHyperlinkManager().setMacroHyperlinkClick(macroName);

            System.out.println("External URL is " + shape.getHyperlinkClick().getExternalUrl());
            System.out.println("Shape action type is " + shape.getHyperlinkClick().getActionType());
        } finally {
            if (pres != null) pres.dispose();
        }
    }
}
