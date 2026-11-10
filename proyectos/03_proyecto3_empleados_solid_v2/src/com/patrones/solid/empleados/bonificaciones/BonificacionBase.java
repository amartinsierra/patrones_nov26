package com.patrones.solid.empleados.bonificaciones;

public class BonificacionBase implements Bonificacion {

	@Override
	public double aplicarBonificacion(double salario) {
		return salario + 1000;
	}

}
