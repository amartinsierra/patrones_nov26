package com.patrones.solid.empleados.reports;

import java.util.List;

import com.patrones.solid.empleados.model.Empleado;

public class InformeConsola implements Informe {
    @Override
    public void generar(List<Empleado> empleados) {
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " - " + e.calcularSalarioAnual());
        }
    }
}

