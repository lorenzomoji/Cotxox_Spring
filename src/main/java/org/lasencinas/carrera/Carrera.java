package org.lasencinas.carrera;

import org.lasencinas.conductor.Conductor;
import org.lasencinas.tarifas.Tarifas;
import org.lasencincas.poolconductores.PoolConductores;

public class Carrera {

	private int tiempoEsperado = 0;
	private double tiempoCarrera = 0;
	private double costeTotal = 0;
	private String origen = null;
	private String destino = null;
	private double distancia = 0;
	private String tarjetaCredito = null;
	private Conductor conductor = null;
	private double propina = 0;
	
	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	public String getOrigen() {
		return this.origen;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public String getDestino() {
		return this.destino;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public double getDistancia() {
		return this.distancia;
	}
	
	public void setTiempoEsperado(int tiempoEsperado) {
		this.tiempoEsperado = tiempoEsperado;
	}
	
	public int getTiempoEsperado() {
		return 10;
	}
	
	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	
	public String getTarjetaCredito() {
		return this.tarjetaCredito;
	}
	
	public double getCosteEsperado() {
		return Tarifas.getCosteTotalEsperado(this);
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	
	public Conductor getConductor() {
		return this.conductor;
	}

	public void asignarConductor(PoolConductores conductores) {
		setConductor(conductores.asignarConductor());
	}
	
	public void realizarPago(double pago) {
		this.costeTotal = pago;
	}
	
	public void recibirPropina(double propina) {
		this.propina = propina;
	}

	public double getPropina() {
		return this.propina;
	}
	
	public void liberarConductor() {
		getConductor().setOcupado(false);
	}
	
	public double getCosteTotal() {
		return this.costeTotal;
	}
	
	
	
	
}
