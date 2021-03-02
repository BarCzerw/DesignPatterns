package designpatterns.structural.adapter.example.editors;

public class PdfEditor {

    private String text;

    public PdfEditor(String text) {
        this.text = text;
    }

    public String getText() {
        return "Text in .pdf format - " + text;
    }
}
