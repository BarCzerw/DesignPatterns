package designpatterns.structural.adapter.example;

import designpatterns.structural.adapter.example.adapters.ExcelAdapter;
import designpatterns.structural.adapter.example.adapters.PdfAdapter;
import designpatterns.structural.adapter.example.adapters.WordAdapter;
import designpatterns.structural.adapter.example.editors.ExcelEditor;
import designpatterns.structural.adapter.example.editors.PdfEditor;
import designpatterns.structural.adapter.example.editors.WordEditor;
import designpatterns.structural.adapter.example.interfaces.TextEditor;

import java.util.ArrayList;
import java.util.List;

public class AdaptersMain {

    private static List<TextEditor> editorList = new ArrayList<>();

    public static void main(String[] args) {
        editorList.add(new WordAdapter(new WordEditor("First random text in word")));
        editorList.add(new PdfAdapter(new PdfEditor("Second random text in pdf")));
        editorList.add(new ExcelAdapter(new ExcelEditor("Third random text in xlsx")));

        printTextFromEditors();
    }

    private static void printTextFromEditors() {
        for (TextEditor textEditor : editorList) {
            System.out.println(textEditor.getText());
        }
    }

}
