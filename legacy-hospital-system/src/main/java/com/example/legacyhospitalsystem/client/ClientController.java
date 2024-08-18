package com.example.legacyhospitalsystem.client;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @PostMapping("/clients")
    public List<ClientDto> getAllClients() {
        return clientService.fetchAllClients();
    }

}
