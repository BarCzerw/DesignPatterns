package designpatterns.structural.adapter.example.editors;

import designpatterns.structural.adapter.example.interfaces.TextEditor;

public class ExcelEditor implements TextEditor {

    private String text;

    public ExcelEditor(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return "Text in .xlsx format - " + text;
    }
}
