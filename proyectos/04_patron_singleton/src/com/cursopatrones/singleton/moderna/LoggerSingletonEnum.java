package com.cursopatrones.singleton.moderna;

public enum LoggerSingletonEnum {
	INSTANCE;
	// Método para registrar mensajes
    public void log(String mensaje) {
        System.out.println("[LOG] " + mensaje);
    }
}
