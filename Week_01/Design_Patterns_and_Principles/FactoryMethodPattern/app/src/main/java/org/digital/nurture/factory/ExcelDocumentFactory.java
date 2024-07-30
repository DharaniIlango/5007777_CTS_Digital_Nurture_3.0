// src/main/java/org/digital/nurture/factory/ExcelDocumentFactory.java
package org.digital.nurture.factory;

import org.digital.nurture.document.Document;
import org.digital.nurture.document.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}