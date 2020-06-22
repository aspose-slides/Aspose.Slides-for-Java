package com.aspose.slides.examples.slides.layout;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;


public class AddLayoutSlides
{
    public static void Run()
    {
        //ExStart:AddLayoutSlides
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Slides_Presentations_Layout();

        // Instantiate Presentation class that represents the presentation file
        Presentation presentation = new Presentation(dataDir + "AccessSlides.pptx");
        try
        {
            // Try to search by layout slide type
            IMasterLayoutSlideCollection layoutSlides = presentation.getMasters().get_Item(0).getLayoutSlides();
            ILayoutSlide layoutSlide = null;

            if (layoutSlides.getByType(SlideLayoutType.TitleAndObject) != null)
                layoutSlide = layoutSlides.getByType(SlideLayoutType.TitleAndObject);
            else
                layoutSlide = layoutSlides.getByType(SlideLayoutType.Title);

            if (layoutSlide == null)
            {
                // The situation when a presentation doesn't contain some type of layouts.
                // presentation File only contains Blank and Custom layout types.
                // But layout slides with Custom types has different slide names,
                // like "Title", "Title and Content", etc. And it is possible to use these
                // names for layout slide selection.
                // Also it is possible to use the set of placeholder shape types. For example,
                // Title slide should have only Title pleceholder type, etc.
                for (ILayoutSlide titleAndObjectLayoutSlide : (Iterable<ILayoutSlide>) layoutSlides)
                {
                    if ("Title and Object".equals(titleAndObjectLayoutSlide.getName()))
                    {
                        layoutSlide = titleAndObjectLayoutSlide;
                        break;
                    }
                }

                if (layoutSlide == null)
                {
                    for (ILayoutSlide titleLayoutSlide : (Iterable<ILayoutSlide>) layoutSlides)
                    {
                        if ("Title".equals(titleLayoutSlide.getName()))
                        {
                            layoutSlide = titleLayoutSlide;
                            break;
                        }
                    }

                    if (layoutSlide == null)
                    {
                        layoutSlide = layoutSlides.getByType(SlideLayoutType.Blank);
                        if (layoutSlide == null)
                        {
                            layoutSlide = layoutSlides.add(SlideLayoutType.TitleAndObject, "Title and Object");
                        }
                    }
                }
            }

            // Adding empty slide with added layout slide 
            presentation.getSlides().insertEmptySlide(0, layoutSlide);

            // Save presentation    
            presentation.save(dataDir + "AddLayoutSlides_out.pptx", SaveFormat.Pptx);
        }
        finally
        {
            if (presentation != null) presentation.dispose();
        }
        //ExEnd:AddLayoutSlides
    }
}
