package com.example.legacyhospitalsystem.note;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NoteController {
    private final NoteService noteService;
    @PostMapping("/notes")
    public List<NoteDto> getNotesByClientCredAndDatePeriod(@Valid @RequestBody NoteRequest noteRequest){
        return noteService.fetchNotesByClientAndDateInterval(noteRequest);
    }
}
