package com.cursopatrones.prototype.client;

import java.util.ArrayList;
import java.util.List;

import com.cursopatrones.prototype.model.Libro;

public class Demo {

	public static void main(String[] args) {
		var prototipo=new Libro("titulo1","1111A",new ArrayList<String>(List.of("autor1","autor2")));
		var clon1=prototipo.clone();
		clon1.setIsbn("2222B");
		clon1.getAutores().add("autor3");
		var clon2=prototipo.clone();
		clon2.setIsbn("3333C");
		clon2.getAutores().add("autor4");
		System.out.println(prototipo);
		System.out.println(clon1);
		System.out.println(clon2);

	}

}
