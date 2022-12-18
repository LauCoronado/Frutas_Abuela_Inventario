package com.unab.tienda.IService;

import java.util.List;
import java.util.Optional;

import com.unab.tienda.Collection.UnidadesMedidas;

public interface IUnidadesMedidasService {

	public List<UnidadesMedidas> all();
	
	public Optional<UnidadesMedidas> findById(String id);
	
	public UnidadesMedidas save(UnidadesMedidas unidadesMedidas);
	
	public void delete(String id);
}
