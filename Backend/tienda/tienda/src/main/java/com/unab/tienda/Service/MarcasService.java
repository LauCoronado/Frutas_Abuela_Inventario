package com.unab.tienda.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda.Collection.Marcas;
import com.unab.tienda.IRepository.IMarcasRepository;
import com.unab.tienda.IService.IMarcasService;

@Service
public class MarcasService implements IMarcasService {

	@Autowired
	private IMarcasRepository repository;
	
	@Override
	public List<Marcas> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Marcas> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Marcas save(Marcas marcas) {
		return repository.save(marcas);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);		
	}

}
