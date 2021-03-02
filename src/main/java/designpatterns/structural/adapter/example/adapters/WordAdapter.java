package designpatterns.structural.adapter.example.adapters;

import designpatterns.structural.adapter.example.interfaces.TextEditor;
import designpatterns.structural.adapter.example.editors.WordEditor;

public class WordAdapter implements TextEditor {

    private WordEditor wordEditor;

    public WordAdapter(WordEditor wordEditor) {
        this.wordEditor = wordEditor;
    }

    @Override
    public String getText() {
        return wordEditor.getText().replace("Text in .docx format - ","");
    }

}
