package dominio;

public class Funcion {
	private Pelicula pelicula;
	private SalaCine salaCine;
	private String horario;
	private boolean [][] ocupacionButacas;
	
	public Funcion (Pelicula pelicula, SalaCine salaCine, String horario) {
		this.pelicula = pelicula;
		this.salaCine = salaCine;
		this.horario = horario;
		this.ocupacionButacas = new boolean [salaCine.getFilas()][salaCine.getColumnas()];
		}
	
	public boolean ocuparButaca (int fila, int columna) {
		
		if(posicionDentroRango(fila, columna) && estaDisponible(fila, columna)) {
			this.ocupacionButacas [fila][columna] = true;
			return true;
		}
		return false;
	}
	
	public boolean estaDisponible (int fila, int columna) {
		return !ocupacionButacas[fila][columna];
	}
	
	public boolean posicionDentroRango (int fila, int columna) {
		return fila >= 0 && fila < ocupacionButacas.length &&
		           columna >= 0 && columna < ocupacionButacas[0].length;
	}
	
	public int [][] butacasLibres (){
		int contador = 0;
		
		for (int i = 0; i < ocupacionButacas.length; i++) {
			for (int j = 0; j < ocupacionButacas[i].length; j++) {
				if(estaDisponible(i, j)) {
					contador++;
				}
			}
		}
		
		
	}
}
