package com.example.legacyhospitalsystem.note;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {

    private final NoteRepository noteRepository;
    private final NoteMapper noteMapper;

    public List<NoteDto> fetchNotesByClientAndDateInterval(NoteRequest noteRequest) {
        LocalDateTime dateFrom = LocalDateTime.of(noteRequest.getDateFrom().getYear(),
                noteRequest.getDateFrom().getMonth(), noteRequest.getDateFrom().getDayOfMonth(), 0, 0);
        LocalDateTime dateTo = LocalDateTime.of(noteRequest.getDateTo().getYear(),
                noteRequest.getDateTo().getMonth(), noteRequest.getDateTo().getDayOfMonth(), 23, 59, 59);
        List<NoteDto> noteDtoList = noteRepository.findNotesByClientCredAndDatePeriod(noteRequest.getAgency(),
                        dateFrom, dateTo, noteRequest.getClientGuid())
                .stream().map(noteMapper::toNoteDto).toList();
        return noteDtoList;
    }
}
