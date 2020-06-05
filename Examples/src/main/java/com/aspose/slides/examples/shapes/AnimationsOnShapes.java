package com.aspose.slides.examples.shapes;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.awt.geom.Point2D;
import java.io.File;
import java.lang.reflect.Array;


public class AnimationsOnShapes
{
    public static void main(String[] args)
    {
        //ExStart:AnimationsOnShapes
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Shapes();

        // Create directory if it is not already present.
        boolean IsExists = new File(dataDir).exists();
        if (!IsExists)
            new File(dataDir).mkdirs();

        // Instantiate PrseetationEx class that represents the PPTX
        Presentation pres = new Presentation();
        try
        {
            ISlide sld = pres.getSlides().get_Item(0);

            // Now create effect "PathFootball" for existing shape from scratch.
            IAutoShape ashp = sld.getShapes().addAutoShape(ShapeType.Rectangle, 150, 150, 250, 25);

            ashp.addTextFrame("Animated TextBox");

            // Add PathFootBall animation effect
            pres.getSlides().get_Item(0).getTimeline().getMainSequence().addEffect(ashp, EffectType.PathFootball,
                    EffectSubtype.None, EffectTriggerType.AfterPrevious);

            // Create some kind of "button".
            IShape shapeTrigger = pres.getSlides().get_Item(0).getShapes().addAutoShape(ShapeType.Bevel, 10, 10, 20, 20);

            // Create sequence of effects for this button.
            ISequence seqInter = pres.getSlides().get_Item(0).getTimeline().getInteractiveSequences().add(shapeTrigger);

            // Create custom user path. Our object will be moved only after "button" click.
            IEffect fxUserPath = seqInter.addEffect(ashp, EffectType.PathUser, EffectSubtype.None, EffectTriggerType.OnClick);

            // Created path is empty so we should add commands for moving.
            IMotionEffect motionBhv = ((IMotionEffect) fxUserPath.getBehaviors().get_Item(0));

            Point2D.Float[] pts = (Point2D.Float[]) Array.newInstance(Point2D.Float[].class, 1);
            pts[0] = new Point2D.Float(0.076f, 0.59f);
            motionBhv.getPath().add(MotionCommandPathType.LineTo, pts, MotionPathPointsType.Auto, true);
            pts[0] = new Point2D.Float(-0.076f, -0.59f);
            motionBhv.getPath().add(MotionCommandPathType.LineTo, pts, MotionPathPointsType.Auto, false);
            motionBhv.getPath().add(MotionCommandPathType.End, null, MotionPathPointsType.Auto, false);

            //Write the presentation as PPTX to disk
            pres.save(dataDir + "AnimExample_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (pres != null) pres.dispose();
        }
        //ExEnd:AnimationsOnShapes
    }
}
