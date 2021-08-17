package com.vs.openShiftTest.Service.implementacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.vs.openShiftTest.DTO.UsuarioDTO;
import com.vs.openShiftTest.Entity.Usuario;
import com.vs.openShiftTest.Service.IUsuarioService;
import com.vs.openShiftTest.repository.UsuarioRepositorio;
import com.vs.openShiftTest.utils.MHelpers;


@Component
public class UsuarioImpl implements IUsuarioService{
	
	@Autowired
	private UsuarioRepositorio usuarioRepostirio;

	@Override
	public List<UsuarioDTO> findAll() {
		
		List<UsuarioDTO> dto = new ArrayList<>();
		Iterable<Usuario> usuarios = this.usuarioRepostirio.findAll();
		
		for(Usuario usuario : usuarios) {
			UsuarioDTO usuariosDTO = MHelpers.modelMapper().map(usuario, UsuarioDTO.class); 
		
			dto.add(usuariosDTO);
		}
		
		return dto;
	}

	@Override
	public Optional<UsuarioDTO> findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<UsuarioDTO> findByUserId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(UsuarioDTO usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAll(List<UsuarioDTO> usuarios) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int userId) {
		// TODO Auto-generated method stub
		
	}
	
	private UsuarioDTO convertirUsuarioDTO(final Usuario usuario) {
		return MHelpers.modelMapper().map(usuario, UsuarioDTO.class);
	}

}
