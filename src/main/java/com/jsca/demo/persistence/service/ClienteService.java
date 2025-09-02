package com.jsca.demo.persistence.service;

import com.jsca.demo.persistence.dto.ClienteResponseDto;
import org.springframework.http.ResponseEntity;

public interface ClienteService {

    ResponseEntity<ClienteResponseDto> obtenerCliente(String documento) throws Exception;
}
