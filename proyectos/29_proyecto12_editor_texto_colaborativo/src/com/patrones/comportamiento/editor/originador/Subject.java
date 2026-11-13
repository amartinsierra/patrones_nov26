package com.patrones.comportamiento.editor.originador;

import com.patrones.comportamiento.editor.observer.Observador;

public interface Subject {

	void agregarObservador(Observador obs);

}