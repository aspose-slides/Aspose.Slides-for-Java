package com.aspose.slides.examples.Presentation.Properties;

import com.aspose.slides.IDocumentProperties;
import com.aspose.slides.IPresentationInfo;
import com.aspose.slides.PresentationFactory;
import com.aspose.slides.examples.Utils;


public class ReadAndUpdateDocumentProperties {
    public static void main(String[] args) {

        String dataDir = Utils.getSharedDataDir(ReadAndUpdateDocumentProperties.class) + "Properties/";

        //ExStart:ReadAndUpdateDocumentProperties
        // read the info of presentation
        IPresentationInfo info = PresentationFactory.getInstance().getPresentationInfo(dataDir + "presentation.pptx");

        // obtain the current properties
        IDocumentProperties props = info.readDocumentProperties();

        // set the new values of Author and Title fields
        props.setAuthor("New Author");
        props.setTitle("New Title");

        // update the presentation with a new values
        info.updateDocumentProperties(props);
        info.writeBindedPresentation(dataDir + "presentation.pptx");
        //ExEnd:ReadAndUpdateDocumentProperties
    }
}
