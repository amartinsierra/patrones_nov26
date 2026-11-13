package com.cursopatrones.strategy.demo;

import com.cursopatrones.strategy.estrategias.PagoPaypal;
import com.cursopatrones.strategy.estrategias.PagoTarjeta;
import com.cursopatrones.strategy.service.PagoService;

public class Main {

    public static void main(String[] args) {

        PagoService servicio =
            new PagoService(new PagoTarjeta());

        servicio.realizarPago(100);

        servicio.setEstrategia(new PagoPaypal());

        servicio.realizarPago(200);

        
    }
}