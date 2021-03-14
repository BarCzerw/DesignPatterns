package designpatterns.behavioral.memento.exercise;

public class EditorTextMemento {

    private String savedText;

    public EditorTextMemento(EditorText editorText) {
        savedText = editorText.getText();
    }

    public String getSavedText() {
        return savedText;
    }
}
