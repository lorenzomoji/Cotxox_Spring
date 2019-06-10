package org.lasencinas.tarifas;

import org.lasencinas.carrera.Carrera;

public class Tarifas {

	private static final double COSTE_MILLA = 1.35;
	private static final double COSTE_MINUTO = 0.35;
	private static final double COSTE_MINIMO = 5.00;
	private static final double COSTE_COMISION = 0.20;
	
	public static double getCosteDistancia(double distancia) {
		return distancia * COSTE_MILLA;
	}
	
	public static double getCosteTiempo(double tiempoEsperado) {
		return tiempoEsperado * COSTE_MINUTO;
	}
	
	public static double getCosteTotalEsperado(Carrera carrera) {
		double total =  getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
		if (total > COSTE_MINIMO) {
			return total;
		}
		else {
			return COSTE_MINIMO;
		}
	}
	
}
