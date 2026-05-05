package clasesEnum;

public enum GeneroPeliculas {
	TERROR ("Terror"), COMEDIA ("Comedia"), DRAMA ("Drama"), ACCION ("Accion"), AVENTURA ("Aventura");
	
	private String genero;
	
	GeneroPeliculas (String genero) {
		this.genero  = genero;
	}
	
	public String getTipoPelicula () {
		return this.genero;
	}
}
