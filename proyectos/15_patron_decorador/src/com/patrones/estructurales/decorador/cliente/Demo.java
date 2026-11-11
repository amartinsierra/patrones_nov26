package com.patrones.estructurales.decorador.cliente;

import com.patrones.estructurales.decorador.clasesdecorables.OrdenadorBase;
import com.patrones.estructurales.decorador.decorador.DecoradorDisco;
import com.patrones.estructurales.decorador.decorador.Ordenador;

public class Demo {

	public static void main(String[] args) {
		Ordenador ordenador=new OrdenadorBase();
		System.out.println("Sin decorar "+ordenador.getDescripcion());
		System.out.println("Sin decorar "+ordenador.getPrecio());
		//modifica el componente aplicando un decorador
		ordenador=new DecoradorDisco(ordenador);
		System.out.println("Decorado "+ordenador.getDescripcion());
		System.out.println("Decorado "+ordenador.getPrecio());


	}

}
