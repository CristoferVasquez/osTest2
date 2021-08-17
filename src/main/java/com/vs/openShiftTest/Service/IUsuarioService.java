package com.vs.openShiftTest.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.vs.openShiftTest.DTO.UsuarioDTO;

@Service
public interface IUsuarioService {
	
	List<UsuarioDTO> findAll();
	Optional<UsuarioDTO> findByUsername(String username);
	Optional<UsuarioDTO> findByUserId(Integer id);
	void save(UsuarioDTO usuario);
	void saveAll(List<UsuarioDTO> usuarios);
	void deleteById(int userId);
	
		
	
}
