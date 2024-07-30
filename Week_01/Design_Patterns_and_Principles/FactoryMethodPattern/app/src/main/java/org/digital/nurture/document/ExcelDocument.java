// src/main/java/org/digital/nurture/document/ExcelDocument.java
package org.digital.nurture.document;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document");
    }
}