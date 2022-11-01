package com.impro.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.impro.ecommerce.model.Orden;
import com.impro.ecommerce.model.Usuario;

public interface IOrdenService {
	List<Orden> findAll();
	Optional<Orden> findById(Integer id);
	Orden save (Orden orden);
	String generarNumeroOrden();
	List<Orden> findByUsuario (Usuario usuario);
}
