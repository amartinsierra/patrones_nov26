package com.patrones.proyectofinal.observer;

public class AnalyticSystem implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Analytics : " + message);
    }
}
