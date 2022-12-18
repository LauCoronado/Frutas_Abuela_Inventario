package com.unab.tienda.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda.Collection.Categorias;
import com.unab.tienda.IRepository.ICategoriasRepository;
import com.unab.tienda.IService.ICategoriasService;

@Service
public class CategoriasService implements ICategoriasService {

	@Autowired
	private ICategoriasRepository repository;
	
	@Override
	public List<Categorias> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Categorias> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Categorias save(Categorias categorias) {
		return repository.save(categorias);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);		
	}

}
