package dominio;

import clasesEnum.GeneroPeliculas;

public class Pelicula {
	
	private String nombre;
	private GeneroPeliculas generoPelicula;
	
	public Pelicula (String nombre, GeneroPeliculas generoPelicula ) {
		this.nombre = nombre;
		this.generoPelicula = generoPelicula;
	}
	
	public String toString() {
		return "Pelicula: " + nombre + "\nGénero: " + generoPelicula;
	}
	
	
}
