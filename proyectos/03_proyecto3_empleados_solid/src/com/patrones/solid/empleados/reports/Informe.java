package com.patrones.solid.empleados.reports;

import java.util.List;

import com.patrones.solid.empleados.model.Empleado;

public interface Informe {
    void generar(List<Empleado> empleados);
}

