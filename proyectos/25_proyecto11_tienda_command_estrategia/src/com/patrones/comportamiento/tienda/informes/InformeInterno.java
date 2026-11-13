package com.patrones.comportamiento.tienda.informes;

import com.patrones.comportamiento.tienda.model.Pedido;

public class InformeInterno extends GeneradorInforme {

    @Override
    protected String obtenerDetalleEspecifico(Pedido pedido) {

        return "Producto: " + pedido.getProducto() + "\n"
             + "Estado pagado: " + pedido.isPagado() + "\n";
    }
}
