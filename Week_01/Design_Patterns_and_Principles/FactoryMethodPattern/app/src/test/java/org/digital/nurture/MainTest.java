// src/test/java/org/digital/nurture/MainTest.java
package org.digital.nurture;

import org.digital.nurture.document.Document;
import org.digital.nurture.factory.DocumentFactory;
import org.digital.nurture.factory.WordDocumentFactory;
import org.digital.nurture.factory.PdfDocumentFactory;
import org.digital.nurture.factory.ExcelDocumentFactory;

public class MainTest {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
