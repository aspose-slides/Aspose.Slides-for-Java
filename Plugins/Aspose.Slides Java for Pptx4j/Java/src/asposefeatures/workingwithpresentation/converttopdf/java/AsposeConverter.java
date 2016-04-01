/**
 * Copyright (c) Aspose 2002-2014. All Rights Reserved.
 *
 * LICENSE: This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://opensource.org/licenses/gpl-3.0.html>;.
 *
 * @author  Shoaib Khan
 * 
 * @link	https://asposejavadocx4j.codeplex.com/
 * @link	https://sourceforge.net/projects/asposejavafordocx4j/
 * @link	https://github.com/asposemarketplace/Aspose_Java_for_Docx4j
 * @link    https://bitbucket.org/asposemarketplace/aspose-java-for-docx4j/
 */

package asposefeatures.workingwithpresentation.converttopdf.java;

import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

public class AsposeConverter
{
	public static void main(String[] args)
	{
        // 1. Conversion to PDF using default options.

		String dataPath = "src/asposefeatures/workingwithpresentation/converttopdf/data/";
		
		//Instantiate a Presentation object that represents a PPT file
		Presentation pres = new Presentation(dataPath + "presentation.ppt");
		
		//Saving the presentation to PDF document
		pres.save(dataPath + "AsposeConvert_Out.pdf", SaveFormat.Pdf);
		
		//Display result of conversion.
		System.out.println("Conversion to PDF performed successfully with default options!");
        
        // 2. Conversion to PDF using custom options.

        //Instantiate the PdfOptions class
        com.aspose.slides.PdfOptions opts = new com.aspose.slides.PdfOptions();

        //Set JPEG Quality
        opts.setJpegQuality((byte)90);

        //Define behavior for meta files
        opts.setSaveMetafilesAsPng(true);

        //Set Text Compression level
        opts.setTextCompression(com.aspose.slides.PdfTextCompression.Flate);

        //Define the PDF standard
        opts.setCompliance(com.aspose.slides.PdfCompliance.Pdf15);

        //Save the presentation to PDF with specified options
        pres.save(dataPath + "AsposeConvert2_Out.pdf", SaveFormat.Pdf,opts);

        //Display result of conversion.
        System.out.println("Conversion to PDF performed successfully with custom options!");
	}
}