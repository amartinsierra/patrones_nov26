package com.patrones.solid.empleados.cliente;

import com.patrones.solid.empleados.bonificaciones.BonificacionBase;
import com.patrones.solid.empleados.bonificaciones.BonificacionSenior;
import com.patrones.solid.empleados.model.EmpleadoFijo;
import com.patrones.solid.empleados.model.EmpleadoTemporal;
import com.patrones.solid.empleados.reports.InformeCSV;
import com.patrones.solid.empleados.reports.InformeConsola;
import com.patrones.solid.empleados.service.EmpresaService;

public class Demo {
	public static void main(String[] args) {
        var empresa = new EmpresaService();
        //diferntes bonificaciones a cada empleado
        empresa.agregarEmpleado(new EmpleadoFijo("Ana", 2000,new BonificacionBase()));
        
        empresa.agregarEmpleado(new EmpleadoTemporal("Luis", 1500, new BonificacionSenior()));

        // OCP: podemos usar diferentes tipos de informes
        // sin modificar Empresa
        empresa.generarInforme(new InformeConsola());
        empresa.generarInforme(new InformeCSV());
    }

}
