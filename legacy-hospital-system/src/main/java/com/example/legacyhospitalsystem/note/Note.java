package com.example.legacyhospitalsystem.note;

import com.example.legacyhospitalsystem.client.Client;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String comments;
    private String guid;
    @Column(name = "modified_datetime")
    private LocalDateTime modifiedDateTime;
    private LocalDateTime datetime;
    @Column(name = "logged_user")
    private String loggedUser;
    @Column(name = "created_datetime")
    private LocalDateTime createdDateTime;
    @ManyToOne
    @JoinColumn(name = "client_guid", referencedColumnName = "guid")
    private Client client;
}
