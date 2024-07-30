// src/main/java/org/digital/nurture/document/PdfDocument.java
package org.digital.nurture.document;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document");
    }
}