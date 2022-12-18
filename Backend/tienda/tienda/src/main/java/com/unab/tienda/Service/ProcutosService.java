package com.unab.tienda.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda.Collection.Productos;
import com.unab.tienda.IRepository.IProductosRepository;
import com.unab.tienda.IService.IProductosService;

@Service
public class ProcutosService implements IProductosService {

	@Autowired
	private IProductosRepository repository;
	
	@Override
	public List<Productos> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Productos> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Productos save(Productos productos) {
		return repository.save(productos);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);		
	}

}
