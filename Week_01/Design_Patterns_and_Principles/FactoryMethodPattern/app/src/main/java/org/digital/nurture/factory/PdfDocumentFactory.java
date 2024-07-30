// src/main/java/org/digital/nurture/factory/PdfDocumentFactory.java
package org.digital.nurture.factory;

import org.digital.nurture.document.Document;
import org.digital.nurture.document.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}