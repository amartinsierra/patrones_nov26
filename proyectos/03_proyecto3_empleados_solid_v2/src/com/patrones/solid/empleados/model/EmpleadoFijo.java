package com.patrones.solid.empleados.model;

import com.patrones.solid.empleados.bonificaciones.Bonificacion;

public class EmpleadoFijo extends Empleado {
    
    public EmpleadoFijo(String nombre, double salarioMensual, Bonificacion bonificacion) {
		super(nombre, salarioMensual, bonificacion);
	}

	@Override
    public double calcularSalarioAnual() {
        return bonificacion.aplicarBonificacion(salarioMensual) * 12 ; // bonus fijo
    }
}

