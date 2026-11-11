package com.patrones.creacionales.model;

public class Operador extends Usuario {
	private final int categoria;
	private Operador() {
        
    }

    @Override
    public String getTipoUsuario() {
        return "Operador";
    }
    @Override
    public  void enviarUsuario() {
    	System.out.println("Envio de operador ");
    }

    

	//otros métodos específicos de la clase
	public void establecerProtocolo() {
		
	}
}

