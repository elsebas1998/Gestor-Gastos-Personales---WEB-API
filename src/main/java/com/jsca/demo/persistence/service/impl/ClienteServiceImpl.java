package com.jsca.demo.persistence.service.impl;

import com.jsca.demo.persistence.dto.ClienteResponseDto;
import com.jsca.demo.persistence.entity.ClienteEntity;
import com.jsca.demo.persistence.repository.ClienteRepository;
import com.jsca.demo.persistence.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    @Override
    public ResponseEntity<ClienteResponseDto> obtenerCliente(final String documento) throws Exception {
        return clienteRepository.findByDocumento(documento)
                .map(entity -> ResponseEntity.ok(
                        new ClienteResponseDto(
                                entity.getNombre(),
                                entity.getApellido(),
                                entity.getEdad(),
                                entity.getEmail(),
                                entity.getDocumento()
                        )
                ))
                .orElseThrow(() -> new Exception("Fallo la búsqueda de cliente"));
    }
}
