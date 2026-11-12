package com.cursopatrones.strategy.estrategias;

import com.cursopatrones.strategy.interfaz.EstrategiaPago;

public class PagoTarjeta implements EstrategiaPago {
    @Override
    public void pagar(double importe) {
        System.out.println("Validando tarjeta...");
        System.out.println("Contactando con pasarela bancaria...");
        System.out.println("Autorizando pago de " + importe);
    }
}
