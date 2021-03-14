package designpatterns.behavioral.memento.exercise;

public class EditorMain {

    public static void main(String[] args) {

        EditorTextMementoManager manager = new EditorTextMementoManager();

        EditorText editor = new EditorText();

        manager.save(editor);

        editor.addText("text 1");

        manager.save(editor);

        editor.addText(" appended");

        manager.save(editor);

        editor.addText(". end.");

        System.out.println(editor);
        editor.restoreFromMemento(manager.restore());
        System.out.println(editor);
        editor.restoreFromMemento(manager.restore());
        System.out.println(editor);
        editor.restoreFromMemento(manager.restore());
        System.out.println(editor);


    }

}
