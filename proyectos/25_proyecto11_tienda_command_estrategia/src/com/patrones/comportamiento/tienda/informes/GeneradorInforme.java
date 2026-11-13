package com.patrones.comportamiento.tienda.informes;

import com.patrones.comportamiento.tienda.model.Pedido;

public abstract class GeneradorInforme {

    // Template Method
    public final String generar(Pedido pedido) {

        StringBuilder informe = new StringBuilder();

        informe.append(obtenerCabecera());

        informe.append(obtenerDatosPedido(pedido));

        informe.append(obtenerDetalleEspecifico(pedido));

        informe.append(obtenerPie());

        return informe.toString();
    }

    protected String obtenerCabecera() {
        return "===== INFORME DE PEDIDO =====\n";
    }

    protected String obtenerDatosPedido(Pedido pedido) {
        return "Producto: " + pedido.getProducto() + "\n";
    }

    // Cada tipo de informe implementará este paso
    protected abstract String obtenerDetalleEspecifico(Pedido pedido);

    protected String obtenerPie() {
        return "=============================\n";
    }
}

