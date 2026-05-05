package dominio;

public class SalaCine {
	
	private int filas;
	private int columnas;
	private int numeroSala;
	
	public SalaCine (int filas, int columnas, int numeroSala) {
		this.filas = filas;
		this.columnas = columnas;
		this.numeroSala = numeroSala;
	}
	
	public int getFilas () {
		return this.filas;
	}
	public int getColumnas () {
		return this.columnas;
	}
}
