package com.mx.CrudHerramientas.servicios;

import java.util.List;

import com.mx.CrudHerramientas.entity.Herramientas;

//AQUI MODIFIQUE YO
public interface HerramientasServ {
	public boolean guardar(Herramientas herramienta);

	public List<Herramientas> listar();

	public Herramientas buscar(Herramientas herramienta);

	public void editar(Herramientas herramienta);

	public void eliminar(Herramientas herramienta);
}
