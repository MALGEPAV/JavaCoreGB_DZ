package note_managing.note_adding;

import note_managing.notes.Note;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TextFileNoteAppender implements NoteAppender{
    public static void appendNote(Note note) {
        try (FileWriter fw = new FileWriter("notes.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(note.toString());
            bw.newLine();
            System.out.println("A new Note appended to the text file: ");
            System.out.println(note);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
