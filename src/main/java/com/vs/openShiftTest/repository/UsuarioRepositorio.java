package com.vs.openShiftTest.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vs.openShiftTest.Entity.Usuario;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {
	
	@Transactional (readOnly = true)
	Optional<Usuario> findByRut(String rut);
	
	
}
