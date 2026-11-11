package com.patrones.creacionales.cliente;

import com.patrones.creacionales.factory.AntiAirMisilFactory;
import com.patrones.creacionales.factory.AntiTankMisilFactory;
import com.patrones.creacionales.factory.MisilFactory;

public class DefenseSystem {
	public static void main(String[] args) {
        
        MisilFactory airFactory = new AntiAirMisilFactory();
        
        System.out.println(airFactory.createMisil());

        MisilFactory tankFactory = new AntiTankMisilFactory();
        System.out.println(tankFactory.createMisil());
    }

}
