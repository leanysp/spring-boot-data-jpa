package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

public interface IClienteService {
	/**
	 * para listar los clientes
	 * @return
	 */
	public List<Cliente> findAll();
	
	/**
	 * 
	 * @param pageable
	 * @return
	 */
	public Page<Cliente> findAll(Pageable pageable);
	
	/**
	 * metodo para guardar u nuevo cliente
	 */
	public void save(Cliente cliente);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Cliente findOne(Long id);
	
	/**
	 * 
	 * @param id
	 */
	public void delete(Long id);

}