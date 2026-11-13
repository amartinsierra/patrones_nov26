package com.patrones.comportamiento.tienda.informes;

import com.patrones.comportamiento.tienda.model.Pedido;

public class InformeCliente extends GeneradorInforme {

    @Override
    protected String obtenerDetalleEspecifico(Pedido pedido) {

        return "Producto: " + pedido.getProducto() + "\n"
             + "Precio: " + pedido.getPrecio() + " €\n";
    }
}
