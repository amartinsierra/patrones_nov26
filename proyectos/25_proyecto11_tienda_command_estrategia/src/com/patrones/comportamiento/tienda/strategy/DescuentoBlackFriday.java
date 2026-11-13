package com.patrones.comportamiento.tienda.strategy;

public class DescuentoBlackFriday implements EstrategiaDescuento {
    @Override
    public double aplicarDescuento(double precioBase) {
    	if(precioBase>1000) {
    		return precioBase * 0.5; // 50% menos
    	}else {
    		return precioBase * 0.7; // 70% menos
    	}
    }
}
