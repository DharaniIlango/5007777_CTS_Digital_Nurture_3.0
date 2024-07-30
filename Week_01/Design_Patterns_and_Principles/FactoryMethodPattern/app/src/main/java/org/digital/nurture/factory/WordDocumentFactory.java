// src/main/java/org/digital/nurture/factory/WordDocumentFactory.java
package org.digital.nurture.factory;

import org.digital.nurture.document.Document;
import org.digital.nurture.document.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}