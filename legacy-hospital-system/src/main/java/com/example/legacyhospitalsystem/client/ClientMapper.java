package com.example.legacyhospitalsystem.client;

import org.springframework.stereotype.Component;

@Component
public class ClientMapper {
    public ClientDto toClientDto(Client client) {
        return ClientDto.builder()
                .agency(client.getAgency())
                .guid(client.getGuid())
                .firstName(client.getFirstName())
                .lastName(client.getLastName())
                .status(client.getStatus())
                .dob(client.getDob())
                .createdDateTime(client.getCreatedDateTime())
                .build();
    }
}
