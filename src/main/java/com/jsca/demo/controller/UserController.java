package com.jsca.demo.controller;

import com.jsca.demo.persistence.dto.ClienteResponseDto;
import com.jsca.demo.persistence.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/api/cliente")
@AllArgsConstructor
public class UserController {

    private final ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<ClienteResponseDto> buscarClientes(@PathVariable String documento) throws Exception {
        return clienteService.obtenerCliente(documento);
    }
}
