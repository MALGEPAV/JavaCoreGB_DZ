package run;

import note_managing.note_adding.TextFileNoteAppender;
import note_managing.note_creating.ConsoleNoteCreator;
import note_managing.notes.Note;

public class Program {
    public static void main(String[] args) {
        Note newNote1 = ConsoleNoteCreator.createNote();
        Note newNote2 = ConsoleNoteCreator.createNote();
        TextFileNoteAppender.appendNote(newNote1);
        TextFileNoteAppender.appendNote(newNote2);
    }
}
    