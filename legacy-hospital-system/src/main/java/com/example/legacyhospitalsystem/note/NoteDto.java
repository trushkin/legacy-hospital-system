package com.example.legacyhospitalsystem.note;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoteDto {
    private String comments;
    private String guid;
    private LocalDateTime modifiedDateTime;
    private String clientGuid;
    private LocalDateTime datetime;
    private String loggedUser;
    private LocalDateTime createdDateTime;

}
