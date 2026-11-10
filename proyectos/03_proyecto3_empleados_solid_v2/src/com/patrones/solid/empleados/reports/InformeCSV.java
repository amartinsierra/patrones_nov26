package com.patrones.solid.empleados.reports;

import java.util.List;

import com.patrones.solid.empleados.model.Empleado;

public class InformeCSV implements Informe {
    @Override
    public void generar(List<Empleado> empleados) {
        System.out.println("nombre,salarioAnual");
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + "," + e.calcularSalarioAnual());
        }
    }
}
