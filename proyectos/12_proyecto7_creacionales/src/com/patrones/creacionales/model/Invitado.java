package com.patrones.creacionales.model;

import com.patrones.creacionales.singleton.EnvioUsuarioSingleton;

public class Invitado extends Usuario {
	private Invitado() {
       
    }

    @Override
    public String getTipoUsuario() {
        return "Invitado";
    }

  
    @Override
    public  void enviarUsuario() {
    	System.out.println("Envio de invitado ");
    }
    

}
