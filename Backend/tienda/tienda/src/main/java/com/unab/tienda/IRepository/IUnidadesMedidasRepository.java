package com.unab.tienda.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.tienda.Collection.UnidadesMedidas;

public interface IUnidadesMedidasRepository extends MongoRepository<UnidadesMedidas, String>{

}
