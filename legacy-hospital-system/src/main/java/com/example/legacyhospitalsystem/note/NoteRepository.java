package com.example.legacyhospitalsystem.note;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    @Query(nativeQuery = true, value = """
            select n.id, n.comments, n.guid, n.modified_datetime, n.client_guid, n.datetime, n.logged_user, n.created_datetime
            from notes n
            join clients c on n.client_guid = c.guid
            where n.client_guid = :clientGuid
            and c.agency = :agency
            and n.modified_datetime between :dateFrom and :dateTo
            """)
    List<Note> findNotesByClientCredAndDatePeriod(String agency, LocalDateTime dateFrom, LocalDateTime dateTo, String clientGuid);
}
