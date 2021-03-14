package designpatterns.behavioral.memento.exercise;

public class EditorText {

    private String text;

    public EditorText() {
        text="";
    }

    public String getText() {
        return text;
    }

    public void addText(String text) {
        this.text += text;
    }

    public void restoreFromMemento(EditorTextMemento editorTextMemento) {
        this.text = editorTextMemento.getSavedText();
    }

    @Override
    public String toString() {
        return "EditorText{" +
                "text='" + text + '\'' +
                '}';
    }
}
