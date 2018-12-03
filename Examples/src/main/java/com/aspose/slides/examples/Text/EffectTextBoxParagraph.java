
package com.aspose.slides.examples.Text;

import com.aspose.slides.IAutoShape;
import com.aspose.slides.IEffect;
import com.aspose.slides.IParagraph;
import com.aspose.slides.ISequence;
import com.aspose.slides.Presentation;
import com.aspose.slides.examples.Slides.Charts.SettingFontPropertiesForTable;
import com.aspose.slides.examples.Utils;


public class EffectTextBoxParagraph {
    
public static void main(String[] args) {

  //ExStart:EffectTextBoxParagraph 
String dataDir = Utils.getDataDir(EffectTextBoxParagraph.class);
Presentation pres = new Presentation(dataDir+"Presentation.pptx");
try
{
ISequence sequence = pres.getSlides().get_Item(0).getTimeline().getMainSequence();
IAutoShape autoShape = (IAutoShape)pres.getSlides().get_Item(0).getShapes().get_Item(0);
 
for (IParagraph paragraph : autoShape.getTextFrame().getParagraphs())
{
IEffect[] effects = sequence.getEffectsByParagraph(paragraph);
 
if (effects.length > 0)
System.out.println("Paragraph \"" + paragraph.getText() + "\" has " + effects[0].getType() + " effect.");
}
}
finally {
pres.dispose();
}

//ExEnd:EffectTextBoxParagraph 
}
}
