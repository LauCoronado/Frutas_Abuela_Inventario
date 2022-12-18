package com.unab.tienda.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Productos")
public class Productos {
	
	@Id
	private String id;
	
	@Field("nombre")
	private String nombre;
	
	@Field("estado")
	private Boolean estado;
	
	@DBRef
	private Categorias categoriaId;
	
	@DBRef
	private Marcas marcaId;
	
	@DBRef
	private UnidadesMedidas unidadMedidaId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Categorias getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Categorias categoriaId) {
		this.categoriaId = categoriaId;
	}

	public Marcas getMarcaId() {
		return marcaId;
	}

	public void setMarcaId(Marcas marcaId) {
		this.marcaId = marcaId;
	}

	public UnidadesMedidas getUnidadMedidaId() {
		return unidadMedidaId;
	}

	public void setUnidadMedidaId(UnidadesMedidas unidadMedidaId) {
		this.unidadMedidaId = unidadMedidaId;
	}	
}
