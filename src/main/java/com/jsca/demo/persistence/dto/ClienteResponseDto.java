package com.jsca.demo.persistence.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class ClienteResponseDto {
    private String nombreCliente;
    private String apellidoCliente;
    private Integer edad;
    private String email;
    private String documentoIdentidad;
}
