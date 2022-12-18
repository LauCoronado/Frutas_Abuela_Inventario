package com.unab.tienda.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.tienda.Collection.UnidadesMedidas;
import com.unab.tienda.IRepository.IUnidadesMedidasRepository;
import com.unab.tienda.IService.IUnidadesMedidasService;

@Service
public class UnidadesMedidasService implements IUnidadesMedidasService {

	@Autowired
	private IUnidadesMedidasRepository repository;
	
	@Override
	public List<UnidadesMedidas> all() {
		return repository.findAll();
	}

	@Override
	public Optional<UnidadesMedidas> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public UnidadesMedidas save(UnidadesMedidas unidadesMedidas) {
		return repository.save(unidadesMedidas);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);		
	}

}
