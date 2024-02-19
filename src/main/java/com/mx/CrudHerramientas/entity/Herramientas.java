package com.mx.CrudHerramientas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HERRAMIENTAS")
public class Herramientas {

	@Id
	private int id;
	private String nombre;
	private Float precio;
	private String tipo;
	private int existencia;
	public Herramientas() {
	}
	public Herramientas(int id, String nombre, Float precio, String tipo, int existencia) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.tipo = tipo;
		this.existencia = existencia;
	}
	@Override
	public String toString() {
		return "Herramientas [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo
				+ ", existencia=" + existencia + "]\n";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getExistencia() {
		return existencia;
	}
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	
	
	
	
}
