package com.patrones.creacionales.model;

import com.patrones.creacionales.singleton.EnvioUsuarioSingleton;

public class Admin extends Usuario {
	private Admin() {
        
    }

    @Override
    public String getTipoUsuario() {
        return "Admin";
    }

    
    @Override
    public  void enviarUsuario() {
    	System.out.println("Envio de administrador ");
    }
   
	//otros métodos específicos de la clase
	public void enviarAvisos() {
		
	}
	public void convocarSubordinados() {
		
	}
}
