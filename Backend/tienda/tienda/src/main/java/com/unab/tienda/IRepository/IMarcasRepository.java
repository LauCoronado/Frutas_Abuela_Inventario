package com.unab.tienda.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.tienda.Collection.Marcas;

public interface IMarcasRepository extends MongoRepository<Marcas, String>{

}
