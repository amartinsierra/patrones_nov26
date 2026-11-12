package com.patrones.proyecto.buena.adapter;

import com.patrones.proyecto.buena.canales.CanalNotificacion;
import com.patrones.proyecto.buena.proveedor.ProveedorExternoMailChimp;

public class CanalEmailAdapter implements CanalNotificacion {
    private ProveedorExternoMailChimp mailchimp = new ProveedorExternoMailChimp();

    @Override
    public void enviar(String mensaje) {
    	
        mailchimp.sendMail(mensaje);
        mailchimp.registrarContenido(mensaje);
    }
}
