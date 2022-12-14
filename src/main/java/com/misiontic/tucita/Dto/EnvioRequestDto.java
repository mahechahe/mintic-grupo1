package com.misiontic.tucita.Dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Datos que seran solicitados al crear un envio.
 *
 * @author Yelan
 */
@Getter
@Setter
public class EnvioRequestDto {

    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String nombreEnvio;
    private String direccionEnvio;
    private double largo;
    private double ancho;
    private double altura;
    private double peso;
    private String nombreDestinatario;
    private String apellidoDestinatario;
    private String emailDestinatario;
    private String telefonoDestinatario;
}
