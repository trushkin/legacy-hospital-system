package com.example.legacyhospitalsystem.client;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    private static final Logger logger = LoggerFactory.getLogger(ClientService.class);
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    public List<ClientDto> fetchAllClients() {
        try {
            List<ClientDto> clientDtoList = clientRepository.findAll().stream().map(clientMapper::toClientDto).toList();
            return clientDtoList;
        } catch (DataAccessException e) {
            logger.error("DataAccessException occurred while fetching clients", e);
        } catch (RuntimeException e) {
            logger.error("Unexpected error occurred while fetching clients", e);
        }
        return Collections.emptyList();

}}

