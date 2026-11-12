package com.cursopatrones.strategy.estrategias;

import com.cursopatrones.strategy.interfaz.EstrategiaPago;

public class PagoPaypal implements EstrategiaPago {
    @Override
    public void pagar(double importe) {
        System.out.println("Autenticando usuario en PayPal...");
        System.out.println("Invocando API de PayPal...");
        System.out.println("Procesando pago de " + importe);
    }
}
