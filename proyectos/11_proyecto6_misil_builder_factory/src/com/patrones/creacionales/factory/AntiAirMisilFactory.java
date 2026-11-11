package com.patrones.creacionales.factory;

import com.patrones.creacionales.builder.Misil;
import com.patrones.creacionales.builder.MisilBuilder;

public class AntiAirMisilFactory extends MisilFactory {
    public Misil createMisil() {
    	return new MisilBuilder()
                .buildGuiado("Radar")
                .buildOjiva("ojiva plana")
                .buildPropulsion("Combustible sólido")
                .buildTipo("Antiaereo")
                .getMisil();
    }
}

