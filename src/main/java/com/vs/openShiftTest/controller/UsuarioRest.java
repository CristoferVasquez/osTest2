package com.vs.openShiftTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.openShiftTest.Entity.Usuario;
import com.vs.openShiftTest.Service.IUsuarioService;
import com.vs.openShiftTest.Service.UsuarioService;

@RestController
@RequestMapping("/v3/usuarios")
public class UsuarioRest {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private IUsuarioService iusuarioService;

	// respuesta basado en codigo 200-500-404 etc.
	// validar con descripciones

	@PostMapping("/usuario")
	Usuario create(@RequestBody Usuario user) {

		return (usuarioService.agregarUsuario(user));

	}

	@GetMapping(value = "/usuarios", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> mostrar() {

	
		return ResponseEntity.ok(this.usuarioService.mostrarUsuarios());
	}

	@GetMapping("/usuarios/{id}")
	String buscar(@PathVariable Integer id) {

		Usuario user = usuarioService.buscarUsuario(id);

		return user.getNombre();
	}

	/*
	 * @GetMapping("/rut/{userId}") String subirArchivo( @PathVariable Integer
	 * userId) { Usuario user = usuarioDAO.findById(userId).get();
	 * 
	 * 
	 * String token = user.getRut(); /*
	 * 
	 * 
	 * 
	 * return token; }
	 */

}