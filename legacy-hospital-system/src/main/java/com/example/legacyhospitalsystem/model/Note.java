package com.example.legacyhospitalsystem.model;

import com.example.legacyhospitalsystem.model.Client;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "notes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Comments;
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
