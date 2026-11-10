package com.patrones.solid.empleados.service;

import java.util.ArrayList;
import java.util.List;

import com.patrones.solid.empleados.model.Empleado;
import com.patrones.solid.empleados.reports.Informe;

public class EmpresaService {
    private List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void generarInforme(Informe informe) {
        informe.generar(empleados);
    }
}

