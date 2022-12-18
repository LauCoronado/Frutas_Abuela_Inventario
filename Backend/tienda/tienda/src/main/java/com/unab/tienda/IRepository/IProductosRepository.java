package com.unab.tienda.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unab.tienda.Collection.Productos;

public interface IProductosRepository extends MongoRepository<Productos, String>{

}
