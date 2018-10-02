package com.crtecnologia.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crtecnologia.cursomc.domain.Cliente;
import com.crtecnologia.cursomc.repositories.ClienteRepository;
import com.crtecnologia.cursomc.services.exceptions.ObjectNotFoundException;

/*
 * Classe de servico, faz tratamento dos dados sempre utilizando o repositorio para consultar/ alterar/ gravar no banco, 
 * faz o meio de campo, entre o repositorio e resourses.
 * 
 */

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		
		Optional<Cliente> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
		
	}
	
}
