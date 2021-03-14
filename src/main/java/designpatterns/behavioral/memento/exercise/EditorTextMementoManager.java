package designpatterns.behavioral.memento.exercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorTextMementoManager {

    private Deque<EditorTextMemento> editorTextMementos = new ArrayDeque<>();

    public void save(EditorText editorText) {
        editorTextMementos.push(new EditorTextMemento(editorText));
    }

    public EditorTextMemento restore() {
        return editorTextMementos.pop();
    }


}
