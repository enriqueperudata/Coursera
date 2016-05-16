package com.example.tareamascota;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Mascota implements Serializable{
	
	private String nombre;
	private int puntaje;
	private int foto;

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public int getFoto() {
		return foto;
	}

	public void setFoto(int foto) {
		this.foto = foto;
	}

	public Mascota(String nombre, int puntaje, int foto) {
		super();
		this.nombre = nombre;
		this.puntaje = puntaje;
		this.foto = foto;
	}



}
