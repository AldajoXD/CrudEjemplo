package com.mx.CrudHerramientas.servicios;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudHerramientas.dao.HerramientasDao;
import com.mx.CrudHerramientas.entity.Herramientas;

@Service
public class HerramientaServImp implements HerramientasServ {
	@Autowired
	HerramientasDao dao;

	@Transactional
	@Override
	public boolean guardar(Herramientas herramienta) {
		// TODO Auto-generated method stub
		boolean respuesta = false;

		for (Herramientas h : dao.findAll()) {
			if (h.getId() == herramienta.getId() || h.getNombre().equals(herramienta.getNombre())) {
				respuesta = true;
				break;
			}
		}
		if (!respuesta) {
			dao.save(herramienta);
		}
		return respuesta;
	}

	@Transactional(readOnly = true)
	@Override
	public List<Herramientas> listar() {
		// TODO Auto-generated method stub
		return (List<Herramientas>) dao.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Herramientas buscar(Herramientas herramienta) {
		// TODO Auto-generated method stub
		return dao.findById(herramienta.getId()).orElse(null);
	}

	@Transactional
	@Override
	public void editar(Herramientas herramienta) {
		// TODO Auto-generated method stub
		dao.save(herramienta);
	}

	@Transactional
	@Override
	public void eliminar(Herramientas herramienta) {
		// TODO Auto-generated method stub
		dao.delete(herramienta);
	}

}
