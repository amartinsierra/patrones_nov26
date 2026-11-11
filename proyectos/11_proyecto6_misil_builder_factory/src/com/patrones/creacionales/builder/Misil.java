package com.patrones.creacionales.builder;

public class Misil {
    private String tipo;
    private String guiado="microondas";
    private String ojiva="estirada";
    private String propulsion="jet";
    private int alcance=200;

    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setGuiado(String guiado) { this.guiado = guiado; }
    public void setOjiva(String ojiva) { this.ojiva = ojiva; }
    public void setPropulsion(String propulsion) { this.propulsion = propulsion; }
    public void setAlcance(int alcance) { this.alcance = alcance; }

    @Override
    public String toString() {
        return "Misil [" + tipo + "] → " +
               "Guiado: " + guiado +
               ", Ojiva: " + ojiva +
               ", Propulsion: " + propulsion +
               ", Alcance: " + alcance + " km";
    }

}
