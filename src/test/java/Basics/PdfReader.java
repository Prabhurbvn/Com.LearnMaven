package Basics;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class PdfReader {
	
	@Test
	public void Reader() throws IOException
	{
		URL url=new URL("http://www.axmag.com/download/pdfurl-guide.pdf");
		
		InputStream fis=url.openStream();
		
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		PDDocument doc=PDDocument.load(bis);
		
		PDFTextStripper text=new PDFTextStripper();
		
		String str=text.getText(doc);
		
		System.out.println(str);
	}

}
