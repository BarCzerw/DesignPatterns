package designpatterns.structural.adapter.example.adapters;

import designpatterns.structural.adapter.example.editors.ExcelEditor;
import designpatterns.structural.adapter.example.interfaces.TextEditor;

public class ExcelAdapter implements TextEditor {

    private ExcelEditor excelEditor;

    public ExcelAdapter(ExcelEditor excelEditor) {
        this.excelEditor = excelEditor;
    }

    @Override
    public String getText() {
        return excelEditor.getText().replace("Text in .xlsx format - ","");
    }
}
