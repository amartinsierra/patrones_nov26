package com.patrones.creacionales.factory;

import com.patrones.creacionales.builder.Misil;
import com.patrones.creacionales.builder.MisilBuilder;

public class AntiTankMisilFactory extends MisilFactory {
    public Misil createMisil() {
    	return new MisilBuilder()
         	   .buildGuiado("Infrarrojo")
               .buildPropulsion("Chorro")
 	           .buildAlcance(10)
 	           .buildTipo("Antiatanque")
               .build();
    }
}

