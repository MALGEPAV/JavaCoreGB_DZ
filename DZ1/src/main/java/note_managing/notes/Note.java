package note_managing.notes;

import java.util.Date;

public class Note {
    private final String content;
    private final Date creationDate;

    public Note(String content, Date creationDate){
        this.content = content;
        this.creationDate = creationDate;
    }
    @Override
    public String toString() {
        return creationDate +" -> "+content;
    }
}
