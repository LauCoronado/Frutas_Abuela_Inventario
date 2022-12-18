package com.unab.tienda.IService;

import java.util.List;
import java.util.Optional;

import com.unab.tienda.Collection.Marcas;

public interface IMarcasService {

	public List<Marcas> all();
	
	public Optional<Marcas> findById(String id);
	
	public Marcas save(Marcas marcas);
	
	public void delete(String id);
}
