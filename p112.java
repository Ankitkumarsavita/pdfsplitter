// Splitting a PDF in to many using Java
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.multipdf.Splitter;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;

public class p112 {
	public static void main(String[] args)
		throws IOException
	{

		// Loading PDF
		File pdffile
			= new File("C:/Users/ankit/OneDrive/Desktop/prollllll.pdf");
		PDDocument document = Loader.loadPDF(pdffile);

		// Splitter Class
		Splitter splitting = new Splitter();

		// Splitting the pages into multiple PDFs
		List<PDDocument> Page = splitting.split(document);

		// Using a iterator to Traverse all pages
		Iterator<PDDocument> iteration
			= Page.listIterator();

		// Saving each page as an individual document
		int j = 1;
		while (iteration.hasNext()) {
			PDDocument pd = iteration.next();
			pd.save("C:/Users/ankit/OneDrive/Desktop/s/abc"
					+ j++ + ".pdf");
		}
		System.out.println("Splitted Pdf Successfully.");
		document.close();
	}
}
