package com.patrones.solid.empleados.model;

import com.patrones.solid.empleados.bonificaciones.Bonificacion;

public abstract class Empleado {
    protected String nombre;
    protected double salarioMensual;
    protected Bonificacion bonificacion;
    

    public Empleado(String nombre, double salarioMensual, Bonificacion bonificacion) {
		super();
		this.nombre = nombre;
		this.salarioMensual = salarioMensual;
		this.bonificacion = bonificacion;
	}
	public String getNombre() { return nombre; }
    public double getSalarioMensual() { return salarioMensual; }

    // OCP: Método abstracto que permite calcular salario anual 
    //según tipo de empleado
    public abstract double calcularSalarioAnual();
}

