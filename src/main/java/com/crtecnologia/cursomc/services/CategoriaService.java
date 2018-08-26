package com.crtecnologia.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crtecnologia.cursomc.domain.Categoria;
import com.crtecnologia.cursomc.repositories.CategoriaRepository;
import com.crtecnologia.cursomc.services.exceptions.ObjectNotFoundException;

/*
 * Classe de servico, faz tratamento dos dados sempre utilizando o repositorio para consultar/ alterar/ gravar no banco, 
 * faz o meio de campo, entre o repositorio e resourses.
 * 
 */

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
	}
	
}
