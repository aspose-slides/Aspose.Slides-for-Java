/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aspose.slides.examples.Presentation.Opening;

import com.aspose.slides.IResourceLoadingArgs;
import com.aspose.slides.IResourceLoadingCallback;
import com.aspose.slides.LoadOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.ResourceLoadingAction;
import com.aspose.slides.examples.Utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author mfazi
 */
public class LoadPresentation {

    public static void main(String[] args) {

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(LoadPresentation.class);

        //ExStart:LoadPresentation
        LoadOptions opts = new LoadOptions();
        opts.setResourceLoadingCallback(new ImageLoadingHandler());

        Presentation presentation = new Presentation(dataDir + "presentation.pptx", opts);
        //ExEnd:LoadPresentation
    }
}

//ExStart:IResourceLoadingCallback
class ImageLoadingHandler implements IResourceLoadingCallback {

    public int resourceLoading(IResourceLoadingArgs args) {

        if (args.getOriginalUri().endsWith(".jpg")) {
            try // load substitute image
            {
                // The path to the documents directory.
                String dataDir = Utils.getDataDir(LoadPresentation.class);
                byte[] imageBytes = java.nio.file.Files.readAllBytes(new File(dataDir + "aspose-logo.jpg").toPath());
                args.setData(imageBytes);
                return ResourceLoadingAction.UserProvided;
            } catch (RuntimeException ex) {
                return ResourceLoadingAction.Skip;
            } catch (IOException ex) {
                Logger.getLogger(ImageLoadingHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (args.getOriginalUri().endsWith(".png")) {
            // set substitute url
            args.setUri("http://www.google.com/images/logos/ps_logo2.png");
            return ResourceLoadingAction.Default;
        }
        // skip all other images
        return ResourceLoadingAction.Skip;
    }

}
//ExEnd:IResourceLoadingCallback
