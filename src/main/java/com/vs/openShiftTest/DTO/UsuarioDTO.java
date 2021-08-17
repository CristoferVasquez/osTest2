package com.vs.openShiftTest.DTO;

import java.io.Serializable;

import lombok.Data;

@Data
public class UsuarioDTO implements Serializable {
	
	private Integer id;
	private String nombre;
	private String apellido;
	private String email;
	private String rut;

}
