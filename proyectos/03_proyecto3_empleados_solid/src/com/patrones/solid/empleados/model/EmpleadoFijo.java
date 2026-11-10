package com.patrones.solid.empleados.model;

public class EmpleadoFijo extends Empleado {
    public EmpleadoFijo(String nombre, double salarioMensual) {
        super(nombre, salarioMensual);
    }
    @Override
    public double calcularSalarioAnual() {
        return salarioMensual * 12 + 1000; // bonus fijo
    }
}

