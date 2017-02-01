package domini;

public class Coordenada {//cada objecta representarà una coordenada del taulell

	private int fila;//número de la fila dins el taulell (0..9)
	private int columna;//número de la columna dins el taulell (0..9)

	public Coordenada(int fila, int columna) {
		//PENDENT IMPLEMENTAR
		this.fila = fila;
		this.columna = columna;
	}

	public int getFila() {
		//PENDENT IMPLEMENTAR
		
		
		return this.fila;
	}

	public int getColumna() {
		//PENDENT IMPLEMENTAR
		return this.columna;
	}
	
	/*Una casella depenent la seva situació en el taulell, pot tenir 2, 5 o 8 veins.
	 * Aquest mètode retorna en un array les coordenades  veines a l'objecte actual.
	 * Cal tenir en compte que una coordenada no és veina de si mateixa.*/
	public Coordenada [] cercarCoordenadesVeines() {
		//PENDENT IMPLEMENTAR
		return null;		
	}
}