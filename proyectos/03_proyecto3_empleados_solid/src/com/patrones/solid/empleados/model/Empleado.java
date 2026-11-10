package com.patrones.solid.empleados.model;

public abstract class Empleado {
    protected String nombre;
    protected double salarioMensual;

    public Empleado(String nombre, double salarioMensual) {
        this.nombre = nombre;
        this.salarioMensual = salarioMensual;
    }

    public String getNombre() { return nombre; }
    public double getSalarioMensual() { return salarioMensual; }

    // OCP: Método abstracto que permite calcular salario anual 
    //según tipo de empleado
    public abstract double calcularSalarioAnual();
}

