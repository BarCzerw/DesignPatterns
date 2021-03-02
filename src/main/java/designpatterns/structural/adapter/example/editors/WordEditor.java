package designpatterns.structural.adapter.example.editors;

public class WordEditor {

    private String text;

    public WordEditor(String text) {
        this.text = text;
    }

    public String getText() {
        return "Text in .docx format - " + text;
    }
}
