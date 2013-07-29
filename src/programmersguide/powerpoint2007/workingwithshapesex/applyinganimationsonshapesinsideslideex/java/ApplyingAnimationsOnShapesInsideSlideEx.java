/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.powerpoint2007.workingwithshapesex.applyinganimationsonshapesinsideslideex.java;

import com.aspose.slides.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ApplyingAnimationsOnShapesInsideSlideEx
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/powerpoint2007/workingwithshapesex/applyinganimationsonshapesinsideslideex/data/";

        //Instantiate PrseetationEx class that represents the PPTX
        PresentationEx pres = new PresentationEx();
        SlideEx sld = pres.getSlides().get_Item(0);

        //Now create effect "PathFootball" for existing shape from scratch.
        int idx = sld.getShapes().addAutoShape(ShapeTypeEx.Rectangle, 150, 150, 250, 25);
        AutoShapeEx ashp = (AutoShapeEx)sld.getShapes().get_Item(idx);
        ashp.addTextFrame("Animated TextBox");

        //Add PathFootBall animation effect
        ShapeEx shape = pres.getSlides().get_Item(0).getShapes().get_Item(idx);
        pres.getSlides().get_Item(0).getTimeline().getMainSequence().addEffect(shape, EffectTypeEx.PathFootball,EffectSubtypeEx.None, EffectTriggerTypeEx.AfterPrevious);

        //Create some kind of "button".
        int index = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeTypeEx.Bevel, 10, 10, 20, 20);
        ShapeEx shapeTrigger = pres.getSlides().get_Item(0).getShapes().get_Item(index);

        //Create sequence of effects for this button.
        SequenceEx seqInter = pres.getSlides().get_Item(0).getTimeline().getInteractiveSequences().add(shapeTrigger);

        //Create custom user path. Our object will be moved only after "button" click.
        EffectEx fxUserPath = seqInter.addEffect(shape, EffectTypeEx.PathUser, EffectSubtypeEx.None, EffectTriggerTypeEx.OnClick);

        //Created path is empty so we should add commands for moving.
        MotionEffectEx motionBhv = ((MotionEffectEx)fxUserPath.getBehaviors().get_Item(0));
        java.awt.geom.Point2D.Float [] pts = new java.awt.geom.Point2D.Float [1];
        pts[0] = new java.awt.geom.Point2D.Float (0.076f, 0.59f);
       // motionBhv.getPath().add(MotionCommandPathTypeEx.LineTo, pts, MotionPathPointsTypeEx.Auto, true);
        pts[0] = new java.awt.geom.Point2D.Float (-0.076f, -0.59f);
     //   motionBhv.getPath().add(MotionCommandPathTypeEx.LineTo, pts, MotionPathPointsTypeEx.Auto, false);
     //   motionBhv.getPath().add(MotionCommandPathTypeEx.End, null, MotionPathPointsTypeEx.Auto, false);

        //Write the presentation as PPTX to disk
        pres.write(dataDir + "AnimExample.pptx");

        //Printing the status
        System.out.println("Animation added successfully!");
    }
}




