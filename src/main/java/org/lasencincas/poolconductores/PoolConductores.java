package org.lasencincas.poolconductores;

import java.util.ArrayList;

import org.lasencinas.conductor.Conductor;

public class PoolConductores {

	private ArrayList<Conductor> poolConductores = new ArrayList<>();
	
	public PoolConductores(ArrayList<Conductor> conductor) {
		this.poolConductores = poolConductores;
	}
	
	public ArrayList<Conductor> getPoolConductores() {
		return this.poolConductores;
	}

	public Conductor asignarConductor() {
		Conductor conductor = new Conductor();
		for (int i = 0; i <= poolConductores.size(); i++) {
			if (!conductor.isOcupado()) {
				conductor.setOcupado(true);
			}
		}
		return conductor;
	}
	

}
