package com.cursopatrones.prototype.model;

import java.util.ArrayList;

public class Libro implements Cloneable{
	private String titulo;
    private String isbn;
    private ArrayList<String> autores;
    public Libro(String titulo, String isbn, ArrayList<String> autores) {
        super();
        this.titulo = titulo;
        this.isbn = isbn;
        this.autores = autores;
    }
    //getter setter
    
    @Override 
    public Libro clone() {
        try {
            //llamada al método clone() heredado de Object
            Libro lb=(Libro)super.clone();
            lb.setAutores(new ArrayList<String>(autores));
            return lb;
        }catch(CloneNotSupportedException ex) {
            throw new AssertionError();
        }
    }
    public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	

	public ArrayList<String> getAutores() {
		return autores;
	}

	public void setAutores(ArrayList<String> autores) {
		this.autores = autores;
	}

	@Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", isbn=" + isbn + ", autor=" + autores + "]";
    }   

}
