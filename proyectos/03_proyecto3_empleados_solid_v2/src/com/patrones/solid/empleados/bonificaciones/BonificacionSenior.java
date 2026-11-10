package com.patrones.solid.empleados.bonificaciones;

public class BonificacionSenior implements Bonificacion {

	@Override
	public double aplicarBonificacion(double salario) {
		return salario*1.8;
	}

}
