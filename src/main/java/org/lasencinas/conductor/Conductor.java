package org.lasencinas.conductor;

import java.util.ArrayList;

public class Conductor {

	private String nombre = null;
	private String modelo = null;
	private String matricula = null;
	private double valoracionMedia = 0;
	private boolean ocupado = false;
	private ArrayList<Byte> valoraciones = new ArrayList<>();
	
	public Conductor() {
		
	}
	
	public Conductor(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isOcupado() {
		return ocupado;
	}
	
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	private double calcularValoracionMedia() {
		int sumaValoraciones = 0;
		for (byte valoracion : this.valoraciones) {
			sumaValoraciones += valoracion;
		}
		this.valoracionMedia = (double) sumaValoraciones / this.valoraciones.size();
		return this.valoracionMedia;
	}
	
	public void setValoracion(byte valoracion) {
		this.valoraciones.add(valoracion);
		this.calcularValoracionMedia();
	}
	
	public double getValoracion() {
		return this.valoracionMedia;
	}
	
	
	
}
