package com.aspose.slides.examples.text;

import com.aspose.slides.*;
import com.aspose.slides.examples.RunExamples;

import java.util.ArrayList;
import java.util.List;

/**
 * The following code sample demonstrates how to handle text replacing results using the IFindResultCallback interface:
 */
public class FindAndReplaceTextResult
{
    public static void main(String[] args)
    {
        String presentationName = RunExamples.getDataDir_Text() + "TextReplaceExample.pptx";
        String outPath = RunExamples.getOutPath() + "TextReplaceExampleReplace-out.pptx";

        Presentation pres = new Presentation(presentationName);
        try {
            // Create callback.
            FindResultCallback callback = new FindResultCallback();

            // Replace all words "[this block]".
            pres.replaceText("\\[this block\\]", "my text", new TextSearchOptions(), callback);

            // Output the number of found fragments of the given text.
            System.out.println("number of found fragments = " + callback.getCount());

            // Output data for each word "[this block] " found.
            for (WordInfo info : callback.Words)
            {
                System.out.println("Text = " + info.getFoundText() + ", Position = " + info.getTextPosition());
            }

            pres.save(outPath, SaveFormat.Pptx);
        } finally {
            if (pres != null) pres.dispose();

        }
    }

    /**
     * Class that provides information about all found occurrences of a given text.
     */
    static class FindResultCallback implements IFindResultCallback
    {
        // Array of retrieved text information.
        public final List<WordInfo> Words = new ArrayList<>();

        /**
         * The number of matches found to a given text.
         */
        public int getCount()
        {
            return Words.size();
        }

        /**
         * Gets all slides in which the given text was found.
         */
        public Integer[] getSlideNumbers()
        {
            List<Integer> slideNumbers = new ArrayList<>();
            for (WordInfo element : Words)
            {
                int slideNumber = ((Slide)element.TextFrame.getSlide()).getSlideNumber();
                if (!slideNumbers.contains(slideNumber))
                    slideNumbers.add(slideNumber);
            }
            return slideNumbers.toArray(new Integer[0]);
        }

        /**
         * Gets all occurrences of the found text on the slide.
         * @param slideNumber Slide number
         */
        public WordInfo[] getElemensForSlide(int slideNumber)
        {
            List<WordInfo> foundElements = new ArrayList<>();
            for (WordInfo element : Words)
            {
                if (((Slide)element.TextFrame.getSlide()).getSlideNumber() == slideNumber)
                    foundElements.add(element);
            }
            return foundElements.toArray(new WordInfo[0]);
        }

        /**
         * Callback method that receives data about the found text.
         * @param textFrame The ITextFrame in which the text was found.
         * @param oldText The source text in which the text was found.
         * @param foundText The found text.
         * @param textPosition The position of the found text.
         */
        public void foundResult(ITextFrame textFrame, String oldText, String foundText, int textPosition)
        {
            Words.add(new WordInfo(textFrame, oldText, foundText, textPosition));
        }
    }

    /**
     * Class providing information about each text found in the presentation.
     */
    public static class WordInfo
    {
        private final ITextFrame TextFrame;
        private final String SourceText;
        private final String FoundText;
        private final int TextPosition;

        WordInfo(ITextFrame textFrame, String sourceText, String foundText, int textPosition)
        {
            TextFrame = textFrame;
            SourceText = sourceText;
            FoundText = foundText;
            TextPosition = textPosition;
        }

        /**
         * Gets found text.
         */
        public String getFoundText() {
            return FoundText;
        }

        /**
         * Gets the source text for the TextFrame in which the text was found.
         */
        public String getSourceText() {
            return SourceText;
        }

        /**
         * The position of the found text in the text frame.
         */
        public int getTextPosition() {
            return TextPosition;
        }

        /**
         * The text frame in which the text was found.
         */
        public ITextFrame getTextFrame() {
            return TextFrame;
        }
    }
}
