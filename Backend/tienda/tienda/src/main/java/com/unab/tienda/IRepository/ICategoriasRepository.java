package com.unab.tienda.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.tienda.Collection.Categorias;

public interface ICategoriasRepository extends MongoRepository<Categorias, String>{

}
