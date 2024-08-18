package com.example.legacyhospitalsystem.note;

import org.springframework.stereotype.Component;

@Component
public class NoteMapper {
    public NoteDto toNoteDto(Note note){
        return NoteDto.builder()
                .comments(note.getComments())
                .guid(note.getGuid())
                .modifiedDateTime(note.getModifiedDateTime())
                .clientGuid(note.getClient().getGuid())
                .datetime(note.getDatetime())
                .loggedUser(note.getLoggedUser())
                .createdDateTime(note.getCreatedDateTime())
                .build();
    }
}
