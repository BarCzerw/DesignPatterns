package designpatterns.structural.adapter.example.adapters;

import designpatterns.structural.adapter.example.editors.PdfEditor;
import designpatterns.structural.adapter.example.interfaces.TextEditor;

public class PdfAdapter implements TextEditor {

    private PdfEditor pdfEditor;

    public PdfAdapter(PdfEditor pdfEditor) {
        this.pdfEditor = pdfEditor;
    }

    @Override
    public String getText() {
        return pdfEditor.getText().replace("Text in .pdf format - ", "");
    }
}
