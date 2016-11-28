package jozinko.pdf;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 */
public class PdfParser {


  public String parseText(final File file) throws IOException {
    PDDocument doc = PDDocument.load(file);
    return new PDFTextStripper().getText(doc);
  }

}
