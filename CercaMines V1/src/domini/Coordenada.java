package domini;

public class Coordenada {//cada objecta representarà una coordenada del taulell

	private int fila;//número de la fila dins el taulell (0..9)
	private int columna;//número de la columna dins el taulell (0..9)

	public Coordenada(int fila, int columna) {
		
		this.fila = fila;
		this.columna = columna;
	}

	public int getFila() {
		
		
		
		return this.fila;
	}

	public int getColumna() {
	
		return this.columna;
	}
	
	/*Una casella depenent la seva situació en el taulell, pot tenir 2, 5 o 8 veins.
	 * Aquest mètode retorna en un array les coordenades  veines a l'objecte actual.
	 * Cal tenir en compte que una coordenada no és veina de si mateixa.*/
	public Coordenada [] cercarCoordenadesVeines() {
		//PENDENT IMPLEMENTAR
		int[][] veines;
		int casella = 0;
		int veins = 0;

		if(fila ==0 && columna == 0 || fila ==0 && columna == MAX_COLUMNES-1 || fila == MAX_FILES-1 && columna == 0 || fila == MAX_FILES-1 && columna == MAX_COLUMNES-1)
		{
			veins = 3;
		}
		else if ( fila == 0 || fila == MAX_FILES-1 || columna ==0 || columna == MAX_COLUMNES-1)
		{
			veins = 5;
		}
		else
		{
			veins = 8;
		}
				
				

		veines = new int[veins][2];
		int columnaInicial = -1;
		int filaInicial = -1;
		int columnaFinal = 1;
		int filaFinal = 1;
		if(veins == 3)
		{
			if(fila == 0 && columna == 0)
			{
				columnaInicial = 0;
				filaInicial = 0;
				columnaFinal = 1;
				filaFinal = 1;
			}
			else if (fila == MAX_FILES-1 && columna == MAX_COLUMNES-1)
			{
				columnaInicial = -1;
				filaInicial = -1;
				columnaFinal = 0;
				filaFinal = 0;
			}
			else if (columna == 0 && fila == MAX_FILES-1)
			{
				columnaInicial = 0;
				filaInicial = -1;
				columnaFinal = 1;
				filaFinal = 0;
			}
			else if(columna == MAX_COLUMNES-1 && fila == 0)
			{
				columnaInicial = -1;
				filaInicial = 0;
				columnaFinal = 0;
				filaFinal = 1;
			}
		}
		else if (veins == 5)
		{

			if(fila == 0)
			{
				columnaInicial = -1;
				filaInicial = 0;
				columnaFinal = 1;
				filaFinal = 1;
			}
			else if (fila == MAX_FILES-1)
			{
				columnaInicial = -1;
				filaInicial = -1;
				columnaFinal = 1;
				filaFinal = 0;
			}
			else if (columna == 0)
			{
				columnaInicial = 0;
				filaInicial = -1;
				columnaFinal = 1;
				filaFinal = 1;
			}
			else if(columna == MAX_COLUMNES-1)
			{
				columnaInicial = -1;
				filaInicial = -1;
				columnaFinal = 0;
				filaFinal = 1;
			}

		}
		else
		{
			columnaInicial = -1;
			filaInicial = -1;
			columnaFinal = 1;
			filaFinal = 1;
		}
		
		for(int f = filaInicial; f<=filaFinal; f++)
		{
			for(int c = columnaInicial; c<=columnaFinal;c++)
			{
				if(!(f == 0 && c == 0))
				{
					veines[casella][0] = fila +f;
					veines[casella][1] = columna +c;
					casella++;
				}
			}	
		}
		return veines;	
			
	}
}