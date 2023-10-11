package note_managing.note_creating;

import note_managing.notes.Note;

import java.util.Date;
import java.util.Scanner;

public class ConsoleNoteCreator implements NoteCreator{
    public static Note createNote(){
        Scanner consoleScanner = new Scanner(System.in);
        System.out.print("Make a note: ");
        String newContent = consoleScanner.nextLine();
        return new Note(newContent,new Date());
    }
}
