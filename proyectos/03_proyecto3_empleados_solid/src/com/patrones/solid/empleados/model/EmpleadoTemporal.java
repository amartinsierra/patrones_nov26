package com.patrones.solid.empleados.model;

public class EmpleadoTemporal extends Empleado {
    public EmpleadoTemporal(String nombre, double salarioMensual) {
        super(nombre, salarioMensual);
    }
    @Override
    public double calcularSalarioAnual() {
        return salarioMensual * 12; // sin bonus
    }
}

