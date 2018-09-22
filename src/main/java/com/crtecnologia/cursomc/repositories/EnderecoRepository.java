package com.crtecnologia.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.crtecnologia.cursomc.domain.Endereco;

/*
 * Classe de repositorio, serve para mapear quais campos sera utilizado para gravar dados no banco.
 * 
 */

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{

}
