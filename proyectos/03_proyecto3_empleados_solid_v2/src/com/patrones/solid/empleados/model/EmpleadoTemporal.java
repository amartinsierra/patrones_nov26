package com.patrones.solid.empleados.model;

import com.patrones.solid.empleados.bonificaciones.Bonificacion;

public class EmpleadoTemporal extends Empleado {
    
    public EmpleadoTemporal(String nombre, double salarioMensual, Bonificacion bonificacion) {
		super(nombre, salarioMensual, bonificacion);
	}

	@Override
    public double calcularSalarioAnual() {
		return bonificacion.aplicarBonificacion(salarioMensual) * 12 -1000 ;
    }
}

