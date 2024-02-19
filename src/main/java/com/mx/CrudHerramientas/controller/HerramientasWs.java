package com.mx.CrudHerramientas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudHerramientas.entity.Herramientas;
import com.mx.CrudHerramientas.servicios.HerramientaServImp;

@RestController
@RequestMapping("HerramientasWs")
@CrossOrigin
public class HerramientasWs {
	@Autowired
	HerramientaServImp impHerramientaServImp;

	// http://localhost:9000/HerramientasWs/listar
	@GetMapping("mostrar")
	public List<Herramientas> listar() {
		return impHerramientaServImp.listar();
	}

	// http://localhost:9000/HerramientasWs/guardar
	@PostMapping("salvar")
	public ResponseEntity<String> guardar(@RequestBody Herramientas herramienta) {
		var respuesta = new ResponseEntity<String>("Se guardo la herramienta", HttpStatus.OK);
		if (impHerramientaServImp.guardar(herramienta) == true) {
			respuesta = new ResponseEntity<String>("No se guardo la herramienta, ya que ya existe el registro",
					HttpStatus.OK);
		}
		return respuesta;
	}

	// http://localhost:9000/HerramientasWs/buscar
	@PostMapping("buscar")
	public Herramientas buscar(@RequestBody Herramientas herramienta) {
		return impHerramientaServImp.buscar(herramienta);
	}

	// http://localhost:9000/HerramientasWs/editar
	@PostMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Herramientas herramienta) {
		var respuesta = new ResponseEntity<String>("Se edito correctamente", HttpStatus.OK);
		impHerramientaServImp.editar(herramienta);
		return respuesta;
	}

	// http://localhost:9000/HerramientasWs/eliminar
	@PostMapping("eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Herramientas herramienta) {
		var respuesta = new ResponseEntity<String>("Se elimino correctamente", HttpStatus.OK);
		impHerramientaServImp.eliminar(herramienta);
		return respuesta;
	}

}
