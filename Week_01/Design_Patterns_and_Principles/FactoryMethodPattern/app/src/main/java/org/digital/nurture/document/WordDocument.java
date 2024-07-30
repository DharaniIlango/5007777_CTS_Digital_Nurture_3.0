// src/main/java/org/digital/nurture/document/PdfDocument.java
package org.digital.nurture.document;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document");
    }
}