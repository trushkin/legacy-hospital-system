package com.example.legacyhospitalsystem.model;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDto {
    private String agency;
    private String guid;
    private String firstName;
    private String lastName;
    private String status;
    private LocalDate dob;
    private LocalDateTime createdDateTime;
}
