package com.patrones.composite.cliente;

import com.patrones.composite.impl.EmpleadoCompuesto;
import com.patrones.composite.impl.EmpleadoSimple;
import com.patrones.composite.interfaz.Empleado;

public class Main {
    public static void main(String[] args) {
        EmpleadoSimple dev1 = new EmpleadoSimple("Carlos", "Desarrollador");
        EmpleadoSimple dev2 = new EmpleadoSimple("Laura", "Desarrollador");
        EmpleadoSimple rrhh = new EmpleadoSimple("Marta", "Recursos Humanos");

        EmpleadoCompuesto jefeDesarrollo = new EmpleadoCompuesto("Elena", "Jefa de Desarrollo");
        jefeDesarrollo.agregarSubordinado(dev1);
        jefeDesarrollo.agregarSubordinado(dev2);

        EmpleadoCompuesto director = new EmpleadoCompuesto("Ana", "Directora General");
        director.agregarSubordinado(jefeDesarrollo);
        director.agregarSubordinado(rrhh);
        System.out.println("Detalles del director:-----------------");
        detalles(director);
        System.out.println("Detalles del jefe de desarrollo-----------");
        detalles(jefeDesarrollo);
    }
    
    static void detalles(Empleado empleado) {
    	empleado.mostrarDetalles();
    }
}
