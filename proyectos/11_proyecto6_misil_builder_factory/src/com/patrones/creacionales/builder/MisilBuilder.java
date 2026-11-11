package com.patrones.creacionales.builder;

public class MisilBuilder {
	protected Misil misil = new Misil();

	public MisilBuilder buildGuiado(String guiado) {
		misil.setGuiado(guiado);
		return this;
	}

	public MisilBuilder buildOjiva(String ojiva) {
		misil.setOjiva(ojiva);
		return this;
	}

	public MisilBuilder buildPropulsion(String propulsion) {
		misil.setPropulsion(propulsion);
		return this;
	}

	public MisilBuilder buildAlcance(int alcance) {
		misil.setAlcance(alcance);
		return this;
	}

	public MisilBuilder buildTipo(String tipo) {
		misil.setTipo(tipo);
		return this;
	}

	public Misil getMisil() {
		return misil;
	}

}
