package com.vs.openShiftTest.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="usuario") 
/*@NamedQueries({
	@NamedQuery(name = "Usuario.findAll",query="select c from usuario c")
})*/

public class Usuario implements Serializable {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String rut;
	@Column
	private String email;
	
	/*@JsonIgnore
	@OneToMany (mappedBy="usuario")
	private Set<Archivo> archivos = new HashSet<>();
	*/
	

	public Usuario() {
	
	}

	public Integer getCod() {
		return id;
	}

	public void setCod(Integer cod) {
		this.id = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



/*
	public Set<Archivo> getArchivos() {
		return archivos;
	}

	public void setArchivos(Set<Archivo> archivos) {
		this.archivos = archivos;
	}
	*/
	
	}