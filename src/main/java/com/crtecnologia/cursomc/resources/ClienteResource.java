package com.crtecnologia.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crtecnologia.cursomc.domain.Cliente;
import com.crtecnologia.cursomc.services.ClienteService;

/*
 * Classe de resource, de acesso, busca o dado tratado e passa como se fosse um GET, a nivel navegador.
 * WebService.
 * 
 */

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);

	}

}
