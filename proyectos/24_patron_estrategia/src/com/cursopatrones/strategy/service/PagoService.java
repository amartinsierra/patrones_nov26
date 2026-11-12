package com.cursopatrones.strategy.service;

import com.cursopatrones.strategy.interfaz.EstrategiaPago;

public class PagoService {

    private EstrategiaPago estrategia;

    public PagoService(EstrategiaPago estrategia) {
        this.estrategia = estrategia;
    }

    public void realizarPago(double importe) {
        estrategia.pagar(importe);
    }

    public void setEstrategia(EstrategiaPago estrategia) {
        this.estrategia = estrategia;
    }
}
