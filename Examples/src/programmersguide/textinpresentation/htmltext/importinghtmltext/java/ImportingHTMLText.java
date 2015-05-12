/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.textinpresentation.htmltext.importinghtmltext.java;

import com.aspose.slides.*;

import java.io.*;

public class ImportingHTMLText
{
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/textinpresentation/htmltext/importinghtmltext/data/";

        //Create Empty presentation instance//Create Empty presentation instance
        Presentation pres = new Presentation();

//Acesss the default first slide of presentation
        ISlide slide = pres.getSlides().get_Item(0);

//Adding the AutoShape to accomodate the HTML content
        IAutoShape ashape = slide.getShapes().addAutoShape(ShapeType.Rectangle, 10, 10, (float) pres.getSlideSize().getSize().getWidth(), (float) pres.getSlideSize().getSize().getHeight());

        ashape.getFillFormat().setFillType(FillType.NoFill);

//Adding text frame to the shape
        ashape.addTextFrame("");

//Clearing all paragraphs in added text frame
        ashape.getTextFrame().getParagraphs().clear();

//Loading the HTML file using InputStream
        InputStream inputStream = new FileInputStream(dataDir + "html from pp2010 clipboard.html");
        Reader reader = new InputStreamReader(inputStream);

        int data = reader.read();
        String content = ReadFile(dataDir + "html from pp2010 clipboard.html");

//Adding text from HTML stream reader in text frame
        ashape.getTextFrame().getParagraphs().addFromHtml(content);

//Saving Presentation
        pres.save(dataDir + "output.pptx", SaveFormat.Pptx);
    }


        public static String ReadFile(String FileName) throws Exception
        {

            File file = new File(FileName);
            StringBuilder contents = new StringBuilder();
            BufferedReader reader = null;

            try {
                reader = new BufferedReader(new FileReader(file));
                String text = null;

                // repeat until all lines is read
                while ((text = reader.readLine()) != null) {
                    contents.append(text)
                            .append(System.getProperty(
                                    "line.separator"));
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            return contents.toString();


        }
    }





